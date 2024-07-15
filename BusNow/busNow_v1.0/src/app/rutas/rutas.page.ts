import { Component} from '@angular/core';
import { IonContent, IonApp} from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-rutas',
  templateUrl: './rutas.page.html',
  styleUrls: ['./rutas.page.scss'],
  standalone: true,
  imports: [IonContent, IonApp, HeaderComponent]
})
export class RutasComponent {
}
