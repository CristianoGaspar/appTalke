package com.garagetalke.appgarage;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

   /*
    EditText editApelido, editSenha, editContrasenha, editEmail;

    Button btnCadastrese;
    TextView txtCadastro;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_login);


      /*  editApelido      = (EditText)findViewById(R.id.apelido);
        editSenha        = (EditText)findViewById(R.id.senha);
        editContrasenha  = (EditText)findViewById(R.id.contrasenha);
        editEmail        = (EditText)findViewById(R.id.email);
        btnCadastrese    = (Button)findViewById(R.id.btn_Cadastrese);
        txtCadastro = (TextView)findViewById(R.id.btn_cadastrese);
    */

      Button btnCadastrese = (Button)findViewById(R.id.btn_cadastro);

        btnCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity3_cadastrese);
            }
        });


    }

}
