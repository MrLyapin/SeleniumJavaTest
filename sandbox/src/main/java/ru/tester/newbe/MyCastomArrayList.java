package ru.tester.newbe;

public class MyCastomArrayList<T> {
   private Object[] data = new Object[0];
   private int lenght = 0;


      public void add(T element) {
         if(lenght == data.length){
            Object[] newData = new Object[data.length * 2 + 1]; // <---------
            for (int i = 0; i < data.length; i++) {
               newData[i] = data[i];
            }
            data = newData;
         }
         data[lenght] = element;
         lenght++;
      }


      public void del(int index) {
         //System.out.println("Index: " + index);
         if(index < 0 || index >= lenght) {
            System.out.println("Error, 1");
         }
         else{
            //System.out.println("Entered !");
            Object[] newData = new Object[lenght - 1];

            if(index > 0) {
                  for (int i = 0; i < index; i++) {
                     //System.out.println("FOR_1");
                     //System.out.println("index: " + i + " newData:" + newData[i] + " = Data:" + data[i]);
                     newData[i] = data[i];
                  }
               }


            if(index < lenght - 1) {
               //System.out.println("end");
               for (int i = index; i <= lenght - 2; i++) {
                  //System.out.println("FOR_2");
                  //System.out.println("index: " + i + " newData:" + newData[i] + " = Data:" + data[i + 1]);
                  newData[i] = data[i + 1];
               }
            }

            data = newData;
            lenght--;

         }
      }


      public T get(int index) {
         if(index >= lenght || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
         }
         return (T) data[index];
      }

      public int getLength() {
         return lenght;
      }

      public void clear() {
         data = new Object[0];
         lenght = 0;
      }
}
