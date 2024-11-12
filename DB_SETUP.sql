-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
DROP SCHEMA if exists `chatapp`;
-- -----------------------------------------------------
-- Schema chatapp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `chatapp` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `chatapp` ;

-- -----------------------------------------------------
-- Table `chatapp`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chatapp`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(32) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `userame_UNIQUE` (`username` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `chatapp`.`messages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chatapp`.`messages` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fromFKUID` INT NOT NULL,
  `toFKUID` INT NOT NULL,
  `sentDate` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `readStatus` TINYINT NOT NULL DEFAULT 0,
  `messageText` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `FromUser_idx` (`fromFKUID` ASC) VISIBLE,
  INDEX `ToUser_idx` (`toFKUID` ASC) VISIBLE,
  CONSTRAINT `FromUser`
    FOREIGN KEY (`fromFKUID`)
    REFERENCES `chatapp`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ToUser`
    FOREIGN KEY (`toFKUID`)
    REFERENCES `chatapp`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `chatapp`.`users` (`id`, `username`, `password`,`email`) VALUES ('2', 'exampleuser', 'exa,ple', 'e@s.com');
INSERT INTO `chatapp`.`users` (`id`, `username`, `password`,`email`) VALUES ('1', 'makiman283', 'test', 'test@mail.com');
INSERT INTO `chatapp`.`messages` (`id`, `fromFKUID`, `toFKUID`, `readStatus`, `messageText`) VALUES ('1', '1', '2', '0', 'hello!');
INSERT INTO `chatapp`.`messages` (`id`, `fromFKUID`, `toFKUID`, `readStatus`, `messageText`) VALUES ('2', '2', '1', '0', 'Hii!!!');

