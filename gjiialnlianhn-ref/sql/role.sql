CREATE  TABLE `hotnews`.`Role` (

  `id` VARCHAR(60) NOT NULL ,

  `description` VARCHAR(255) NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) ,

  UNIQUE INDEX `id_UNIQUE` (`id` ASC) );

