select * from item

insert into item(
    id,
    catId,
    description,
    url,
    active,
    createdDate,
    updatedDate
) 
values(
    'I0000000',
    '00000000',
    'Yahoo news',
    'http://www.yahoo.com',
    0,
    now(),
    now()
)

-- CREATION QUERY
CREATE  TABLE `hotnews`.`item` (

  `id` VARCHAR(8) NOT NULL ,

  `catId` VARCHAR(8) NOT NULL ,

  `description` VARCHAR(255) NOT NULL ,

  `url` TEXT NOT NULL ,

  `active` CHAR NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) );


