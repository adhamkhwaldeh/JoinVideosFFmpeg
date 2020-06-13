/*
 * Copyright 2014-2016 Media for Mobile
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jawad.sons.joinVideos;

public class FPSCounter
{
	private long mTimeNow;
	private long mTimePrev;
	private long mTimeElapsed;
	
	private int mFrames;
	
	private int mFPS;

    private int mEveryXFrames;
	
	public FPSCounter(int xFrames)
	{
		mFrames = 0;
        mEveryXFrames = xFrames;
	}
	
	public boolean update()
	{		
		mFrames = (mFrames + 1) % mEveryXFrames;
		
		if(mFrames == 0)
		{
			mTimeNow = System.currentTimeMillis();
			mTimeElapsed = (mTimeNow - mTimePrev) / mEveryXFrames;
			mTimePrev = mTimeNow;

			mFPS = (int)(1000.0f / (float)mTimeElapsed);

            return true;
		}
		
		return false;
	}

    public int fps()
    {
        return mFPS;
    }
}