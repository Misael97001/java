package com.clearminds.test;

import com.clearminds.maquina.*;
import com.clearminds.componentes.Celda;
import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.maquina.*;

import com.clearminds.maquina.*;

import com.clearminds.maquina.MaquinaDulces;

public class TestMaquinaDulces {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces ();

        // EL CODIGO, TIENE DATO, PERO el tipo de dato Producto al ser una clase tien que
        // inicializar sino estara null
        maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
        maquina.mostarConfiguracion();
    }
}
