import { ComponentFixture, TestBed } from '@angular/core/testing';
import { TerminalesPage } from './terminales.page';

describe('TerminalesPage', () => {
  let component: TerminalesPage;
  let fixture: ComponentFixture<TerminalesPage>;

  beforeEach(() => {
    fixture = TestBed.createComponent(TerminalesPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
