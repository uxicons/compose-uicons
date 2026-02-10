package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Ts.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13f)
                curveToRelative(0f, -5.9f, -4.67f, -10.71f, -10.5f, -10.97f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.02f)
                curveTo(5.67f, 2.29f, 1f, 7.1f, 1f, 13f)
                curveToRelative(0f, 3.05f, 1.25f, 5.82f, 3.27f, 7.81f)
                lineToRelative(-2.14f, 2.35f)
                lineToRelative(0.74f, 0.67f)
                lineToRelative(2.14f, -2.35f)
                curveToRelative(1.9f, 1.57f, 4.34f, 2.51f, 6.99f, 2.51f)
                reflectiveCurveToRelative(5.09f, -0.94f, 6.99f, -2.51f)
                lineToRelative(2.14f, 2.35f)
                lineToRelative(0.74f, -0.67f)
                lineToRelative(-2.14f, -2.35f)
                curveToRelative(2.02f, -2.0f, 3.27f, -4.76f, 3.27f, -7.81f)
                close()
                moveTo(2f, 13f)
                curveTo(2f, 7.49f, 6.49f, 3f, 12f, 3f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 18.51f, 2f, 13f)
                close()
                moveTo(18.8f, 1.33f)
                lineToRelative(0.5f, -0.86f)
                curveToRelative(1.65f, 0.96f, 3.07f, 2.22f, 4.23f, 3.73f)
                lineToRelative(-0.8f, 0.61f)
                curveToRelative(-1.08f, -1.41f, -2.4f, -2.58f, -3.94f, -3.48f)
                close()
                moveTo(1.25f, 4.83f)
                lineToRelative(-0.8f, -0.6f)
                curveTo(1.61f, 2.7f, 3.04f, 1.44f, 4.69f, 0.47f)
                lineToRelative(0.51f, 0.86f)
                curveToRelative(-1.54f, 0.9f, -2.87f, 2.08f, -3.95f, 3.5f)
                close()
                moveTo(12.5f, 11.72f)
                lineToRelative(4.76f, 2.85f)
                lineToRelative(-0.52f, 0.86f)
                lineToRelative(-5.24f, -3.15f)
                verticalLineToRelative(-7.28f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.72f)
                close()
            }
        }.also { _AlarmClock = it}
