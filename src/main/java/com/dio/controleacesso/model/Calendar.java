package com.dio.controleacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendar {
    @Id
    private Long id;
    private String description;
    private DateType dateType;
    private LocalDateTime especialDate;
}
