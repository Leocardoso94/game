/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.5.16 : Database - fj21
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fj21` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fj21`;

/*Table structure for table `desafios` */

DROP TABLE IF EXISTS `desafios`;

CREATE TABLE `desafios` (
  `id` int(11) NOT NULL,
  `situacao` tinyint(1) NOT NULL DEFAULT '0',
  `resolvida` time DEFAULT NULL,
  `dica` tinyint(1) DEFAULT '0',
  `resposta` varchar(200) DEFAULT NULL,
  `pergunta` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `desafios` */

insert  into `desafios`(`id`,`situacao`,`resolvida`,`dica`,`resposta`,`pergunta`) values (1,1,NULL,0,'50','Na terceira foto da nossa conversa, encontrara o que está buscando.'),(2,0,NULL,0,'alice','Tem hora que é necessário enxergar as coisas por outra perspectiva, sabia? <br><br><b>ecila é atsopser A</b>'),(3,0,NULL,0,'351848683','Até agora as coisas estão sendo bem fáceis <br>Mas apartir de agora as perguntas não vão estar tão explícitas assim, Preparada? <br><br> Ao deslizar dos dedos, números aparecerão. <br> Quais os números?'),(4,0,NULL,0,'1123581321','Essa última foi difícil? Aguarde o que está por vir muahaha! <br> Vou te dar alguma dicas para você responder a próxima pergunta, boa sorte! <br><br>saunière senha suiço'),(5,0,NULL,0,'página','Vou parar de interagir com você agora, espero que você consiga se virar sozinha haha. <br><br> Sua mão, calendário, nosso dia.'),(6,0,NULL,0,'',''),(7,0,NULL,0,'',''),(8,0,NULL,0,'anjos','Na playlist está a resposta.'),(9,0,NULL,0,'eu te amo','Algumas das respostas, te guiarão ao caminho.'),(10,0,NULL,0,'nós','Último desafio, o que achou das perguntas até agora? <br> Espero que tenha gostado, a solução desse desafio é um pouco complicada. <br><br> Busque a resposta em si mesmo...');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
