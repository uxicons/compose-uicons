package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmSnooze: ImageVector? = null

val Icons.Ts.AlarmSnooze: ImageVector
    get() = _AlarmSnooze ?: UXIcon(name = "AlarmSnooze") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1.23f)
                lineToRelative(-6.73f, 5.77f)
                horizontalLineToRelative(6.73f)
                verticalLineToRelative(1f)
                lineTo(8f, 17f)
                verticalLineToRelative(-1.23f)
                lineToRelative(6.73f, -5.77f)
                horizontalLineToRelative(-6.73f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19.74f, 20.81f)
                lineToRelative(2.14f, 2.35f)
                lineToRelative(-0.74f, 0.67f)
                lineToRelative(-2.14f, -2.35f)
                curveToRelative(-1.9f, 1.57f, -4.34f, 2.51f, -6.99f, 2.51f)
                reflectiveCurveToRelative(-5.09f, -0.94f, -6.99f, -2.51f)
                lineToRelative(-2.14f, 2.35f)
                lineToRelative(-0.74f, -0.67f)
                lineToRelative(2.14f, -2.35f)
                curveToRelative(-2.02f, -2.0f, -3.27f, -4.76f, -3.27f, -7.81f)
                curveTo(1.01f, 7.1f, 5.68f, 2.29f, 11.51f, 2.02f)
                lineTo(11.51f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12.51f, 2.02f)
                curveToRelative(5.83f, 0.26f, 10.5f, 5.08f, 10.5f, 10.97f)
                curveToRelative(0f, 3.05f, -1.25f, 5.82f, -3.27f, 7.81f)
                close()
                moveTo(12.01f, 23f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.52f, 3f, 12.01f, 3f)
                reflectiveCurveTo(2.01f, 7.49f, 2.01f, 13f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                close()
                moveTo(22.74f, 4.81f)
                lineToRelative(0.8f, -0.61f)
                curveToRelative(-1.16f, -1.52f, -2.58f, -2.77f, -4.23f, -3.73f)
                lineToRelative(-0.5f, 0.86f)
                curveToRelative(1.53f, 0.9f, 2.86f, 2.07f, 3.94f, 3.48f)
                close()
                moveTo(5.21f, 1.34f)
                lineToRelative(-0.51f, -0.86f)
                curveTo(3.05f, 1.44f, 1.62f, 2.7f, 0.46f, 4.23f)
                lineToRelative(0.8f, 0.6f)
                curveToRelative(1.08f, -1.42f, 2.41f, -2.6f, 3.95f, -3.5f)
                close()
            }
        }.also { _AlarmSnooze = it}
