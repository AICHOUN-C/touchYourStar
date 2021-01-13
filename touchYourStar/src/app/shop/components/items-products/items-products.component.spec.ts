import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItemsProductsComponent } from './items-products.component';

describe('ItemsProductsComponent', () => {
  let component: ItemsProductsComponent;
  let fixture: ComponentFixture<ItemsProductsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ItemsProductsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ItemsProductsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
