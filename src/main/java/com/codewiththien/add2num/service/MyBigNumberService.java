package com.codewiththien.add2num.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MyBigNumberService {
     private static final Logger log = Logger.getLogger(MyBigNumberService.class.getName());

    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();
        
        int i = stn1.length() - 1;
        int j = stn2.length() - 1;

        int carry = 0; // biến nhớ đầu tiên ví dụ 7 + 8 = 15 nhớ 1
        int step = 1;

        while (i >= 0 || j >= 0) {
            
            int digit1 = (i >= 0) ? stn1.charAt(i) - '0' : 0; // lấy vị trí cuối cùng của chuỗi chuyển từ char về int, nếu đã hết thì lấy 0
            int digit2 = (j >= 0) ? stn2.charAt(j) - '0' : 0;

            int carryIn = carry; // nhớ từ bước trước

            int sum = digit1 + digit2 + carryIn;

            int newDigit = sum % 10;
            carry = sum / 10; // nhớ mới

            // LOG
            log.info("Bước " + step + ": "
                    + digit1 + " + " + digit2
                    + (carryIn > 0 ? " + " + carryIn : "")
                    + " = " + sum
                    + " → ghi " + newDigit
                    + ", nhớ " + carry);

            result.append(newDigit);

            i--;
            j--;
            step++;
        }

        // nếu còn nhớ cuối
        if (carry > 0) {
            result.append(carry);
            log.info("Thêm nhớ cuối: " + carry);
        }

        return result.reverse().toString();
    }
    
}
