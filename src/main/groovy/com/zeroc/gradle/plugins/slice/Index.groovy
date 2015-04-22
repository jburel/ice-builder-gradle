// **********************************************************************
//
// Copyright (c) 2014-2015 ZeroC, Inc. All rights reserved.
//
// **********************************************************************

package com.zeroc.gradle.plugins.slice;

class Index {
	def name
	def javaType
    def type
    def member
    def caseSensitive = true

    Index(String n) {
        name = n
    }
}
