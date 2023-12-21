import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import {OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.sass'
})


  export class AppComponent implements OnInit {
    title: string = "Angular";
    responseData: any = {};
  
    constructor(private http: HttpClient) {}

    ngOnInit(): void {
      this.http.get('http://localhost:8080/resource').subscribe(data => {
        console.log(data)
        this.responseData = data;
      })  
    }


    
  
  }