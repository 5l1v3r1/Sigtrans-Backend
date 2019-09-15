package com.sigtrans.sigtrans;

import com.sigtrans.sigtrans.model.endereco.municipio.Municipio;
import com.sigtrans.sigtrans.repository.MunicipioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sigtrans.sigtrans.model.endereco.estado.Estado;
import com.sigtrans.sigtrans.repository.EstadoRepository;

import java.util.UUID;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EstadoRepository estadoRepository, MunicipioRepository municipioRepository) {
        UUID partnerId = UUID.randomUUID();
        Estado state = new Estado(partnerId, "Paraná", "PR");
        estadoRepository.save(state);
        municipioRepository.save(new Municipio("Cascavel", partnerId , state));
        return args -> {
            estadoRepository.findAll().forEach(estado -> {
                log.info("Preloaded " + estado);
            });
            municipioRepository.findAll().forEach(cidade -> {
                log.info("Preloaded " + cidade);
            });
        };
    }
}