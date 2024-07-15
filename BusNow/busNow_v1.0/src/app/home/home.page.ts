import { Component} from '@angular/core';
import { IonContent, IonApp, IonLabel} from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
  standalone: true,
  imports: [IonContent, IonApp, HeaderComponent,IonLabel]
})
export class HomePage {
}
