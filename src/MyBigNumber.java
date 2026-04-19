import java.util.logging.Logger;

public class MyBigNumber {

    private static final Logger log = Logger.getLogger(MyBigNumber.class.getName());

    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();

        int i = stn1.length() - 1;
        int j = stn2.length() - 1;

        int carry = 0;
        int step = 1;
        int digit1, digit2, carryIn, sum, newDigit;

//        for (int i = stn1.length() - 1, j = stn2.length() - 1; i >= 0 || j >= 0;i--, j--) code khó đọc
        while (i >= 0 || j >= 0) { // lý do dùng while: vì i và j có thể giảm không đồng đều, nếu dùng for sẽ khó xử lý
            
             digit1 = (i >= 0) ? stn1.charAt(i) - '0' : 0;
             digit2 = (j >= 0) ? stn2.charAt(j) - '0' : 0;

             carryIn = carry; // nhớ từ bước trước

             sum = digit1 + digit2 + carryIn;

             newDigit = sum % 10;
            carry = sum / 10; // nhớ mới

            // LOG
            log.info("Bước " + step + ": "
                    + digit1 + " + " + digit2
                    + (carryIn > 0 ? " + " + carryIn : "")
                    + " = " + sum
                    + " → ghi " + newDigit
                    + ", nhớ " + carry);

            result.append(newDigit); // append vào đầu mảng nên bị ngược, cuối cùng sẽ reverse lại

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

    // Test
    public static void main(String[] args) {
        MyBigNumber mbn = new MyBigNumber();
        String result = mbn.sum("1234", "5678");
        System.out.println("Kết quả: " + result);
    }
}