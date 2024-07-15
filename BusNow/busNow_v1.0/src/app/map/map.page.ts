import { Component} from '@angular/core';
import { IonContent, IonApp} from '@ionic/angular/standalone';
import { HeaderComponent } from '../components/header/header.component';

@Component({
  selector: 'app-map',
  templateUrl: './map.page.html',
  styleUrls: ['./map.page.scss'],
  standalone: true,
  imports: [IonContent, IonApp, HeaderComponent]
})
export class MapPage{

}
