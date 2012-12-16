select * from imagetype

insert into imagetype(
    id,
    description,
    createdDate,
    updatedDate
) 
values(
    'BANNER_660_X_300',
    'Banner image size 660 width by 330 height',
    now(),
    now()
)

-- CREATION QUERY
CREATE  TABLE `hotnews`.`imagetype` (

  `id` VARCHAR(8) NOT NULL ,

  `description` VARCHAR(255) NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) ,

  UNIQUE INDEX `id_UNIQUE` (`id` ASC) );