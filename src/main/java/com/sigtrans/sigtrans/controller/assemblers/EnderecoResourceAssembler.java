package com.sigtrans.sigtrans.controller.assemblers;

import com.sigtrans.sigtrans.model.endereco.rua.RuaResourceAssembler;
import com.sigtrans.sigtrans.model.endereco.bairro.BairroResourceAssembler;
import com.sigtrans.sigtrans.model.endereco.estado.EstadoResourceAssembler;
import com.sigtrans.sigtrans.model.endereco.municipio.MunicipioResourceAssembler;
import org.springframework.stereotype.Component;

@Component
public class EnderecoResourceAssembler {
    public final BairroResourceAssembler districtAssembler;
    public final EstadoResourceAssembler stateAssembler;
    public final MunicipioResourceAssembler cityAssembler;
    public final RuaResourceAssembler streetAssembler;

    public EnderecoResourceAssembler(BairroResourceAssembler districtAssembler, EstadoResourceAssembler stateAssembler, MunicipioResourceAssembler cityAssembler, RuaResourceAssembler streetAssembler) {
        this.districtAssembler = districtAssembler;
        this.stateAssembler = stateAssembler;
        this.cityAssembler = cityAssembler;
        this.streetAssembler = streetAssembler;
    }
}