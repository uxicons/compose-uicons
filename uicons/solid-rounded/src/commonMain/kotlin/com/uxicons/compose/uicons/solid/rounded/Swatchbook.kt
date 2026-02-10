package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swatchbook: ImageVector? = null

val Icons.Sr.Swatchbook: ImageVector
    get() = _Swatchbook ?: UXIcon(name = "Swatchbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                lineTo(0f, 12f)
                close()
                moveTo(10f, 5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveTo(0f, 21.76f, 0f, 19f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(6.5f, 19f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(10f, 5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveTo(0f, 21.76f, 0f, 19f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(6.5f, 19f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 19.07f)
                lineToRelative(7.94f, -7.94f)
                curveToRelative(1.37f, -1.37f, 1.37f, -3.58f, 0f, -4.95f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-1.37f, -1.37f, -3.58f, -1.37f, -4.95f, 0f)
                lineToRelative(-0.87f, 0.87f)
                reflectiveCurveToRelative(0f, 14.12f, 0f, 14.14f)
                close()
                moveTo(9.9f, 24f)
                horizontalLineToRelative(10.6f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-10.0f, 10f)
                close()
            }
        }.also { _Swatchbook = it}
