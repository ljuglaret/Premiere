-- Pour avoir un apercu : https://github.com/ljuglaret/Premiere/blob/gh-pages/TableauxSansDoublons.html

module Tableaux exposing (..)

import Browser
import Html exposing (..)
import Html.Attributes exposing (..)
import Html.Events exposing (onInput)



main =
  Browser.sandbox { init = init, update = update, view = view }



type alias Model =
  {l : List Int 
  }


init : Model
init =
  Model []



type Msg
  = Vide String

update : Msg -> Model -> Model
update msg model = init
 


-- Une premiere fonction pour determiner si une liste contient un element 
-- et en combien d exemplaires

presence : a -> List a -> Int 
presence x l = List.length (List.filter (\elt -> elt == x) l)


-- Cette fonction enleve les doublons en utilisant la fonction precedente, 
-- en effet si un element d une liste est present une seule fois ce n est pas un doublon.

sansDoublons :  List a -> List a
sansDoublons      l    = List.filter (\cpt -> (presence cpt l) ==1)  l


-- Sur le meme principe on a la fonction qui filtre tous les elements present plus d une fois,
-- on a alors une liste comopsee de tous les doublons de la liste de depart.
-- Donc lorsque cette liste finale est vide c est qu il n y avait pas de doublons au depart.

existeDoublons : List a   ->   Bool
existeDoublons l          =    not ( List.isEmpty (List.filter (\cpt -> (presence cpt l) > 1)  l))

existeDoublons2 : List a -> Bool 
existeDoublons2   l = 
    let 
        filtreEltDoublons : List a -> List a 
        filtreEltDoublons    l0 =
            List.filter (\cpt -> (presence cpt l0) > 1)  l0
    in not (List.isEmpty (filtreEltDoublons l))


-- ou bien en une seule et unique fonction 

existeDoublonsBis : List a -> Bool 
existeDoublonsBis   l = 
    let 
        filtreEltDoublons : List a -> List a 
        filtreEltDoublons    l0 =
            let 
                presence3 : a -> List a -> Int 
                presence3   x     l1     = List.length (List.filter (\elt -> elt == x) l1)   
            in List.filter (\cpt -> (presence3 cpt l0) > 1)  l0
    in not (List.isEmpty (filtreEltDoublons l))



-- tests 

t = presence 4 [1,2,5]
t3 = sansDoublons [1,5,4]
t4 = sansDoublons [1,1,2,2,15,3,3,0]
t5 = existeDoublons [1,1,2,2,15,3,3,0]
t6 = existeDoublons [1,5,4]
t7= existeDoublons2 [1,1,2,2,15,3,3,0]
t8 = existeDoublons2 [1,5,4]
t9= existeDoublonsBis   [1,1,2,2,15,3,3,0]
t10 = existeDoublonsBis [1,5,4]
-- fin des tests

-- On peut faire tout cela directement, mais avec un code illisible : 
existeDoublons3 l = 
    not ( List.isEmpty (List.filter (\cpt -> (List.length (List.filter (\elt -> elt == cpt) l)) > 1)  l))


view : Model -> Html Msg
view model =
  div []
    [
        text(Debug.toString liste1 )
        ,br[][]
        , if (existeDoublons liste1)
          then div[][text("sans les doublons  : ")
               ,text(Debug.toString(sansDoublons liste1))
               ]
        else
            text(Debug.toString( liste1))
    ]


-- Cette meme liste mais sans les elements presents plusieurs fois

liste1 = [1,0,0,0,4,4,4,5,2,2]
