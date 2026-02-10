package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Rs.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.49f, 23.52f)
                lineToRelative(-4.56f, -16.08f)
                lineToRelative(-4.36f, 13.46f)
                lineToRelative(-3.25f, -7.9f)
                lineToRelative(-4.33f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(5.67f, 0f)
                lineToRelative(1.68f, 4.1f)
                lineToRelative(4.71f, -14.54f)
                lineToRelative(4.51f, 15.92f)
                lineToRelative(1.69f, -5.47f)
                lineToRelative(5.74f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(-4.26f, 0f)
                lineToRelative(-3.24f, 10.53f)
                close()
            }
        }.also { _HeartRate = it}
