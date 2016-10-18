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
package com.bxf.test.pattern.without;

/**
 * BusinessServiceWithoutPattern
 *
 * @since 2016-10-18
 * @author Bo-Xuan Fan
 */
public class BusinessServiceWithoutPattern {

    public void doFoo(String data) {
        if (isEmpty(data)) {
            System.out.println("Your data is empty!!");
            return;
        }

        System.out.println("do foo with " + data);
    }


    public void doBar(String data) {
        if (isEmpty(data)) {
            System.out.println("Your data is empty!!");
            return;
        }

        System.out.println("do bar with " + data);
    }

    private boolean isEmpty(String data) {
        return data == null || data.length() == 0;
    }
}
