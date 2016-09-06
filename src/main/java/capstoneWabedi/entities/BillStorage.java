package capstoneWabedi.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Justin on 9/2/16.
 */
public class BillStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    HashMap<Long, String> billStorage;

    ArrayList<String> billCreation;
}
