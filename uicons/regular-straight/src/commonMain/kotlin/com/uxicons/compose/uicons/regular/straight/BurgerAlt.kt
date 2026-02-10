package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Rs.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                curveTo(22.98f, 4.83f, 18.15f, 0f, 12f, 0f)
                reflectiveCurveTo(1f, 4.93f, 1f, 11f)
                verticalLineToRelative(1f)
                lineTo(23f, 12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3.05f, 10f)
                curveTo(3.55f, 5.51f, 7.38f, 2f, 12f, 2f)
                reflectiveCurveToRelative(8.45f, 3.44f, 8.94f, 8f)
                lineTo(3.06f, 10f)
                close()
                moveTo(1f, 14f)
                lineTo(23f, 14f)
                verticalLineToRelative(2f)
                lineTo(1f, 16f)
                verticalLineToRelative(-2f)
                close()
                moveTo(1f, 20f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                lineTo(1f, 18f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(5f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(21f, 20f)
                close()
            }
        }.also { _BurgerAlt = it}
