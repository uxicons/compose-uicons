package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Ss.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16f)
                lineTo(1f, 16f)
                verticalLineToRelative(-2f)
                lineTo(23f, 14f)
                verticalLineToRelative(2f)
                close()
                moveTo(23f, 20f)
                verticalLineToRelative(-2f)
                lineTo(1f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
                moveTo(23f, 12f)
                lineTo(1f, 12f)
                verticalLineToRelative(-1f)
                curveTo(1f, 4.93f, 5.93f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10.98f, 4.83f, 11f, 11f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _BurgerAlt = it}
