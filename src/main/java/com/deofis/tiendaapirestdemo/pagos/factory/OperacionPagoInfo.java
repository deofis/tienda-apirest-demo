package com.deofis.tiendaapirestdemo.pagos.factory;

import com.deofis.tiendaapirestdemo.pagos.dto.AmountPayload;
import com.deofis.tiendaapirestdemo.pagos.dto.PayerPayload;

import java.util.Map;

public abstract class OperacionPagoInfo {

    protected Map<String, Object> atributos;

    public OperacionPagoInfo(Map<String, Object> atributos) {
        this.atributos = atributos;
    }

    public Map<String, Object> getAtributos() {
        return this.atributos;
    }

    public abstract String getId();

    public abstract Long getNroOperacion();

    public abstract String getStatus();

    public abstract String getApproveUrl();

    public abstract AmountPayload getAmount();

    public abstract PayerPayload getPayer();
}
