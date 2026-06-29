CREATE TABLE IF NOT EXISTS cars
 (
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 brand TEXT NOT NULL,
 model TEXT NOT NULL,
 vin_code TEXT NOT NULL UNIQUE
 );
 
CREATE TABLE IF NOT EXISTS car_keys
(
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 code CHAR(6) NOT NULL UNIQUE,
 car_id UUID NOT NULL UNIQUE REFERENCES cars(id) ON DELETE CASCADE
 );
 
INSERT INTO cars (brand, model, vin_code)
VALUES ('VW', 'Golf', 123546),
       ('Ford', 'Focus', 345312),
       ('BMW', 'M4', 132434),
       ('Audi', 'Q7', 345123),
       ('BMW', 'X5', 142434),
       ('BMW', 'M3', 132734);
       

INSERT INTO car_keys (code, car_id)
VALUES
  ('455123', 'f3eb6ea9-921a-4a5e-b5b1-4736f1e6044f'),
  ('453127', '9794caf1-e1d9-453c-a397-934378b51c96'),
  ('453128', 'd801c98d-2213-4e4d-add7-c0bcb0e5cce0'),
  ('453129', '276e11af-6d03-486a-884d-f7f196a89fb1'),
  ('453139', '7843508b-b914-40ca-8dce-eb5747e3b852');
       
       

INSERT INTO car_keys (code, car_id)
VALUES
  ('455123', '8b9386d5-bbfe-463e-904b-026c295921ac'),
  ('453127', '978fd16b-c65f-4e23-96ef-649ed39ed94e'),
  ('453128', '1125786b-a52f-484f-9618-71f3aee07b94'),
  ('453129', '828dd36a-a537-4e6a-ab4d-3169b82b8f03'),
  ('453139', '2785d5e7-55a1-4af8-9d35-76ea1127872c');    
       
DELETE FROM cars
WHERE id = 'b3e6b4ec-e9b2-49ea-9a55-81f8d5182811';


SELECT * FROM car_keys
WHERE car_id = '2785d5e7-55a1-4af8-9d35-76ea1127872c'

--Inner Join (пишеться просто як "Join")
SELECT
    cars.id AS car_id,
    cars.brand AS car_brand,
    cars.model AS car_model,
    cars.vin_code AS car_vin,
    car_keys.code AS car_keys_code
FROM cars
JOIN car_keys ON cars.id = car_keys.car_id
WHERE brand = 'BMW';