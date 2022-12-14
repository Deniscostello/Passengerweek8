package ie.atu.Passenger;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/passenger")
public class PassengerController {

    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }


    @GetMapping
    public List<Passenger> getPassengers(){
        return myService.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID)
    {
        return myService.getPassenger(passengerID);
    }

    //Save operation
    @PostMapping("")
    public void savePassenger(
            @RequestBody Passenger passenger)
    {
        myService.savePassenger(passenger);
    }
}
