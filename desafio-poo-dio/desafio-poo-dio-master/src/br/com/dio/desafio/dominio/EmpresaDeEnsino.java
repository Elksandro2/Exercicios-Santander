package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeEnsino {

    private final String NOME_EMPRESA = "DIO";

    private static List<Bootcamp> listaBootcamps;

    public EmpresaDeEnsino() {
        this.listaBootcamps = new ArrayList<>();
    }

    public String getNOME_EMPRESA() {
        return NOME_EMPRESA;
    }

    public List<Bootcamp> getListaBootcamps() {
        return listaBootcamps;
    }

    public void setListaBootcamps(List<Bootcamp> listaBootcamps) {
        this.listaBootcamps = listaBootcamps;
    }

    public static void adicionarBootcamp(Bootcamp bootcamp){
        listaBootcamps.add(bootcamp);
    }

    public void removerBootcamp(Bootcamp bootcamp){
        listaBootcamps.remove(bootcamp);
    }

    public int quantidadeDeBootcamp(){
        return listaBootcamps.size();
    }

    @Override
    public String toString() {
        return "Nome da empresa: " + NOME_EMPRESA;
    }

}
