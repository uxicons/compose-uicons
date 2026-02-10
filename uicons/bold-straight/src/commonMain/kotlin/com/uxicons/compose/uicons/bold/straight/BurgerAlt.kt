package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Bs.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(1f, 12f)
                verticalLineToRelative(-1.5f)
                curveTo(1f, 4.51f, 5.73f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10.99f, 4.51f, 11f, 10.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(4.15f, 9f)
                horizontalLineToRelative(15.71f)
                curveToRelative(-0.69f, -3.55f, -3.78f, -6f, -7.86f, -6f)
                reflectiveCurveToRelative(-7.15f, 2.49f, -7.85f, 6f)
                close()
                moveTo(23f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(3f)
                lineTo(23f, 17f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18.5f, 24f)
                lineTo(5.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(23f, 19f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _BurgerAlt = it}
