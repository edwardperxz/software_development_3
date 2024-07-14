import { Component} from '@angular/core';
import { IonContent, IonApp} from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.page.html',
  styleUrls: ['./perfil.page.scss'],
  standalone: true,
  imports: [IonContent, IonApp, HeaderComponent]
})
export class PerfilPage {

}
