select * from image

select * from imagetype

select * from category

insert into image(
    id,
    typeId,
    catId,
    active,
    createdDate,
    updatedDate
) 
values(
    'IM000011',
    'BANNER_660_X_300',
    '00000001',
    0,
    now(),
    now()
)

-- CREATION QUERY
CREATE  TABLE `hotnews`.`image` (

  `id` VARCHAR(8) NOT NULL ,

  `typeId` VARCHAR(8) NOT NULL ,

  `catId` VARCHAR(8) NOT NULL ,

  `active` CHAR NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) ,

  UNIQUE INDEX `id_UNIQUE` (`id` ASC) );


