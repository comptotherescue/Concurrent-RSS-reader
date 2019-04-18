import { Injectable,NgModule } from '@angular/core';
import {Document} from './Document';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})


export class DocumentService {

constructor(private http : HttpClient) { }

    // get all Documents
    getCollections(collection) {
      return this.http.get('http://localhost:3000/api/getCollection/'+collection);
    }
}
