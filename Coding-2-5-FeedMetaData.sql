-- Create the "FeedMetaData" table
CREATE TABLE "FeedMetaData" (
    "feedMetaDataId" INTEGER GENERATED ALWAYS AS IDENTITY NOT NULL,
    "feedId" INTEGER NOT NULL,
    "actionUserId" INTEGER NOT NULL,
    "isLike" BOOLEAN NOT NULL,
    "comment" CHARACTER VARYING,
    "createdOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,

    CONSTRAINT "FeedMetaData_pkey"
        PRIMARY KEY ("feedMetaDataId"),

    CONSTRAINT "FeedMetaData_actionUserId_fkey"
        FOREIGN KEY ("actionUserId")
        REFERENCES "User"("userId"),

    CONSTRAINT "FeedMetaData_feedId_fkey"
        FOREIGN KEY ("feedId")
        REFERENCES "Feed"("feedId")
);

-- Insert a new row into the "FeedMetaData" table.
INSERT INTO "FeedMetaData"
("actionUserId", "feedId", "isLike", "comment", "createdOn")
VALUES
(2, 1, TRUE, 'Thanks!', CURRENT_TIMESTAMP);

-- Insert two new rows into the "FeedMetaData" table.
INSERT INTO "FeedMetaData"
("actionUserId", "feedId", "isLike", "comment", "createdOn")
VALUES
(5, 1, TRUE, 'Great post!', CURRENT_TIMESTAMP),
(4, 3, FALSE, 'Interesting perspective.', CURRENT_TIMESTAMP);

-- Select all rows from the "FeedMetaData" table.
SELECT * FROM "FeedMetaData";

-- Update the feedMetaData content for the feedMetaData with feedMetaDataId = 1
UPDATE "FeedMetaData"
SET "comment" = 'Thanks fam!'
WHERE "feedMetaDataId" = 1;

-- Delete feedMetaData with feedMetaDataId = 2
DELETE FROM "FeedMetaData"
WHERE "feedMetaDataId" = 2;

-- Select all rows from the "FeedMetaData" table.
SELECT * 
FROM "FeedMetaData";

-- Select feedMetaData with feedMetaDataId = 1
SELECT *
FROM "FeedMetaData"
WHERE "feedMetaDataId" = 1;

-- Join the "Feed" and "FeedMetaData" tables to display a row (or rows) for feedId = 1
SELECT * 
FROM "Feed" 
LEFT OUTER JOIN "FeedMetaData" 
  ON "Feed"."feedId" = "FeedMetaData"."feedId"
WHERE "Feed"."feedId" = 1;

-- Join the "User", "Feed" and "FeedMetaData" tables to display a row (or rows) for userId = 2
SELECT *
FROM "User"
LEFT OUTER JOIN "Feed"
    ON "User"."userId" = "Feed"."userId"
LEFT OUTER JOIN "FeedMetaData"
    ON "Feed"."feedId" = "FeedMetaData"."feedId"
WHERE "User"."userId" = 2;