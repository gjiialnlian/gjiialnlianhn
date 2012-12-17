

CREATE TABLE `login` (
  `id` varchar(60) NOT NULL,
  `userId` varchar(8) NOT NULL,
  `password` varchar(255) NOT NULL,
  `createdDate` datetime NOT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1$$