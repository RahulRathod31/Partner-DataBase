package net.details.springboot.repository;


import net.details.springboot.model.Partner;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository; 


@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long>
{

}
