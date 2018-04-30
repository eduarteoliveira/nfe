package com.fincatto.documentofiscal.mdfe3.classes.nota.evento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "eventoMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeProtocoloEvento extends DFBase {

    @Attribute(name = "versao")
    private String versao;

    @Element(name = "eventoMDFe")
    private MDFeEvento evento;

    @Element(name = "retEventoMDFe", required = false)
    private MDFeEventoRetorno eventoRetorno;

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public MDFeEvento getEvento() {
        return evento;
    }

    public void setEvento(MDFeEvento evento) {
        this.evento = evento;
    }

    public void setEventoRetorno(final MDFeEventoRetorno infoEventoRetorno) {
        this.eventoRetorno = infoEventoRetorno;
    }

    public MDFeEventoRetorno getEventoRetorno() {
        return eventoRetorno;
    }
}