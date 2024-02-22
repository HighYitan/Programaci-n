Algoritmo fibonacci
	Escribir "Se ejecutará la serie de Fibonacci hasta el número elegido de veces a ejecutar.";
	Leer fib;
	Definir num1, num2, resultado como entero;
	num1<-0
	num2<-1
	resultado<-0
	Para contador<-1 Hasta fib Hacer
		resultado<-num1+num2;
		Escribir num1 " + " num2 " = " resultado;
		num1<-num2
		num2<-resultado
	FinPara
FinAlgoritmo