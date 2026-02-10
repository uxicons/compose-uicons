package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Tc.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.66f, 2.52f)
                curveToRelative(-0.18f, -0.06f, -4.37f, -1.46f, -10.66f, -1.46f)
                reflectiveCurveTo(1.51f, 2.46f, 1.34f, 2.52f)
                curveToRelative(-0.25f, 0.08f, -0.39f, 0.34f, -0.32f, 0.59f)
                curveToRelative(1.89f, 7.59f, 8.82f, 10.51f, 10.48f, 11.11f)
                verticalLineToRelative(7.72f)
                horizontalLineTo(7.28f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9.45f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.22f)
                verticalLineToRelative(-7.72f)
                curveToRelative(1.67f, -0.6f, 8.63f, -3.53f, 10.48f, -11.11f)
                curveToRelative(0.06f, -0.25f, -0.08f, -0.51f, -0.32f, -0.59f)
                close()
                moveTo(12f, 13.34f)
                curveToRelative(-0.84f, -0.28f, -5.26f, -1.92f, -8.07f, -6.1f)
                horizontalLineTo(14.08f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(3.31f)
                curveToRelative(-0.48f, -0.87f, -0.9f, -1.84f, -1.2f, -2.9f)
                curveToRelative(1.23f, -0.35f, 4.92f, -1.27f, 9.89f, -1.27f)
                reflectiveCurveToRelative(8.66f, 0.92f, 9.89f, 1.27f)
                curveToRelative(-1.99f, 7.08f, -8.83f, 9.64f, -9.89f, 10.0f)
                close()
            }
        }.also { _CocktailAlt = it}
