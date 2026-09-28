package com.eventmate.controller;
import com.eventmate.model.Booking;
import com.eventmate.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins="*")
public class BookingController {
 private final BookingRepository repo;
 public BookingController(BookingRepository repo){this.repo=repo;}
 @PostMapping public Booking create(@RequestBody Booking booking){return repo.save(booking);}
 @GetMapping public List<Booking> all(){return repo.findAll();}
}