USE saturday;
CREATE TABLE movie_info (
    movie_id INT , 
    movie_title VARCHAR(255) ,        
    genre VARCHAR(100),                       
    film_director VARCHAR(100),               
    movie_language VARCHAR(50),                    
    summary VARCHAR(1000),                    
    year_released INT,                        
    duration_minutes INT,                     
    rating BIGINT,                            
    revenue BIGINT,                           
    is_available BOOLEAN                      
);
ALTER TABLE movie_info ADD lead_actor VARCHAR(100);
ALTER TABLE movie_info ADD production_company VARCHAR(100);
ALTER TABLE movie_info ADD budget BIGINT;
ALTER TABLE movie_info ADD awards_won INT;
ALTER TABLE movie_info ADD is_streaming BOOLEAN;

ALTER TABLE movie_info RENAME COLUMN movie_title TO title;
ALTER TABLE movie_info RENAME COLUMN film_director TO director;
ALTER TABLE movie_info RENAME COLUMN year_released TO release_year;
ALTER TABLE movie_info RENAME COLUMN duration_minutes TO length_minutes;
ALTER TABLE movie_info RENAME COLUMN revenue TO box_office;

INSERT INTO movie_info  VALUES (1, 'The Matrix', 'Sci-Fi', 'Lana Wachowski, Lilly Wachowski', 'English', 'A computer hacker learns about the true nature of reality and his role in the war against its controllers.', 1999, 136, 8, 465000000, TRUE, 'Keanu Reeves', 'Warner Bros.', 63000000, 4, TRUE);
INSERT INTO movie_info VALUES (2, 'Inception', 'Sci-Fi', 'Christopher Nolan', 'English', 'A thief who steals corporate secrets through dream-sharing technology is given the inverse task of planting an idea.', 2010, 148, 9, 830000000, TRUE, 'Leonardo DiCaprio', 'Warner Bros.', 160000000, 8, TRUE);
INSERT INTO movie_info VALUES (3, 'Interstellar', 'Sci-Fi', 'Christopher Nolan', 'English', 'A team of explorers travel through a wormhole in space in an attempt to ensure humanity\'s survival.', 2014, 169, 9, 677000000, TRUE, 'Matthew McConaughey', 'Paramount Pictures', 165000000, 6, TRUE);
INSERT INTO movie_info VALUES (4, 'The Godfather', 'Crime', 'Francis Ford Coppola', 'English', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', 1972, 175, 9, 246120974, TRUE, 'Marlon Brando', 'Paramount Pictures', 6000000, 29, TRUE);
INSERT INTO movie_info VALUES (5, 'Pulp Fiction', 'Crime', 'Quentin Tarantino', 'English', 'The lives of two mob hitmen, a boxer, a gangster, and his wife intertwine in four tales of violence and redemption.', 1994, 154, 9, 213928762, TRUE, 'John Travolta', 'Miramax', 8000000, 7, TRUE);
INSERT INTO movie_info VALUES (6, 'The Shawshank Redemption', 'Drama', 'Frank Darabont', 'English', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', 1994, 142, 9, 28341469, TRUE, 'Tim Robbins', 'Castle Rock Entertainment', 25000000, 7, TRUE);
INSERT INTO movie_info VALUES (7, 'The Dark Knight', 'Action', 'Christopher Nolan', 'English',  'When the menace known as the Joker emerges, he plunges Gotham into anarchy, forcing Batman closer to crossing the line between hero and vigilante.', 2008, 152, 9, 1004558444, TRUE, 'Christian Bale', 'Warner Bros.', 185000000, 2, TRUE);
INSERT INTO movie_info VALUES (8, 'Forrest Gump', 'Drama', 'Robert Zemeckis', 'English',  'The presidencies of Kennedy and Johnson, Vietnam, Watergate, and other history unfold through the perspective of an Alabama man.',  1994, 142, 8, 678200000, TRUE, 'Tom Hanks', 'Paramount Pictures', 55000000, 6, TRUE);
INSERT INTO movie_info VALUES (9, 'Fight Club', 'Drama', 'David Fincher', 'English',  'An insomniac office worker and a soap salesman form an underground fight club that evolves into something much more.',  1999, 139, 8, 101209702, TRUE, 'Brad Pitt', '20th Century Fox', 63000000, 1, TRUE);
INSERT INTO movie_info VALUES (10, 'Gladiator', 'Action', 'Ridley Scott', 'English',  'A former Roman general sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.', 2000, 155, 8, 460583960, TRUE, 'Russell Crowe', 'DreamWorks', 103000000, 5, TRUE);

UPDATE movie_info SET genre = 'Action', rating = 9 WHERE movie_id = 1;
UPDATE movie_info SET summary = 'A skilled thief is given a chance to have his criminal history erased if he can successfully perform an inception.', is_available = FALSE
WHERE movie_id = 2;
UPDATE movie_info SET lead_actor = 'Anne Hathaway', budget = 170000000 WHERE movie_id = 3;
UPDATE movie_info SET production_company = 'New Paramount', awards_won = 30 WHERE movie_id = 4;
UPDATE movie_info SET length_minutes = 160, is_streaming = FALSE WHERE movie_id = 5;
UPDATE movie_info SET release_year = 1995, box_office = 30000000 WHERE movie_id = 6;
UPDATE movie_info SET movie_language = 'Spanish', budget = 200000000 WHERE movie_id = 7;
UPDATE movie_info SET title = 'Forrest Gump: The New Edition', lead_actor = 'Tom Hanks' WHERE movie_id = 8;
UPDATE movie_info SET genre = 'Thriller', production_company = 'New Fox'WHERE movie_id = 9;
UPDATE movie_info SET rating = 9, is_available = FALSE WHERE movie_id = 10;
UPDATE movie_info SET awards_won = 10, is_streaming = TRUE WHERE movie_id = 11;

DELETE FROM movie_info WHERE movie_id = 1;
DELETE FROM movie_info WHERE movie_id = 4;
DELETE FROM movie_info WHERE movie_id = 7;

SELECT * FROM movie_info WHERE release_year > 2010;
SELECT * FROM movie_info WHERE rating = 9 AND is_streaming = TRUE;
SELECT * FROM movie_info WHERE genre = 'Sci-Fi' OR rating = 10;
SELECT * FROM movie_info WHERE movie_id IN (2, 5, 8);
SELECT * FROM movie_info WHERE movie_id NOT IN (1, 3, 7);

CREATE TABLE bank_details (
    account_id INT ,
    account_holder VARCHAR(255),
    account_type VARCHAR(50),
    branch_name VARCHAR(255),
    currency VARCHAR(10),
    balance BIGINT,
    credit_limit BIGINT,
    interest_rate DECIMAL(5, 2),
    account_status BOOLEAN
);
ALTER TABLE bank_details ADD opening_date DATE;

ALTER TABLE bank_details ADD email VARCHAR(255);

ALTER TABLE bank_details ADD phone_number VARCHAR(15);

ALTER TABLE bank_details ADD address VARCHAR(500);

ALTER TABLE bank_details ADD account_manager VARCHAR(255);

ALTER TABLE bank_details RENAME COLUMN account_holder TO holder_name;

ALTER TABLE bank_details RENAME COLUMN account_type TO type_of_account;

ALTER TABLE bank_details RENAME COLUMN branch_name TO branch_location;

ALTER TABLE bank_details RENAME COLUMN currency TO currency_type;

ALTER TABLE bank_details RENAME COLUMN account_status TO is_active;

INSERT INTO bank_details VALUES (1, 'Alice Johnson', 'Savings', 'Downtown Branch', 'USD', 150000, 50000, 3.5, TRUE, '2022-01-15', 'alice.johnson@example.com', '123-456-7890', '123 Elm Street', 'Robert Smith');
INSERT INTO bank_details VALUES(2, 'Bob Williams', 'Checking', 'Uptown Branch', 'USD', 25000, 10000, 2.0, TRUE, '2023-03-21', 'bob.williams@example.com', '234-567-8901', '456 Oak Avenue', 'Emily Davis');
INSERT INTO bank_details VALUES(3, 'Charlie Brown', 'Business', 'Midtown Branch', 'USD', 300000, 200000, 4.0, FALSE, '2021-06-30', 'charlie.brown@example.com', '345-678-9012', '789 Pine Road', 'Michael Johnson');
INSERT INTO bank_details VALUES(4, 'Diana Prince', 'Savings', 'Downtown Branch', 'EUR', 200000, 60000, 3.0, TRUE, '2020-11-25', 'diana.prince@example.com', '456-789-0123', '321 Maple Street', 'Linda Lee');
INSERT INTO bank_details VALUES(5, 'Eve Adams', 'Checking', 'Uptown Branch', 'USD', 12000, 5000, 2.5, TRUE, '2022-05-18', 'eve.adams@example.com', '567-890-1234', '654 Birch Lane', 'David Green');
INSERT INTO bank_details VALUES(6, 'Frank Castle', 'Savings', 'Midtown Branch', 'GBP', 80000, 20000, 3.8, TRUE, '2021-09-10', 'frank.castle@example.com', '678-901-2345', '987 Cedar Drive', 'Sarah Brown');
INSERT INTO bank_details VALUES(7, 'Grace Lee', 'Business', 'Downtown Branch', 'USD', 500000, 300000, 4.5, TRUE, '2022-07-15', 'grace.lee@example.com', '789-012-3456', '321 Birch Street', 'James Wilson');
INSERT INTO bank_details VALUES(8, 'Henry Clark', 'Checking', 'Uptown Branch', 'USD', 6000, 2000, 2.2, FALSE, '2023-01-01', 'henry.clark@example.com', '890-123-4567', '456 Willow Avenue', 'Nancy Davis');
INSERT INTO bank_details VALUES(9, 'Isabel Martinez', 'Savings', 'Midtown Branch', 'EUR', 75000, 25000, 3.7, TRUE, '2020-12-12', 'isabel.martinez@example.com', '901-234-5678', '654 Elm Street', 'Steven Harris');
INSERT INTO bank_details VALUES(10, 'Jack Smith', 'Business', 'Downtown Branch', 'USD', 400000, 150000, 4.2, TRUE, '2021-10-30', 'jack.smith@example.com', '012-345-6789', '789 Oak Lane', 'Laura Brown');

UPDATE bank_details SET balance = 160000, email = 'alice.johnson@newdomain.com'WHERE account_id = 1;
UPDATE bank_details SET credit_limit = 12000, phone_number = '234-567-9999' WHERE account_id = 2;
UPDATE bank_details SET interest_rate = 4.2, address = '789 Pine Road, Apt 2B' WHERE account_id = 3;
UPDATE bank_details SET currency_type = 'USD', is_active = FALSE WHERE account_id = 4;
UPDATE bank_details SET opening_date = '2022-06-15', account_manager = 'Paul Thompson' WHERE account_id = 5;
UPDATE bank_details SET balance = 85000, email = 'frank.castle@updatedmail.com'WHERE account_id = 6;
UPDATE bank_details SET credit_limit = 320000, phone_number = '789-012-3456' WHERE account_id = 7;
UPDATE bank_details SET branch_location = 'New Branch', is_active = TRUE WHERE account_id = 8;
UPDATE bank_details SET address = '789 Cedar Drive', account_manager = 'Rachel Adams' WHERE account_id = 9;
UPDATE bank_details SET balance = 420000, interest_rate = 4.3 WHERE account_id = 10;

DELETE FROM bank_details WHERE account_id = 1;
DELETE FROM bank_details WHERE account_id = 4;
DELETE FROM bank_details WHERE account_id = 7;

SELECT *  FROM bank_details WHERE balance > 50000;
SELECT *  FROM bank_details WHERE type_of_account = 'Savings' AND balance < 100000;
SELECT * FROM bank_details WHERE branch_location = 'Uptown Branch' OR interest_rate > 3.5;
SELECT * FROM bank_details WHERE account_id IN (2, 5, 8);
SELECT * FROM bank_details WHERE account_id NOT IN (3, 6, 9);

SELECT * FROM movie_info;