-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 29 avr. 2022 à 15:17
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `pdi`
--

-- --------------------------------------------------------

--
-- Structure de la table `axe`
--

CREATE TABLE `axe` (
  `id` int(11) NOT NULL,
  `axe` varchar(255) DEFAULT NULL,
  `axe_ar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `axe`
--

INSERT INTO `axe` (`id`, `axe`, `axe_ar`) VALUES
(2, 'Développement Industriel Phosboucraâ', ''),
(3, 'Infrastructures Routières', NULL),
(4, 'Eau Potable et Assainissement Liquide', NULL),
(5, 'Santé', NULL),
(6, 'Energie Infrastructures Electriques', ''),
(7, 'Agriculture Elevage', NULL),
(8, 'Ouvrage Hydrauliques et Protection Contre les Inondations', NULL),
(9, 'Pêche', NULL),
(10, 'Education, Enseignement et Formation', NULL),
(11, 'Les Infrastructures et les Activités Culturelles', NULL),
(12, 'Préservation des Ressources et des Ecosystèmes', NULL),
(13, 'Artisanat et Economie Social', NULL),
(14, 'Mise à Niveau Urbaine', NULL),
(15, 'Infrastructures Aéroportuaires', NULL),
(16, 'Emploi', NULL),
(17, 'Tourisme', NULL),
(18, 'Hydrocarbures et Mines', NULL),
(19, '-', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `commune`
--

CREATE TABLE `commune` (
  `id` int(11) NOT NULL,
  `commune` varchar(255) DEFAULT NULL,
  `commune_ar` varchar(255) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `commune`
--

INSERT INTO `commune` (`id`, `commune`, `commune_ar`, `province_id`) VALUES
(2, 'c', NULL, 2),
(3, 'lo', NULL, 2),
(4, 'Foum El Oued', NULL, 1),
(5, 'Boucraâ', NULL, 1),
(6, 'Dchéira', NULL, 1),
(7, 'Intercommunal_Laay', NULL, 1),
(8, 'Essemara', '', 3),
(9, 'Amgala', NULL, 3),
(10, 'Haouza', NULL, 3),
(11, 'Jdiriya', NULL, 3),
(12, 'Tifariti', NULL, 3),
(13, 'Sidi Ahmed Laaroussi', NULL, 3),
(14, 'Intercommunal_Essm', NULL, 3),
(15, 'Boujdour', NULL, 2),
(16, 'Lamssid', NULL, 2),
(17, 'Jraifiya', NULL, 2),
(18, 'Gueltat Zemmour', NULL, 2),
(19, 'Intercommunal_Bjdr', NULL, 2),
(20, 'Tarfaya', NULL, 4),
(21, 'Amgueriou', NULL, 4),
(22, 'El Haggounia', NULL, 4),
(23, 'Tah', NULL, 4),
(24, 'Daoura', NULL, 4),
(25, 'Akhfennir', NULL, 4),
(26, 'Intercommunal_Tarf', NULL, 4),
(27, 'Intercommunal_LSH', NULL, 5),
(28, '-', '', 6);

-- --------------------------------------------------------

--
-- Structure de la table `maitre_ouvrage`
--

CREATE TABLE `maitre_ouvrage` (
  `id` int(11) NOT NULL,
  `maitre_ouvrage` varchar(255) DEFAULT NULL,
  `maitre_ouvrage_ar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `maitre_ouvrage`
--

INSERT INTO `maitre_ouvrage` (`id`, `maitre_ouvrage`, `maitre_ouvrage_ar`) VALUES
(1, 'maitre douvrage', ''),
(2, 'Maitre d\'ouvrage 2', ''),
(3, 'maitre d\'ouvrage 3', NULL),
(4, 'maitre 4', ''),
(5, 'Maitre d\'ouvrage 5', '');

-- --------------------------------------------------------

--
-- Structure de la table `partenaire`
--

CREATE TABLE `partenaire` (
  `id` int(11) NOT NULL,
  `contribution` int(11) NOT NULL,
  `partenaire` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `projet`
--

CREATE TABLE `projet` (
  `id` int(11) NOT NULL,
  `benificiaires` longtext DEFAULT NULL,
  `benificiares` varchar(255) DEFAULT NULL,
  `consistence` varchar(255) DEFAULT NULL,
  `cout` bigint(20) DEFAULT NULL,
  `date_lancement` datetime DEFAULT NULL,
  `delai` int(11) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `maitre_ouvrage_délegue` varchar(255) DEFAULT NULL,
  `partenaire_contribution` longtext DEFAULT NULL,
  `projet` varchar(255) DEFAULT NULL,
  `projet_ar` varchar(255) DEFAULT NULL,
  `axe_id` int(11) DEFAULT NULL,
  `commune_id` int(11) DEFAULT NULL,
  `maitre_ouvrage_id` int(11) DEFAULT NULL,
  `province_id` int(11) DEFAULT NULL,
  `situation_id` int(11) DEFAULT NULL,
  `statut_id` int(11) DEFAULT NULL,
  `taux_id` int(11) DEFAULT NULL,
  `secteur_id` int(11) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `projet`
--

INSERT INTO `projet` (`id`, `benificiaires`, `benificiares`, `consistence`, `cout`, `date_lancement`, `delai`, `location`, `maitre_ouvrage_délegue`, `partenaire_contribution`, `projet`, `projet_ar`, `axe_id`, `commune_id`, `maitre_ouvrage_id`, `province_id`, `situation_id`, `statut_id`, `taux_id`, `secteur_id`, `create_date`, `modify_date`) VALUES
(4, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'projet1', '', 18, 20, NULL, 5, 5, 11, 12, 7, NULL, NULL),
(5, NULL, 'br', 'rr', 34, '2022-04-28 00:00:00', 0, '', NULL, '- ocp :450MAD\n- nasa: 34MAD', 'projet 2', 'projet ', 19, 21, NULL, 6, 6, 12, 13, 8, NULL, NULL),
(6, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'projet 3', '', 4, 4, 1, 1, 2, 3, 5, NULL, NULL, NULL),
(7, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'projet 4', '', 2, 8, 1, 3, 3, 6, 2, NULL, NULL, NULL),
(8, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'projet 5', '', 17, 11, 1, 4, 4, 11, 9, NULL, NULL, NULL),
(9, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'test', '', 10, 13, 1, 2, 3, 9, 5, NULL, NULL, NULL),
(10, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, '', '', NULL, 15, 3, 4, 4, 8, 6, NULL, NULL, NULL),
(11, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'projet vvv', '', 11, 20, NULL, 4, 3, 7, 2, 2, NULL, NULL),
(12, NULL, '', '', NULL, NULL, 0, '', NULL, NULL, 'projet tttt', '', 19, 18, 2, 6, 2, 6, 9, 3, NULL, NULL),
(13, NULL, '', '', NULL, NULL, 0, '', NULL, '- ocp: 450MAD\n- ocp: 450MAD\n', 'b', '', 15, 19, 2, 3, 4, 7, 10, 5, NULL, NULL),
(14, NULL, '', '', NULL, NULL, 0, '', NULL, '', 'nd', '', 17, 18, NULL, 3, 4, 3, 4, 6, NULL, NULL),
(15, NULL, '', '', NULL, NULL, 0, '', NULL, '', 'ns', '', 9, 17, NULL, 5, 3, 8, 5, 2, NULL, NULL),
(16, NULL, '', '', NULL, NULL, 0, '', NULL, '', '', '', 7, 5, NULL, 4, 3, 3, 4, 3, NULL, NULL),
(17, NULL, '', '', NULL, NULL, 0, '', NULL, '', ',e', '', 11, 19, 2, 3, 3, 9, 9, 4, NULL, NULL),
(18, NULL, '', '', NULL, NULL, 0, '', NULL, '', 'nrr', '', 15, 19, 2, 1, 4, 12, 11, 6, '2022-04-28 23:34:37', '2022-04-28 23:34:37'),
(19, NULL, '', '', NULL, NULL, 0, '', NULL, '', 'nd', 'nd', 13, 28, 5, 6, 5, 8, 11, 3, NULL, NULL),
(20, NULL, '', '', NULL, NULL, 0, '', NULL, '', ';,n', '', 15, 16, 4, 3, 4, 5, 4, 6, NULL, NULL),
(21, NULL, '', '', NULL, NULL, 0, '', NULL, '', 'n', '', 5, 4, 2, 4, 3, 3, 3, 4, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `projet_partenaires`
--

CREATE TABLE `projet_partenaires` (
  `projets_id` int(11) NOT NULL,
  `partenaires_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `province`
--

CREATE TABLE `province` (
  `id` int(11) NOT NULL,
  `province` varchar(255) DEFAULT NULL,
  `province_ar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `province`
--

INSERT INTO `province` (`id`, `province`, `province_ar`) VALUES
(1, 'LAAYOUNE', 'العيون'),
(2, 'BOUJDOUR', ''),
(3, 'ESSEMARA', NULL),
(4, 'Tarfaya', NULL),
(5, 'Interprovincial', NULL),
(6, '-', '');

-- --------------------------------------------------------

--
-- Structure de la table `secteur`
--

CREATE TABLE `secteur` (
  `id` int(11) NOT NULL,
  `secteur` varchar(255) DEFAULT NULL,
  `secteur_ar` varchar(255) DEFAULT NULL,
  `axe_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `secteur`
--

INSERT INTO `secteur` (`id`, `secteur`, `secteur_ar`, `axe_id`) VALUES
(2, 'Secteur 1', '', 14),
(3, 'Secteur 1', NULL, 17),
(4, 'nsn', NULL, 15),
(5, 'Secteur 1', NULL, 9),
(6, 'nene', NULL, 4),
(7, 'nsn', '', 17),
(8, '-', '', 19);

-- --------------------------------------------------------

--
-- Structure de la table `situation_etude`
--

CREATE TABLE `situation_etude` (
  `id` int(11) NOT NULL,
  `situation` varchar(255) DEFAULT NULL,
  `situation_ar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `situation_etude`
--

INSERT INTO `situation_etude` (`id`, `situation`, `situation_ar`) VALUES
(1, 'En cours de réalisation', ''),
(2, 'Achevées', ''),
(3, 'Non Lancées', ''),
(4, 'Lancées', ''),
(5, 'Non concérné', ''),
(6, '-', '');

-- --------------------------------------------------------

--
-- Structure de la table `statut`
--

CREATE TABLE `statut` (
  `id` int(11) NOT NULL,
  `statut` varchar(255) DEFAULT NULL,
  `statut_ar` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `statut`
--

INSERT INTO `statut` (`id`, `statut`, `statut_ar`) VALUES
(1, 'En Cours', ''),
(2, 'Achevé', ''),
(3, 'Achevé & Opérationnel', NULL),
(4, 'Achevé et Non Opérationnel', NULL),
(5, 'Travaux en Cours', NULL),
(6, 'En Instance de Démarrage', NULL),
(7, 'Passation des Marchés', NULL),
(8, 'Etudes', NULL),
(9, 'Non Lancé', NULL),
(10, 'En Arrêt', NULL),
(11, 'Annulé', NULL),
(12, '-', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `taux_avancement`
--

CREATE TABLE `taux_avancement` (
  `id` int(11) NOT NULL,
  `taux_avancement` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `taux_avancement`
--

INSERT INTO `taux_avancement` (`id`, `taux_avancement`) VALUES
(1, '0%'),
(2, 'Entre 0% 10%'),
(3, 'Entre 11% et 20%'),
(4, 'Entre 21% et 30%'),
(5, 'Entre 31% et 40%'),
(6, 'Entre 41% et 50%'),
(7, 'Entre 51% et 60%'),
(8, 'Entre 61% et 70%'),
(9, 'Entre 71% et 80%'),
(10, 'Entre 81% et 90%'),
(11, 'Entre 91% et 100%'),
(12, '100%'),
(13, '-');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `axe`
--
ALTER TABLE `axe`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `commune`
--
ALTER TABLE `commune`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrhtr6i3x1axuogpsdeqltyonm` (`province_id`);

--
-- Index pour la table `maitre_ouvrage`
--
ALTER TABLE `maitre_ouvrage`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `partenaire`
--
ALTER TABLE `partenaire`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `projet`
--
ALTER TABLE `projet`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkcpss4lyk5wdfaketptq0gj8t` (`axe_id`),
  ADD KEY `FK4psm6is5qq712ktl7yw6cjgpe` (`commune_id`),
  ADD KEY `FKmegvk5cu03hdb4l9fa78ompuw` (`maitre_ouvrage_id`),
  ADD KEY `FK5t4798j5wrhae9w9lfb38lof7` (`province_id`),
  ADD KEY `FKh813y7pqq3eom7it2ul604x1r` (`situation_id`),
  ADD KEY `FKp3lvo2iqceniqn9hxlm85lis9` (`statut_id`),
  ADD KEY `FKohv9yyspj8h8xepbcbvl0yxmo` (`taux_id`),
  ADD KEY `FK6jxkwsc3glcsuuc672t0y2geu` (`secteur_id`);

--
-- Index pour la table `projet_partenaires`
--
ALTER TABLE `projet_partenaires`
  ADD KEY `FKbmu4l8dbenqjt97m9cfrtxh22` (`partenaires_id`),
  ADD KEY `FK46sjj2l7wq9wwij9nyo2s16pq` (`projets_id`);

--
-- Index pour la table `province`
--
ALTER TABLE `province`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `secteur`
--
ALTER TABLE `secteur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKducogh2bhrcljgnnwg2pkqxxd` (`axe_id`);

--
-- Index pour la table `situation_etude`
--
ALTER TABLE `situation_etude`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `statut`
--
ALTER TABLE `statut`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `taux_avancement`
--
ALTER TABLE `taux_avancement`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `axe`
--
ALTER TABLE `axe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT pour la table `commune`
--
ALTER TABLE `commune`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT pour la table `maitre_ouvrage`
--
ALTER TABLE `maitre_ouvrage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `partenaire`
--
ALTER TABLE `partenaire`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `projet`
--
ALTER TABLE `projet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT pour la table `province`
--
ALTER TABLE `province`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `secteur`
--
ALTER TABLE `secteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `situation_etude`
--
ALTER TABLE `situation_etude`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `statut`
--
ALTER TABLE `statut`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `taux_avancement`
--
ALTER TABLE `taux_avancement`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `commune`
--
ALTER TABLE `commune`
  ADD CONSTRAINT `FKrhtr6i3x1axuogpsdeqltyonm` FOREIGN KEY (`province_id`) REFERENCES `province` (`id`);

--
-- Contraintes pour la table `projet`
--
ALTER TABLE `projet`
  ADD CONSTRAINT `FK4psm6is5qq712ktl7yw6cjgpe` FOREIGN KEY (`commune_id`) REFERENCES `commune` (`id`),
  ADD CONSTRAINT `FK5t4798j5wrhae9w9lfb38lof7` FOREIGN KEY (`province_id`) REFERENCES `province` (`id`),
  ADD CONSTRAINT `FK6jxkwsc3glcsuuc672t0y2geu` FOREIGN KEY (`secteur_id`) REFERENCES `secteur` (`id`),
  ADD CONSTRAINT `FKh813y7pqq3eom7it2ul604x1r` FOREIGN KEY (`situation_id`) REFERENCES `situation_etude` (`id`),
  ADD CONSTRAINT `FKkcpss4lyk5wdfaketptq0gj8t` FOREIGN KEY (`axe_id`) REFERENCES `axe` (`id`),
  ADD CONSTRAINT `FKmegvk5cu03hdb4l9fa78ompuw` FOREIGN KEY (`maitre_ouvrage_id`) REFERENCES `maitre_ouvrage` (`id`),
  ADD CONSTRAINT `FKohv9yyspj8h8xepbcbvl0yxmo` FOREIGN KEY (`taux_id`) REFERENCES `taux_avancement` (`id`),
  ADD CONSTRAINT `FKp3lvo2iqceniqn9hxlm85lis9` FOREIGN KEY (`statut_id`) REFERENCES `statut` (`id`);

--
-- Contraintes pour la table `projet_partenaires`
--
ALTER TABLE `projet_partenaires`
  ADD CONSTRAINT `FK46sjj2l7wq9wwij9nyo2s16pq` FOREIGN KEY (`projets_id`) REFERENCES `projet` (`id`),
  ADD CONSTRAINT `FKbmu4l8dbenqjt97m9cfrtxh22` FOREIGN KEY (`partenaires_id`) REFERENCES `partenaire` (`id`);

--
-- Contraintes pour la table `secteur`
--
ALTER TABLE `secteur`
  ADD CONSTRAINT `FKducogh2bhrcljgnnwg2pkqxxd` FOREIGN KEY (`axe_id`) REFERENCES `axe` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
