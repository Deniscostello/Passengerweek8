package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers(){

        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr", "Denis", "1234567890","087654321", 22);
        return myPassenger;
    }
    public void savePassenger(Passenger passenger)
    {
        passengerRepo.save(passenger);
    }
    public Passenger findPassengerByName(String name)
    {
        return passengerRepo.findPassengerByName(name);
    }
}
