package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaVaga;
import view.TelaCadastroVaga;

public class ControllerCadVaga implements ActionListener {

    TelaCadastroVaga telaCadastroVaga;

    public ControllerCadVaga(TelaCadastroVaga telaCadastroVaga) {

        this.telaCadastroVaga = telaCadastroVaga;

        this.telaCadastroVaga.getjButtonNovo().addActionListener(this);
        this.telaCadastroVaga.getjButtonCancelar().addActionListener(this);
        this.telaCadastroVaga.getjButtonGravar().addActionListener(this);
        this.telaCadastroVaga.getjButtonBuscar().addActionListener(this);
        this.telaCadastroVaga.getjButtonSair().addActionListener(this);

        utilities.Utilities.ativaDesativa(this.telaCadastroVaga.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroVaga.getjPanelDados(), false);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaCadastroVaga.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroVaga.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroVaga.getjPanelDados(), true);

        } else if (evento.getSource() == this.telaCadastroVaga.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroVaga.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroVaga.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroVaga.getjButtonGravar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroVaga.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroVaga.getjPanelDados(), false);

        } else if (evento.getSource() == this.telaCadastroVaga.getjButtonBuscar()) {
            TelaBuscaVaga telaBuscaVaga = new TelaBuscaVaga(null, true);
            ControllerBuscaVaga controllerBuscaVaga = new ControllerBuscaVaga(telaBuscaVaga);
            telaBuscaVaga.setVisible(true);
            
        } else if (evento.getSource() == this.telaCadastroVaga.getjButtonSair()) {
            this.telaCadastroVaga.dispose();
        }
    }
}
