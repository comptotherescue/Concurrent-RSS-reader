import { Injectable,NgModule } from '@angular/core';
import {Document} from './Document';
// import {HHeaders} from '@angular/common/http';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
//
// @NgModule({
//   imports: [
//     HttpClientModule,
//   ],
//   declarations: [
//     AppComponent,
//   ],
//   bootstrap: [ AppComponent ]
// })

export class DocumentService {

constructor(private http : HttpClient) { }

    // get all Documents
    getCollections(collection) {
      return this.http.get('http://localhost/3000/api/getCollection/'+collection);
    }
}
