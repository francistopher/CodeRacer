import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.sass'
})
export class AppComponent {
  title = 'QA';
  greeting = {}
  // constructor(private http: HttpClient) {
  //   http.get('resource').subscribe(data => this.greeting = data)
  // }
  
}
