package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manhole: ImageVector? = null

val Icons.Ss.Manhole: ImageVector
    get() = _Manhole ?: UXIcon(name = "Manhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 0.17f)
                verticalLineToRelative(0.33f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(10f, 0.17f)
                curveTo(4.33f, 1.12f, 0f, 6.06f, 0f, 12f)
                reflectiveCurveToRelative(4.33f, 10.88f, 10f, 11.83f)
                verticalLineToRelative(-0.33f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(0.33f)
                curveToRelative(5.67f, -0.95f, 10f, -5.9f, 10f, -11.83f)
                reflectiveCurveTo(19.67f, 1.12f, 14f, 0.17f)
                close()
                moveTo(8.13f, 5f)
                horizontalLineToRelative(7.74f)
                curveToRelative(0.92f, 0.51f, 1.72f, 1.19f, 2.37f, 2f)
                lineTo(5.76f, 7f)
                curveToRelative(0.65f, -0.81f, 1.45f, -1.49f, 2.37f, -2f)
                close()
                moveTo(15.87f, 19f)
                horizontalLineToRelative(-7.74f)
                curveToRelative(-0.92f, -0.51f, -1.72f, -1.19f, -2.37f, -2f)
                horizontalLineToRelative(12.48f)
                curveToRelative(-0.65f, 0.81f, -1.45f, 1.49f, -2.37f, 2f)
                close()
                moveTo(19.41f, 15f)
                lineTo(4.59f, 15f)
                curveToRelative(-0.26f, -0.63f, -0.43f, -1.3f, -0.52f, -2f)
                horizontalLineToRelative(15.86f)
                curveToRelative(-0.09f, 0.7f, -0.26f, 1.37f, -0.52f, 2f)
                close()
                moveTo(4.07f, 11f)
                curveToRelative(0.09f, -0.7f, 0.26f, -1.37f, 0.52f, -2f)
                horizontalLineToRelative(14.83f)
                curveToRelative(0.26f, 0.63f, 0.43f, 1.3f, 0.52f, 2f)
                lineTo(4.07f, 11f)
                close()
            }
        }.also { _Manhole = it}
