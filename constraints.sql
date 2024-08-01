CREATE DATABASE Constrains;
USE Constrains;

-- Creating the tables
CREATE TABLE show_room (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    capacity INT,
    open_time TIME,
    close_time TIME,
    phone_number VARCHAR(15) UNIQUE,
    email VARCHAR(100) UNIQUE,
    rating DECIMAL(2, 1) CHECK (rating >= 0 AND rating <= 5),
    manager_id INT
);

CREATE TABLE chat_center (
    id INT PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL,
    message TEXT NOT NULL,
    timestamp TIMESTAMP,
    user_id INT,
    chat_room_id INT,
    is_active BOOLEAN,
    ip_address VARCHAR(45) UNIQUE,
    email VARCHAR(100) UNIQUE,
    message_length INT CHECK (message_length > 0)
);

CREATE TABLE temple_info (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    deity VARCHAR(100) NOT NULL,
    location VARCHAR(100),
    establishment_year INT,
    open_time TIME,
    close_time TIME,
    contact_number VARCHAR(15) UNIQUE,
    email VARCHAR(100) UNIQUE,
    rating DECIMAL(2, 1) CHECK (rating >= 0 AND rating <= 5)
);

CREATE TABLE market_info (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    opening_date DATE,
    open_time TIME,
    close_time TIME,
    number_of_shops INT,
    phone_number VARCHAR(15) UNIQUE,
    email VARCHAR(100) UNIQUE,
    average_rating DECIMAL(2, 1) CHECK (average_rating >= 0 AND average_rating <= 5)
);

CREATE TABLE metro_info (
    id INT PRIMARY KEY,
    station_name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    lines_served INT,
    open_time TIME,
    close_time TIME,
    contact_number VARCHAR(15) UNIQUE,
    email VARCHAR(100) UNIQUE,
    cleanliness_rating DECIMAL(2, 1) CHECK (cleanliness_rating >= 0 AND cleanliness_rating <= 5),
    manager_id INT
);

-- Inserting data into show_room
INSERT INTO show_room VALUES
(1, 'puma', 'Bengaluru', 50, '09:00', '18:00', '123-456-7890', 'email1@example.com', 4.5, 101),
(2, 'adidas', 'Mangalore', 75, '10:00', '19:00', '123-456-7891', 'email2@example.com', 4.0, 102),
(3, 'zara', 'hubli', 60, '08:00', '17:00', '123-456-7892', 'email3@example.com', 4.7, 103),
(4, 'max', 'dharwad', 90, '11:00', '20:00', '123-456-7893', 'email4@example.com', 4.2, 104),
(5, 'puma', 'delhi', 45, '09:30', '18:30', '123-456-7894', 'email5@example.com', 4.6, 105),
(6, 'rio', 'mumbai', 55, '10:30', '19:30', '123-456-7895', 'email6@example.com', 4.3, 106),
(7, 'max', 'hyderabad', 70, '08:30', '17:30', '123-456-7896', 'email7@example.com', 4.8, 107),
(8, 'Soch', 'bihar', 65, '09:15', '18:15', '123-456-7897', 'email8@example.com', 4.1, 108),
(9, 'puma', 'patna', 80, '10:15', '19:15', '123-456-7898', 'email9@example.com', 4.4, 109),
(10, 'soch', 'kerala', 85, '11:15', '20:15', '123-456-7899', 'email10@example.com', 4.9, 110),
(11, 'gap', 'kochi', 100, '08:00', '17:00', '223-456-7890', 'email11@example.com', 3.9, 111),
(12, 'max', 'lucknow', 120, '09:00', '18:00', '223-456-7891', 'email12@example.com', 4.0, 112),
(13, 'puma', 'kolkatta', 110, '10:00', '19:00', '223-456-7892', 'email13@example.com', 4.1, 113),
(14, 'puma', 'up', 130, '11:00', '20:00', '223-456-7893', 'email14@example.com', 4.2, 114),
(15, 'max', 'mp', 95, '08:30', '17:30', '223-456-7894', 'email15@example.com', 4.3, 115),
(16, 'biba', 'delhi', 105, '09:30', '18:30', '223-456-7895', 'email16@example.com', 4.4, 116),
(17, 'people', 'Ladakh', 115, '10:30', '19:30', '223-456-7896', 'email17@example.com', 4.5, 117),
(18, 'gucci', 'kashmir', 125, '11:30', '20:30', '223-456-7897', 'email18@example.com', 4.6, 118),
(19, 'prada', 'manali', 135, '08:45', '17:45', '223-456-7898', 'email19@example.com', 4.7, 119),
(20, 'max', 'kulu', 140, '09:45', '18:45', '223-456-7899', 'email20@example.com', 4.8, 120);


ALTER TABLE show_room
MODIFY email VARCHAR(100) NOT NULL;
ALTER TABLE show_room
ADD CONSTRAINT check_rating CHECK (rating >= 0 AND rating <= 5);
-- Inserting data into chat_center

INSERT INTO chat_center VALUES
(1, 'nita', 'Hello!', CURRENT_TIMESTAMP, 201, 301, TRUE, '192.168.1.1', 'user1@example.com', 6),
(2, 'hema', 'Hi there!', CURRENT_TIMESTAMP, 202, 302, TRUE, '192.168.1.2', 'user2@example.com', 8),
(3, 'pooja', 'Good morning!', CURRENT_TIMESTAMP, 203, 303, TRUE, '192.168.1.3', 'user3@example.com', 13),
(4, 'megha', 'Good afternoon!', CURRENT_TIMESTAMP, 204, 304, TRUE, '192.168.1.4', 'user4@example.com', 15),
(5, 'nithya', 'Good evening!', CURRENT_TIMESTAMP, 205, 305, TRUE, '192.168.1.5', 'user5@example.com', 14),
(6, 'kavya', 'How are you?', CURRENT_TIMESTAMP, 206, 306, TRUE, '192.168.1.6', 'user6@example.com', 11),
(7, 'karthik', 'I am fine.', CURRENT_TIMESTAMP, 207, 307, TRUE, '192.168.1.7', 'user7@example.com', 10),
(8, 'nitha', 'What about you?', CURRENT_TIMESTAMP, 208, 308, TRUE, '192.168.1.8', 'user8@example.com', 12),
(9, 'amith', 'I am good too.', CURRENT_TIMESTAMP, 209, 309, TRUE, '192.168.1.9', 'user9@example.com', 13),
(10, 'anil', 'Have a nice day!', CURRENT_TIMESTAMP, 210, 310, TRUE, '192.168.1.10', 'user10@example.com', 14),
(11, 'tarun', 'See you later.', CURRENT_TIMESTAMP, 211, 311, TRUE, '192.168.1.11', 'user11@example.com', 11),
(12, 'varun', 'Take care!', CURRENT_TIMESTAMP, 212, 312, TRUE, '192.168.1.12', 'user12@example.com', 9),
(13, 'sunitha', 'Bye!', CURRENT_TIMESTAMP, 213, 313, TRUE, '192.168.1.13', 'user13@example.com', 8),
(14, 'pushpa', 'Goodbye!', CURRENT_TIMESTAMP, 214, 314, TRUE, '192.168.1.14', 'user14@example.com', 7),
(15, 'keerthi', 'How is it going?', CURRENT_TIMESTAMP, 215, 315, TRUE, '192.168.1.15', 'user15@example.com', 15),
(16, 'shruthi', 'All good here.', CURRENT_TIMESTAMP, 216, 316, TRUE, '192.168.1.16', 'user16@example.com', 14),
(17, 'sneha', 'What’s new?', CURRENT_TIMESTAMP, 217, 317, TRUE, '192.168.1.17', 'user17@example.com', 13),
(18, 'vidya', 'Not much.', CURRENT_TIMESTAMP, 218, 318, TRUE, '192.168.1.18', 'user18@example.com', 12),
(19, 'anagha', 'See you tomorrow.', CURRENT_TIMESTAMP, 219, 319, TRUE, '192.168.1.19', 'user19@example.com', 10),
(20, 'sanju', 'Let’s catch up soon.', CURRENT_TIMESTAMP, 220, 320, TRUE, '192.168.1.20', 'user20@example.com', 9);

ALTER TABLE chat_center
MODIFY message VARCHAR(255) NOT NULL;

ALTER TABLE chat_center
ADD CONSTRAINT check_user_id CHECK (user_id > 0);

-- Inserting data into temple_info
INSERT INTO temple_info VALUES
(1, 'Sri Venkateswara Temple', 'Deity 1', 'pune', 1990, '06:00', '20:00', '123-456-7890', 'temple1@example.com', 4.7);
INSERT INTO temple_info VALUES(2, 'Akshardham Temple', 'Deity 2', 'delhi', 1985, '05:00', '21:00', '123-456-7891', 'temple2@example.com', 4.5);
INSERT INTO temple_info VALUES(3, 'Meenakshi Temple', 'Deity 3', 'bihar', 2000, '07:00', '19:00', '123-456-7892', 'temple3@example.com', 4.8);
INSERT INTO temple_info VALUES(4, 'Shri Jagannath Temple', 'Deity 4', 'up', 1975, '08:00', '18:00', '123-456-7893', 'temple4@example.com', 4.6);
INSERT INTO temple_info VALUES(5, 'Kashi Vishwanath Temple', 'Deity 5', 'mp', 1960, '06:30', '20:30', '123-456-7894', 'temple5@example.com', 4.9);
INSERT INTO temple_info VALUES(6, 'Brihadeeswarar Temple', 'Deity 6', 'surat', 1950, '07:30', '19:30', '123-456-7895', 'temple6@example.com', 4.4);
INSERT INTO temple_info VALUES(7, 'Somnath Temple', 'Deity 7', 'jaipur', 1980, '08:30', '18:30', '123-456-7896', 'temple7@example.com', 4.5);
INSERT INTO temple_info VALUES(8, 'Kedarnath Temple', 'Deity 8', 'kashmir', 1995, '09:30', '17:30', '123-456-7897', 'temple8@example.com', 4.7);
INSERT INTO temple_info VALUES(9, 'Rameshwaram Temple', 'Deity 9', 'ajmer', 2005, '06:45', '19:45', '123-456-7898', 'temple9@example.com', 4.8);
INSERT INTO temple_info VALUES(10, 'Siddhivinayak Temple', 'Deity 10', 'udaipur', 2010, '07:45', '18:45', '123-456-7899', 'temple10@example.com', 4.6);
INSERT INTO temple_info VALUES(11, 'Lingaraj Temple', 'Deity 11', 'puri', 1992, '08:00', '20:00', '223-456-7890', 'temple11@example.com', 4.5);
INSERT INTO temple_info VALUES(12, 'Tirupati Balaji Temple', 'Deity 12', 'kerala', 1987, '09:00', '21:00', '223-456-7891', 'temple12@example.com', 4.4);
INSERT INTO temple_info VALUES(13, 'Dwarkadhish Temple', 'Deity 13', 'kochi', 2001, '10:00', '19:00', '223-456-7892', 'temple13@example.com', 4.3);
INSERT INTO temple_info VALUES(14, 'Vaishno Devi Temple', 'Deity 14', 'hubli', 1993, '06:00', '18:00', '223-456-7893', 'temple14@example.com', 4.2);
INSERT INTO temple_info VALUES(15, 'Konark Sun Temple', 'Deity 15', 'dharwad', 1983, '07:00', '20:00', '223-456-7894', 'temple15@example.com', 4.1);
INSERT INTO temple_info VALUES(16, 'Golden Temple', 'Deity 16', 'kolar', 1978, '08:00', '21:00', '223-456-7895', 'temple16@example.com', 4.0);
INSERT INTO temple_info VALUES(17, 'Sanchi Stupa', 'Deity 17', 'mysore', 1965, '09:00', '17:00', '223-456-7896', 'temple17@example.com', 3.9);
INSERT INTO temple_info VALUES(18, 'Lotus Temple', 'Deity 18', 'kadur', 1970, '10:00', '18:00', '223-456-7897', 'temple18@example.com', 3.8);
INSERT INTO temple_info VALUES(19, 'Kailasa Temple', 'Deity 19', 'birur', 1988, '06:30', '19:30', '223-456-7898', 'temple19@example.com', 4.7);
INSERT INTO temple_info VALUES(20, 'Mahabodhi Temple', 'Deity 20', 'tarikere', 1996, '07:30', '18:30', '223-456-7899', 'temple20@example.com', 4.6);

ALTER TABLE temple_info
ADD CONSTRAINT unique_email UNIQUE (email);

-- Inserting data into market_info
INSERT INTO market_info VALUES
(1, 'Chandni Chowk', 'delhi', '2020-01-01', '08:00', '22:00', 100, '123-456-7890', 'market1@example.com', 4.3),
(2, 'Colaba Causeway', 'mumbai', '2019-06-15', '09:00', '21:00', 150, '123-456-7891', 'market2@example.com', 4.1),
(3, 'Sarojini Nagar Market', 'delhi', '2018-02-20', '10:00', '20:00', 200, '123-456-7892', 'market3@example.com', 4.5),
(4, 'Crawford Market', 'mumbai', '2017-07-10', '11:00', '19:00', 250, '123-456-7893', 'market4@example.com', 4.2),
(5, 'Johari Bazaar', 'jaipur', '2016-03-30', '12:00', '18:00', 300, '123-456-7894', 'market5@example.com', 4.4),
(6, 'Commercial Street', 'bangalore', '2015-11-25', '08:30', '22:30', 350, '123-456-7895', 'market6@example.com', 4.6),
(7, 'Laad Bazaar ', 'hyderabad', '2014-05-05', '09:30', '21:30', 400, '123-456-7896', 'market7@example.com', 4.8),
(8, 'New Market ', 'kolkatta', '2013-09-15', '10:30', '20:30', 450, '123-456-7897', 'market8@example.com', 4.7),
(9, 'FC Road Market', 'pune', '2012-12-10', '11:30', '19:30', 500, '123-456-7898', 'market9@example.com', 4.5),
(10, 'Anjuna Flea Market', 'goa', '2011-08-25', '12:30', '18:30', 550, '123-456-7899', 'market10@example.com', 4.4),
(11, 'Connaught Place ', 'delhi', '2010-01-01', '08:00', '22:00', 600, '223-456-7890', 'market11@example.com', 4.3),
(12, 'Lajpat Nagar Market ', 'delhi', '2009-06-15', '09:00', '21:00', 650, '223-456-7891', 'market12@example.com', 4.2),
(13, 'Zaveri Bazaar ', 'mumbai', '2008-02-20', '10:00', '20:00', 700, '223-456-7892', 'market13@example.com', 4.1),
(14, 'Begum Bazaar', 'hyderabad', '2007-07-10', '11:00', '19:00', 750, '223-456-7893', 'market14@example.com', 4.0),
(15, 'Janpath Market', 'delhi', '2006-03-30', '12:00', '18:00', 800, '223-456-7894', 'market15@example.com', 3.9),
(16, 'Russel Market ', 'bangalore', '2005-11-25', '08:30', '22:30', 850, '223-456-7895', 'market16@example.com', 3.8),
(17, 'Fashion Street', 'Mumbai', '2004-05-05', '09:30', '21:30', 900, '223-456-7896', 'market17@example.com', 3.7),
(18, 'Palladium Mall ', 'mumbai', '2003-09-15', '10:30', '20:30', 950, '223-456-7897', 'market18@example.com', 3.6),
(19, 'T. Nagar', 'chennai', '2002-12-10', '11:30', '19:30', 1000, '223-456-7898', 'market19@example.com', 3.5),
(20, 'Manek Chowk', 'Ahmedabad', '2001-08-25', '12:30', '18:30', 1050, '223-456-7899', 'market20@example.com', 3.4);

-- Adding a NOT NULL constraint
ALTER TABLE market_info
MODIFY COLUMN email VARCHAR(100) NOT NULL;

-- Adding a UNIQUE constraint
ALTER TABLE market_info
ADD CONSTRAINT unique_market_phone UNIQUE (phone);

-- Adding CHECK constraints
ALTER TABLE market_info
ADD CONSTRAINT check_rating CHECK (rating >= 0 AND rating <= 5);

ALTER TABLE market_info
ADD CONSTRAINT check_opening_hour CHECK (opening_hour >= '06:00' AND opening_hour <= '22:00');

-- Inserting data into metro_info
INSERT INTO metro_info VALUES
(1, 'Central Station', 'New York', 3, '05:00', '23:00', '123-456-7890', 'station1@example.com', 4.6, 501),
(2, 'Union Station','Los Angeles', 2, '06:00', '22:00', '123-456-7891', 'station2@example.com', 4.4, 502),
(3, 'Kings Cross','London', 4, '07:00', '21:00', '123-456-7892', 'station3@example.com', 4.8, 503),
(4, 'Shinjuku Station', ' Tokyo', 1, '08:00', '20:00', '123-456-7893', 'station4@example.com', 4.2, 504),
(5, 'Gare du Nord',' Paris', 5, '05:30', '23:30', '123-456-7894', 'station5@example.com', 4.5, 505),
(6, 'Berlin Hauptbahnhof','Berlin', 3, '06:30', '22:30', '123-456-7895', 'station6@example.com', 4.7, 506),
(7, 'Penn Station', 'New York', 2, '07:30', '21:30', '123-456-7896', 'station7@example.com', 4.1, 507),
(8, 'Chhatrapati Shivaji Maharaj Terminus',' Mumbai', 4, '08:30', '20:30', '123-456-7897', 'station8@example.com', 4.9, 508),
(9, 'Sydney Central Station','Sydney', 1, '05:45', '23:45', '123-456-7898', 'station9@example.com', 4.3, 509),
(10, 'Seoul Station','Seoul', 5, '06:45', '22:45', '123-456-7899', 'station10@example.com', 4.6, 510),
(11, 'Roma Termini','Rome', 3, '07:00', '21:00', '223-456-7890', 'station11@example.com', 4.8, 511),
(12, 'São Bento Station','Porto', 2, '08:00', '20:00', '223-456-7891', 'station12@example.com', 4.2, 512),
(13, 'Kyoto Station','Kyoto', 4, '09:00', '19:00', '223-456-7892', 'station13@example.com', 4.5, 513),
(14, 'Beijing Railway Station', 'Beijing', 1, '05:00', '23:00', '223-456-7893', 'station14@example.com', 4.7, 514),
(15, 'Moscow Kazansky Railway Station',' Moscow', 5, '06:00', '22:00', '223-456-7894', 'station15@example.com', 4.9, 515),
(16, 'Grand Central Terminal','New York', 3, '07:00', '21:00', '223-456-7895', 'station16@example.com', 4.4, 516),
(17, 'Amsterdam Centraal','Amsterdam', 2, '08:00', '20:00', '223-456-7896', 'station17@example.com', 4.6, 517),
(18, 'Zurich Hauptbahnhof','Zurich', 4, '05:30', '23:30', '223-456-7897', 'station18@example.com', 4.3, 518),
(19, 'Mumbai Central',' Mumbai', 1, '06:30', '22:30', '223-456-7898', 'station19@example.com', 4.8, 519),
(20, 'Bangkok Railway Station','Bangkok', 5, '07:30', '21:30', '223-456-7899', 'station20@example.com', 4.5, 520);

-- Adding a NOT NULL constraint
ALTER TABLE metro_info MODIFY COLUMN lines_served INT NOT NULL;

-- Adding another UNIQUE constraint
ALTER TABLE metro_info ADD CONSTRAINT unique_manager_id UNIQUE (manager_id);

-- Adding additional CHECK constraints
ALTER TABLE metro_info ADD CONSTRAINT check_close_time CHECK (close_time >= '20:00');

ALTER TABLE metro_info ADD CONSTRAINT check_lines_served CHECK (lines_served > 0);

