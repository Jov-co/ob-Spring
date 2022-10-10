package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // CONCEPTO 1: Cómo obtener Beans de Spring
        //Recibir un objeto de Spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        String text = calculadora.holaMundo();
        System.out.println(text);
        // se puede volver a obtener
        // Se recupera el mismo objeto
        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        text = calculadora2.holaMundo();
        System.out.println(text);

        // CONCEPTO 2: Cargar un Bean dentro de otro Bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());
        System.out.println(gestor.nombre);

        /*CONCEPTO 3: Scope o alcance
        los Beans por defecto son singleton,(Operaciones que no cambien) se crea el objeto y se
        reutiliza para toda la aplicacion
        Podemos cambiarlo a scope prototype,(Cuando el objeto tienes propiedades unicas) si queremos
        que se cree un objeto cada vez
        Podemos verificarlo viendo como se ejecuta varias veces un constructor
*/

    }
}
