select * from category

insert into category(
    id,
    name,
    description,
    active,
    createdDate,
    updatedDate
) 
values(
    '00000000',
    'News',
    'News',
    0,
    now(),
    now()
)

insert into category(
    id,
    name,
    description,
    active,
    createdDate,
    updatedDate
) 
values(
    '00000001',
    'Sports',
    'Sports news',
    0,
    now(),
    now()
)

-- Creation QUESRY

CREATE  TABLE `hotnews`.`category` (

  `id` VARCHAR(8) NOT NULL ,

  `name` VARCHAR(255) NOT NULL ,

  `description` VARCHAR(255) NOT NULL ,

  `active` CHAR NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) ,

  UNIQUE INDEX `id_UNIQUE` (`id` ASC) );



