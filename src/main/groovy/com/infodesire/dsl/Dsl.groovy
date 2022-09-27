package com.infodesire.dsl

import static groovy.lang.Closure.DELEGATE_ONLY

public class Dsl {

    static void query( final Closure closure ) {
        final QueryDsl dsl = new QueryDsl()
        closure.delegate = dsl
        closure.resolveStrategy = DELEGATE_ONLY
        closure.call()
    }


    static class QueryDsl {

        void type( String type ) {
            println( "Type: " + type )
        }

    }

}