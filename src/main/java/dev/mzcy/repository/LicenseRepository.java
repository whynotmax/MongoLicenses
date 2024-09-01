package dev.mzcy.repository;

import dev.mzcy.model.License;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LicenseRepository extends MongoRepository<License, String> {
}