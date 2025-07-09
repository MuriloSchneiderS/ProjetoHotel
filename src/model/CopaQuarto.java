package model;

import java.security.Timestamp;

public class CopaQuarto {
    private int id;
    private float quantidade;
    private Timestamp dataHoraPedido;
    private String obs;
    private char status;
    private CheckQuarto checkQuarto;
    private ProdutoCopa produtoCopa;

    public CopaQuarto(int id, float quantidade, Timestamp dataHoraPedido, String obs, char status, CheckQuarto checkQuarto, ProdutoCopa produtoCopa) {
        this.id = id;
        this.quantidade = quantidade;
        this.dataHoraPedido = dataHoraPedido;
        this.obs = obs;
        this.status = status;
        this.checkQuarto = checkQuarto;
        this.produtoCopa = produtoCopa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Timestamp getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Timestamp dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public CheckQuarto getCheckQuarto() {
        return checkQuarto;
    }

    public void setCheckQuarto(CheckQuarto checkQuarto) {
        this.checkQuarto = checkQuarto;
    }

    public ProdutoCopa getProdutoCopa() {
        return produtoCopa;
    }

    public void setProdutoCopa(ProdutoCopa produtoCopa) {
        this.produtoCopa = produtoCopa;
    }
    
    
}
