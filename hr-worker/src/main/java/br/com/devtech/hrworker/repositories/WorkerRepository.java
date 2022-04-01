package br.com.devtech.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devtech.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
