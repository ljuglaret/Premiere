

import Browser exposing (..)
import Html exposing (..)
import Html.Attributes exposing (..)
import Html.Events exposing (..)



estPair : Int -> Maybe Int 
estPair x = 
    if (modBy 2 x  == 0)
    then Just x 
    else Nothing 



affichePair : Int -> Int -> List Int 
affichePair d a = 
    List.filterMap estPair (List.range d a)


{-
    Partie web
-}

main =
  Browser.sandbox { init = init, update = update, view = view }


type alias Model =
  { int1 : Maybe Int
  , int2 : Maybe Int

  }

init : Model
init =
  Model Nothing Nothing



type Msg
  = I1 (Result String Int)
  | I2 (Result String Int)




update : Msg -> Model -> Model
update msg {int1, int2 } =
  case msg of
    I1 (Ok int0) ->
      Model (Just int0)  int2

    I1 (Err err ) -> 
        Model Nothing int2 

    I2 (Ok int0) ->
      Model int1 (Just int0)  

    I2 (Err err) ->
      Model int1 Nothing  

resInt s = 
    case (String.toInt s) of 
        Just s0 -> Ok s0 
        Nothing -> Err "nopte"

view : Model -> Html Msg
view model =
    div [ ][
         input [ type_ "String", placeholder " Borne debut ", onInput ( I1<<resInt) ] []
        ,input [ type_ "String", placeholder " Borne Fin ", onInput (I2<<resInt ) ] []
        ,laFabrique model
        ]

laFabrique : Model ->  Html Msg 
laFabrique model  = 
    
        let
            i1 = model.int1
            i2 = model.int2
        in 
             case (i1,i2) of 
                            (Just i1b, Just i2b) -> 
                                if (i1b < i2b )
                                then
                                    let 
                                        l = List.map (\x -> tr[][td[][text(String.fromInt x)]]) (affichePair i1b i2b)
                                    in table[] l
                                else  
                                    let
                                        l2 = List.map (\x -> tr[][td[][text(String.fromInt x)]]) (affichePair i2b i1b)
                                    in table[] l2


                            (_,_)             -> text ("")
    
