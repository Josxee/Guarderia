package com.example.demo.services;
import com.example.demo.entity.Pago;
import java.util.List;

public interface IPagoService {



    List<Pago> obtenerPago();

    Pago obtenerPagoPoridPago(Long idpago);

    Pago guardarPago(Pago pago);

    void eliminarPago(Long idpago);
}

