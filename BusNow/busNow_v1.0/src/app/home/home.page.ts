import { Component} from '@angular/core';
import { IonContent, IonApp} from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
  standalone: true,
  imports: [IonContent, IonApp, HeaderComponent]
})
export class HomePage {
}
