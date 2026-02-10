package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brightness: ImageVector? = null

val Icons.Ts.Brightness: ImageVector
    get() = _Brightness ?: UXIcon(name = "Brightness") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 0f)
                close()
                moveTo(12.5f, 19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                close()
                moveTo(5f, 11.5f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(5f, 12.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 11.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(20.84f, 3.87f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(7.4f, 17.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.54f, -3.54f)
                close()
                moveTo(7.4f, 6.69f)
                lineTo(3.87f, 3.16f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(20.84f, 20.13f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _Brightness = it}
