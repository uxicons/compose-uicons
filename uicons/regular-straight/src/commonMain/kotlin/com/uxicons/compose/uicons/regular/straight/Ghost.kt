package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Rs.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-14f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 5.59f, 4f, 10f)
                verticalLineToRelative(10.54f)
                curveToRelative(0.59f, -0.34f, 1.27f, -0.54f, 2f, -0.54f)
                curveToRelative(1.19f, 0f, 2.27f, 0.53f, 3f, 1.36f)
                curveToRelative(0.73f, -0.83f, 1.81f, -1.36f, 3f, -1.36f)
                reflectiveCurveToRelative(2.27f, 0.53f, 3f, 1.36f)
                curveToRelative(0.73f, -0.83f, 1.81f, -1.36f, 3f, -1.36f)
                curveToRelative(0.73f, 0f, 1.41f, 0.2f, 2f, 0.54f)
                verticalLineToRelative(-10.54f)
                close()
            }
        }.also { _Ghost = it}
