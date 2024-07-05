import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Contact } from '../models/contact.model';
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})

export class ContactComponent {
  errorMessage: string = '';


  contactForm = new FormGroup({
    name: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required, Validators.email]),
    phone: new FormControl('', [Validators.required, Validators.pattern('^[0-9]*$')]),
    message: new FormControl('', [Validators.required])
  });

  constructor(private http: HttpClient, private toastr: ToastrService) { }

  onSubmit() {
    if (this.contactForm.valid) {
      const contact: Contact = this.contactForm.value as Contact;
      this.http.post('http://localhost:8080/api/contact', contact)
        .subscribe({
          next: (response) => {
            console.log('Contact message saved', response);
            this.toastr.success('Votre message a été envoyé avec succès.');


            this.errorMessage = '';
            this.contactForm.reset();

          },
          error: (error) => {
            console.error('Error saving contact message', error);
            this.errorMessage = 'Une erreur est survenue lors de l\'envoi du message. Réessayez !';
            // this.toastr.error('Une erreur est survenue lors de l\'envoi du message. Réessayez');

          }
        });
    }
  }
}
