package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimerClockCall: ImageVector? = null

val Icons.Ts.TimerClockCall: ImageVector
    get() = _TimerClockCall ?: UXIcon(name = "TimerClockCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.15f, 17.21f)
                curveToRelative(-3.4f, -1.38f, -5.87f, -3.86f, -7.36f, -7.37f)
                lineToRelative(3.37f, -3.37f)
                lineTo(4.48f, 0.79f)
                lineTo(1.6f, 3.67f)
                curveToRelative(-1.03f, 1.03f, -1.6f, 2.43f, -1.6f, 3.94f)
                curveToRelative(0f, 7.2f, 9.19f, 16.39f, 16.39f, 16.39f)
                curveToRelative(1.51f, 0f, 2.91f, -0.57f, 3.94f, -1.6f)
                lineToRelative(2.88f, -2.88f)
                lineToRelative(-5.68f, -5.68f)
                lineToRelative(-3.38f, 3.38f)
                close()
                moveTo(19.62f, 21.69f)
                curveToRelative(-0.84f, 0.84f, -1.99f, 1.31f, -3.23f, 1.31f)
                curveTo(9.77f, 23f, 1f, 14.23f, 1f, 7.61f)
                curveToRelative(0f, -1.24f, 0.47f, -2.39f, 1.31f, -3.23f)
                lineToRelative(2.17f, -2.17f)
                lineToRelative(4.27f, 4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(0.12f, 0.31f)
                curveToRelative(1.62f, 4.05f, 4.44f, 6.86f, 8.36f, 8.35f)
                lineToRelative(0.3f, 0.12f)
                lineToRelative(3.13f, -3.13f)
                lineToRelative(4.27f, 4.26f)
                lineToRelative(-2.17f, 2.17f)
                close()
                moveTo(18.5f, 11f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(21.53f, 0f, 18.5f, 0f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(18.5f, 1f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(19.8f, 7.51f)
                lineToRelative(-1.8f, -1.8f)
                verticalLineToRelative(-2.71f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.29f)
                lineToRelative(1.51f, 1.51f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _TimerClockCall = it}
