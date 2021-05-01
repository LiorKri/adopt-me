import { BlogService } from './blog.service';
import { AnimalService } from './animal.service';
import { VolunteerService } from './volunteer.service';
import { DonationService } from './donation.service';
import { ContactRequestService } from './contact-request.service';

export const services = [BlogService, AnimalService, VolunteerService, DonationService, ContactRequestService];

export * from './blog.service';
export * from './animal.service';
export * from './volunteer.service';
export * from './donation.service';
export * from './contact-request.service';
