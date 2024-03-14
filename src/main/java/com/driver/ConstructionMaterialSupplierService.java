package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ConstructionMaterialSupplierService {
	private Map<Integer, ConstructionMaterial> materialDatabase;
    private Map<Integer, Supplier> supplierDatabase;
    private int nextMaterialId;
    private int nextSupplierId;

    public ConstructionMaterialSupplierService() {
    	// your code goes here
        materialDatabase=new HashMap<>();
        supplierDatabase=new HashMap<>();
        nextMaterialId=1;
        nextSupplierId=1;
    }

    public ConstructionMaterial addConstructionMaterial(ConstructionMaterial material) {
    	// your code goes here
        material.setId(nextMaterialId++);
        materialDatabase.put(material.getId(), material);
        return material;
    }

    public Supplier addSupplier(Supplier supplier) {
    	// your code goes here
        supplier.setId(nextSupplierId++);
        supplierDatabase.put(supplier.getId(), supplier);
        return supplier;
    }

    public List<ConstructionMaterial> getAllMaterials() {
    	// your code goes here
        return new ArrayList<>(materialDatabase.values());
    }

    public List<Supplier> getAllSuppliers() {
    	// your code goes here
        return new ArrayList<>(supplierDatabase.values());
    }
}
