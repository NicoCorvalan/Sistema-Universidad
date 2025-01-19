package sistema_universidad.universidad.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sistema_universidad.universidad.enums.Duracion;

@Getter
@Setter
@AllArgsConstructor
public class MateriaDTO {

    private Long id;
    private String nombre;
    private String carreraNombre;
    private Duracion duracion;
    private int horasCursado;
}
