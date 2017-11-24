package com.jvillavi.gui;

import javax.swing.*;
import com.jvillavi.servicios.*;
import com.jvillavi.tipos.Tweet;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Forma Principal
 */
public class Principal extends JFrame {

    private JLabel usuario;
    private JLabel fecha;
    private JLabel detalle;
    private JButton cargarTweet;
    private JPanel contenedor;

    public Principal(){

        contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(4,2,10,10));

        usuario = new JLabel();
        fecha = new JLabel();
        detalle = new JLabel();
        cargarTweet = new JButton("Cargar Tweet");

        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prepararContenedor();

        setLayout(new BorderLayout());
        add(contenedor,BorderLayout.CENTER);
        add(cargarTweet,BorderLayout.SOUTH);

        iniciarManejadorEventos();

    }

    /**
     * Prepara el contenedor principal
     */
    private void prepararContenedor(){

        contenedor.add(new JLabel("Usuario:"));
        contenedor.add(usuario);
        contenedor.add(new JLabel("Fecha:"));
        contenedor.add(fecha);
        contenedor.add(new JLabel("Detalle:"));
        contenedor.add(detalle);

    }

    /**
     * Inicia los manejadores de eventos
     */
    private void iniciarManejadorEventos(){
        cargarTweet.addActionListener((e)->{
            cargarPrimerTweet();
        });
    }

    /**
     * Carga el primer tweet que aparece
     */
    private void cargarPrimerTweet(){
        List<Tweet> tweets = ParserTweets.obtenerTweets();

        if (tweets != null && tweets.size() > 0) {

            Tweet primerTweet = tweets.get(0);

            SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

            usuario.setText(primerTweet.getUsuario());
            fecha.setText(formateador.format(primerTweet.getFecha()));
            detalle.setText(primerTweet.getContenido());

            formateador = null;

        }

        tweets = null;
    }

}
