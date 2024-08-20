import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend-cours-maths-pc-angular';

   closeMenu(): void {
    const navbarResponsive = document.getElementById('navbarResponsive');
    if (navbarResponsive && navbarResponsive.classList.contains('show')) {
      navbarResponsive.classList.remove('show');
    }
  }
}
