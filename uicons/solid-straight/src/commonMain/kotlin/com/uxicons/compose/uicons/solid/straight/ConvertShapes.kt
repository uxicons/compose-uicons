package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertShapes: ImageVector? = null

val Icons.Ss.ConvertShapes: ImageVector
    get() = _ConvertShapes ?: UXIcon(name = "ConvertShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 24f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-10f)
                lineTo(0f, 14f)
                verticalLineToRelative(10f)
                close()
                moveTo(24f, 5.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(5.36f, 2f)
                horizontalLineToRelative(-3.36f)
                lineTo(2f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.67f)
                curveToRelative(-3.08f, 1.76f, -5f, 5.03f, -5f, 8.66f)
                lineTo(0f, 12f)
                curveTo(0f, 7.89f, 2.04f, 4.19f, 5.36f, 2f)
                close()
                moveTo(18.64f, 22f)
                horizontalLineToRelative(3.36f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.67f)
                curveToRelative(3.08f, -1.76f, 5f, -5.03f, 5f, -8.67f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 4.11f, -2.04f, 7.81f, -5.36f, 10f)
                close()
            }
        }.also { _ConvertShapes = it}
