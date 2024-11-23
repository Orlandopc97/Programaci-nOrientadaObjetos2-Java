public class Main {

    public static void main(String[] args) {

        //Objeto
        //Clase //Nombre objeto
        //Instanciacion de la clase // Instancia de objeto persona
        //Tipo de dato
        //Llamar al constructor
        //Nuevo alumno
        Empleado empleado1 = new Empleado();// Llamada al constructor vacio

        //Llamada a metodo propio
        empleado1.getNumLegajo();
        //Llamadametodo heredado
        empleado1.getApellido();

        Consultor consultor1 = new Consultor();// Llamada al constructor vacio
        //Llamada a metodo propio
        consultor1.getNombreConsultora();
        //Llamada a metodo heredado
        consultor1.getDomicilio();




        //Imprimir con el metodo get

        //Modificar datos con el metodo set


    }
}

/*
PROGRAMACION ORIENTADA A OBJETOS (POO)

Introduccion:
    *PARADIGMA: (Manera de pensar // Manera de actuar)
        -Modelo, Patron o ejemplo que debe seguirse en determinada situación.
        -Se refiere conjunto de teorias o teoria que sirve de modelo a seguir para resolver problemas
        o situaciones determinadas.

    *PARADIGMA ORIENTADO A OBJETOS:
        -Se basa en un mundo lleno de objetos, donde la resolucion de problemas se realiza mediante
         el modelado/ abstraccion de objetos de la vida real.
        -Los objetos pueden comunicarse mediante mensajes entre si.
        -Se basa en agrupar codigo y datos juntos dentro de una misma unidad llamada CLASE.

   *-ABSTRACCIÓN: Traer algo del mundo real y abstraerlo al mundo logico(imaginario)
   *-INSTANCIAS = (solicitud de creaciones de objetos (solicitud, peticion, suplica, demanda, escrito, oficio)

   *CLASE (Caja/Plantilla/Molde) que permite construir objetos:
        -Representan "entidiades(objetos)" del mundo real.
        -Poseen atributos y metodos.
        -No pueden ser utilizadas directamente, sino mediante instancias a objetos.
            #EJEMPLO:
                -Tenemos la CLASE Alumno, seria el molde para construir objetos tipo Alumno: alumno1, alumno2, alumno3
                -Definen las propiedades (datos(atributos)) y comportamientos (metodos(funciones)) que caracterizan al objeto especifico
                -La clase al encapsular datos y funcionalidades relacionadas permiten la reutilizacion del codigo, lo organizacion modular y la abstraccion(traer)


                Clase Alumno:                   alumno1: Alumno

                +String apellido                apellido = Sanchez
                +String nombre                  nombre = Mario              <------OBJETOS
                                                                                     ALUMNO
                                                alumno2: Alumno

                                                apellido = Perez
                                                nombre = Juan

                                                alumno3: Alumno

                                                apellido = Suarez
                                                nombre = Daniela


        -Conjunto que contiene y agrupa codigo y datos.
            Estas clases tienen estas caracteristicas (POO):
                -ABSTRACCION
                -ENCAPSULAMIENTO
                -POLIMORFISMO
                -HERENCIA
                -UML (Lenguaje unificado(universal) de modelado): Todas las clases o modelado se puede representar por el estandar de diagramas de uml (diagrama de clase).

            #EJEMPLOS: AUTO, PERSONA, DEPARTAMENTO, FACTURA, RECIBO, PRODUCTO, ETC.

    *OBJETOS:
        -Es la representacion de un objeto que generalmente exite en la vida real
        -Un objeto es una instancia de una clase(Crear un objeto de la clase alumno).
        -Posee un estado (atributos/caracteristicas).
        -Poseen un comportamiento(metodos(funciones))

    *HERENCIA:
        -Hay clases que comparten gran parte de sus caracteristicas
        -Heredamos ATRIBUTOS(CARACTERISTICAS) y COMPORTAMIENTOS (METODOS).
        -El mecanismo conocido con el nombre de herencia permite reutilizar clases: Se crea una nueva clase que extiende la
         funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.
        -La nueva clase, a la que se denomina subclase, puede poseer atributos y metodos que no existan en la clase original.
        -Los objetos de la nueva clase heredan los atributos y los metodos de la clase original, que se DENOMINA SUPERCLASE.
        -Clase principal se llama CLASE MADRE O PADRE y las que heredan son SUBCLASES O CLASES HIJAS.
        -Para la herencia, a la clase hija se le agrega la palabra reservada extends(extiende) de la clase padre que hereda,
         Ejemplo:
            public class Empleado extends Persona{}

        #EJEMPLO:
            -CLASE PERSONA: Clase generica que sirve para almacenar datos en comun de todas las personas.
                -Atributos:
                    -nombre
                    -dirección
                    -numTelefono

            -CLASE EMPLEADO: Hereda los mismos atributos de la clase persona (nombre, dirección, numTelefono), mientras puede incluir atributos propio
                -Atributos:
                    -numLegajo
                    -puesto
                    -cargo

            -CLASE CONSULTOR: hereda los mismo atributos de la clase persona (nombre, dirección, numTelefono), mientras puede incluir atributos propios
                -Atributos:
                    -empresaConsultora
                    -idConsultor






 */