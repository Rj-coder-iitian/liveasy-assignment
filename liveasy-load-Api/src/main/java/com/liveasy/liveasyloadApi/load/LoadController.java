package com.liveasy.liveasyloadApi.load;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadController {
    
    @Autowired
	LoadRepository loadRepository;
	
	@GetMapping("/load")
	public List<Load> getAllLoad(){
		List<Load> allLoadlist = loadRepository.findAll();
		return allLoadlist;
		
	}

    @GetMapping("/load/{id}")
	public Load getEmployeebyId(@PathVariable(value = "id") UUID shipperId)
      
	{
		Load load = loadRepository.findById(shipperId).get();
		
		return load;	
	}

    @PostMapping("/load")
    public Load createEmployee(@RequestBody Load load) {
       
    	 Load savedLoad = loadRepository.save(load);
    	 
    	 return savedLoad;
    }

    @PutMapping("/load/{id}")
    public ResponseEntity<Load> updateLoad(@PathVariable(value = "id") UUID shipperId,
         @RequestBody Load loadDetails) {
        Load load = loadRepository.findById(shipperId).get();

        load.setLoadingPoint(loadDetails.getLoadingPoint());
        load.setUnloadingPoint(loadDetails.getUnloadingPoint());
        load.setProductType(loadDetails.getProductType());
        load.setTruckType(loadDetails.getTruckType());
        load.setNoOfTrucks(loadDetails.getNoOfTrucks());
        load.setWeight(loadDetails.getWeight());
        load.setComment(loadDetails.getComment());
        load.setDate(loadDetails.getDate());
        final Load updatedLoad = loadRepository.save(load);
        return ResponseEntity.ok(updatedLoad);
    }

    @DeleteMapping("/load/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") UUID shipperId)
    {
     Load load = loadRepository.findById(shipperId).get();

        loadRepository.delete(load);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
