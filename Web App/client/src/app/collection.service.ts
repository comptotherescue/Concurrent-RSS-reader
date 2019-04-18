import { Injectable } from '@angular/core';
import {Collection} from './Collection';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  constructor(private http : HttpClient) { }

  // get all Collections
  getCollections() {
    return this.http.get('http://localhost:3000/api/getCollections').subscribe();
  }
}
