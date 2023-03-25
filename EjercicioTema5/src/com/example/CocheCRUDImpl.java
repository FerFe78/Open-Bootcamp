package com.example;
public class CocheCRUDImpl implements CocheCRUD {

    public void save(){}
    public void findAll(){}
    public void delete(){}

    String save = "guardar";
    String findAll = "listar";
    String delete = "borrar";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
