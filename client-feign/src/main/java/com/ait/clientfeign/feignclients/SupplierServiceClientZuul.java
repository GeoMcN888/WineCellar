package com.ait.clientfeign.feignclients;

import com.ait.wine.model.Supplier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient("zuul-api-gateway")
public interface SupplierServiceClientZuul
{
/*    @GetMapping("supplier-service/suppliers/{supplierId}")
    Supplier getSupplierById(@PathVariable(value = "supplierId") long supplierId);

    @DeleteMapping("supplier-service/suppliers/{supplierId}")
    void deleteSupplierById(@PathVariable(value = "supplierId") long supplierId);

    @PostMapping("supplier-service/suppliers/{supplierId}")
    Supplier addSupplier(@RequestBody Supplier supplier) ;

    @GetMapping("supplier-service/suppliers")
    public List<Supplier> getSuppliers(@RequestParam("name") Optional<String> name, @RequestParam("country")Optional<String> country);*/

}
