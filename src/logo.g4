grammar logo;

programa
    : comment codigo haz codigo
    ;

codigo
    : (comment | instrucciones | procedimiento)*
    ;

instrucciones
    : instruccion+
    ;

instruccion
    :haz
    |inic
    |inc
    |avanza
    |retrocede
    |girarderecha
    |girarizquierda
    |ocultartortuga
    |aparecertortuga
    |rumbo
    |ponpos
    |ponrumbo
    |ponx
    |pony
    |poncolor
    |goma
    |bajalapiz
    |subelapiz
    |borrarPantalla
    |centro
    |espera
    |ejecuta
    |repite
    |hasHasta
    |haz
    |hazMientras
    |mientras
    |hasta
    |si
    |sisino
    ;

procedimiento//Declara un procedimiento
    :'para' variable PAR_OPEN listaParametros PAR_CLOSE
      instrucciones
      'fin'
    ;

haz//Inicialisa tokenNumericos
    :'haz' variable token
    ;

inic //altera el valor de la tokenNumerico
    :'inic' variable '=' token
    ;

token:
     STRINGLITERAL
    | expresionLogica
    | expresionNumerica
    | expresionIndeterminada
    ;

inc//incrementsa uno o una segunda tokenNumericos
    :'inc' BRACKET_OPEN variable tokenNumerico BRACKET_CLOSE
    |'inc' BRACKET_OPEN variable BRACKET_CLOSE
    ;
avanza //Mueve el avatar n valores hacia adelante
    :'avanza' tokenNumerico
    |'av' tokenNumerico
    ;
retrocede //Mueve el avatar n valores hacia atras
    :'retrocede' tokenNumerico
    |'re' tokenNumerico
    ;
girarderecha //Gira hacia la derecha n angulos
    :'girarDerecha' tokenNumerico
    |'gd' tokenNumerico
    ;
girarizquierda //Gira a la izquierda n angulos
    :'girarIzquierda' tokenNumerico
    |'gi' tokenNumerico
    ;
ocultartortuga //Oculta el avatar
    :'ocultartortuga'
    |'ot'
    ;
aparecertortuga //Aparece el avatar en pantalla
    :'aparecetortuga'
    |'at'
    ;
ponpos //Coloca a la tortuga en una posicion de cordenadas XY
    :'ponpos' BRACKET_OPEN tokenNumerico tokenNumerico BRACKET_CLOSE
    |'ponposxy' tokenNumerico tokenNumerico
    ;

ponrumbo //Coloca el avatar en dirrecion del angulo
    :'ponrumbo' tokenNumerico
    ;
rumbo //Muestra el rumbo
    :'rumbo'
    ;
ponx //Orientacion de la tortuga
    :'ponx' tokenNumerico
    ;
pony //Orientacion de la tortuga
    :'pony' tokenNumerico
    ;

goma //Poen lapiz y para borrar
    :'goma'
    ;

bajalapiz //El lapiz inicia a dibujar
    :'bajalapiz'
    |'bj'
    ;
subelapiz //El lapiz deja de dibujar cuando se mueve
    :'subelapiz'
    |'sb'
    ;

poncolor //Establece el color en el que se pinta
    :'poncolorlapiz' STRINGLITERAL
    |'poncl' STRINGLITERAL
    ;
centro //Coloca la tortuga en el centro
    :'centro'
    ;
espera //Espera n/60 segudnos para ejecutar
    :'espera' tokenNumerico
    ;

ejecuta //Ejecuta una orden directa
    :'ejecuta' BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;

repite//Repite n cantidad de vevces una orden
    :'repite' tokenNumerico BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;


si//Condicion instruccion
    :'si' PAR_OPEN tokenLogico PAR_CLOSE
     BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;
sisino //CondiCion y luego iNstruciones
    :'sisino' PAR_OPEN tokenLogico PAR_CLOSE
     BRACKET_OPEN instrucciones BRACKET_CLOSE
     BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;

hasHasta //Repite la lista de instrucciones tanta veces hasta que se cumpla la condición
    :'haz.hasta'
      BRACKET_OPEN
            instrucciones
      BRACKET_CLOSE
      BRACKET_OPEN  tokenLogico  BRACKET_CLOSE
    ;
hasta //Repite la lista de instrucciones tanta veces hasta que se cumpla la condición
    :'hasta' BRACKET_OPEN  tokenLogico  BRACKET_CLOSE
     BRACKET_OPEN
            instrucciones
     BRACKET_CLOSE
    ;

hazMientras //
    :'haz.mientras'
      BRACKET_OPEN
            instrucciones
      BRACKET_CLOSE
      BRACKET_OPEN  tokenLogico  BRACKET_CLOSE
    ;

mientras //Repite las instrucciones mientras se cumplan las condiciones eh intrucciones
    :'mientras' BRACKET_OPEN  tokenLogico  BRACKET_CLOSE
      BRACKET_OPEN
            instrucciones
      BRACKET_CLOSE
    ;

booleanos
    : iguales
    | yLogico
    | oLogico
    ;

iguales //Devuelve un true si las dos entradas n1,n2 son iguales
    :'iguales?' tokenNumerico  tokenNumerico
    ;

yLogico //Devuelve cierto si las dos condisiones son ciertas
    :'y' tokenLogico  tokenLogico
    ;

oLogico //Devuelve cieto al menos una condiccion es cierta
    :'o' tokenLogico  tokenLogico
    ;

tokenLogico
    : expresionLogica
    | expresionIndeterminada
    ;

expresionLogica
    : PAR_OPEN expresionLogicaSimple PAR_CLOSE
    | expresionLogicaSimple
    | PAR_OPEN booleanos PAR_CLOSE
    | booleanos
    | BOOL
    ;

expresionLogicaSimple
    : tokenNumerico operadorCondicional tokenNumerico
    | mayorque
    | menorque
    ;

operadorCondicional
    : '<'
    | '>'
    | '='
    ;

mayorque //Devuelve si N1 es mayor que N2
    : 'mayorque?' tokenNumerico  tokenNumerico
    ;
menorque //Devuelve si N1 es menor que N2
    : 'menorque?' tokenNumerico  tokenNumerico
    ;

operacionAritmetica
    :redondea
    |diferencia
    |azar
    |menos
    |producto
    |potencia
    |division
    |resto
    |suma
    ;

redondea//aproxima un decimal n hasta al entero mas positivo
    :'redondea' tokenNumerico
    ;
diferencia//Diferencia (n1-n2-n3...)
    :'diferencia' tokenNumerico (tokenNumerico)+
    ;

azar//Genera un numero decimal n hasta el numero proximo
    :'azar' tokenNumerico
    ;

menos //cambia el signo de de n
    :'menos' tokenNumerico
    ;

producto //Multiplicar n numeros
    :'producto' tokenNumerico (tokenNumerico)+
    ;

potencia //Calcula una potencia, dos numeors
    :'potencia' tokenNumerico  tokenNumerico
    ;

division //division de dos numeros
    :'division' tokenNumerico tokenNumerico
    ;

resto //El residuo de una division entera, dos numeros
    :'resto' tokenNumerico  tokenNumerico
    ;

suma //Suma de numeros-Revisar como tener n-numeros
    :'suma' tokenNumerico (tokenNumerico)+
    ;

expresionIndeterminada
    : elegir
    | ultimo
    | elemento
    | primero
    | variable
    ;


elegir //Devuelve un elemento al azar de la lista.
    :'elegir' lista
    ;

cuenta//Cuenta el numero de elementos
    :'cuenta' lista
    ;
ultimo //Devuelve el ultimo elemento de la lista
    :'ultimo' lista
    |'ul' lista
    ;
elemento//Devuelve el n-esimo elemento de lista
    :'elemento' tokenNumerico lista
    ;
primero //Devuelve el primer elemento de la lista
    : 'primero' lista
    ;

borrarPantalla //Limpia completamente el liezo
    :'borrarPantalla'
    ;
    

tokenNumerico
    : expresionNumerica
    | expresionIndeterminada
    ;

expresionNumerica
   : expresionNumericaSimple
   | PAR_OPEN expresionNumericaSimple PAR_CLOSE
   | PAR_OPEN operacionAritmetica PAR_CLOSE
   | operacionAritmetica
   | cuenta
   ;

expresionNumericaSimple
   : expresionMultiplicativa (('+' | '-') expresionMultiplicativa)*
   ;

expresionMultiplicativa
   : expresionMultiplicativaSimple
   | PAR_OPEN expresionMultiplicativaSimple PAR_CLOSE
   ;

expresionMultiplicativaSimple
   : expresionConSigno (('*' | '/') expresionConSigno)*
   ;

expresionConSigno
   : (('+' | '-'))* numero
   ;

numero
   :NUMERO
   ;

comment
   : COMMENT
   ;

listaParametros
   : BRACKET_OPEN  (variable)* BRACKET_CLOSE
   ;

lista
    : BRACKET_OPEN (token)+ BRACKET_CLOSE
    ;

variable
   : NOMBRE
   ;

BRACKET_OPEN: '[';
BRACKET_CLOSE: ']';

PAR_OPEN: '(';
PAR_CLOSE: ')';

COMMENT
   : '//' ~ [\r\n]*
   ;

STRINGLITERAL
   : '"' STRING '"'
   ;

NOMBRE
   :  [a-z] CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER CARACTER CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER CARACTER
   |  [a-z] CARACTER CARACTER
   |  [a-z] CARACTER
   |  [a-z]
   ;

NUMERO
   : [0-9] +
   ;

BOOL
   : 'TRUE'
   | 'FALSE'
   ;

STRING
   : CARACTER+
   ;

CARACTER
   : [a-zA-Z0-9&@_]
   ;

WS
   : [ \t\r\n] -> skip
   ;
