package com.dbl.validacoesexemplojavax;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/motoristas")
public class MotoristaController {

    @Operation(description = "Operação para salvar o motorista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Motorista salvo com sucesso"),
            @ApiResponse(responseCode = "417", description = "Algum erro de validação de dados ocorreu"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PostMapping
    void salvaMotorista(@Valid @RequestBody MotoristaDto motoristaDto) {
        System.out.println(motoristaDto);
    }

    @Operation(description = "Operação para editar o motorista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Motorista editado com sucesso"),
            @ApiResponse(responseCode = "417", description = "Algum erro de validação de dados ocorreu"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PutMapping("/{id}")
    void atualizaMotorista(@Valid @RequestBody MotoristaDto motoristaDto) {
        System.out.println(motoristaDto);
    }

}
