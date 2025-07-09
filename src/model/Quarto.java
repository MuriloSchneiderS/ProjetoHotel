package model;

public class Quarto {
    private int id, capacidadeHospedes, andar;
    private String descricao, identificacao, obs;
    private float metragem;
    private boolean flagAnimais;
    private char status;

    public Quarto(int id, int capacidadeHospedes, int andar, String descricao, String identificacao, String obs, float metragem, boolean flagAnimais, char status) {
        this.id = id;
        this.capacidadeHospedes = capacidadeHospedes;
        this.andar = andar;
        this.descricao = descricao;
        this.identificacao = identificacao;
        this.obs = obs;
        this.metragem = metragem;
        this.flagAnimais = flagAnimais;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadeHospedes() {
        return capacidadeHospedes;
    }

    public void setCapacidadeHospedes(int capacidadeHospedes) {
        this.capacidadeHospedes = capacidadeHospedes;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public float getMetragem() {
        return metragem;
    }

    public void setMetragem(float metragem) {
        this.metragem = metragem;
    }

    public boolean isFlagAnimais() {
        return flagAnimais;
    }

    public void setFlagAnimais(boolean flagAnimais) {
        this.flagAnimais = flagAnimais;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
