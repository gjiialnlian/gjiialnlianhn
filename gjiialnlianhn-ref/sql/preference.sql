select * from preferencetype

insert into preference(
    id,
    value,
    description,
    active,
    createdDate,
    updatedDate
) 
values(
    'TOP10_LINKS_HOME',
    'www.cnn.com',
    'cnn news',
    0,
    now(),
    now()
)

update preference
set value='http://www.cnn.com' where description = 'cnn news'


select * from preference

-- CREATION QUERY
CREATE  TABLE `hotnews`.`preference` (

  `id` VARCHAR(8) NOT NULL ,

  `value` TEXT NOT NULL ,

  `description` VARCHAR(255) NOT NULL ,

  `active` CHAR NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) );



