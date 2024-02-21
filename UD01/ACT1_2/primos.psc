Algoritmo primos
	Definir contador, residuo_cero como entero;
	Escribir "Se mostrarán los números primos entre el primer y el segundo número, incluyéndolos."
	Escribir "Introduzca el número de menos valor."
	Leer num1
	Escribir "Introduzca el número de más valor."
	Leer num2
	Para numeral<-num1 Hasta num2 Con Paso 1 Hacer
		contador<-1;
		residuo_cero<-0;
		Mientras contador <= numeral Hacer
			Si numeral%contador == 0 Entonces
				residuo_cero<-residuo_cero+1;
			FinSi
			contador<-contador+1;
		FinMientras
		Si residuo_cero == 2 Entonces
			Escribir numeral;
		FinSi
	FinPara
//	Para numeral<-num1 Hasta num2 Con Paso 1 Hacer
//		primo = Verdadero;
//		Mientras contador <= numeral-1 Hacer
//			Si numeral % contador == 0 Entonces
//				primo = Falso;
//				Escribir "no"
//				contador<-contador+1;
//			SiNo
//				primo = Verdadero;
//				Escribir "si"
//				contador<-contador+1;
//			FinSi
//		FinMientras
//		Si primo = Verdadero Entonces
//			Escribir numeral;
//		FinSi
//		//numeral<-numeral+1;
//	FinPara
FinAlgoritmo