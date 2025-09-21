INSERT INTO types (id, name) VALUES
(1, 'Normal'),
(2, 'Fighting'),
(3, 'Flying'),
(4, 'Poison'),
(5, 'Ground'),
(6, 'Rock'),
(7, 'Bug'),
(8, 'Ghost'),
(9, 'Steel'),
(10, 'Fire'),
(11, 'Water'),
(12, 'Grass'),
(13, 'Electric'),
(14, 'Psychic'),
(15, 'Ice'),
(16, 'Dragon'),
(17, 'Dark'),
(18, 'Fairy')
;

-- attacks type normal
INSERT INTO type_effectiveness (attack_id, defend_id, multiplier) VALUES
-- Attacks from Normal (1)
(1, 1, 1.0),  -- Normal vs Normal
(1, 2, 1.0),  -- Normal vs Fighting
(1, 3, 1.0),
(1, 4, 1.0),
(1, 5, 1.0),
(1, 6, 0.5),  -- Rock resists Normal
(1, 7, 1.0),
(1, 8, 0.0),  -- Ghost immune to Normal
(1, 9, 0.5),  -- Steel resists Normal
(1, 10, 1.0), -- Fire
(1, 11, 1.0), -- Water
(1, 12, 1.0), -- Grass
(1, 13, 1.0), -- Electric
(1, 14, 1.0), -- Psychic
(1, 15, 1.0), -- Ice
(1, 16, 1.0), -- Dragon
(1, 17, 1.0), -- Dark
(1, 18, 1.0), -- Fairy
-- Attacks from Fighting (2)
(2, 1, 2.0),  -- Normal
(2, 2, 1.0),  -- Fighting
(2, 3, 0.5),  -- Flying
(2, 4, 0.5),  -- Poison
(2, 5, 1.0),  -- Ground
(2, 6, 2.0),  -- Rock
(2, 7, 0.5),  -- Bug
(2, 8, 0.0),  -- Ghost (no effect)
(2, 9, 2.0),  -- Steel
(2, 10, 1.0),  -- Fire
(2, 11, 1.0),  -- Water
(2, 12, 1.0),  -- Grass
(2, 13, 1.0),  -- Electric
(2, 14, 0.5),  -- Psychic
(2, 15, 2.0),  -- Ice
(2, 16, 1.0),  -- Dragon
(2, 17, 2.0),  -- Dark
(2, 18, 0.5),  -- Fairy
-- Attacks from Flying (3)
(3, 1, 1.0), -- Normal
(3, 2, 2.0), -- Fighting
(3, 3, 1.0), -- Flying
(3, 4, 1.0), -- Poison
(3, 5, 1.0), -- Ground
(3, 6, 0.5), -- Rock
(3, 7, 2.0), -- Bug
(3, 8, 1.0), -- Ghost
(3, 9, 0.5), -- Steel
(3, 10, 1.0), -- Fire
(3, 11, 1.0), -- Water
(3, 12, 2.0), -- Grass
(3, 13, 0.5), -- Electric
(3, 14, 1.0), -- Psychic
(3, 15, 1.0), -- Ice
(3, 16, 1.0), -- Dragon
(3, 17, 1.0), -- Dark
(3, 18, 1.0),  -- Fairy
-- Attacks from Poison (4)
(4, 1, 1.0), -- Normal
(4, 2, 1.0), -- Fighting
(4, 3, 1.0), -- Flying
(4, 4, 0.5), -- Poison
(4, 5, 0.5), -- Ground
(4, 6, 0.5), -- Rock
(4, 7, 1.0), -- Bug
(4, 8, 0.5), -- Ghost
(4, 9, 0.0), -- Steel (inmune)
(4, 10, 1.0), -- Fire
(4, 11, 1.0), -- Water
(4, 12, 2.0), -- Grass
(4, 13, 1.0), -- Electric
(4, 14, 1.0), -- Psychic
(4, 15, 1.0), -- Ice
(4, 16, 1.0), -- Dragon
(4, 17, 1.0), -- Dark
(4, 18, 2.0),  -- Fairy
-- Attacks from Ground
(5, 1, 1.0), -- Normal
(5, 2, 1.0), -- Fighting
(5, 3, 0.0), -- Flying
(5, 4, 2.0), -- Poison
(5, 5, 1.0), -- Ground
(5, 6, 2.0), -- Rock
(5, 7, 0.5), -- Bug
(5, 8, 1.0), -- Ghost
(5, 9, 2.0), -- Steel
(5, 10, 2.0), -- Fire
(5, 11, 1.0), -- Water
(5, 12, 0.5), -- Grass
(5, 13, 2.0), -- Electric
(5, 14, 1.0), -- Psychic
(5, 15, 1.0), -- Ice
(5, 16, 1.0), -- Dragon
(5, 17, 1.0), -- Dark
(5, 18, 1.0), -- Fairy
-- Attacks from Rock (6)
(6, 1, 1.0), -- Normal
(6, 2, 0.5), -- Fighting
(6, 3, 2.0), -- Flying
(6, 4, 1.0), -- Poison
(6, 5, 0.5), -- Ground
(6, 6, 1.0), -- Rock
(6, 7, 2.0), -- Bug
(6, 8, 1.0), -- Ghost
(6, 9, 0.5), -- Steel
(6, 10, 2.0), -- Fire
(6, 11, 1.0), -- Water
(6, 12, 1.0), -- Grass
(6, 13, 1.0), -- Electric
(6, 14, 1.0), -- Psychic
(6, 15, 2.0), -- Ice
(6, 16, 1.0), -- Dragon
(6, 17, 1.0), -- Dark
(6, 18, 1.0), -- Fairy
-- Attacks from Bug (7)
(7, 1, 1.0), -- Normal
(7, 2, 0.5), -- Fighting
(7, 3, 0.5), -- Flying
(7, 4, 0.5), -- Poison
(7, 5, 1.0), -- Ground
(7, 6, 1.0), -- Rock
(7, 7, 1.0), -- Bug
(7, 8, 0.5), -- Ghost
(7, 9, 0.5), -- Steel
(7, 10, 0.5), -- Fire
(7, 11, 1.0), -- Water
(7, 12, 2.0), -- Grass
(7, 13, 1.0), -- Electric
(7, 14, 2.0), -- Psychic
(7, 15, 1.0), -- Ice
(7, 16, 1.0), -- Dragon
(7, 17, 1.0), -- Dark
(7, 18, 0.5), -- Fairy
-- Attacks from Ghost (8)
(8, 1, 0.0), -- Normal
(8, 2, 1.0), -- Fighting
(8, 3, 1.0), -- Flying
(8, 4, 1.0), -- Poison
(8, 5, 1.0), -- Ground
(8, 6, 1.0), -- Rock
(8, 7, 1.0), -- Bug
(8, 8, 2.0), -- Ghost
(8, 9, 1.0), -- Steel
(8, 10, 1.0), -- Fire
(8, 11, 1.0), -- Water
(8, 12, 1.0), -- Grass
(8, 13, 1.0), -- Electric
(8, 14, 2.0), -- Psychic
(8, 15, 1.0), -- Ice
(8, 16, 1.0), -- Dragon
(8, 17, 0.5), -- Dark
(8, 18, 1.0), -- Fairy
-- Attacks from Steel (9)
(9, 1, 1.0), -- Normal
(9, 2, 1.0), -- Fighting
(9, 3, 1.0), -- Flying
(9, 4, 1.0), -- Poison
(9, 5, 1.0), -- Ground
(9, 6, 2.0), -- Rock
(9, 7, 1.0), -- Bug
(9, 8, 1.0), -- Ghost
(9, 9, 0.5), -- Steel
(9, 10, 0.5), -- Fire
(9, 11, 0.5), -- Water
(9, 12, 1.0), -- Grass
(9, 13, 0.5), -- Electric
(9, 14, 1.0), -- Psychic
(9, 15, 2.0), -- Ice
(9, 16, 1.0), -- Dragon
(9, 17, 1.0), -- Dark
(9, 18, 2.0), -- Fairy
-- Attacks from Fire
(10, 1, 1.0), -- Normal
(10, 2, 1.0), -- Fighting
(10, 3, 1.0), -- Flying
(10, 4, 1.0), -- Poison
(10, 5, 1.0), -- Ground
(10, 6, 0.5), -- Rock
(10, 7, 2.0), -- Bug
(10, 8, 1.0), -- Ghost
(10, 9, 2.0), -- Steel
(10, 10, 0.5), -- Fire
(10, 11, 0.5), -- Water
(10, 12, 2.0), -- Grass
(10, 13, 1.0), -- Electric
(10, 14, 1.0), -- Psychic
(10, 15, 2.0), -- Ice
(10, 16, 0.5), -- Dragon
(10, 17, 1.0), -- Dark
(10, 18, 1.0), -- Fairy
-- Attacks from Water
(11, 1, 1.0), -- normal
(11, 2, 1.0), -- Fighting
(11, 3, 1.0), -- Flying
(11, 4, 1.0), -- Poison
(11, 5, 2.0), -- Ground
(11, 6, 2.0), -- Rock
(11, 7, 1.0), -- Bug
(11, 8, 1.0), -- Ghost
(11, 9, 1.0), -- Steel
(11, 10, 2.0), -- Fire
(11, 11, 0.5), -- Water
(11, 12, 0.5), -- Grass
(11, 13, 1.0), -- Electric
(11, 14, 1.0), -- Psychic
(11, 15, 1.0), -- Ice
(11, 16, 0.5), -- Dragon
(11, 17, 1.0), -- Dark
(11, 18, 1.0), -- Fairy
-- Attacks from Grass
(12, 1, 1.0), -- Normal
(12, 2, 1.0), -- Fighting
(12, 3, 0.5), -- Flying
(12, 4, 0.5), -- Poison
(12, 5, 2.0), -- Ground
(12, 6, 2.0), -- Rock
(12, 7, 0.5), -- Bug
(12, 8, 1.0), -- Ghost
(12, 9, 0.5), -- Steel
(12, 10, 0.5), -- Fire
(12, 11, 2.0), -- Water
(12, 12, 0.5), -- Grass
(12, 13, 1.0), -- Electric
(12, 14, 1.0), -- Psychic
(12, 15, 1.0), -- Ice
(12, 16, 0.5), -- Dragon
(12, 17, 1.0), -- Dark
(12, 18, 1.0), -- Fairy
-- Attacks from Electric (13)
(13, 1, 1.0), -- Normal
(13, 2, 1.0), -- Fighting
(13, 3, 2.0), -- Flying
(13, 4, 1.0), -- Poison
(13, 5, 0.0), -- Ground
(13, 6, 1.0), -- Rock
(13, 7, 1.0), -- Bug
(13, 8, 1.0), -- Ghost
(13, 9, 1.0), -- Steel
(13, 10, 1.0), -- Fire
(13, 11, 2.0), -- Water
(13, 12, 0.5), -- Grass
(13, 13, 0.5), -- Electric
(13, 14, 1.0), -- Psychic
(13, 15, 1.0), -- Ice
(13, 16, 0.5), -- Dragon
(13, 17, 1.0), -- Dark
(13, 18, 1.0), -- Fairy
-- Attacks from Psychic
(14, 1, 1.0), -- Normal
(14, 2, 2.0), -- Fighting
(14, 3, 1.0), -- Flying
(14, 4, 2.0), -- Posion
(14, 5, 1.0), -- Ground
(14, 6, 1.0), -- Rock
(14, 7, 1.0), -- Bug
(14, 8, 1.0), -- Ghost
(14, 9, 0.5), -- Steel
(14, 10, 1.0), -- Fire
(14, 11, 1.0), -- Water
(14, 12, 1.0), -- Grass
(14, 13, 1.0), -- Electric
(14, 14, 0.5), -- Psychic
(14, 15, 1.0), -- Ice
(14, 16, 1.0), -- Dragon
(14, 17, 0.0), -- Dark
(14, 18, 1.0), -- Fairy
-- Attacks from Ice
(15, 1, 1.0),
(15, 2, 1.0),
(15, 3, 2.0),
(15, 4, 1.0),
(15, 5, 2.0),
(15, 6, 1.0),
(15, 7, 1.0),
(15, 8, 1.0),
(15, 9, 0.5),
(15, 10, 0.5),
(15, 11, 0.5),
(15, 12, 2.0),
(15, 13, 1.0),
(15, 14, 1.0),
(15, 15, 0.5),
(15, 16, 2.0),
(15, 17, 1.0),
(15, 18, 1.0),
-- Attacks from Dragon
(16, 1, 1.0), -- Normal
(16, 2, 1.0), -- Fighting
(16, 3, 1.0), -- Flying
(16, 4, 1.0), -- Posion
(16, 5, 1.0), -- Ground
(16, 6, 1.0), -- Rock
(16, 7, 1.0), -- Bug
(16, 8, 1.0), -- Ghost
(16, 9, 0.5), -- Steel
(16, 10, 1.0), -- Fire
(16, 11, 1.0), -- Water
(16, 12, 1.0), -- Grass
(16, 13, 1.0), -- Electric
(16, 14, 1.0),-- Psychic
(16, 15, 1.0), -- Ice
(16, 16, 2.0), -- Dragon
(16, 17, 1.0), -- Dark
(16, 18, 0.0),  -- Fairy
-- Attacks from Dark
(17, 1, 1.0), -- Normal
(17, 2, 0.5), -- Fighting
(17, 3, 1.0), -- Flying
(17, 4, 1.0), -- Posion
(17, 5, 1.0), -- Ground
(17, 6, 1.0), -- Rock
(17, 7, 1.0), -- Bug
(17, 8, 2.0), -- Ghost
(17, 9, 1.0), -- Steel
(17, 10, 1.0), -- Fire
(17, 11, 1.0), -- Water
(17, 12, 1.0), -- Grass
(17, 13, 1.0), -- Electric
(17, 14, 2.0), -- Psychic
(17, 15, 1.0), -- Ice
(17, 16, 1.0), -- Dragon
(17, 17, 0.5), -- Dark
(17, 18, 0.5), -- Fairy
-- Attacks from Fairy
(18, 1, 1.0), -- Normal
(18, 2, 2.0), -- Fighting
(18, 3, 1.0), -- Flying
(18, 4, 0.5), -- Poison
(18, 5, 1.0), -- Ground
(18, 6, 1.0), -- Rock
(18, 7, 1.0), -- Bug
(18, 8, 1.0), -- Ghost
(18, 9, 0.5), -- Steel
(18, 10, 0.5), -- Fire
(18, 11, 1.0), -- Water
(18, 12, 1.0), -- Grass
(18, 13, 1.0), -- Electric
(18, 14, 1.0), -- Psychic
(18, 15, 1.0), -- Ice
(18, 16, 2.0), -- Dragon
(18, 17, 2.0), -- Dark
(18, 18, 1.0) -- Fairy
;

-- Modificamos la sequencia del tipo
SELECT setval('types_id_seq', (SELECT MAX(id) FROM types));