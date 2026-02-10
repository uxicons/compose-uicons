package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerGlass: ImageVector? = null

val Icons.Sr.BurgerGlass: ImageVector
    get() = _BurgerGlass ?: UXIcon(name = "BurgerGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.06f, 16.49f)
                verticalLineToRelative(0.5f)
                lineTo(9.06f, 16.99f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.49f, 2.01f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.49f, 0f, 4.5f, 2.01f, 4.5f, 4.5f)
                close()
                moveTo(18.26f, 20.82f)
                curveToRelative(-0.17f, 0.11f, -0.36f, 0.17f, -0.55f, 0.17f)
                reflectiveCurveToRelative(-0.39f, -0.06f, -0.55f, -0.17f)
                lineToRelative(-2.75f, -1.83f)
                horizontalLineToRelative(-5.34f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.49f, 2.01f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.49f, 0f, 4.5f, -2.01f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.05f)
                lineToRelative(-2.75f, 1.83f)
                close()
                moveTo(17.98f, 3.33f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                reflectiveCurveToRelative(-1.38f, -1f, -2.24f, -1f)
                lineTo(3f, -0.01f)
                curveTo(2.15f, 0.01f, 1.33f, 0.38f, 0.76f, 1.01f)
                curveTo(0.19f, 1.65f, -0.08f, 2.5f, 0.02f, 3.34f)
                lineToRelative(0.17f, 1.66f)
                lineTo(17.81f, 5f)
                lineToRelative(0.17f, -1.66f)
                close()
                moveTo(7.06f, 19.49f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(3.75f)
                lineToRelative(0.3f, -2.99f)
                lineTo(0.39f, 7f)
                lineToRelative(1.26f, 12.5f)
                curveToRelative(0.26f, 2.55f, 2.41f, 4.5f, 4.97f, 4.5f)
                horizontalLineToRelative(2.27f)
                curveToRelative(-1.13f, -1.17f, -1.83f, -2.76f, -1.83f, -4.51f)
                close()
            }
        }.also { _BurgerGlass = it}
