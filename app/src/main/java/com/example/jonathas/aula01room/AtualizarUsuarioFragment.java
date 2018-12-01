package com.example.jonathas.aula01room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AtualizarUsuarioFragment extends Fragment {

Button btAtualiza;
EditText edAtId, edAtualizaNome, edAtualizaEmail;


    public AtualizarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_atualizar_usuario, container, false);

    btAtualiza = view.findViewById(R.id.buttonAtualizaUsuario);
    edAtId = view.findViewById(R.id.editTextId);
    edAtualizaEmail = view.findViewById(R.id.editTextAtualizaEmail);
    edAtualizaNome = view.findViewById(R.id.editTextAtualizaNome);

    btAtualiza.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int userId = Integer.parseInt(edAtId.getText().toString());
            String userNome = edAtualizaNome.getText().toString();
            String email = edAtualizaEmail.getText().toString();


            Usuario usuario = new Usuario();
            usuario.setEmail(email);
            usuario.setId(userId);
            usuario.setNome(userNome);

            MainActivity.myAppDatabase.myDAO().atualizarUsuario(usuario);
        }
    });


    return view;
    }

}
