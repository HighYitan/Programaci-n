Algoritmo celsiusFahrenheit
	Escribir "El programa convierte los grados celsius introducidos en grados fahrenheit o viceversa.";
	Escribir "Si utiliza Celsius escriba C, si utiliza Fahrenheit escriba F.";
	Leer eleccion;
	Si eleccion == "C" Entonces
	Escribir "Introduzca el n�mero en grados Celsius.";
	Leer celsius;
	Escribir celsius "� Celsius en grados Fahrenheit son " (celsius*9/5)+32 "�.";
	SiNo
		Si eleccion == "F" Entonces
			Escribir "Introduzca el n�mero en grados Fahrenheit.";
			Leer fahrenheit;
			Escribir fahrenheit "� Fahrenheit en grados Celsius son " (fahrenheit*5/9)-32 "�.";
		FinSi
	FinSi
FinAlgoritmo