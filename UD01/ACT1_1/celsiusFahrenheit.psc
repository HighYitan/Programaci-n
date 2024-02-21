Algoritmo celsiusFahrenheit
	Escribir "El programa convierte los grados celsius introducidos en grados fahrenheit o viceversa.";
	Escribir "Si utiliza Celsius escriba C, si utiliza Fahrenheit escriba F.";
	Leer eleccion;
	Si eleccion == "C" Entonces
	Escribir "Introduzca el número en grados Celsius.";
	Leer celsius;
	Escribir celsius "º Celsius en grados Fahrenheit son " (celsius*9/5)+32 "º.";
	SiNo
		Si eleccion == "F" Entonces
			Escribir "Introduzca el número en grados Fahrenheit.";
			Leer fahrenheit;
			Escribir fahrenheit "º Fahrenheit en grados Celsius son " (fahrenheit*5/9)-32 "º.";
		FinSi
	FinSi
FinAlgoritmo