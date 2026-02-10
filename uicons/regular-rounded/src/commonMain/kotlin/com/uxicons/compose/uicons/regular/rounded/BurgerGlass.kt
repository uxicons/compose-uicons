package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerGlass: ImageVector? = null

val Icons.Rr.BurgerGlass: ImageVector
    get() = _BurgerGlass ?: UXIcon(name = "BurgerGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.17f, 12f)
                horizontalLineToRelative(-2.23f)
                lineToRelative(0.87f, -8.66f)
                curveToRelative(0.1f, -0.85f, -0.17f, -1.7f, -0.74f, -2.34f)
                curveToRelative(-0.57f, -0.64f, -1.38f, -1f, -2.24f, -1f)
                lineTo(2.83f, 0f)
                curveTo(1.97f, 0.01f, 1.16f, 0.38f, 0.59f, 1.01f)
                curveTo(0.02f, 1.65f, -0.25f, 2.5f, -0.15f, 3.34f)
                lineTo(1.47f, 19.5f)
                curveToRelative(0.26f, 2.56f, 2.4f, 4.5f, 4.98f, 4.5f)
                horizontalLineToRelative(12.73f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22.17f, 17f)
                lineTo(10.17f, 17f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2.08f, 2.35f)
                curveToRelative(0.19f, -0.22f, 0.46f, -0.33f, 0.75f, -0.33f)
                lineTo(14.83f, 2.02f)
                curveToRelative(0.29f, -0.01f, 0.55f, 0.11f, 0.75f, 0.32f)
                curveToRelative(0.19f, 0.22f, 0.28f, 0.49f, 0.25f, 0.79f)
                lineToRelative(-0.29f, 2.87f)
                lineTo(2.12f, 6f)
                lineToRelative(-0.29f, -2.88f)
                curveToRelative(-0.03f, -0.29f, 0.06f, -0.56f, 0.25f, -0.78f)
                close()
                moveTo(3.46f, 19.3f)
                lineToRelative(-1.14f, -11.3f)
                lineTo(15.33f, 8f)
                lineToRelative(-0.4f, 4f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-1.55f, 0f, -2.83f, -1.16f, -2.99f, -2.7f)
                close()
                moveTo(19.17f, 22f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(3.7f)
                lineToRelative(2.75f, 1.83f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.17f, 0.55f, 0.17f)
                reflectiveCurveToRelative(0.39f, -0.06f, 0.55f, -0.17f)
                lineToRelative(2.75f, -1.83f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BurgerGlass = it}
