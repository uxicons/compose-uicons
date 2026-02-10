package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerGlass: ImageVector? = null

val Icons.Rs.BurgerGlass: ImageVector
    get() = _BurgerGlass ?: UXIcon(name = "BurgerGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                horizontalLineToRelative(-2.89f)
                lineToRelative(0.87f, -8.66f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                reflectiveCurveToRelative(-1.38f, -1f, -2.24f, -1f)
                lineTo(3f, 0f)
                curveTo(2.15f, 0.01f, 1.33f, 0.38f, 0.76f, 1.01f)
                curveTo(0.19f, 1.65f, -0.08f, 2.5f, 0.02f, 3.34f)
                lineTo(2.1f, 24f)
                lineTo(20f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 16f)
                verticalLineToRelative(1f)
                lineTo(10f, 17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(2.25f, 2.35f)
                curveToRelative(0.19f, -0.22f, 0.46f, -0.33f, 0.75f, -0.33f)
                lineTo(15f, 2.02f)
                curveToRelative(0.29f, -0.01f, 0.55f, 0.11f, 0.75f, 0.32f)
                curveToRelative(0.19f, 0.21f, 0.28f, 0.49f, 0.25f, 0.79f)
                lineToRelative(-0.29f, 2.87f)
                lineTo(2.3f, 6f)
                lineToRelative(-0.29f, -2.88f)
                curveToRelative(-0.03f, -0.29f, 0.06f, -0.56f, 0.25f, -0.78f)
                close()
                moveTo(2.49f, 8f)
                lineTo(15.5f, 8f)
                lineToRelative(-0.4f, 4f)
                horizontalLineToRelative(-3.1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.74f, 0.21f, 1.42f, 0.56f, 2.01f)
                lineTo(3.9f, 22.01f)
                reflectiveCurveToRelative(-1.41f, -14.01f, -1.41f, -14.01f)
                close()
                moveTo(19.99f, 22f)
                lineTo(12f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                lineToRelative(3f, 2f)
                lineToRelative(3f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _BurgerGlass = it}
