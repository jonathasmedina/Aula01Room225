package com.example.jonathas.aula01room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment implements View.OnClickListener {

    Button btAdicionar, btAtualizar, btDeletar, btListar;


    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

    btAdicionar = view.findViewById(R.id.buttonInserirUsuario);
    btListar= view.findViewById(R.id.buttonListarUsuarios);
    btDeletar = view.findViewById(R.id.buttonDeletarUsuario);
    btAtualizar = view.findViewById(R.id.buttonAlterarUsuario);


    btAtualizar.setOnClickListener(this);
    btDeletar.setOnClickListener(this);
    btListar.setOnClickListener(this);
    btAdicionar.setOnClickListener(this);

    return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonInserirUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameConteiner,
                                new AdicionarUsuarioFragment()).
                        addToBackStack(null).commit();

                break;

            case R.id.buttonListarUsuarios:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameConteiner,
                                new ListarUsuariosFragment()).
                        addToBackStack(null).commit();
                break;
            case R.id.buttonAlterarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameConteiner,
                                new AtualizarUsuarioFragment()).
                        addToBackStack(null).commit();
                break;
            case R.id.buttonDeletarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameConteiner,
                                new DeletarUsuarioFragment()).
                        addToBackStack(null).commit();
                break;
        }
    }
}
