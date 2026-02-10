package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swatchbook: ImageVector? = null

val Icons.Ss.Swatchbook: ImageVector
    get() = _Swatchbook ?: UXIcon(name = "Swatchbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                lineTo(0f, 12f)
                close()
                moveTo(10f, 5f)
                lineTo(10f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(5f)
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
                lineTo(10f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(5f)
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
                moveTo(12f, 19f)
                curveToRelative(0f, 0.02f, 0f, 0.05f, 0f, 0.07f)
                lineToRelative(9.97f, -9.97f)
                lineToRelative(-7.07f, -7.07f)
                lineToRelative(-2.9f, 2.9f)
                verticalLineToRelative(14.07f)
                close()
                moveTo(9.9f, 24f)
                horizontalLineToRelative(14.1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(-10.0f, 10f)
                close()
            }
        }.also { _Swatchbook = it}
