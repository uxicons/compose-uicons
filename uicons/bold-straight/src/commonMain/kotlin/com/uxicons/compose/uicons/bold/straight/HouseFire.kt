package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFire: ImageVector? = null

val Icons.Bs.HouseFire: ImageVector
    get() = _HouseFire ?: UXIcon(name = "HouseFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.16f)
                verticalLineToRelative(2.83f)
                curveToRelative(-0.94f, -1.16f, -2.2f, -2.36f, -3.19f, -3.22f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(12.31f, 3.12f, 12.31f, 3.12f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.61f, 0f)
                lineTo(3.19f, 9.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(10.82f)
                horizontalLineToRelative(7.58f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.18f, 2.13f, 3f)
                lineTo(0f, 23.99f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.76f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(8.5f, 6.65f)
                horizontalLineToRelative(0f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.67f, 1.34f, 2.76f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                close()
                moveTo(19.41f, 18.59f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _HouseFire = it}
