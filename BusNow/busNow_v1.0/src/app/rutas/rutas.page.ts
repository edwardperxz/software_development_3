import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular'; // Importa IonicModule en lugar de componentes individuales
import { HeaderComponent } from '../components/header/header.component'; // Asegúrate de que esta ruta sea correcta

@Component({
  selector: 'app-rutas',
  templateUrl: './rutas.page.html',
  styleUrls: ['./rutas.page.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    HeaderComponent // Importa IonicModule para tener acceso a todos los componentes de Ionic
  ]
})
export class RutasComponent {
}
