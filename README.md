# Le but de cette séance 
  - Comprendre les résultats des tests contenus dans le fichier premiersTests.  
  - Créer un jeu "plus moins".
 
   - Le principe : l utilisateur doit deviner un entier choisit au préalable.
 
---
# Cahier des charges
  
 - Indiquer si l entier saisi est plus grand ou plus petit que l entier attendu.
 - Compter le nombre d essais et considérer la partie perdue si ce nombre est supérieur à 10
 - Demander à l'utilisateur si il souhaite effectuer une autre partie.
- Après la dernière partie indiquez un récapitulatif ( combien de parties gagnées et perdues, combien d essais pour chaque partie).
---
#  Ce qui est disponible :

<a href="https://github.com/ljuglaret/Premiere/blob/master/pm.java" >projet jeu plus moins</a>

 Il faut compléter le code en suivant les instructions indiquées en commentaires

---
# Les outils
- un compilateur
- des notions de base
   - déclaration
   - affectation
   - type entier et booléen 
   - instruction conditionnelle
   - boucle do while
----
### <a href="https://www.onlinegdb.com/" >compilateur java en ligne</a>
----
### Déclaration et affectation pour un entier 

```java
int valeur = 42;
```

---
### Déclaration et affectation pour un booléen

 Un booléen a deux valeurs possibles : vraie(true) et fausse(false).

```java
bool b = true;
```


 On verra par la suite comment déclarer des variables d autres types.

---
### Les conditions
- la plus simple
```java
if(condition) {;}
else {;}
```
- un peu plus complexe
```java
if(condition) {;}
else if(condition) {;}
else if(condition) {;}
else {;}
```

### La boucle do while. 

```java
do{
Instructions;}
while(Conditions);
```

 Littéralement "faire une action tant que la condition de fin n est pas vérifiée" 
