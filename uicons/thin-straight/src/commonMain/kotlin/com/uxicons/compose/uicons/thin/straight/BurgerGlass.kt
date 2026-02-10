package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerGlass: ImageVector? = null

val Icons.Ts.BurgerGlass: ImageVector
    get() = _BurgerGlass ?: UXIcon(name = "BurgerGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13f)
                horizontalLineToRelative(-3.99f)
                lineToRelative(0.98f, -10.23f)
                curveToRelative(0.08f, -0.71f, -0.15f, -1.41f, -0.62f, -1.94f)
                reflectiveCurveTo(15.21f, 0f, 14.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.79f, 0f, 1.11f, 0.3f, 0.64f, 0.83f)
                reflectiveCurveTo(-0.06f, 2.07f, 0.01f, 2.77f)
                lineTo(2.05f, 24f)
                lineTo(20f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(23f, 17f)
                verticalLineToRelative(1f)
                lineTo(10f, 18f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19.44f, 19f)
                lineToRelative(-1.94f, 1.38f)
                lineToRelative(-1.91f, -1.38f)
                horizontalLineToRelative(3.85f)
                close()
                moveTo(1.38f, 1.5f)
                curveToRelative(0.29f, -0.32f, 0.68f, -0.5f, 1.12f, -0.5f)
                lineTo(14.5f, 1f)
                curveToRelative(0.43f, 0f, 0.83f, 0.18f, 1.12f, 0.5f)
                curveToRelative(0.29f, 0.32f, 0.42f, 0.73f, 0.37f, 1.17f)
                lineToRelative(-0.32f, 3.34f)
                lineTo(1.33f, 6.01f)
                reflectiveCurveToRelative(-0.32f, -3.35f, -0.32f, -3.35f)
                curveToRelative(-0.05f, -0.43f, 0.09f, -0.84f, 0.38f, -1.16f)
                close()
                moveTo(2.95f, 23f)
                lineTo(1.42f, 7f)
                lineTo(15.57f, 7f)
                reflectiveCurveToRelative(-0.57f, 6f, -0.57f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.2f, 0.54f, 2.27f, 1.38f, 3f)
                lineTo(2.95f, 23f)
                close()
                moveTo(20f, 23f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.89f)
                lineToRelative(3.61f, 2.62f)
                lineToRelative(3.66f, -2.62f)
                horizontalLineToRelative(1.84f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _BurgerGlass = it}
