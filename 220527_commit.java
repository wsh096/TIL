//1) 선택정렬
  public int[] solution(int n, int[] arr) {
    for (int i = 0; i < n - 1; i++) {
      int idx = i;
      
      for (int j = i + 1; j < n; j++) {
        if (arr[idx] > arr[j]) {
          idx = j;
        }
      }

      int tmp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = tmp;
    }
    return arr;
  }
//2) 버블정렬
  public int[] solution(int n, int[] arr) {
    // 오름차순 방법 1
    for (int i = 0; i < n; i++) {
      for (int j = n -1; j > i; j--) {
        if (arr[j] < arr[j-1]) {
          int tmp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tmp;
        }
      }
    }
    
    // 오름차순 방법 2
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }
    return arr;
  }
//3) 삽입정렬
  public int[] solution(int n, int[] arr) {
    for (int i = 1; i < n; i++) {
      int tmp = arr[i], j;
      for (j = i - 1; j >= 0; j--) {
        if (tmp < arr[j]) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }
      arr[j + 1] = tmp;
    }
    return arr;
  }
//4) Comparable
class Point implements Comparable<Point> {
  public int x, y;
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  @Override
  public int compareTo(Point o) {
    if (this.x == o.x) return this.y - o.y; // 오름차순
    else return this.x - o.x;
  }
  // o.y - this.y는 내림차순
}

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    ArrayList<Point> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = stdIn.nextInt();
      int y = stdIn.nextInt();
      arr.add(new Point(x, y));
    }
    Collections.sort(arr);
    for (Point o : arr) {
      System.out.println(o.x + " " + o.y);
    }
  }
}
/*좌표를 오름차순으로 정렬하는 문제이다.
compareTo에서 양수를 반환하면 값을 바꾸고, 음수를 반환하면 값을 바꾸지 않는다. 따라서 오름차순으로 정렬하려고 할 때 현재 값에서 다음값을 뺀 것을 반환하면 된다.
*/
