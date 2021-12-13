package structures;

import java.util.Arrays;

        public class LinkedListTest {

            public static void main(String[] args) {
                LinkedList secondList = new LinkedList();
                secondList.add(new int[]{4, 5, 6});

                LinkedList list = new LinkedList();
                list.add(new int[]{1, 2, 3});
                list.add(secondList);

                System.out.println(list.asString());


            /*    LinkedList list = new LinkedList();
                list.add(new int[]{0, 1, 2, 3});
                DynaArray dynaArray = new DynaArray();

                dynaArray.add(list);

                System.out.println(dynaArray.asString());
*/
            /*    DynaArray dynaArray = new DynaArray();
                int[] array = {0, 1, 2, 3, 4};
                dynaArray.add(array);

                LinkedList list = new LinkedList();
                list.add(array);
                list.add(dynaArray);

                System.out.println(list.asString());*/
       /* LinkedList list = new LinkedList();
                list.add(0);
                list.add(1);
                list.add(2);
                list.add(3);

                System.out.println(list.contains(0));
                System.out.println(list.contains(2));

                System.out.println(list.contains(100));
                System.out.println(list.contains(-3));*/

              /*  LinkedList list = new LinkedList();
                list.add(0);
                list.add(1);
                list.add(2);
                list.add(3);

                System.out.println(list.size());*/

                /*LinkedList list = new LinkedList();
                list.add(0);
                list.add(1);
                list.add(2);
                list.add(3);

                System.out.println(list.asString());

                list.remove(5);
                // [0, 1, 2, 3]
                System.out.println(list.asString());

                list.remove(0);
                // [1, 2, 3]
                System.out.println(list.asString());

                list.remove(2);
                // [1, 3]
                System.out.println(list.asString());

                list.remove(1);
                // [3]
                System.out.println(list.asString());

                list.remove(3);
                //[]
                System.out.println(list.asString());
                ///////////////////////////////////////////
                list.add(0);
                list.add(1);

                list.remove(1);
                // [0]
                System.out.println(list.asString());*/

              /*  LinkedList list = new LinkedList();
                for (int i = 1; i <= 3; i++) {
                    list.add(i);
                }
                System.out.println(list.asString());

                list.clear();
                System.out.println(list.asString());

                for (int i = 1; i <= 10; i++) {
                    list.add(i);
                }
                System.out.println(list.asString());
            }
        }*/

      /* LinkedList list = new LinkedList();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }

        System.out.println(Arrays.toString(list.toArray()));
*/
      /*  LinkedList list = new LinkedList();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
        System.out.println(list.asString());
        System.out.println(Arrays.toString(list.toArray()));*/

            }
        }

