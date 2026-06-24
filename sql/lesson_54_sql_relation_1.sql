--One-to-One Relation
--Because one key = one car
CREATE TABLE IF NOT EXISTS Car2
 (
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 brand TEXT NOT NULL,
 model TEXT NOT NULL,
 vin_code TEXT NOT NULL UNIQUE
 );
 
CREATE TABLE IF NOT EXISTS Car_Keys
(
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 code CHAR(6) NOT NULL UNIQUE,
 car_id UUID NOT NULL UNIQUE REFERENCES Car2(id)
 );
 
 --One to many relation
 --Because one customer can has many cars
CREATE TABLE IF NOT EXISTS Customers 
 (
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  customer_name TEXT NOT NULL,
  car_id UUID NOT NULL REFERENCES Car2(id)
  );
  
CREATE TABLE IF NOT EXISTS Orders 
 (
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  picked_up_date DATE NOT NULL,
  customer_id UUID NOT NULL REFERENCES Customers(id)
  );
  
ALTER TABLE Orders
DROP COLUMN car_id;