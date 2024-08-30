CREATE DATABASE assign;
USE assign;
CREATE TABLE scam_info (
    scam_id BIGINT,
    scam_name VARCHAR(100),
    scam_type VARCHAR(100),
    affected_population BIGINT,
    financial_loss BIGINT,
    region VARCHAR(100),
    reported_date DATE,
    perpetrator VARCHAR(100),
    scam_method VARCHAR(100),
    authority_response VARCHAR(100)
);

-- Step 2: Alter the Table to Add Columns
ALTER TABLE scam_info ADD COLUMN victim_age_group VARCHAR(100);
ALTER TABLE scam_info ADD COLUMN scam_duration VARCHAR(100);
ALTER TABLE scam_info ADD COLUMN severity_level VARCHAR(100);
ALTER TABLE scam_info ADD COLUMN legal_action_taken VARCHAR(100);
ALTER TABLE scam_info ADD COLUMN detection_date VARCHAR(10);

-- Step 3: Rename Columns
ALTER TABLE scam_info RENAME COLUMN scam_name TO full_scam_name;
ALTER TABLE scam_info RENAME COLUMN scam_type TO category;
ALTER TABLE scam_info RENAME COLUMN affected_population TO victims_count;
ALTER TABLE scam_info RENAME COLUMN reported_date TO reporting_date;
ALTER TABLE scam_info RENAME COLUMN perpetrator TO suspect;

-- Step 4: Modify Column Types
ALTER TABLE scam_info MODIFY COLUMN financial_loss BIGINT;
ALTER TABLE scam_info MODIFY COLUMN region VARCHAR(150);
ALTER TABLE scam_info MODIFY COLUMN detection_date VARCHAR(10);

-- Step 5: Insert Data into the Table
INSERT INTO scam_info VALUES 
(1, 'Phishing Scam', 'Email', 50000, 2000000, 'Global', '2021-05-10', 'John Doe', 'Email Phishing', 'Investigation Ongoing', 'All Ages', '1 Month', 'High', 'Yes', '2021-05-15'),
(2, 'Ponzi Scheme', 'Investment', 2000, 10000000, 'USA', '2019-08-20', 'Jane Smith', 'Investment Fraud', 'Arrests Made', 'Adults', '2 Years', 'Severe', 'Yes', '2019-08-25'),
(3, 'Lottery Scam', 'SMS', 30000, 1500000, 'UK', '2020-03-15', 'Tom Brown', 'Text Message', 'Closed', 'Elderly', '2 Weeks', 'Medium', 'Yes', '2020-03-20'),
(4, 'Charity Scam', 'Phone', 10000, 500000, 'Canada', '2021-01-05', 'Lucy Green', 'Phone Call', 'Open', 'All Ages', '1 Year', 'High', 'No', '2021-01-10'),
(5, 'Romance Scam', 'Online', 7000, 2000000, 'Australia', '2020-02-14', 'Mike White', 'Online Dating', 'Under Investigation', 'Adults', '6 Months', 'Severe', 'Yes', '2020-02-20'),
(6, 'Tech Support Scam', 'Phone', 20000, 750000, 'India', '2019-06-30', 'Raj Patel', 'Phone Call', 'Closed', 'Elderly', '3 Months', 'Medium', 'Yes', '2019-07-05'),
(7, 'Investment Scam', 'Email', 5000, 3000000, 'Germany', '2018-09-10', 'Hans Müller', 'Email Phishing', 'Arrests Made', 'Adults', '1 Year', 'Severe', 'Yes', '2018-09-15'),
(8, 'Job Offer Scam', 'Online', 15000, 1000000, 'Nigeria', '2021-07-01', 'Ayo Okeke', 'Fake Job Ads', 'Open', 'All Ages', '2 Months', 'High', 'No', '2021-07-05'),
(9, 'Bank Fraud', 'Email', 10000, 2500000, 'USA', '2020-11-11', 'Sarah Johnson', 'Email Phishing', 'Under Investigation', 'Adults', '6 Months', 'Severe', 'Yes', '2020-11-15'),
(10, 'Online Shopping Scam', 'Online', 30000, 500000, 'UK', '2019-12-01', 'David Clark', 'Fake Websites', 'Closed', 'All Ages', '1 Month', 'Medium', 'Yes', '2019-12-05'),
(11, 'Medical Scam', 'Phone', 5000, 1000000, 'Canada', '2020-04-01', 'Emily Brown', 'Phone Call', 'Under Investigation', 'Elderly', '2 Weeks', 'High', 'Yes', '2020-04-05'),
(12, 'Travel Scam', 'Online', 8000, 1500000, 'USA', '2019-05-15', 'Robert Davis', 'Fake Travel Agencies', 'Arrests Made', 'Adults', '1 Year', 'Severe', 'Yes', '2019-05-20'),
(13, 'Utility Scam', 'Phone', 12000, 750000, 'UK', '2021-06-01', 'James Wilson', 'Phone Call', 'Closed', 'Elderly', '3 Months', 'Medium', 'Yes', '2021-06-05'),
(14, 'Online Auction Scam', 'Online', 10000, 500000, 'Germany', '2018-08-15', 'Maria Schmidt', 'Fake Auctions', 'Under Investigation', 'All Ages', '6 Months', 'High', 'Yes', '2018-08-20'),
(15, 'Loan Scam', 'Email', 7000, 2000000, 'Australia', '2020-10-01', 'Peter Lee', 'Email Phishing', 'Arrests Made', 'Adults', '1 Year', 'Severe', 'Yes', '2020-10-05'),
(16, 'Insurance Scam', 'Phone', 9000, 1500000, 'India', '2019-03-25', 'Anita Kumar', 'Phone Call', 'Closed', 'All Ages', '2 Months', 'Medium', 'Yes', '2019-03-30'),
(17, 'Fake Charity Scam', 'Email', 11000, 500000, 'Canada', '2020-12-25', 'Steven Green', 'Email Phishing', 'Open', 'Adults', '1 Month', 'High', 'No', '2020-12-30'),
(18, 'Inheritance Scam', 'Letter', 6000, 2000000, 'Nigeria', '2019-04-10', 'Chinedu Nwankwo', 'Fake Letters', 'Under Investigation', 'Elderly', '6 Months', 'Severe', 'Yes', '2019-04-15'),
(19, 'Fake Rental Scam', 'Online', 4000, 1000000, 'UK', '2021-08-20', 'Oliver Brown', 'Fake Rental Listings', 'Arrests Made', 'All Ages', '2 Months', 'High', 'Yes', '2021-08-25'),
(20, 'Grandparent Scam', 'Phone', 15000, 500000, 'USA', '2018-07-10', 'Anna Davis', 'Phone Call', 'Closed', 'Elderly', '1 Year', 'Medium', 'Yes', '2018-07-15');

-- Step 6: Update Data in the Table
UPDATE scam_info
SET financial_loss = 2500000, authority_response = 'Closed'
WHERE scam_id = 1;

UPDATE scam_info 
SET category = 'Crypto Investment', legal_action_taken = 'No'
WHERE scam_id = 2;

UPDATE scam_info 
SET victims_count = 7000, legal_action_taken = 'No'
WHERE scam_id = 5;

UPDATE scam_info 
SET suspect = 'Amogh', legal_action_taken = 'No'
WHERE scam_id = 7;

UPDATE scam_info 
SET scam_method = 'phone call', legal_action_taken = 'YES'
WHERE scam_id =2 ;

UPDATE scam_info 
SET category = 'SMS', financial_loss = '1'
WHERE scam_id = 2;

UPDATE scam_info 
SET full_scam_name = 'Travel Scam', scam_method = 'Phone call'
WHERE scam_id = 11;

UPDATE scam_info 
SET region = 'dubai', suspect = 'Lucy Green'
WHERE scam_id = 3;

UPDATE scam_info 
SET authority_response = 'closed', suspect = 'Lucy Green'
WHERE scam_id = 2;

UPDATE scam_info 
SET authority_response = 'open', suspect = 'Anitha'
WHERE scam_id = 8;
SELECT * FROM scam_info;
-- Step 7: Delete Rows
DELETE FROM scam_info WHERE scam_id = 15;
DELETE FROM scam_info WHERE scam_id= 18;
DELETE FROM scam_info WHERE scam_id= 20;

-- Step 8: Select Specific Data
SELECT * FROM scam_info
WHERE victims_count > 1000 AND region = 'USA';

SELECT * FROM scam_info
WHERE financial_loss > 5000000 OR region = 'Global';

SELECT * FROM scam_info
WHERE scam_id IN (2, 3, 4);

SELECT * FROM scam_info
WHERE scam_id NOT IN (5, 6, 7);



CREATE TABLE state_info (
    state_id INT,
    state_name VARCHAR(100),
    capital VARCHAR(100),
    largest_city VARCHAR(100),
    population INT,
    area FLOAT,
    time_zone VARCHAR(50),
    established_date DATE,
    governor VARCHAR(100),
    state_bird VARCHAR(100)
);
ALTER TABLE state_info ADD COLUMN nickname VARCHAR(100);
ALTER TABLE state_info ADD COLUMN state_flower VARCHAR(100);
ALTER TABLE state_info ADD COLUMN state_tree VARCHAR(100);
ALTER TABLE state_info ADD COLUMN state_motto VARCHAR(100);
ALTER TABLE state_info ADD COLUMN admission_to_union DATE;

ALTER TABLE state_info RENAME COLUMN state_name TO state_full_name;
ALTER TABLE state_info RENAME COLUMN largest_city TO major_city;
ALTER TABLE state_info RENAME COLUMN established_date TO statehood_date;
ALTER TABLE state_info RENAME COLUMN governor TO current_governor;
ALTER TABLE state_info RENAME COLUMN state_bird TO official_state_bird;


ALTER TABLE state_info MODIFY COLUMN state_id BIGINT;
ALTER TABLE state_info MODIFY COLUMN population BIGINT;
ALTER TABLE state_info MODIFY COLUMN area DOUBLE PRECISION;
ALTER TABLE state_info MODIFY COLUMN time_zone VARCHAR(100);
ALTER TABLE state_info MODIFY COLUMN admission_to_union varchar(10);

desc state_info

INSERT INTO state_info VALUES (1, 'California', 'Sacramento', 'Los Angeles', 39538223, 163696.32, 'Pacific', '1850-09-09', 'Gavin Newsom', 'California Quail', 'The Golden State', 'California Poppy', 'California Redwood', 'Eureka', '1850-09-09');
INSERT INTO state_info VALUES (2, 'Texas', 'Austin', 'Houston', 29145505, 268596.46, 'Central', '1845-12-29', 'Greg Abbott', 'Mockingbird', 'The Lone Star State', 'Bluebonnet', 'Pecan Tree', 'Friendship', '1845-12-29');
INSERT INTO state_info VALUES (3, 'Florida', 'Tallahassee', 'Jacksonville', 21538187, 65757.70, 'Eastern', '1845-03-03', 'Ron DeSantis', 'Mockingbird', 'The Sunshine State', 'Orange Blossom', 'Sabal Palm', 'In God We Trust', '1845-03-03');
INSERT INTO state_info VALUES (4, 'New York', 'Albany', 'New York City', 20201249, 54555.00, 'Eastern', '1788-07-26', 'Kathy Hochul', 'Eastern Bluebird', 'The Empire State', 'Rose', 'Sugar Maple', 'Excelsior', '1788-07-26');
INSERT INTO state_info VALUES (5, 'Illinois', 'Springfield', 'Chicago', 12812508, 57914.00, 'Central', '1818-12-03', 'J.B. Pritzker', 'Northern Cardinal', 'The Prairie State', 'Violet', 'White Oak', 'State Sovereignty, National Union', '1818-12-03');
INSERT INTO state_info VALUES (6, 'Pennsylvania', 'Harrisburg', 'Philadelphia', 13002700, 46054.00, 'Eastern', '1787-12-12', 'Josh Shapiro', 'Ruffed Grouse', 'The Keystone State', 'Mountain Laurel', 'Eastern Hemlock', 'Virtue, Liberty, and Independence', '1787-12-12');
INSERT INTO state_info VALUES (7, 'Ohio', 'Columbus', 'Columbus', 11799448, 44826.00, 'Eastern', '1803-03-01', 'Mike DeWine', 'Northern Cardinal', 'The Buckeye State', 'Scarlet Carnation', 'Ohio Buckeye', 'With God, All Things Are Possible', '1803-03-01');
INSERT INTO state_info VALUES (8, 'Georgia', 'Atlanta', 'Atlanta', 10711908, 59425.00, 'Eastern', '1788-01-02', 'Brian Kemp', 'Brown Thrasher', 'The Peach State', 'Cherokee Rose', 'Live Oak', 'Wisdom, Justice, and Moderation', '1788-01-02');
INSERT INTO state_info VALUES (9, 'North Carolina', 'Raleigh', 'Charlotte', 10439388, 53819.00, 'Eastern', '1789-11-21', 'Roy Cooper', 'Northern Cardinal', 'The Tar Heel State', 'Dogwood', 'Longleaf Pine', 'Esse Quam Videri', '1789-11-21');
INSERT INTO state_info VALUES (10, 'Michigan', 'Lansing', 'Detroit', 10077331, 96714.00, 'Eastern', '1837-01-26', 'Gretchen Whitmer', 'Robin', 'The Great Lakes State', 'Apple Blossom', 'Eastern White Pine', 'Si Quaeris Peninsulam Amoenam Circumspice', '1837-01-26');
INSERT INTO state_info VALUES (11, 'New Jersey', 'Trenton', 'Newark', 9288994, 8722.58, 'Eastern', '1787-12-18', 'Phil Murphy', 'Eastern Goldfinch', 'The Garden State', 'Violet', 'Northern Red Oak', 'Liberty and Prosperity', '1787-12-18');
INSERT INTO state_info VALUES (12, 'Virginia', 'Richmond', 'Virginia Beach', 8631393, 42774.90, 'Eastern', '1788-06-25', 'Glenn Youngkin', 'Northern Cardinal', 'The Old Dominion', 'American Dogwood', 'American Dogwood', 'Sic Semper Tyrannis', '1788-06-25');
INSERT INTO state_info VALUES (13, 'Washington', 'Olympia', 'Seattle', 7693612, 71298.00, 'Pacific', '1889-11-11', 'Jay Inslee', 'Willow Goldfinch', 'The Evergreen State', 'Rhododendron', 'Western Hemlock', 'Al-ki', '1889-11-11');
INSERT INTO state_info VALUES (14, 'Arizona', 'Phoenix', 'Phoenix', 7151502, 113990.30, 'Mountain', '1912-02-14', 'Katie Hobbs', 'Cactus Wren', 'The Grand Canyon State', 'Saguaro Cactus Blossom', 'Palo Verde', 'Ditat Deus', '1912-02-14');
INSERT INTO state_info VALUES (15, 'Massachusetts', 'Boston', 'Boston', 7029917, 10554.39, 'Eastern', '1788-02-06', 'Maura Healey', 'Black-Capped Chickadee', 'The Bay State', 'Mayflower', 'American Elm', 'Ense Petit Placidam Sub Libertate Quietem', '1788-02-06');
INSERT INTO state_info VALUES (16, 'Tennessee', 'Nashville', 'Nashville', 6910840, 42144.25, 'Central', '1796-06-01', 'Bill Lee', 'Mockingbird', 'The Volunteer State', 'Iris', 'Tulip Poplar', 'Agriculture and Commerce', '1796-06-01');
INSERT INTO state_info VALUES (17, 'Indiana', 'Indianapolis', 'Indianapolis', 6785528, 36420.00, 'Eastern', '1816-12-11', 'Eric Holcomb', 'Northern Cardinal', 'The Hoosier State', 'Peony', 'Tulip Tree', 'The Crossroads of America', '1816-12-11');
INSERT INTO state_info VALUES (18, 'Missouri', 'Jefferson City', 'Kansas City', 6154913, 69707.00, 'Central', '1821-08-10', 'Mike Parson', 'Eastern Bluebird', 'The Show Me State', 'Hawthorn', 'Flowering Dogwood', 'Salus Populi Suprema Lex Esto', '1821-08-10');
INSERT INTO state_info VALUES (19, 'Maryland', 'Annapolis', 'Baltimore', 6177224, 12406.68, 'Eastern', '1788-04-28', 'Wes Moore', 'Baltimore Oriole', 'The Old Line State', 'Black-Eyed Susan', 'White Oak', 'Fatti Maschii, Parole Femine', '1788-04-28');
INSERT INTO state_info VALUES (20, 'Wisconsin', 'Madison', 'Milwaukee', 5893718, 65496.00, 'Central', '1848-05-29', 'Tony Evers', 'American Robin', 'America\'s Dairyland', 'Wood Violet', 'Sugar Maple', 'Forward', '1848-05-29');

UPDATE state_info
SET capital = 'Los Angeles', major_city = 'San Francisco', population = 40000000
WHERE state_id = 1;

UPDATE state_info
SET time_zone = 'Mountain', current_governor = 'Beto O\'Rourke', state_flower = 'Bluebonnet'
WHERE state_id = 2;

UPDATE state_info
SET major_city = 'Orlando', statehood_date = '1845-03-04', official_state_bird = 'Northern Mockingbird'
WHERE state_id = 3;

UPDATE state_info
SET population = 21000000, area = 55000.00, nickname = 'The Empire State'
WHERE state_id = 4;

-- Update row with state_id = 5
UPDATE state_info
SET state_flower = 'Sunflower', state_motto = 'Land of Lincoln', area = 58000.00
WHERE state_id = 5;

UPDATE state_info
SET current_governor = 'Tom Wolf', official_state_bird = 'Pennsylvania Bluebird', time_zone = 'Eastern'
WHERE state_id = 6;

UPDATE state_info
SET major_city = 'Cincinnati', state_flower = 'Scarlet Rose', state_tree = 'Buckeye'
WHERE state_id = 7;

UPDATE state_info
SET population = 10800000, area = 60000.00, capital = 'Atlanta'
WHERE state_id = 8;

UPDATE state_info
SET official_state_bird = 'Cardinal', state_flower = 'Carolina Jessamine', statehood_date = '1789-11-20'
WHERE state_id = 9;

UPDATE state_info
SET state_tree = 'Red Pine', state_flower = 'Daisy', capital = 'Detroit'
WHERE state_id = 10;


DELETE FROM state_info WHERE state_id = 1;

DELETE FROM state_info WHERE state_id = 2;

DELETE FROM state_info WHERE state_id = 3;

SELECT * FROM state_info
WHERE population > 10000000 AND time_zone = 'Central';

SELECT * FROM state_info
WHERE population > 20000000 OR time_zone = 'Pacific';
SELECT * FROM state_info WHERE state_id IN (4, 5, 6);
SELECT * FROM state_info WHERE state_id NOT IN (7, 8, 9);

USE assign;

CREATE DATABASE RTO;
USE RTO;

CREATE TABLE LLR_INFO (
    LLR_ID INT PRIMARY KEY,
    Applicant_Name VARCHAR(100) NOT NULL,
    Date_of_Birth DATE NOT NULL,
    Address VARCHAR(255),
    Mobile_Number VARCHAR(15),
    Email VARCHAR(100),
    Application_Date DATE,
    Status VARCHAR(50),
    Expiry_Date DATE,
    Issued_By VARCHAR(100)
);

CREATE TABLE LLR_TEST_INFO (
    LLR_ID INT,
    TEST_ID INT PRIMARY KEY,
    Test_Date DATE,
    Test_Result VARCHAR(50),
    FOREIGN KEY (LLR_ID) REFERENCES LLR_INFO(LLR_ID)
);

CREATE TABLE DRIVING_LICENCE_INFO (
    DL_ID INT PRIMARY KEY,
    TEST_ID INT,
    LLR_ID INT,
    Issue_Date DATE,
    Expiry_Date DATE,
    License_Number VARCHAR(100),
    Issued_By VARCHAR(100),
    Status VARCHAR(50),
    Holder_Name VARCHAR(100),
    Address VARCHAR(255),
    FOREIGN KEY (TEST_ID) REFERENCES LLR_TEST_INFO(TEST_ID),
    FOREIGN KEY (LLR_ID) REFERENCES LLR_INFO(LLR_ID)
);

CREATE TABLE DRIVING_LICENSE_TEST_INFO (
    DL_ID INT,
    Test_Date DATE,
    Test_Result VARCHAR(50),
    FOREIGN KEY (DL_ID) REFERENCES DRIVING_LICENCE_INFO(DL_ID)
);

INSERT INTO LLR_INFO (LLR_ID, Applicant_Name, Date_of_Birth, Address, Mobile_Number, Email, Application_Date, Status, Expiry_Date, Issued_By)
VALUES
(1, 'John Doe', '1990-01-01', '123 Elm St', '555-0101', 'john@example.com', '2024-01-01', 'Pending', '2025-01-01', 'RTO Office A'),
-- Add more rows up to 20
(20, 'Jane Smith', '1985-05-15', '456 Oak St', '555-2020', 'jane@example.com', '2024-02-15', 'Approved', '2025-02-15', 'RTO Office B');

INSERT INTO LLR_TEST_INFO (LLR_ID, TEST_ID, Test_Date, Test_Result)
VALUES
(1, 101, '2024-01-15', 'Pass'),
-- Add more rows up to 20
(20, 120, '2024-03-10', 'Pass');

INSERT INTO DRIVING_LICENCE_INFO (DL_ID, TEST_ID, LLR_ID, Issue_Date, Expiry_Date, License_Number, Issued_By, Status, Holder_Name, Address)
VALUES
(1, 101, 1, '2024-01-20', '2029-01-20', 'DL123456789', 'RTO Office A', 'Active', 'John Doe', '123 Elm St'),
-- Add more rows up to 20
(20, 120, 20, '2024-03-15', '2029-03-15', 'DL987654321', 'RTO Office B', 'Active', 'Jane Smith', '456 Oak St');

INSERT INTO DRIVING_LICENSE_TEST_INFO (DL_ID, Test_Date, Test_Result)
VALUES
(1, '2024-01-18', 'Pass'),
-- Add more rows up to 20
(20, '2024-03-12', 'Pass');

INSERT INTO LLR_INFO (LLR_ID, Applicant_Name, Date_of_Birth, Address, Mobile_Number, Email, Application_Date, Status, Expiry_Date, Issued_By)
VALUES (1, 'John Doe', '1990-01-01', '123 Elm St', '555-0101', 'john@example.com', '2024-01-01', 'Pending', '2025-01-01', 'RTO Office A')
ON DUPLICATE KEY UPDATE
    Applicant_Name = VALUES(Applicant_Name),
    Date_of_Birth = VALUES(Date_of_Birth),
    Address = VALUES(Address),
    Mobile_Number = VALUES(Mobile_Number),
    Email = VALUES(Email),
    Application_Date = VALUES(Application_Date),
    Status = VALUES(Status),
    Expiry_Date = VALUES(Expiry_Date),
    Issued_By = VALUES(Issued_By);

    
REPLACE INTO LLR_INFO (LLR_ID, Applicant_Name, Date_of_Birth, Address, Mobile_Number, Email, Application_Date, Status, Expiry_Date, Issued_By)
VALUES
(1, 'John Doe', '1990-01-01', '123 Elm St', '555-0101', 'john@example.com', '2024-01-01', 'Pending', '2025-01-01', 'RTO Office A');




