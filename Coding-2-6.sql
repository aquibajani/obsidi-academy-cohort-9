-- Select DISTINCT content and the user's firstName, JOINING User and Feed
SELECT DISTINCT
	F."content",
	U."firstName"
FROM
	"Feed" F
	JOIN "User" U ON F."userId" = U."userId"


-- Select feedId, username, and createdOn, ORDERING BY createdOn DESC and LIMIT 5
SELECT
	F."feedId",
	U."username",
	F."createdOn"
FROM
	"Feed" F
	JOIN "User" U ON F."userId" = U."userId"
ORDER BY
	F."createdOn" DESC
LIMIT
	5;

-- Select feedId and content where content contains the word 'post' (using LIKE)
SELECT
	"feedId",
	"content"
FROM
	"Feed"
WHERE
	"content" LIKE '%post%';

-- GROUP BY username and COUNT the total number of posts, ORDER BY post count descending
SELECT
	"User"."username",
	COUNT("Feed"."feedId") AS "post_count"
FROM
	"User"
	LEFT JOIN "Feed" ON "User"."userId" = "Feed"."userId"
GROUP BY
	"User"."username"
ORDER BY
	"post_count" DESC;

-- Find usernames with exactly one post using GROUP BY and HAVING
SELECT
	"User"."username"
FROM
	"Feed"
	JOIN "User" ON "Feed"."userId" = "User"."userId"
GROUP BY
	"User"."username"
HAVING
	COUNT("Feed"."feedId") = 1;

-- Combine all feedId from Feed and userId from User into one result set using UNION ALL
SELECT
	"feedId"
FROM
	"Feed"
UNION ALL
SELECT
	"userId"
FROM
	"User";

-- Which ACID property guarantees all-or-nothing submission of a post?

-- Write a TRIGGER named prevent_short_post BEFORE INSERT on the Feed table
CREATE OR REPLACE FUNCTION PREVENT_SHORT_POST () RETURNS TRIGGER AS $$ BEGIN IF LENGTH(NEW.content) < 10 THEN RAISE EXCEPTION 'Content must be at least 10 characters long'; END IF; NEW.content := '"' || NEW.content || '"'; RETURN NEW; END; $$ LANGUAGE PLPGSQL;

CREATE TRIGGER PREVENT_SHORT_POST BEFORE INSERT ON "Feed" FOR EACH ROW
EXECUTE FUNCTION PREVENT_SHORT_POST ();