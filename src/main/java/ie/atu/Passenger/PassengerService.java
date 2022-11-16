package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers(){
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Denis", "1234567890","087654321", 22),
                new Passenger("Mr", "Denis1", "0987654321","087123456", 27),
                new Passenger("Mr", "Denis2", "12342345678","087098765", 23));
        return myPassengers;
    }

    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("Mr", "Denis", "1234567890","087654321", 22);
        return myPassenger;
    }
}