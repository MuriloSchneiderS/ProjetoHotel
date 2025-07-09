package model;

import java.security.Timestamp;
import java.util.List;

public class CheckQuarto {
    private int id;
    private Timestamp dataHoraInicio, dataHoraFim;
    private String obs;
    private char status;
    private Quarto quarto;
    private Check check;
    private ReservaQuarto reservaQuarto;
    private List<CopaQuarto> copaQuarto;

    public CheckQuarto(int id, Timestamp dataHoraInicio, Timestamp dataHoraFim, String obs, char status, Quarto quarto, Check check) {
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.obs = obs;
        this.status = status;
        this.quarto = quarto;
        this.check = check;
    }
    
    public ReservaQuarto getReservaQuarto() {
        return reservaQuarto;
    }

    public void setReservaQuarto(ReservaQuarto reservaQuarto) {
        this.reservaQuarto = reservaQuarto;
    }

    public List getCopaQuarto() {
        return copaQuarto;
    }

    public void setCopaQuarto(List copaQuarto) {
        this.copaQuarto = copaQuarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Timestamp getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Timestamp dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }   
}