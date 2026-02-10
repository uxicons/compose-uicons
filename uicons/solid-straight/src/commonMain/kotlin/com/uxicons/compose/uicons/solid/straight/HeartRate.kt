package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Ss.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.49f, 23.52f)
                lineTo(11.94f, 7.44f)
                lineToRelative(-4.36f, 13.46f)
                lineToRelative(-3.25f, -7.9f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.67f)
                lineToRelative(1.69f, 4.1f)
                lineTo(12.06f, 0.56f)
                lineToRelative(4.51f, 15.92f)
                lineToRelative(1.69f, -5.47f)
                horizontalLineToRelative(5.74f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(-3.24f, 10.53f)
                close()
            }
        }.also { _HeartRate = it}
