#import.sql file
delete from foods
insert into foods(category, foodname, vendor) values ('Tree', 'Bamboo', 'Exotic Eats');
insert into foods(category, foodname, vendor) values ('Fish', 'Mackeral', 'Fish Foundry');
insert into foods(category, foodname, vendor) values ('Grass', 'Grass', 'Gary Grass Guy');
insert into foods(category, foodname, vendor) values ('Fruit', 'Banana', 'Bananarama');
insert into foods(category, foodname, vendor) values ('Vegetable', 'Carrot', 'Delicious Dirt');
insert into foods(category, foodname, vendor) values ('Nut', 'Lychee Nut', 'Exotic Eats');
insert into foods(category, foodname, vendor) values ('Meat', 'Cow', 'Butcher Bud');
insert into foods(category, foodname, vendor) values ('Fish', 'Krill', 'Fish Foundry');
insert into foods(category, foodname, vendor) values ('Fruit', 'Strawberry', 'Out of Clever Names');
insert into foods(category, foodname, vendor) values ('Vegetable', 'Potatoe', 'Delicious Dirt');
delete from animals
insert into animals(commonname, scientificname, infolink, foodid) values ('Panda', 'Ailuropoda melanoleuca', 'https://en.wikipedia.org/wiki/Giant_panda', 1);
insert into animals(commonname, scientificname, infolink, foodid) values ('Penguin', 'Aptenodytes patagonicus', 'https://en.wikipedia.org/wiki/King_penguin', 8);
insert into animals(commonname, scientificname, infolink, foodid) values ('Zebra', 'Equus quagga', 'https://en.wikipedia.org/wiki/Zebra', 3);
insert into animals(commonname, scientificname, infolink, foodid) values ('Orca', 'Orcinus orca', 'https://en.wikipedia.org/wiki/Killer_whale', 2);
insert into animals(commonname, scientificname, infolink, foodid) values ('Cow', 'Bos taurus', 'https://en.wikipedia.org/wiki/Cattle', 3);
insert into animals(commonname, scientificname, infolink, foodid) values ('Lemur', 'Lemur catta', 'https://en.wikipedia.org/wiki/Ring-tailed_lemur', 6);
insert into animals(commonname, scientificname, infolink, foodid) values ('White Tiger', 'Panthera tigris tigris', 'https://en.wikipedia.org/wiki/White_tiger', 7);
insert into animals(commonname, scientificname, infolink, foodid) values ('Skunk', 'Mephitis mephitis', 'https://en.wikipedia.org/wiki/Striped_skunk', 9);
insert into animals(commonname, scientificname, infolink, foodid) values ('Sloth', 'Bradypus tridactylus', 'https://en.wikipedia.org/wiki/Pale-throated_sloth', 4);
insert into animals(commonname, scientificname, infolink, foodid) values ('Goat', 'Goat', 'https://en.wikipedia.org/wiki/Goat', 10);
delete from enclosures
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (5, 'Great', 'Panda Pagoda', '14:00:00', 1);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (10, 'Good', 'Penguin Preserve', '08:00:00', 2);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (15, 'Great', 'Zebra Zoo', '18:00:00', 3);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (20, 'Criminal', 'Orca Orphanage', '10:00:00', 4);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (25, 'Bad', 'Cow Castle', '6:00:00', 5);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (30, 'Okay', 'Lemur Lookout', '4:00:00', 6);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (35, 'Great', 'White Tiger Wilderness Trail', '2:00:00', 7);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (40, 'Great', 'Skunk Saloon', '12:00:00', 8);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (45, 'Great', 'Sloth Sanctuary', '16:00:00', 9);
insert into enclosures(animalamount, condition, enclosurename, feedingtime, animalid) values (50, 'Great', 'Goat Gorge', '20:00:00', 10);