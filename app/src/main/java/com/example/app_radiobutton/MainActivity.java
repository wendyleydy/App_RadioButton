package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ESTOS SON LOS OBJETOS O COMPONENTES
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREAR OBJETOS QUE PERMITAN RECUPERAR A TRAVES D ELOS ID QUE LE HEMOS PUESTO A CADA UNO DE LOS COMPONENTES:
        //CASTING
        //ESTO ES PARA ESTABLECER UNA RELACION ENTRE LA PARTE LOGICA Y LA PARTE GRAFICA
        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);
        tv1 = (TextView)findViewById(R.id.textView);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
    }

    //METODO PARA EL BOTON CALCULAR:
    public void Calcular(View view){
        //RECUPERAR LOS VALORES QUE EL USUARIO HA INTRODUCIDO EN LOS EDITTEXT:
            String valor1_String = et1.getText().toString();
            String valor2_String = et2.getText().toString();
        //CONVERTIR A ENTERO:
            int valor1_int = Integer.parseInt(valor1_String);
            int valor2_int = Integer.parseInt(valor2_String);


            if(rb1.isChecked() == true){
                int suma = valor1_int + valor2_int;
                String resultado = String.valueOf(suma);    //PASAR UN ENTERO A UN STRING
                tv1.setText(resultado);//PONER EL RESULTADO DENTRO DEL TEXTVIEW
            }else if(rb2.isChecked() ==true){
                int resta = valor1_int - valor2_int;
                String resultado = String.valueOf(resta);
                tv1.setText(resultado);
            }
    }
}
