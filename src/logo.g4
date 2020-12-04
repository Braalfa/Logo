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
    :'para' nombre PAR_OPEN listaParametros PAR_CLOSE
      instrucciones
      'fin'
    ;

haz//Inicialisa variables
    :'haz' nombre primitivo
    ;
inic //altera el valor de la variable
    :'inic' nombre '=' variable
    ;

inc//incrementsa uno o una segunda variables
    :'inc' BRACKET_OPEN nombre variable BRACKET_CLOSE
    |'inc' BRACKET_OPEN nombre BRACKET_CLOSE
    ;
avanza //Mueve el avatar n valores hacia adelante
    :'avanza' variable
    |'av' variable
    ;
retrocede //Mueve el avatar n valores hacia atras
    :'retrocede' variable
    |'re' variable
    ;
girarderecha //Gira hacia la derecha n angulos
    :'girarDerecha' variable
    |'gd' variable
    ;
girarizquierda //Gira a la izquierda n angulos
    :'girarIzquierda' variable
    |'gi' variable
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
    :'ponpos' BRACKET_OPEN variable variable BRACKET_CLOSE
    |'ponposxy' variable variable
    ;

ponrumbo //Coloca el avatar en dirrecion del angulo
    :'ponrumbo' variable
    ;
rumbo //Muestra el rumbo
    :'rumbo'
    ;
ponx //Orientacion de la tortuga
    :'ponx' variable
    ;
pony //Orientacion de la tortuga
    :'pony' variable
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
    :'espera' variable
    ;

ejecuta //Ejecuta una orden directa
    :'ejecuta' BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;

repite//Repite n cantidad de vevces una orden
    :'repite' variable BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;


si//Condicion instruccion
    :'si' PAR_OPEN expresionLogica PAR_CLOSE
     BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;
sisino //CondiCion y luego iNstruciones
    :'sisino' PAR_OPEN expresionLogica PAR_CLOSE
     BRACKET_OPEN instrucciones BRACKET_CLOSE
     BRACKET_OPEN instrucciones BRACKET_CLOSE
    ;

hasHasta //Repite la lista de instrucciones tanta veces hasta que se cumpla la condición
    :'haz.hasta'
      BRACKET_OPEN
            instrucciones
      BRACKET_CLOSE
      BRACKET_OPEN  expresionLogica  BRACKET_CLOSE
    ;
hasta //Repite la lista de instrucciones tanta veces hasta que se cumpla la condición
    :'hasta' BRACKET_OPEN  expresionLogica  BRACKET_CLOSE
     BRACKET_OPEN
            instrucciones
     BRACKET_CLOSE
    ;

hazMientras //
    :'haz.mientras'
      BRACKET_OPEN
            instrucciones
      BRACKET_CLOSE
      BRACKET_OPEN  expresionLogica  BRACKET_CLOSE
    ;

mientras //Repite las instrucciones mientras se cumplan las condiciones eh intrucciones
    :'mientras' BRACKET_OPEN  expresionLogica  BRACKET_CLOSE
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
    :'iguales?' variable  variable
    ;

yLogico //Devuelve cierto si las dos condisiones son ciertas
    :'y' expresionLogica  expresionLogica
    ;

oLogico //Devuelve cieto al menos una condiccion es cierta
    :'o' expresionLogica  expresionLogica
    ;

expresionLogica
    : PAR_OPEN expresionLogicaSimple PAR_CLOSE
    | expresionLogicaSimple
    | PAR_OPEN booleanos PAR_CLOSE
    | booleanos
    | BOOL
    ;

expresionLogicaSimple
    : variable operadorCondicional variable
    | mayorque
    | menorque
    ;

operadorCondicional
    : '<'
    | '>'
    | '='
    ;

mayorque //Devuelve si N1 es mayor que N2
    : 'mayorque?' variable  variable
    ;
menorque //Devuelve si N1 es menor que N2
    : 'menorque?' variable  variable
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
    :'redondea' variable
    ;
diferencia//Diferencia (n1-n2-n3...)
    :'diferencia' variable (variable)+
    ;

azar//Genera un numero decimal n hasta el numero proximo
    :'azar' variable
    ;

menos //cambia el signo de de n
    :'menos' variable
    ;

producto //Multiplicar n numeros
    :'producto' variable (variable)+
    ;

potencia //Calcula una potencia, dos numeors
    :'potencia' variable  variable
    ;

division //division de dos numeros
    :'division' variable variable
    ;

resto //El residuo de una division entera, dos numeros
    :'resto' variable  variable
    ;

suma //Suma de numeros-Revisar como tener n-numeros
    :'suma' variable (variable)+
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
    :'elemento' variable lista
    ;
primero //Devuelve el primer elemento de la lista
    : 'primero' lista
    ;

borrarPantalla //Limpia completamente el liezo
    :'borrarPantalla'
    ;
variable
    :expresionNumerica
    |nombre
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
   : BRACKET_OPEN  (nombre)* BRACKET_CLOSE
   ;

lista
    : BRACKET_OPEN  (primitivo ) + BRACKET_CLOSE
    ;

nombre
   : NOMBRE
   ;

primitivo
    :NUMERO
    |STRINGLITERAL
    |BOOL
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