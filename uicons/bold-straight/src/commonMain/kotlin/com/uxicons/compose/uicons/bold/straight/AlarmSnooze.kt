package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmSnooze: ImageVector? = null

val Icons.Bs.AlarmSnooze: ImageVector
    get() = _AlarmSnooze ?: UXIcon(name = "AlarmSnooze") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.66f)
                lineToRelative(-1.84f, 2.34f)
                horizontalLineToRelative(1.84f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2.57f)
                lineToRelative(1.91f, -2.43f)
                horizontalLineToRelative(-1.91f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19.69f, 19.4f)
                lineToRelative(2.42f, 2.58f)
                lineToRelative(-2.19f, 2.05f)
                lineToRelative(-2.48f, -2.64f)
                curveToRelative(-1.56f, 1.02f, -3.43f, 1.61f, -5.43f, 1.61f)
                reflectiveCurveToRelative(-3.86f, -0.6f, -5.43f, -1.61f)
                lineToRelative(-2.48f, 2.64f)
                lineToRelative(-2.19f, -2.05f)
                lineToRelative(2.42f, -2.58f)
                curveToRelative(-1.45f, -1.74f, -2.32f, -3.97f, -2.32f, -6.4f)
                curveTo(2.02f, 8.0f, 5.71f, 3.85f, 10.52f, 3.12f)
                lineTo(10.52f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.52f, 3.12f)
                curveToRelative(4.8f, 0.73f, 8.5f, 4.87f, 8.5f, 9.88f)
                curveToRelative(0f, 2.43f, -0.88f, 4.66f, -2.32f, 6.4f)
                close()
                moveTo(12.02f, 20f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                close()
                moveTo(6.07f, 2.59f)
                lineTo(4.47f, 0.06f)
                curveTo(2.74f, 1.07f, 1.24f, 2.42f, 0.03f, 4.01f)
                lineToRelative(2.49f, 1.66f)
                curveToRelative(0.96f, -1.25f, 2.17f, -2.3f, 3.54f, -3.09f)
                close()
                moveTo(21.51f, 5.67f)
                lineToRelative(2.49f, -1.66f)
                curveToRelative(-1.2f, -1.59f, -2.71f, -2.94f, -4.44f, -3.96f)
                lineToRelative(-1.6f, 2.53f)
                curveToRelative(1.38f, 0.79f, 2.58f, 1.84f, 3.54f, 3.09f)
                close()
            }
        }.also { _AlarmSnooze = it}
