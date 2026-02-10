package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertShapes: ImageVector? = null

val Icons.Ts.ConvertShapes: ImageVector
    get() = _ConvertShapes ?: UXIcon(name = "ConvertShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 24f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-10f)
                lineTo(0f, 14f)
                verticalLineToRelative(10f)
                close()
                moveTo(1f, 15f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                lineTo(1f, 23f)
                verticalLineToRelative(-8f)
                close()
                moveTo(24f, 5.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(14f, 5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                close()
                moveTo(7.21f, 1f)
                lineTo(2f, 1f)
                lineTo(2f, 0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                lineTo(8f, 1.76f)
                curveTo(3.79f, 3.39f, 1f, 7.42f, 1f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 7.17f, 2.85f, 2.89f, 7.21f, 1f)
                close()
                moveTo(16.79f, 23f)
                horizontalLineToRelative(5.21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.24f)
                curveToRelative(4.21f, -1.64f, 7f, -5.67f, 7f, -10.24f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 4.83f, -2.85f, 9.11f, -7.21f, 11f)
                close()
            }
        }.also { _ConvertShapes = it}
