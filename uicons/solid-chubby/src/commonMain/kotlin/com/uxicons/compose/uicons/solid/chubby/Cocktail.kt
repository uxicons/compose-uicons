package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Sc.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.72f, 3.56f)
                curveToRelative(-1.69f, -2.04f, -5.35f, -2.31f, -8.72f, -2.31f)
                reflectiveCurveTo(4.96f, 1.53f, 3.26f, 3.58f)
                curveToRelative(-0.56f, 0.68f, -0.86f, 1.49f, -0.91f, 2.43f)
                horizontalLineTo(21.64f)
                curveToRelative(-0.05f, -0.95f, -0.36f, -1.77f, -0.92f, -2.45f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 14.73f)
                verticalLineToRelative(5.52f)
                horizontalLineToRelative(-3.94f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.87f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.94f)
                verticalLineToRelative(-5.52f)
                curveToRelative(4.32f, -0.41f, 6.97f, -2.66f, 7.92f, -6.71f)
                horizontalLineTo(2.59f)
                curveToRelative(0.97f, 4.05f, 3.62f, 6.3f, 7.91f, 6.71f)
                close()
            }
        }.also { _Cocktail = it}
