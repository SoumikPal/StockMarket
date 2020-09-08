import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsersearchcompaniesinsectorComponent } from './usersearchcompaniesinsector.component';

describe('UsersearchcompaniesinsectorComponent', () => {
  let component: UsersearchcompaniesinsectorComponent;
  let fixture: ComponentFixture<UsersearchcompaniesinsectorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsersearchcompaniesinsectorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsersearchcompaniesinsectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
