Algoritmo calificativoNotas
	Escribir "Se calificarán las notas introducidas según el calificativo correspondiente a ellas.";
	Escribir "Introduzca la nota del alumno, por favor.";
	Leer nota;
	Si nota>=9 Entonces
		Escribir "Sobresaliente.";
	Sino
		Si nota>=7 Entonces
			Escribir "Notable.";
		Sino
			Si nota>=6 Entonces
				Escribir "Bien.";
			SiNo
				Si nota>=5 Entonces
					Escribir "Aprobado.";
				SiNo
					Si nota>=3 Entonces
						Escribir "Insuficiente.";
					SiNo
						Escribir "Muy deficiente.";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo