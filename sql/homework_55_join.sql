CREATE TABLE IF NOT EXISTS Actor
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  actor_name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Movie
(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  movie_title TEXT NOT NULL,
  release_year INT
);

CREATE TABLE IF NOT EXISTS Actor_Movie
(
  actor_id UUID NOT NULL REFERENCES Actor(id),
  movie_id UUID NOT NULL REFERENCES Movie(id),
  role TEXT,
  PRIMARY KEY (actor_id, movie_id)
);

INSERT INTO Actor (actor_name) 
VALUES
  ('Alice Cooper'),
  ('Bob Martin'),
  ('Carol King'),
  ('Dave Lee');


INSERT INTO Movie (movie_title, release_year) VALUES
  ('Space Quest', 2020),
  ('Ocean Tale', 2019),
  ('Lost City', 2021),
  ('Silent Night', 2022);
  
INSERT INTO Actor_Movie (actor_id, movie_id, role)
SELECT a.id, m.id, 'Lead'
FROM Actor a, Movie m
WHERE a.actor_name = 'Alice Cooper' AND m.movie_title = 'Space Quest';

INSERT INTO Actor_Movie (actor_id, movie_id, role)
SELECT a.id, m.id, 'Support'
FROM Actor a, Movie m
WHERE a.actor_name = 'Alice Cooper' AND m.movie_title = 'Ocean Tale';

INSERT INTO Actor_Movie (actor_id, movie_id, role)
SELECT a.id, m.id, 'Support'
FROM Actor a, Movie m
WHERE a.actor_name = 'Bob Martin' AND m.movie_title = 'Space Quest';

INSERT INTO Actor_Movie (actor_id, movie_id, role)
SELECT a.id, m.id, 'Lead'
FROM Actor a, Movie m
WHERE a.actor_name = 'Carol King' AND m.movie_title = 'Lost City';

--Inner join

SELECT 
     a.actor_name, 
     m.movie_title, 
     am.role
FROM Actor a
JOIN Actor_Movie am ON a.id = am.actor_id
JOIN Movie m ON m.id = am.movie_id
ORDER BY a.actor_name, m.movie_title;

--Left join

SELECT a.actor_name, m.movie_title, am.role
FROM Actor a
LEFT JOIN Actor_Movie am ON a.id = am.actor_id
LEFT JOIN Movie m ON m.id = am.movie_id
ORDER BY a.actor_name, m.movie_title;

--Right join

SELECT a.actor_name, m.movie_title, am.role
FROM Actor a
RIGHT JOIN Actor_Movie am ON a.id = am.actor_id
RIGHT JOIN Movie m ON m.id = am.movie_id
ORDER BY m.movie_title, a.actor_name;

--Full join

SELECT a.actor_name, m.movie_title, am.role
FROM Actor a
FULL JOIN Actor_Movie am ON a.id = am.actor_id
FULL JOIN Movie m ON m.id = am.movie_id











