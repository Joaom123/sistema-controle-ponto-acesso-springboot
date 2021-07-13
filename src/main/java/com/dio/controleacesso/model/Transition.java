package com.dio.controleacesso.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Transition {
    @Id
    @EmbeddedId
    private TransitionId id;
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class TransitionId implements Serializable {
        private Long transitionId;
        private Long userId;
    }

}
