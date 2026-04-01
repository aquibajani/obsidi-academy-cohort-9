-- Retrieve All User IDs: Select all unique userId values from the "User" table
SELECT DISTINCT	"userId" FROM "User";

-- Profiles in Canada: Select headline, city, and country for profiles located in 'Canada'
SELECT "headline", "city", "country"
FROM "Profile" WHERE COUNTRY = 'Canada'

-- INNER JOIN User and Profile to display firstName, lastName, and headline
SELECT "User"."firstName", "User"."lastName", "Profile"."headline" FROM "User"
INNER JOIN "Profile" ON "User"."userId" = "Profile"."userId";

-- Users Without Profiles (Outer Join): LEFT JOIN to include all users, ORDER BY headline 
SELECT
	"User"."userId",
	"User"."firstName",
	"User"."lastName",
	"User"."username",
	"User"."phone",
	"User"."emailId",
	"User"."emailVerified",
	"Profile"."headline"
FROM
	"User"
	LEFT JOIN "Profile" ON "User"."userId" = "Profile"."userId"
ORDER BY
	"Profile"."headline";

-- GROUP BY emailVerified status and COUNT the number of users in each group
SELECT
	"emailVerified",
	COUNT(*) AS "user_count"
FROM
	"User"
GROUP BY
	"emailVerified"

-- Use UNION to combine userId from all profiles AND users in Canada
SELECT
	"userId"
FROM
	"Profile"
WHERE
	"country" = 'Canada'
UNION
SELECT
	"userId"
FROM
	"User"
WHERE
	"userId" IN (
		SELECT
			"userId"
		FROM
			"Profile"
		WHERE
			"country" = 'Canada'
	)

-- Which ACID property is ensured by the UNIQUE constraint on username?

-- Write a TRIGGER function named log_profile_update BEFORE UPDATE on the Profile table
CREATE OR REPLACE FUNCTION LOG_PROFILE_UPDATE () RETURNS TRIGGER AS $$ BEGIN RAISE NOTICE 'Profile updated: %', NEW; RETURN NEW; END; $$ LANGUAGE PLPGSQL;

CREATE TRIGGER PROFILE_UPDATE_TRIGGER BEFORE
UPDATE ON "Profile" FOR EACH ROW
EXECUTE FUNCTION LOG_PROFILE_UPDATE ();