insert into preferencetype(
    id,
    description,
    createdDate,
    updatedDate
)
values(
    'BANNERS_HOME',
    'Banners for home page',
    now(),
    now()
)

insert into preferencetype(
    id,
    description,
    createdDate,
    updatedDate
)
values(
    'BANNERS_HOME',
    'Banners for home page',
    now(),
    now()
)

insert into preferencetype(
    id,
    description,
    createdDate,
    updatedDate
)
values(
    'TOP10_LINKS_HOME',
    'Top 10 links for home page',
    now(),
    now()
)

select * from preferencetype


-- CREATION QUERY
CREATE  TABLE `hotnews`.`preferencetype` (

  `id` VARCHAR(8) NOT NULL ,

  `description` VARCHAR(255) NOT NULL ,

  `createdDate` DATETIME NOT NULL ,

  `updatedDate` DATETIME NULL ,

  PRIMARY KEY (`id`) ,

  UNIQUE INDEX `id_UNIQUE` (`id` ASC) );






