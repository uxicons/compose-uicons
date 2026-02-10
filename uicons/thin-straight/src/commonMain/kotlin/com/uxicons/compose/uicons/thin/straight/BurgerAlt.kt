package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Ts.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                lineTo(1f, 13f)
                verticalLineToRelative(-2f)
                curveTo(1f, 4.93f, 5.93f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10.99f, 4.83f, 11f, 11f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 12f)
                lineTo(22f, 12f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.01f, -5.61f, -4.41f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 5.49f, 2f, 11f)
                verticalLineToRelative(1f)
                close()
                moveTo(23f, 15f)
                lineTo(1f, 15f)
                verticalLineToRelative(1f)
                lineTo(23f, 16f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18.5f, 24f)
                lineTo(5.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                lineTo(23f, 18f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                lineTo(2f, 19f)
                close()
            }
        }.also { _BurgerAlt = it}
