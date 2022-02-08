package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;


@Service
public class AppointmentService {
	@Autowired
    AppointmentRepository appointmentRepository;

	public Iterable<Appointment> getAppointments() {
		return appointmentRepository.findAll();
	}

	public Optional<Appointment> getappointment(Integer id) {
		return appointmentRepository.findById(id);
	}

	public void saveAppointment(com.example.demo.entity.@Valid Appointment appointment) {
		appointmentRepository.save(appointment);
		
		
	}

}
