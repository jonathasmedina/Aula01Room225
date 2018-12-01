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
public class DeletarUsuarioFragment extends Fragment {

Button buttonExcluirUsuario;
EditText edExcluirUsuario;

    public DeletarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_deletar_usuario, container, false);

    buttonExcluirUsuario = view.findViewById(R.id.buttonExcuirUsuario);
    edExcluirUsuario = view.findViewById(R.id.editTextExcluirUsuario);

    buttonExcluirUsuario.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = Integer.parseInt(edExcluirUsuario.getText().toString());
            Usuario usuario = new Usuario();

            usuario.setId(id);

            MainActivity.myAppDatabase.myDAO().deletarUsuario(usuario);

        }
    });



    return view;
    }

}
