-- Create the "Profile" table
CREATE TABLE Profile (
    "profileId" INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    "userId" INT NOT NULL,
    headline VARCHAR(255) NOT NULL,
    bio VARCHAR(500),
    city VARCHAR(100),
    country VARCHAR(100),
    picture VARCHAR(500) NOT NULL,
    
    CONSTRAINT "Profile_pkey" PRIMARY KEY ("profileId"),
    CONSTRAINT "Profile_userId_fkey" FOREIGN KEY ("userId")
        REFERENCES "User"("userId")
);

-- Insert a new row into the "Profile" table
INSERT INTO Profile ("userId", headline, bio, city, country, picture)
VALUES (
    2,
    'Wondergirl Amy!',
    'My name is Amy and I am a super hero.',
    'Toronto',
    'Canada',
    'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg'
);
-- Select all rows from the "Profile" table
SELECT * FROM Profile;
-- Insert two new profiles with a single statement using a VALUES list. (use your won data)
INSERT INTO Profile ("userId", headline, bio, city, country, picture)
VALUES 
(
    6,
    'Jessie the Explorer',
    'Love traveling and photography.',
    'Vancouver',
    'Canada',
    'https://example.com/jessie.jpg'
),
(
    4,
    'Diana the Warrior',
    'Strong and fearless leader.',
    'New York',
    'USA',
    'https://example.com/diana.jpg'
);
-- Select all rows from the "Profile" table where the country is "Canada".
SELECT * 
FROM Profile
WHERE country = 'Canada';
-- Update the profile with userId = 2
UPDATE Profile
SET bio = 'I am Amy and I probably shouldn''t tell anyone I''m a super hero instead.'
WHERE "userId" = 2;
-- Delete profile with profileId = 3
DELETE FROM Profile
WHERE "profileId" = 4;
-- Select all rows from the "Profile" table
SELECT * FROM Profile;
-- Select the row from the "Profile" table with userdId = 2
SELECT *
FROM Profile
WHERE "userId" = 2;
-- Join the "User" and "Profile" tables to get all the details for ALL users (including the ones without a profile). Hint: Use an outer join.
SELECT *
FROM "User" u
LEFT JOIN Profile p
ON u."userId" = p."userId";
-- Join the "User" and "Profile" tables to get the details of the users who have a profile.
SELECT *
FROM "User" u
INNER JOIN Profile p
ON u."userId" = p."userId";