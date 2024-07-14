import { Component} from '@angular/core';
import { IonContent, IonApp} from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-terminales',
  templateUrl: './terminales.page.html',
  styleUrls: ['./terminales.page.scss'],
  standalone: true,
  imports: [IonContent, IonApp, HeaderComponent]
})
export class TerminalesPage{

}
