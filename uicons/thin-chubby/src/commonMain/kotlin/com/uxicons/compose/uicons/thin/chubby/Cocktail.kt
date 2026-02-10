package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Tc.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.0f, 3.29f)
                curveToRelative(-1.67f, -2.02f, -5.49f, -2.29f, -9f, -2.29f)
                reflectiveCurveTo(4.66f, 1.27f, 2.98f, 3.31f)
                curveToRelative(-0.78f, 0.95f, -1.02f, 2.2f, -0.72f, 3.72f)
                curveToRelative(0.95f, 4.83f, 3.98f, 7.25f, 9.24f, 7.4f)
                verticalLineToRelative(7.57f)
                lineTo(6.11f, 22f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11.78f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.39f)
                verticalLineToRelative(-7.57f)
                curveToRelative(5.23f, -0.15f, 8.34f, -2.63f, 9.25f, -7.4f)
                curveToRelative(0.29f, -1.53f, 0.04f, -2.79f, -0.74f, -3.74f)
                close()
                moveTo(12.0f, 13.44f)
                curveToRelative(-4.98f, 0f, -7.75f, -2.0f, -8.7f, -6.3f)
                lineTo(20.71f, 7.13f)
                curveToRelative(-0.91f, 4.24f, -3.76f, 6.3f, -8.7f, 6.3f)
                close()
                moveTo(20.86f, 6.13f)
                lineTo(3.15f, 6.13f)
                curveToRelative(-0.06f, -0.89f, 0.14f, -1.61f, 0.61f, -2.19f)
                curveToRelative(1.42f, -1.73f, 5.15f, -1.95f, 8.25f, -1.95f)
                reflectiveCurveToRelative(6.82f, 0.22f, 8.23f, 1.93f)
                curveToRelative(0.48f, 0.57f, 0.68f, 1.3f, 0.62f, 2.21f)
                close()
            }
        }.also { _Cocktail = it}
