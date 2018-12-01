package com.example.jonathas.aula01room;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDAO {

    @Insert
    public void inserirUsuario(Usuario usuario);

    @Query("select *from usuarios")
    public List<Usuario> listarUsuarios();

    @Delete
    public void deletarUsuario(Usuario usuario);

    @Update
    public void atualizarUsuario(Usuario usuario);


}
