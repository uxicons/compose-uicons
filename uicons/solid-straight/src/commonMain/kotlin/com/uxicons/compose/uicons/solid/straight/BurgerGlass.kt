package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerGlass: ImageVector? = null

val Icons.Ss.BurgerGlass: ImageVector
    get() = _BurgerGlass ?: UXIcon(name = "BurgerGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(1f)
                lineTo(8f, 17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(17f, 21f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                lineToRelative(-3f, 2f)
                close()
                moveTo(0.18f, 5f)
                lineTo(17.81f, 5f)
                lineToRelative(0.17f, -1.66f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                reflectiveCurveToRelative(-1.38f, -1f, -2.24f, -1f)
                lineTo(3f, 0f)
                curveTo(2.15f, 0.01f, 1.33f, 0.38f, 0.76f, 1.01f)
                curveTo(0.19f, 1.65f, -0.08f, 2.5f, 0.02f, 3.34f)
                lineToRelative(0.17f, 1.66f)
                close()
                moveTo(0.38f, 7f)
                lineToRelative(1.71f, 17f)
                lineTo(7.54f, 24f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(5.31f)
                lineToRelative(0.3f, -3f)
                lineTo(0.39f, 7f)
                close()
            }
        }.also { _BurgerGlass = it}
