package ru.savochkindv.patterns.collecting_parameter;

/**
 * ������
 * Created by savochkindv on 18.01.2016.
 */
public class Filter {

    /**
     * ��������� � ���������� ������ "accumulating"
     * @param cp ������� ����������
     */
    public void f ( CollectingParameter cp ) {
        cp.add ( "accumulating" ) ;
    }

    /**
     * ��������� � ���������� ������ "items"
     * @param cp ������� ����������
     */
    public void g ( CollectingParameter cp ) {
        cp.add ( "items" ) ;
    }

    /**
     * ��������� � ���������� ������ "as we go"
     * @param cp ������� ����������
     */
    public void h ( CollectingParameter cp ) {
        cp.add ( "as we go" ) ;
    }

}
