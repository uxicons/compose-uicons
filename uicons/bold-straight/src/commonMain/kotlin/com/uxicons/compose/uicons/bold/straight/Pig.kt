package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pig: ImageVector? = null

val Icons.Bs.Pig: ImageVector
    get() = _Pig ?: UXIcon(name = "Pig") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.92f, 9f)
                curveToRelative(-0.88f, -2.17f, -2.68f, -3.86f, -4.92f, -4.6f)
                lineTo(17f, 1f)
                curveToRelative(-1.87f, -0.11f, -3.43f, 1.25f, -3.88f, 3f)
                horizontalLineToRelative(-5.12f)
                curveToRelative(-1.8f, 0f, -3.47f, 0.6f, -4.81f, 1.61f)
                curveToRelative(-0.13f, -0.46f, -0.19f, -0.99f, -0.19f, -1.61f)
                lineTo(0f, 4f)
                curveToRelative(0f, 1.64f, 0.35f, 3.0f, 1.03f, 4.07f)
                curveTo(0.38f, 9.23f, 0f, 10.57f, 0f, 12f)
                curveTo(0f, 14.96f, 1.61f, 17.54f, 4f, 18.93f)
                verticalLineToRelative(3.07f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.81f)
                curveToRelative(1.77f, -0.86f, 3.17f, -2.36f, 3.92f, -4.19f)
                horizontalLineToRelative(2.08f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2.08f)
                close()
                moveTo(14.5f, 17f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Pig = it}
