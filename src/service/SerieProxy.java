package service;

import exception.SerieNaoHabilitadaException;

public class SerieProxy {

    private static int qtdViews;


    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        qtdViews++;
        contarVisualizacao();
        Serie serie = new Serie();
        System.out.println("Total de visualizações: " + qtdViews);
        return serie.getSerie(nome);
    }

    public void contarVisualizacao() throws SerieNaoHabilitadaException {

        if(qtdViews > 5){
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas.");
        }
    }
}
