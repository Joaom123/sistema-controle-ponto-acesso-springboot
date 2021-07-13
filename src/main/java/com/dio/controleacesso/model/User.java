package com.dio.controleacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private LocalDateTime startWorkingDay;
    private LocalDateTime endWorkingDay;
    private BigDecimal tolerance;

    @ManyToOne
    private UserCategory userCategory;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private Company company;

    @ManyToOne
    private WorkingDay workingDay;

}
