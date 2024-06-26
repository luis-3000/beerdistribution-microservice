package luis3000.beerdistributionmicroservice.web.controller;

import luis3000.beerdistributionmicroservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/*
 * Created by Jose Castillo 5/19/24.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeetById(@PathVariable("beerId") UUID beerId) {

        // @Todo: Do the implementation, for now, we're just stubbing things out...
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {

        // @Todo: provide implementation
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {

        // @Todo: provide implementation in a future task
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
