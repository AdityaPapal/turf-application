package turf.turfApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turf.turfApp.TurfAppApplication;
import turf.turfApp.repo.TurfRepo;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class TurfServiceImpl implements TurfService{

    @Autowired
    TurfRepo turfRepo;


    @PostConstruct
    public void testMe() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(turfRepo.findAll());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
