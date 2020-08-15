package com.example.maxdelivery;

import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Usuario;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario = (EditText)findViewById(R.id.miusuario);
        Password = (EditText)findViewById(R.id.micontraseña);
        Login = (Button) findViewById(R.id.milogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NombreUsuario;
                String ContraseñaUsuario;
                NombreUsuario = Usuario.getText().toString();
                ContraseñaUsuario = Password.getText().toString();

                if((NombreUsuario.equals("admin")) && (ContraseñaUsuario.equals("12345"))) {
                    Intent intent = new Intent(MainActivity.this,Productos.class);
                    startActivity(intent);

                }
                else {

                    Toast.makeText(MainActivity.this,"Error de Login",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}