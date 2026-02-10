package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Bs.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(-6.8f)
                verticalLineToRelative(0.02f)
                curveToRelative(-1.53f, 0.11f, -2.91f, 0.99f, -3.64f, 2.36f)
                lineTo(0f, 22f)
                lineTo(3.4f, 22f)
                lineToRelative(3.31f, -8f)
                horizontalLineToRelative(1.0f)
                lineToRelative(3.31f, 8f)
                horizontalLineToRelative(3.4f)
                lineToRelative(-3.44f, -8f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _YogaMoon = it}
