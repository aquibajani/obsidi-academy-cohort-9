
-- Create the "User" table
CREATE TABLE "User" (
    "userId" INTEGER GENERATED ALWAYS AS IDENTITY NOT NULL,
    "firstName" VARCHAR NOT NULL,
    "lastName" VARCHAR NOT NULL,
    "username" VARCHAR NOT NULL,
    "phone" VARCHAR NOT NULL,
    "emailId" VARCHAR NOT NULL,
    "password" VARCHAR NOT NULL,
    "emailVerified" BOOLEAN NOT NULL,
    "CreatedOn" TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    
    -- add constraints :
    CONSTRAINT "User_pkey" PRIMARY KEY ("userId"),
    CONSTRAINT "User_emailId_key" UNIQUE ("emailId"),
    CONSTRAINT "User_username_key" UNIQUE ("username")
);

-- Insert a new row into the "User" table
INSERT INTO "User" (
    "firstName", 
    "lastName", 
    "username", 
    "phone", 
    "emailId", 
    "password", 
    "emailVerified", 
    "CreatedOn"
) 
VALUES (
    'Jessie', 
    'Doe', 
    'jessiedoe', 
    '+1-555-1234', 
    'jessiedoe@example.com', 
    'password123', 
    true, 
    CURRENT_TIMESTAMP
);

-- Select all rows from the "User" table
SELECT * FROM "User";
-- Insert multiple users with a single insert statement using a VALUES list
INSERT INTO "User" (
    "firstName", 
    "lastName", 
    "username", 
    "phone", 
    "emailId", 
    "password", 
    "emailVerified", 
    "CreatedOn"
) 
VALUES
('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());
-- Select all rows from the "User" table where the value of the "emailVerified" column is true
SELECT * 
FROM "User"
WHERE "emailVerified" = true;
-- Insert a few more users into the "User" table, (at least four more)
INSERT INTO "User" (
    "firstName", 
    "lastName", 
    "username", 
    "phone", 
    "emailId", 
    "password", 
    "emailVerified", 
    "CreatedOn"
) 
VALUES 
    ('Ibrahim', 'Saleh', 'isaleh', '+1-555-0001', 'ibrahim.saleh@example.com', 'securePass1', true, CURRENT_TIMESTAMP),
    ('Kingsley', 'Obioha', 'kobioha', '+1-555-0002', 'kingsley.obioha@example.com', 'securePass2', true, CURRENT_TIMESTAMP),
    ('Usama', 'Said', 'usaid', '+1-555-0003', 'usama.said@example.com', 'securePass3', true, CURRENT_TIMESTAMP),
    ('Leonel', 'Nguefack', 'lnguefack', '+1-555-0004', 'leonel.nguefack@example.com', 'securePass4', true, CURRENT_TIMESTAMP),
    ('Aquib', 'Ajani', 'aajani', '+1-555-0005', 'aquib.ajani@example.com', 'securePass5', true, CURRENT_TIMESTAMP);

-- Update user with username "tomjones"
UPDATE "User"
SET "username" = 'randyjones'
WHERE "username" = 'tomjones';
-- Select user with username "tomjones"
SELECT * 
FROM "User"
WHERE "username" = 'randyjones';
-- Delete user with username "randyjones"
DELETE FROM "User"
WHERE "username" = 'randyjones';
-- Select all rows from the "User" table
SELECT * 
FROM "User";