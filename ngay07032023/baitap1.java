package baitapbotuc.ngay07032023;

import Baitaptuan4.Thuc_hanh_lop_hinh_chu_nhat;

import java.util.Scanner;

public class baitap1 {

        double chieudai ;
        double chieurong;

        public baitap1 (double chieudai ,double chieurong) {
            this.chieudai = chieudai;
            this.chieurong = chieurong;
        }
        public double Chu_Vi (){
            return (this.chieudai+this.chieurong)/2;
        }
        public double Dien_Tich() {
            return (this.chieudai*this.chieurong);
        }

        public static class hcn {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("NHap chieu dai");
                double chieudai = sc.nextDouble();
                System.out.println("Nhap chieu rong");
                double chieurong = sc.nextDouble();
                Baitaptuan4.Thuc_hanh_lop_hinh_chu_nhat hcn = new Baitaptuan4.Thuc_hanh_lop_hinh_chu_nhat(chieudai,chieurong);
                System.out.println("Chu vi: "+hcn.Chu_Vi());
                System.out.println("Dien Tich: "+hcn.Dien_Tich());
            }

        }
    }

