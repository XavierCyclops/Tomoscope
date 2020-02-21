//PARAMETROS DE INICIO DEL SISTEMA DE CONTROL ELECTRONICO DE LOS MOTORES A PASO.

int ActB = 3;     //Activacion del motor RECEPTOR.
int ActA = 8;    //Activacion del motor EMISOR.
//Pines de conexion hacia las bobinas del motor a pasos #1
int Pasos = 100;
int Rojo = 12;
int Azul = 11;
int Amarillo = 10;
int Naranja = 9;
//Pines de conexion hacia las bobinas del motor a pasos #2
int Rojo2 = 7;
int Azul2 = 6;
int Amarillo2 = 5;
int Naranja2 = 4;
//Java
int Op = 0;
int d = 1500;

int mSecPaso = 5000;/*tiempo en microsegundos entre paso y paso la velocidad sera:
  velocidad=1000000/mSecPaso en vueltas/segundo. Valor minimo 750 maximo 2350
  con menos de 750 no arranca con mas de 2350 se salta pasos.*/


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(ActA, OUTPUT); //Activacion del L298.
  pinMode(ActB, OUTPUT); //Activacion del L298.

  pinMode(Naranja, OUTPUT);
  pinMode(Rojo, OUTPUT);
  pinMode(Azul, OUTPUT);
  pinMode(Amarillo, OUTPUT);

  pinMode(Naranja2, OUTPUT);
  pinMode(Rojo2, OUTPUT);
  pinMode(Azul2, OUTPUT);
  pinMode(Amarillo2, OUTPUT);
  delay(1000);

  //INICIAR EN PARO
  digitalWrite(Rojo, LOW);
  digitalWrite(Azul, LOW);
  digitalWrite(Amarillo, LOW);
  digitalWrite(Naranja, LOW);

  digitalWrite(Rojo2, LOW);
  digitalWrite(Azul2, LOW);
  digitalWrite(Amarillo2, LOW);
  digitalWrite(Naranja2, LOW);

  Serial.begin(9600);
}

void dormirmotor1() {

  digitalWrite(ActA, LOW);

  digitalWrite(Rojo, LOW);
  digitalWrite(Azul, LOW);
  digitalWrite(Amarillo, LOW);
  digitalWrite(Naranja, LOW);
}

void dormirmotor2() {

  digitalWrite(ActB, LOW);

  digitalWrite(Rojo2, LOW);
  digitalWrite(Azul2, LOW);
  digitalWrite(Amarillo2, LOW);
  digitalWrite(Naranja2, LOW);
}

void amarrarmotor1() {

  digitalWrite(ActA, HIGH);

  digitalWrite(Rojo, HIGH);
  digitalWrite(Azul, HIGH);
  digitalWrite(Amarillo, HIGH);
  digitalWrite(Naranja, HIGH);
}

void amarrarmotor2() {

  digitalWrite(ActB, HIGH);

  digitalWrite(Rojo2, HIGH);
  digitalWrite(Azul2, HIGH);
  digitalWrite(Amarillo2, HIGH);
  digitalWrite(Naranja2, HIGH);
}


void derechamotor1() {

  digitalWrite(ActA, HIGH);

  //paso 1
  digitalWrite(Rojo, HIGH);
  digitalWrite(Azul, LOW);
  digitalWrite(Amarillo, HIGH);
  digitalWrite(Naranja, LOW);

  delayMicroseconds(mSecPaso);
  //paso 2
  digitalWrite(Rojo, HIGH);
  digitalWrite(Azul, LOW);
  digitalWrite(Amarillo, LOW);
  digitalWrite(Naranja, HIGH);

  delayMicroseconds(mSecPaso);
  //paso 3
  digitalWrite(Rojo, LOW);
  digitalWrite(Azul, HIGH);
  digitalWrite(Amarillo, LOW);
  digitalWrite(Naranja, HIGH);

  delayMicroseconds(mSecPaso);
  //paso 4
  digitalWrite(Rojo, LOW);
  digitalWrite(Azul, HIGH);
  digitalWrite(Amarillo, HIGH);
  digitalWrite(Naranja, LOW);

  delayMicroseconds(mSecPaso);
  delay(d);

}//FIN derechamotor1


void derechamotor2() {

  digitalWrite(ActB, HIGH);
  //GIRO DERECHO MOTOR 2
  //paso 1
  digitalWrite(Rojo2, HIGH);
  digitalWrite(Azul2, LOW);
  digitalWrite(Amarillo2, HIGH);
  digitalWrite(Naranja2, LOW);

  delayMicroseconds(mSecPaso);
  //paso 2
  digitalWrite(Rojo2, HIGH);
  digitalWrite(Azul2, LOW);
  digitalWrite(Amarillo2, LOW);
  digitalWrite(Naranja2, HIGH);

  delayMicroseconds(mSecPaso);
  //paso 3
  digitalWrite(Rojo2, LOW);
  digitalWrite(Azul2, HIGH);
  digitalWrite(Amarillo2, LOW);
  digitalWrite(Naranja2, HIGH);

  delayMicroseconds(mSecPaso);
  //paso 4
  digitalWrite(Rojo2, LOW);
  digitalWrite(Azul2, HIGH);
  digitalWrite(Amarillo2, HIGH);
  digitalWrite(Naranja2, LOW);

  delayMicroseconds(mSecPaso);
  delay(d);

}//FIN derechamotor2

void izquierdamotor1() {

  digitalWrite(ActA, HIGH);
  //
  //GIRO IZQUIERDA MOTOR 1
  //paso 1
  digitalWrite(Rojo, LOW);
  digitalWrite(Azul, HIGH);
  digitalWrite(Amarillo, HIGH);
  digitalWrite(Naranja, LOW);
  delayMicroseconds(mSecPaso);
  //paso 2
  digitalWrite(Rojo, LOW);
  digitalWrite(Azul, HIGH);
  digitalWrite(Amarillo, LOW);
  digitalWrite(Naranja, HIGH);
  delayMicroseconds(mSecPaso);
  //paso 3
  digitalWrite(Rojo, HIGH);
  digitalWrite(Azul, LOW);
  digitalWrite(Amarillo, LOW);
  digitalWrite(Naranja, HIGH);
  delayMicroseconds(mSecPaso);
  //paso 4
  digitalWrite(Rojo, HIGH);
  digitalWrite(Azul, LOW);
  digitalWrite(Amarillo, HIGH);
  digitalWrite(Naranja, LOW);


  delayMicroseconds(mSecPaso);
  delay(d);
}

void izquierdamotor2() {
  digitalWrite(ActB, HIGH);
  //GIRO IZQUIERDA MOTOR 2
  //paso 1

  digitalWrite(Rojo2, LOW);
  digitalWrite(Azul2, HIGH);
  digitalWrite(Amarillo2, HIGH);
  digitalWrite(Naranja2, LOW);
  delayMicroseconds(mSecPaso);
  //paso 2
  digitalWrite(Rojo2, LOW);
  digitalWrite(Azul2, HIGH);
  digitalWrite(Amarillo2, LOW);
  digitalWrite(Naranja2, HIGH);
  delayMicroseconds(mSecPaso);
  //paso 3
  digitalWrite(Rojo2, HIGH);
  digitalWrite(Azul2, LOW);
  digitalWrite(Amarillo2, LOW);
  digitalWrite(Naranja2, HIGH);
  delayMicroseconds(mSecPaso);
  //paso 4
  digitalWrite(Rojo2, HIGH);
  digitalWrite(Azul2, LOW);
  digitalWrite(Amarillo2, HIGH);
  digitalWrite(Naranja2, LOW);

  delayMicroseconds(mSecPaso);
  delay(d);
}//FIN izquierdamotor2

void loop() {
  //Coneccion a JAVA
  Op = Serial.read();

//modificacion
//  for (int i = 0; i <= 99; i++) {
//        amarrarmotor1();
//        amarrarmotor2();
//        derechamotor2();
//        amarrarmotor1();
//        amarrarmotor2();
//         izquierdamotor1();
//        amarrarmotor1();
//        amarrarmotor2();
//        }

  switch (Op) {

    case '1':
    izquierdamotor1();
    dormirmotor1();
      break;

    case '2':
    derechamotor2();
    dormirmotor2();
      break;

    case '3':
      for (int k = 0; k <= 43; k++) {
        izquierdamotor1();
        dormirmotor1();
      }
      break;

    case '4':
      dormirmotor1();
      dormirmotor2();
      break;

  }
   
}
