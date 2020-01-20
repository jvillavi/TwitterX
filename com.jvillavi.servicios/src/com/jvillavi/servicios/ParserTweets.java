package com.jvillavi.servicios;

import com.jvillavi.tipos.Tweet;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * ParserTweets de Tweets
 */
public class ParserTweets {
    /**
     * Obtiene los ultimos 10 tweets recientes
     * @return La lista de Tweets recientes
     */
    public static List<Tweet> obtenerTweets() {

        //TODO Revisar si en verdad es necesario usar metodos estaticos en este contexto

        return Arrays.asList(
                new Tweet("jvillavic", new Date(), "No me gusta vb6"),
                new Tweet("promero", new Date(), "Java 9 Rocks!"),
                new Tweet("andreitagolosa", new Date(), "Llamenme que estoy caliente")
        );
    }
}