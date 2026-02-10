package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manhole: ImageVector? = null

val Icons.Rs.Manhole: ImageVector
    get() = _Manhole ?: UXIcon(name = "Manhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.76f, 17f)
                horizontalLineToRelative(12.48f)
                curveToRelative(-0.65f, 0.81f, -1.45f, 1.49f, -2.37f, 2f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-0.92f, -0.51f, -1.72f, -1.19f, -2.37f, -2f)
                close()
                moveTo(19.41f, 9f)
                lineTo(4.59f, 9f)
                curveToRelative(-0.26f, 0.63f, -0.43f, 1.3f, -0.52f, 2f)
                horizontalLineToRelative(15.86f)
                curveToRelative(-0.09f, -0.7f, -0.26f, -1.37f, -0.52f, -2f)
                close()
                moveTo(15.87f, 5f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-0.92f, 0.51f, -1.72f, 1.19f, -2.37f, 2f)
                horizontalLineToRelative(12.48f)
                curveToRelative(-0.65f, -0.81f, -1.45f, -1.49f, -2.37f, -2f)
                close()
                moveTo(4.59f, 15f)
                horizontalLineToRelative(14.83f)
                curveToRelative(0.26f, -0.63f, 0.43f, -1.3f, 0.52f, -2f)
                lineTo(4.07f, 13f)
                curveToRelative(0.09f, 0.7f, 0.26f, 1.37f, 0.52f, 2f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -4.83f, -3.45f, -8.88f, -8.01f, -9.8f)
                curveToRelative(-0.1f, 1.01f, -0.95f, 1.8f, -1.99f, 1.8f)
                reflectiveCurveToRelative(-1.89f, -0.79f, -1.99f, -1.8f)
                curveTo(5.45f, 3.12f, 2f, 7.17f, 2f, 12f)
                reflectiveCurveToRelative(3.45f, 8.88f, 8.01f, 9.8f)
                curveToRelative(0.1f, -1.01f, 0.95f, -1.8f, 1.99f, -1.8f)
                reflectiveCurveToRelative(1.89f, 0.79f, 1.99f, 1.8f)
                curveToRelative(4.56f, -0.93f, 8.01f, -4.97f, 8.01f, -9.8f)
                close()
            }
        }.also { _Manhole = it}
