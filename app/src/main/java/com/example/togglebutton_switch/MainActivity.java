package com.example.togglebutton_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        tv_resultado = findViewById(R.id.tv_resultado);
        adicionarListener();
    }

    private void adicionarListener() {
        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(toggleSenha.isChecked()){
                    tv_resultado.setText("Toggle ligado");
                }else{
                    tv_resultado.setText("Toggle desligado");
                }
            }
        });
    }

    public void enviar(View view){
        if(switchSenha.isChecked()){
            tv_resultado.setText("Switch ligado");
        }else{
            tv_resultado.setText("Switch desligado");
        }
    }

}
