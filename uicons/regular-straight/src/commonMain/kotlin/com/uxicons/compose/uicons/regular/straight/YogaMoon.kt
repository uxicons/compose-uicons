package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Rs.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(16f, 1f)
                horizontalLineToRelative(2f)
                lineTo(18f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 14f)
                horizontalLineToRelative(-5.4f)
                lineToRelative(3.4f, 8f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-3.28f, -8f)
                horizontalLineToRelative(-2.47f)
                lineToRelative(-3.62f, 8f)
                lineTo(0f, 22f)
                lineTo(5.5f, 10.12f)
                curveToRelative(0.7f, -1.31f, 2.05f, -2.12f, 3.53f, -2.12f)
                horizontalLineToRelative(6.97f)
                lineTo(16f, 1f)
                close()
                moveTo(16f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-0.74f, 0f, -1.42f, 0.41f, -1.79f, 1.12f)
                lineToRelative(-0.4f, 0.88f)
                horizontalLineToRelative(9.16f)
                close()
            }
        }.also { _YogaMoon = it}
