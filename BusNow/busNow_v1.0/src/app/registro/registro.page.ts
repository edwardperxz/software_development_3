import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { IonBackButton, IonButton, IonButtons, IonCard, IonCardContent, IonCardHeader, IonCardTitle, IonContent, IonFooter, IonHeader, IonInput, IonItem, IonLabel, IonTitle, IonToolbar } from '@ionic/angular/standalone';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.page.html',
  styleUrls: ['./registro.page.scss'],
  standalone: true,
  imports: 
  [IonContent, 
    IonHeader, 
    IonTitle, 
    IonToolbar, 
    CommonModule, 
    FormsModule,
    IonButtons,
    IonBackButton,
    IonButton,
    IonCardHeader,
    IonLabel,
    IonItem,
    IonCardContent,
    IonInput,
    IonCard,
    IonCardTitle,
    ReactiveFormsModule,
    IonFooter
  ]
})
export class RegistroPage implements OnInit 
{
  formularioRegistro: FormGroup;

  constructor(public fb:FormBuilder) { 
    this.formularioRegistro = this.fb.group({
      'nombre': new FormControl("",Validators.required),
      'password': new FormControl("", Validators.required),
      'confirmacion': new FormControl("", Validators.required)
    });
  }

  ngOnInit() {
  }
}


