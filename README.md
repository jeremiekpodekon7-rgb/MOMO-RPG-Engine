# MOMO RPG Engine

MOMO est un moteur de jeu Android Java orienté RPG fantasy isométrique, pensé pour le concept de Kamel, des ombres, de la magie, des cités, des donjons, des quêtes non linéaires, de la progression 999 et de la logique ATB + PA.

## Ce qui a été amélioré
- structure Android Java stable
- moteur de rendu isométrique et boucle de jeu
- génération procédurale de la carte avec biomes
- système de combat ATB + PA de base
- entités joueur / ennemis / ombres
- synthétiseur audio 8-bit intégré
- base pour villes, guildes, monde et progression

## Ce qui est en cours
- inventaire 10 packs de 7x6
- arbre de compétences et classes
- ombres avec extraction, fusion, loyauté et sous-compétences
- PNJ, guildes, quêtes et dialogues
- donjons, systèmes de transport et planètes
- sauvegarde auto / multi-slot
- optimisation visuelle et polish final

## Structure du projet
- app/src/main/java/com/momo/rpg : activité, vue de jeu, moteur principal
- app/src/main/java/com/momo/rpg/core : entités, terrain, logique centrale
- app/src/main/java/com/momo/rpg/combat : système de combat ATB + PA
- app/src/main/java/com/momo/rpg/audio : synthétiseur 8-bit

## Lancement
1. Ouvrir le projet dans Android Studio.
2. Synchroniser Gradle.
3. Lancer l’application sur émulateur ou téléphone.

## Remarque importante
Cette version est une amélioration sérieuse du socle technique, mais il reste nécessaire de poursuivre le développement pour atteindre le “jeu final complet” décrit dans le cahier des charges. Le moteur est maintenant sur la branche principale pour rester cohérent et centralisé.
