-- Creation Query
CREATE TABLE `user` (
  `id` varchar(8) NOT NULL,
  `roleId` varchar(60) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `createdDate` datetime NOT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1$$