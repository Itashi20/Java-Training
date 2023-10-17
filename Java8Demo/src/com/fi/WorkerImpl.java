package com.fi;

public class WorkerImpl {
public static void execute(Worker worker) {
	worker.doWork();
}

public static void main(String[] args) {
	
//	execute(new Worker(){
//		@Override
//		public void doWork() {
//			System.out.println("called");
//		}
//});
	
	//lambda
	
	execute(()->System.out.println("welcome lambda function"));
}}

