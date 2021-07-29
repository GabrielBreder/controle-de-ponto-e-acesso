package com.dio.live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

//@Data - pode ser usado apenas ele, substitui todos os outros
public class JornadaTrabalho {
    private long id;
    private String descricao;
}


