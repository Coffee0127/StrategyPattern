/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Bo-Xuan Fan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.bxf.test.pattern.with;

import com.bxf.test.pattern.with.service.BarWorker;
import com.bxf.test.pattern.with.service.FooWorker;
import com.bxf.test.pattern.with.service.Worker;

/**
 * BusinessServiceWithPattern
 *
 * @since 2016-10-18
 * @author Bo-Xuan Fan
 */
public class BusinessServiceWithPattern {

    public void doFoo(String data) {
        doSomethingWithCommonCheck(new FooWorker(), data);
    }


    public void doBar(String data) {
        doSomethingWithCommonCheck(new BarWorker(), data);
    }

    private void doSomethingWithCommonCheck(Worker worker, String data) {
        if (isEmpty(data)) {
            System.out.println("Your data is empty!!");
            return;
        }

        worker.work(data);
    }

    private boolean isEmpty(String data) {
        return data == null || data.length() == 0;
    }
}
