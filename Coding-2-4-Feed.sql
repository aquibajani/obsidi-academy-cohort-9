-- Create the "Feed" table
CREATE TABLE "Feed" (
    "feedId" INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    "userId" INT NOT NULL,
    content VARCHAR(255) NOT NULL,
    picture VARCHAR(255) NOT NULL,
    "createdOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,

    CONSTRAINT "Feed_pkey" PRIMARY KEY ("feedId"),
    CONSTRAINT "Feed_userId_fkey" FOREIGN KEY ("userId")
        REFERENCES "User"("userId")
);

-- Insert a new row into the "Feed" table.
INSERT INTO "Feed"
("userId", content, picture, "createdOn")
VALUES
(2, 'This is my first post!',
'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg',
NOW());

-- Insert two new rows into the "Feed" table for other users.
INSERT INTO "Feed"
("userId", content, picture, "createdOn")
VALUES
(1, 'Enjoying my day!',
'https://example.com/image1.jpg', NOW()),
(4, 'Learning SQL is fun!',
'https://example.com/image2.jpg', NOW());

-- Select all rows from the "Feed" table
SELECT * FROM "Feed";

-- Update the feed content for the feed with feedId = 1
UPDATE "Feed"
SET content = 'This is my second post!'
WHERE "feedId" = 1;

-- Delete feed with feedId = 2
DELETE FROM "Feed"
WHERE "feedId" = 2;

-- Join the "User" and "Feed" tables.
SELECT 
    u."userId",
    u.username,
    f."feedId",
    f.content,
    f.picture,
    f."createdOn"
FROM "User" u
JOIN "Feed" f
ON u."userId" = f."userId";

-- Join the "User" and "Feed" tables to display the rows for username = 'amylee'
SELECT 
    u.username,
    f."feedId",
    f.content,
    f.picture,
    f."createdOn"
FROM "User" u
JOIN "Feed" f
ON u."userId" = f."userId"
WHERE u.username = 'amylee';