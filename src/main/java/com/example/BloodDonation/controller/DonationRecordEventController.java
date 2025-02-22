package com.example.BloodDonation.controller;

import com.example.BloodDonation.model.DonationRecordEvent;
import com.example.BloodDonation.service.DonationRecordEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/donationrecordevents")
public class DonationRecordEventController {

    private final DonationRecordEventService donationRecordEventService;

    @Autowired
    public DonationRecordEventController(DonationRecordEventService donationRecordEventService) {
        this.donationRecordEventService = donationRecordEventService;
    }

    @GetMapping
    public List<DonationRecordEvent> getAllDonationRecordEvents() {
        return donationRecordEventService.getAllDonationRecordEvents();
    }

    @GetMapping("/{id}")
    public Optional<DonationRecordEvent> getDonationRecordEventById(@PathVariable Integer id) {
        return donationRecordEventService.getDonationRecordEventById(id);
    }

    @PostMapping
    public DonationRecordEvent saveDonationRecordEvent(@RequestBody DonationRecordEvent donationRecordEvent) {
        return donationRecordEventService.saveDonationRecordEvent(donationRecordEvent);
    }

    @DeleteMapping("/{id}")
    public void deleteDonationRecordEvent(@PathVariable Integer id) {
        donationRecordEventService.deleteDonationRecordEvent(id);
    }
}
    