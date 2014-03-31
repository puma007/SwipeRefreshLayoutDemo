/*
 * Created by Storm Zhang, Mar 31, 2014.
 */

package com.storm.swiperefreshlayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;

public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener {
	private SwipeRefreshLayout swipeLayout;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
		swipeLayout.setOnRefreshListener(this);
		swipeLayout.setColorScheme(android.R.color.holo_blue_bright,
				android.R.color.holo_green_light, android.R.color.holo_orange_light,
				android.R.color.holo_red_light);
	}

	public void onRefresh() {
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				swipeLayout.setRefreshing(false);
			}
		}, 5000);
	}
}
