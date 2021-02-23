package monthInquery;

import java.util.Scanner;

public class DaysUtil {
    public static void monthInquery() {
        Scanner scanner = new Scanner(System.in);
        int dayNum = -1;
        boolean keeping = true;
        while (keeping) {
            System.out.println("请输入1-12月份的阿拉伯数字，输入 q 退出\r");
            if (scanner.hasNext()) {
                String index = scanner.next();
                switch (index) {
                    case "1":
                        dayNum = MonthEnum.Jan;
                        break;
                    case "2":
                        dayNum = MonthEnum.Feb;
                        break;
                    case "3":
                        dayNum = MonthEnum.Mar;
                        break;
                    case "4":
                        dayNum = MonthEnum.Apr;
                        break;
                    case "5":
                        dayNum = MonthEnum.May;
                        break;
                    case "6":
                        dayNum = MonthEnum.Jun;
                        break;
                    case "7":
                        dayNum = MonthEnum.Jul;
                        break;
                    case "8":
                        dayNum = MonthEnum.Aug;
                        break;
                    case "9":
                        dayNum = MonthEnum.Sept;
                        break;
                    case "10":
                        dayNum = MonthEnum.Oct;
                        break;
                    case "11":
                        dayNum = MonthEnum.Nov;
                        break;
                    case "12":
                        dayNum = MonthEnum.Dec;
                        break;
                    case "q":
                        keeping = false;
                        dayNum = -1;
                        break;
                    default:
                        throw new Error("错误的输入：" + index + "请输入正确格式的数字");
                }
                if (dayNum > 0) {
                    System.out.printf(index + "月共有：" + dayNum + "天\r");
                    // 单次退出时开启
                    //break;
                }
            }
        }
    }
}
