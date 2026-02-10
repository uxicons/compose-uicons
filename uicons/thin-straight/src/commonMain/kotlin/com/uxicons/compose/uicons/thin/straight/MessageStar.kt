package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageStar: ImageVector? = null

val Icons.Ts.MessageStar: ImageVector
    get() = _MessageStar ?: UXIcon(name = "MessageStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 23f)
                lineTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                verticalLineToRelative(11f)
                close()
                moveTo(13.94f, 9.99f)
                lineToRelative(-1.52f, -4.33f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(-1.52f, 4.34f)
                lineTo(5.72f, 10.0f)
                verticalLineToRelative(0.83f)
                lineToRelative(3.13f, 2.52f)
                lineToRelative(-1.17f, 3.9f)
                lineToRelative(0.67f, 0.51f)
                lineToRelative(3.66f, -2.37f)
                lineToRelative(3.65f, 2.37f)
                lineToRelative(0.67f, -0.51f)
                lineToRelative(-1.17f, -3.91f)
                lineToRelative(3.13f, -2.42f)
                lineToRelative(-0.01f, -0.92f)
                horizontalLineToRelative(-4.34f)
                close()
                moveTo(14.0f, 12.98f)
                lineToRelative(0.93f, 3.12f)
                lineToRelative(-2.93f, -1.9f)
                lineToRelative(-2.94f, 1.9f)
                lineToRelative(0.93f, -3.11f)
                lineToRelative(-2.47f, -1.99f)
                horizontalLineToRelative(3.24f)
                lineToRelative(1.24f, -3.53f)
                lineToRelative(1.23f, 3.52f)
                horizontalLineToRelative(3.24f)
                lineToRelative(-2.47f, 1.99f)
                close()
            }
        }.also { _MessageStar = it}
