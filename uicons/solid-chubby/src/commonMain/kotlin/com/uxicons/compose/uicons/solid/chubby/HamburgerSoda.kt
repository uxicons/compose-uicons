package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HamburgerSoda: ImageVector? = null

val Icons.Sc.HamburgerSoda: ImageVector
    get() = _HamburgerSoda ?: UXIcon(name = "HamburgerSoda") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.88f, 17.28f)
                curveToRelative(0f, -3.28f, 1.3f, -7.15f, 7.27f, -7.67f)
                lineToRelative(0.29f, -3.75f)
                curveToRelative(0.04f, -0.47f, -0.26f, -0.9f, -0.72f, -1.03f)
                curveToRelative(-0.09f, -0.02f, -1.82f, -0.51f, -4.09f, -0.67f)
                verticalLineToRelative(-1.65f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.65f)
                curveToRelative(-2.27f, 0.17f, -4.0f, 0.65f, -4.08f, 0.67f)
                curveToRelative(-0.46f, 0.13f, -0.76f, 0.56f, -0.72f, 1.03f)
                lineToRelative(1.2f, 15.53f)
                curveToRelative(0.03f, 0.33f, 0.22f, 0.63f, 0.51f, 0.79f)
                curveToRelative(0.15f, 0.08f, 1.56f, 0.82f, 4.6f, 0.82f)
                curveToRelative(0.34f, 0f, 0.65f, -0.01f, 0.95f, -0.03f)
                curveToRelative(-1.82f, -1.66f, -2.2f, -4.01f, -2.2f, -5.7f)
                close()
                moveTo(3.87f, 6.55f)
                curveToRelative(0.91f, -0.19f, 2.51f, -0.47f, 4.26f, -0.47f)
                reflectiveCurveToRelative(3.35f, 0.28f, 4.26f, 0.47f)
                lineToRelative(-0.11f, 1.38f)
                horizontalLineTo(3.98f)
                lineToRelative(-0.11f, -1.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.96f, 16.03f)
                horizontalLineToRelative(13.15f)
                curveToRelative(-0.57f, -3.99f, -3.97f, -4.48f, -6.58f, -4.48f)
                reflectiveCurveToRelative(-6.0f, 0.49f, -6.58f, 4.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 18.03f)
                lineToRelative(-0.89f, 0.9f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.54f, -1.3f, 0.54f)
                reflectiveCurveToRelative(-0.96f, -0.19f, -1.3f, -0.54f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-0.89f, -0.9f, -0.89f, -0.9f)
                horizontalLineToRelative(-5.77f)
                curveToRelative(0.42f, 4.97f, 5.06f, 4.97f, 6.63f, 4.97f)
                curveToRelative(2.71f, 0f, 6.27f, -0.53f, 6.63f, -4.97f)
                horizontalLineToRelative(-3.1f)
                close()
            }
        }.also { _HamburgerSoda = it}
