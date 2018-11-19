<!-- 
- title : de l iteratif au fonctionnel, partie 1
- author : Laure Juglaret
- theme : solarized.css
- transition : convex
- slideNumber : true -->  

## Un nouveau paradigme : Le langage fonctionnel
 Le but est de recommencer l exercice sur les nombres premiers mais cette fois
 sans utiliser de boucle.

---

### let in
Permet d ecrire un raccourci 

Par exemple 

```elm
let 
    x = 3 
    y = 4
in x + y 
```

va renvoyer 3 + 4 = 7.

On l utilise pour rendre plus lisible un calcul.


---
### Maybe

 Le type  maybe permet de dire "peut etre" et a deux valeurs Just a et Nothing.
 Ici lorsque la condition de parite est verifiee sur une valeur x on renvoie Just x 
 si elle n est pas verifiee on renvoie Nothing


```elm
estPair : Int -> Maybe Int 
estPair x = 
    if (modBy 2 x  == 0)
    then Just x 
    else Nothing 
```

---
### List 
#### List.range , List.filterMap , List.filter

Une liste est un ensemble de valeurs de meme types, dans un langage fonctionnel on peut leur appeler des fonctions
predefinies les utilisant.

1 - List.range

```elm
 List.range 1 10 
```

Permet de creer la liste contenant les entiers de 1 a 10

2 - List.filterMap 
(a -> Maybe b) -> List a -> List b
Bien comprendre la notation : 
Le premier parametre est une fonction qui a n importe quel type (par exemple Int) renvoie un Maybe d un autre type
Le second parametre est une Liste de a 
Enfin, en dernier c est le type de retour : une liste d elements de type a .


```elm
affichePair : Int -> Int -> List Int 
affichePair d a = 
    List.filterMap estPair (List.range d a)
```

3 - List.filter 

son type  : (a -> Bool) -> List a -> List a

Exemple

```elm
affichePair2 : Int -> Int -> List Int 
affichePair2 d a = 
    let
        f x = 
            if (modBy 2 x  == 0)
            then True 
            else False 
    in List.filter (\x -> f x)  (List.range d a)

```

---

  <a href = "https://ellie-app.com/new"> Pour tester </a>

  <a href = "https://github.com/ljuglaret/Premiere/blob/master/Parite.elm"> Exemple 1  </a>

