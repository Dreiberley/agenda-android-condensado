package com.exemplo.agenda;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // TODO: Aula 7 - Configurar botão flutuante
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            // TODO: Abrir FormularioActivity
            // Intent intent = new Intent(this, FormularioActivity.class);
            // startActivity(intent);
        });
        
        // TODO: Aula 6 - Abrir lista de alunos
        abrirListaAlunos();
    }
    
    private void abrirListaAlunos() {
        // TODO: Implementar navegação para lista
        Intent intent = new Intent(this, ListaAlunosActivity.class);
        startActivity(intent);
    }
}
