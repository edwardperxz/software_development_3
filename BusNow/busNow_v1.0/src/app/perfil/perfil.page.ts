import { Component} from '@angular/core';
import { IonContent, IonApp, IonButton, IonInput, IonLabel } from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.page.html',
  styleUrls: ['./perfil.page.scss'],
  standalone: true,
  imports: [IonLabel, IonInput, IonButton, IonContent, IonApp, HeaderComponent]
})
export class PerfilPage {
  isActive: boolean = false;

  toggleButton() {
    this.isActive = !this.isActive;
  }
}