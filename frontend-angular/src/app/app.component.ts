import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { HeaderComponent } from './header/header.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, HeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.sass'
})

  export class AppComponent implements OnInit {
    title: string = "QA";
    responseData: any = {};
  
    constructor(private http: HttpClient) {}

    ngOnInit(): void {
      this.http.get('http://localhost:8080/resource').subscribe(data => {
        this.responseData = data;
      })  
    }


    
  
  }