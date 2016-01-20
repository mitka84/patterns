package ru.savochkindv.patterns.collecting_parameter;

/**
 * Фильтр
 * Created by savochkindv on 18.01.2016.
 */
public class Filter {

    /**
     * Добавляет к параметрам строку "accumulating"
     * @param cp сборшик параметров
     */
    public void f ( CollectingParameter cp ) {
        cp.add ( "accumulating" ) ;
    }

    /**
     * Добавляет к параметрам строку "items"
     * @param cp сборшик параметров
     */
    public void g ( CollectingParameter cp ) {
        cp.add ( "items" ) ;
    }

    /**
     * Добавляет к параметрам строку "as we go"
     * @param cp сборшик параметров
     */
    public void h ( CollectingParameter cp ) {
        cp.add ( "as we go" ) ;
    }

}
