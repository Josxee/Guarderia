package com.example.demo.services;

import com.example.demo.entity.TipoPlato;
import java.util.List;

public interface ITipoPlatoService {

    List<TipoPlato> obtenerTiposPlato();

    TipoPlato obtenerTipoPlatoPorId(Long idTipoPlato);

    TipoPlato guardarTipoPlato(TipoPlato tipoPlato);

    void eliminarTipoPlato(Long idTipoPlato);
}
