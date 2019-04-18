import { Component, OnInit } from '@angular/core';
import {CollectionService} from '../collection.service';
import {Collection} from '../Collection';

@Component({
  selector: 'app-collection',
  templateUrl: './collection.component.html',
  styleUrls: ['./collection.component.css'],
  providers: [CollectionService]
})
export class CollectionComponent implements OnInit {
  allCollections: Collection[];
  collection: Collection;
  constructor(private collectionService :CollectionService) { }
  ngOnInit() {
    this.collectionService
    .getCollections()
    .subscribe();

  }
}
