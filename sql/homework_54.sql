-- One-to-one: Person -> Passport
CREATE TABLE IF NOT EXISTS Person
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  full_name TEXT NOT NULL,
  email TEXT UNIQUE
);

CREATE TABLE IF NOT EXISTS Passport
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  person_id UUID NOT NULL UNIQUE REFERENCES Person(id),
  passport_number TEXT NOT NULL UNIQUE,
  issued_date DATE
);

-- One-to-one: Company -> CompanyProfile
CREATE TABLE IF NOT EXISTS Company
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  company_name TEXT NOT NULL,
  registration_number TEXT UNIQUE
);

CREATE TABLE IF NOT EXISTS CompanyProfile
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  company_id UUID NOT NULL UNIQUE REFERENCES Company(id),
  address TEXT,
  founded_year INT
);

-- One-to-many: Category -> Products
CREATE TABLE IF NOT EXISTS Category
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Product
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  name TEXT NOT NULL,
  price INT,
  category_id UUID NOT NULL REFERENCES Category(id)
);
    

CREATE TABLE IF NOT EXISTS Library
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  name TEXT NOT NULL,
  address TEXT
);

CREATE TABLE IF NOT EXISTS Book2
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  title TEXT NOT NULL,
  author TEXT,
  published_date DATE,
  library_id UUID NOT NULL REFERENCES Library(id)
);

-- Many-to-many: Student -> Course = Student_Course 
CREATE TABLE IF NOT EXISTS Student
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Course
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  title TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Student_Course
(
  student_id UUID NOT NULL REFERENCES Student(id),
  course_id  UUID NOT NULL REFERENCES Course(id),
  PRIMARY KEY (student_id, course_id)
);