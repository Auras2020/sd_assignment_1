package ro.tuc.ds2020.dtos;

import lombok.Data;
import java.util.Date;
import java.util.UUID;

@Data
public class TimestampEnergyConsumptionDTO {

    private UUID id;
    private Date timestamp;
    private Double energyConsumption;
    private UUID deviceId;
}
