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
public class AdicionarUsuarioFragment extends Fragment {

    Button buttonInserirUsuario;
    EditText edInserirId, edInserirNome, edInserirEmail;

    public AdicionarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adicionar_usuario, container, false);

    buttonInserirUsuario =view.findViewById(R.id.buttonInserir);
    edInserirEmail = view.findViewById(R.id.editTextInserirEmail);
    edInserirId = view.findViewById(R.id.editTextInserirId);
    edInserirNome = view.findViewById(R.id.editTextInserirNome);


   buttonInserirUsuario.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           int userId = Integer.parseInt(edInserirId.getText().toString());
           String userNome = edInserirNome.getText().toString();
           String email = edInserirEmail.getText().toString();


           Usuario usuario = new Usuario();
           usuario.setEmail(email);
           usuario.setId(userId);
           usuario.setNome(userNome);

           MainActivity.myAppDatabase.myDAO().inserirUsuario(usuario);

       }
   });


    return view;

    }

}
