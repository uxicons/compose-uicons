package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shuffle: ImageVector? = null

val Icons.Ss.Shuffle: ImageVector
    get() = _Shuffle ?: UXIcon(name = "Shuffle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(429.27f, 283.58f)
                lineToRelative(-30.17f, 30.17f)
                lineTo(448f, 362.67f)
                horizontalLineToRelative(-8.15f)
                curveToRelative(-72.19f, 0f, -118.1f, -32.68f, -158.85f, -74.84f)
                lineToRelative(-6.4f, 7.42f)
                curveToRelative(-7f, 8.11f, -14.21f, 16.45f, -21.72f, 24.83f)
                curveToRelative(46.93f, 54.35f, 115.24f, 85.51f, 187.05f, 85.33f)
                horizontalLineTo(448f)
                lineToRelative(-48.92f, 48.92f)
                lineToRelative(30.17f, 30.17f)
                lineToRelative(70.25f, -70.25f)
                curveToRelative(16.66f, -16.66f, 16.66f, -43.67f, 0f, -60.33f)
                lineTo(429.27f, 283.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(439.87f, 149.33f)
                horizontalLineTo(448f)
                lineToRelative(-48.9f, 48.92f)
                lineToRelative(30.17f, 30.17f)
                lineToRelative(70.25f, -70.25f)
                curveToRelative(16.66f, -16.66f, 16.66f, -43.67f, 0f, -60.33f)
                lineToRelative(-70.25f, -70.25f)
                lineToRelative(-30.17f, 30.17f)
                lineTo(448f, 106.67f)
                horizontalLineToRelative(-8.15f)
                curveToRelative(-105.75f, 0f, -163.56f, 56.96f, -216.02f, 116.86f)
                curveTo(172.01f, 165.01f, 109.72f, 106.67f, -0.85f, 106.67f)
                verticalLineToRelative(42.67f)
                curveToRelative(95.23f, 0f, 146.62f, 49.83f, 196.46f, 106.67f)
                curveTo(145.77f, 312.83f, 94.38f, 362.67f, -0.85f, 362.67f)
                verticalLineToRelative(42.67f)
                curveToRelative(123.9f, 0f, 187.22f, -73.3f, 243.2f, -137.94f)
                curveTo(294.7f, 206.68f, 344.26f, 149.33f, 439.87f, 149.33f)
                close()
            }
        }.also { _Shuffle = it}
