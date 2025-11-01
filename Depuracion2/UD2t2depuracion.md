# UD2t2 Depuración

**Enunciado**
Donat el codi a JAVA de la classe cotxe que compta amb els mètodes:

• constructor on se li estableix la marca, model, color i la velocitat inicial del qual és 0.

    **R:** Línea 11, public Coche(String marca, String modelo, String color) {

• getters i setters de cada paràmetre.

    **R:** Getters y setters en Color, Marca, Modelo y Velocidad.

• Mètode accelera (int vel) que incrementa la velocitat del cotxe en “vel” Km/h.

    **R:** Línea 77
    
        public void acelera(int vel) {
			this.velocidad += vel;

• Mètode frena(int vel) que decrementa la velocitat del cotxe en “vel” Km/h.

    **R:** Línea 81
    
        public void frena(int vel) {
			this.velocidad -= vel;
			if(this.velocidad<0) this.velocidad = 0;

• para() que posa la velocitat a 0.

    **R:** Línea 86
    
        public void para(){
		
		this.velocidad = 0;

• pinta() que pinta el cotxe més a prop o més lluny segons la velocitat que tinga en aqueix
moment. 

    **R:** Línea 92,
    
        public void pinta() {
		int i=0;
		for(i=0; i<this.velocidad/10; i++) 
			System.out.print(" ");
		System.out.println(" _/ "+ this.marca+"  \\_");

		for(i=0; i<this.velocidad/10; i++) 
			System.out.print(" ");
		System.out.println(" o    o ");
		
		System.out.println();




**0.** Para abrir un proyecto ya existente en el ordenador pinchamos en file>open folder, en la ventana que se nos abre buscamos el directorio en el que se encuentran los archivos del proyecto que queremos abrir y pulsamos "aceptar".

**1.** El "main" indica el punto de entrada del programa y a partir de donde arranca el mismo, "public" quiere decir que el método es accesible desde fuera de la clsase, "static" que el método pertenece a la clase y no a una instancia, "void" que el método no devuelve ningún valor y "String[] args" permite pasar los argumentos desde la línea de comandos al ejecutarse.

**2.** Breakpoint en línea 27:

velocidad_nueva1 = 14

velocidad_nueva2 = 22

velocidad_nueva3 = 49.

c = {Coche@929}

marca = "Fiat"

modelo = "500"

color = "rojo"

velocidad = 49

c2 = {Coche@930}

marca = "Audi"

modelo = "A4"

color = "Negro"

velocidad = 14

c3 = {Coche@931}

marca = "Renault"

modelo = "4L"

color = "Gris"

velocidad = 22

**3.** 
velocidad_nueva1 = 45

velocidad_nueva2 = 43

velocidad_nueva3 = 93.

c = {Coche@941}

marca = "Fiat"

modelo = "500"

color = "rojo"

velocidad = 0

c2 = {Coche@942}

marca = "Audi"

modelo = "A4"

color = "Negro"

velocidad = 0

c3 = {Coche@943}

marca = "Renault"

modelo = "4L"

color = "Gris"

velocidad = 0
