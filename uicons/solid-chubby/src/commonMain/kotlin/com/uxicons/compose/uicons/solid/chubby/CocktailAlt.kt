package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Sc.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.13f, 2.39f)
                curveToRelative(-0.17f, -0.06f, -4.17f, -1.39f, -10.13f, -1.39f)
                reflectiveCurveTo(2.03f, 2.34f, 1.86f, 2.4f)
                curveToRelative(-0.49f, 0.17f, -0.77f, 0.68f, -0.65f, 1.19f)
                curveToRelative(0.2f, 0.81f, 0.46f, 1.55f, 0.76f, 2.25f)
                horizontalLineTo(13.95f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(3.03f)
                curveToRelative(2.27f, 3.58f, 5.66f, 5.4f, 7.47f, 6.17f)
                curveToRelative(0f, 0.0f, 0f, 0.0f, 0f, 0.01f)
                verticalLineToRelative(5.99f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.83f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-5.99f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(2.42f, -1.02f, 7.7f, -3.95f, 9.28f, -10.42f)
                curveToRelative(0.12f, -0.5f, -0.16f, -1.02f, -0.65f, -1.19f)
                close()
            }
        }.also { _CocktailAlt = it}
