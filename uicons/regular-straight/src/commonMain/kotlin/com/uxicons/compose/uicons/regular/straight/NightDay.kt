package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightDay: ImageVector? = null

val Icons.Rs.NightDay: ImageVector
    get() = _NightDay ?: UXIcon(name = "NightDay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 1.46f)
                lineTo(1.46f, 23.96f)
                lineTo(0.04f, 22.54f)
                lineTo(22.54f, 0.04f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(23.76f, 10.45f)
                curveToRelative(-1.01f, -1.05f, -2.31f, -1.82f, -3.77f, -2.19f)
                lineToRelative(-1.76f, 1.76f)
                curveToRelative(0.6f, 0.02f, 1.19f, 0.12f, 1.75f, 0.31f)
                curveToRelative(-1.54f, 1.43f, -2.47f, 3.47f, -2.47f, 5.67f)
                reflectiveCurveToRelative(0.94f, 4.24f, 2.47f, 5.67f)
                curveToRelative(-0.63f, 0.22f, -1.29f, 0.33f, -1.97f, 0.33f)
                curveToRelative(-3.23f, 0f, -5.87f, -2.57f, -5.99f, -5.77f)
                lineToRelative(-1.75f, 1.75f)
                curveToRelative(0.88f, 3.46f, 4.01f, 6.02f, 7.74f, 6.02f)
                curveToRelative(2.26f, 0f, 4.3f, -0.94f, 5.76f, -2.45f)
                curveToRelative(-2.45f, -0.66f, -4.26f, -2.89f, -4.26f, -5.55f)
                reflectiveCurveToRelative(1.81f, -4.89f, 4.26f, -5.55f)
                close()
                moveTo(3.98f, 12.69f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.19f, -3.19f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.8f, -0.8f, -1.24f, -1.86f, -1.24f, -3.0f)
                reflectiveCurveToRelative(0.44f, -2.19f, 1.24f, -3.0f)
                reflectiveCurveToRelative(1.86f, -1.24f, 3.0f, -1.24f)
                reflectiveCurveToRelative(2.19f, 0.44f, 3.0f, 1.24f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.19f, -3.19f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.83f, 1.83f)
                curveToRelative(-0.79f, -0.57f, -1.69f, -0.94f, -2.65f, -1.09f)
                lineTo(10.04f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(8.04f, 2.89f)
                curveToRelative(-0.96f, 0.15f, -1.86f, 0.53f, -2.64f, 1.09f)
                lineTo(3.08f, 1.67f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.32f, 2.32f)
                curveToRelative(-0.56f, 0.77f, -0.93f, 1.66f, -1.09f, 2.6f)
                lineTo(0f, 8f)
                verticalLineToRelative(2f)
                lineTo(2.88f, 10f)
                curveToRelative(0.15f, 0.97f, 0.52f, 1.89f, 1.1f, 2.69f)
                close()
            }
        }.also { _NightDay = it}
