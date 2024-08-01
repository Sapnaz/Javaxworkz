CREATE DATABASE Classwork;
USE Classwork;
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL UNIQUE,
    course_description VARCHAR(100),
    start_date DATE NOT NULL,
    end_date DATE NOT NULL
);
INSERT INTO students (student_id, first_name, last_name, date_of_birth, email)
VALUES
(1, 'neha', 'sharma', '2002-04-15', 'neha@gmail.com'),
(2, 'rahul', 'jain', '2001-05-22', 'rahul@gmail.com'),
(3, 'naina', 'gupta', '2000-06-10', 'naina@gmail.com'),
(4, 'ravi', 'dube', '2002-07-30', 'ravi@gmail.com'),
(5, 'meena', 'sharma', '2001-08-17', 'meena@gmail.com'),
(6, 'virat', 'kohli', '2000-09-25', 'virat@gmail.com'),
(7, 'anusha', 'sharma', '2002-10-05', 'anusha@gmail.com'),
(8, 'ranveer', 'singh', '2001-11-11', 'ranveer@gmail.com'),
(9, 'wahaj', 'ali', '2000-12-22', 'wahaj@gmail.com'),
(10, 'farhan', 'saheed', '2002-01-14', 'farhan@gmail.com');

INSERT INTO courses (course_id, course_name, course_description, start_date, end_date)
VALUES
(1, 'Mathematics ', 'Introduction to basic mathematics concepts.', '2024-09-01', '2024-12-15'),
(2, 'English Literature', 'Study of English literature.', '2024-09-01', '2024-12-15'),
(3, 'Physics Basics', 'Fundamentals of physics and its applications.', '2024-09-01', '2024-12-15'),
(4, 'Introduction to Chemistry', 'Basics of chemical reactions and compounds.', '2024-09-01', '2024-12-15'),
(5, 'Computer Science', 'Introduction to programming and computer science principles.', '2024-09-01', '2024-12-15'),
(6, 'Biology 101', 'Basic principles of biology and living organisms.', '2024-09-01', '2024-12-15'),
(7, 'Economics', 'Principles of economics and market systems.', '2024-09-01', '2024-12-15'),
(8, 'Geography', 'Study of physical and human geography.', '2024-09-01', '2024-12-15'),
(9, 'Art History', 'Overview of major art movements and styles.', '2024-09-01', '2024-12-15'),
(10, 'Introduction to Philosophy', 'Basic concepts and theories in philosophy.', '2024-09-01', '2024-12-15');

ALTER TABLE courses
MODIFY COLUMN course_description VARCHAR(255);
 
SELECT * FROM students WHERE student_id BETWEEN 3 AND 8;
SELECT * FROM courses WHERE course_id BETWEEN 2 AND 9;

SELECT * FROM students WHERE last_name LIKE 's%' ORDER BY last_name ;

SELECT * FROM courses WHERE course_description LIKE 'B%' LIMIT 1000;

SELECT * FROM students ORDER BY student_id DESC;
SELECT * FROM students ORDER BY student_name ASC;

SELECT * FROM courses WHERE course_description LIKE 'B%' ORDER BY course_description LIMIT 1000;

SELECT UPPER(first_name) AS studename FROM students;
SELECT UPPER(course_name) FROM courses;
SELECT CONCAT(first_name,last_name) AS name FROM students;
SELECT CONCAT(course_id,course_name)  FROM courses;

CREATE INDEX first_namex ON students(first_name);
SELECT * FROM students WHERE first_name='wahaj';

CREATE INDEX course_namex ON courses(course_name);
SELECT * FROM courses WHERE course_name='Physics Basics';
