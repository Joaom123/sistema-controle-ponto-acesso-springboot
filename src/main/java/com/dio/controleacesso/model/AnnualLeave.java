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
public class AnnualLeave {
    @Id
    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime workedDate;
    private BigDecimal hoursWorked;
    private BigDecimal balanceHoursWorked;

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class AnnualLeaveId implements Serializable {
        private Long annualLeaveId;
        private Long transitionId;
        private Long userId;
    }

}
