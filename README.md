# vocabulaire

## Installation
```
git clone https://github.com/NathanDunand/vocabulaire.git
cd vocabulaire
make
#si vous ne disposez pas de make :
javac *.java
java Controller couples.txt
```
Un petit programme Java qui permet de réviser simplement son vocabulaire. Prenez une liste de mots en deux langues différentes (dans l'exemple anglais et français), créez un fichier couples.txt selon le modèle suivant :<br>
```
#première ligne du fichier txt vide
mot langue 1 ex : maison
mot langue 2 ex : house
```
Un exemple complet :
```

ajouter
add

ajuster
adjust

...
```
<br><br>
Ce programme a été développé très rapidement, il est donc très rudimentaire.<br><br>
Par défaut le fichier couples.txt est celui sur lequel s'appliquera le programme, vous pouvez donc le modifier à votre convenance pour adapter vos envies.<br>
Si vous voulez créer votre propre fichier txt il faut :
- respecter le pattern du fichier définit plus haut
- préciser dans le fichier Makefile le chemin relatif du fichier.
