package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CocktailAlt: ImageVector? = null

val Icons.Rc.CocktailAlt: ImageVector
    get() = _CocktailAlt ?: UXIcon(name = "CocktailAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.32f, 2.5f)
                curveToRelative(-0.17f, -0.06f, -4.25f, -1.42f, -10.32f, -1.42f)
                reflectiveCurveTo(1.85f, 2.44f, 1.68f, 2.5f)
                curveToRelative(-0.49f, 0.17f, -0.77f, 0.69f, -0.65f, 1.19f)
                curveToRelative(1.77f, 7.1f, 7.86f, 9.99f, 9.97f, 10.79f)
                verticalLineToRelative(6.44f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-6.44f)
                curveToRelative(2.12f, -0.81f, 8.23f, -3.71f, 9.97f, -10.8f)
                curveToRelative(0.12f, -0.5f, -0.16f, -1.02f, -0.65f, -1.19f)
                close()
                moveTo(12f, 12.72f)
                curveToRelative(-0.97f, -0.35f, -4.23f, -1.69f, -6.65f, -4.72f)
                horizontalLineTo(13.98f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(4.04f)
                curveToRelative(-0.3f, -0.58f, -0.57f, -1.2f, -0.8f, -1.87f)
                curveToRelative(1.48f, -0.38f, 4.65f, -1.05f, 8.76f, -1.05f)
                reflectiveCurveToRelative(7.28f, 0.67f, 8.76f, 1.05f)
                curveToRelative(-1.91f, 5.81f, -7.45f, 8.11f, -8.76f, 8.58f)
                close()
            }
        }.also { _CocktailAlt = it}
