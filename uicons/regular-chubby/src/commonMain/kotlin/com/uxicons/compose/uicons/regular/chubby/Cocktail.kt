package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cocktail: ImageVector? = null

val Icons.Rc.Cocktail: ImageVector
    get() = _Cocktail ?: UXIcon(name = "Cocktail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.95f, 3.37f)
                curveToRelative(-1.73f, -2.08f, -5.49f, -2.37f, -8.95f, -2.37f)
                reflectiveCurveTo(4.76f, 1.28f, 3.03f, 3.39f)
                curveToRelative(-0.85f, 1.03f, -1.12f, 2.37f, -0.8f, 3.98f)
                curveToRelative(0.92f, 4.65f, 3.86f, 7.15f, 8.77f, 7.44f)
                verticalLineToRelative(6.19f)
                lineTo(6.41f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.59f)
                verticalLineToRelative(-6.18f)
                curveToRelative(4.94f, -0.29f, 7.89f, -2.79f, 8.77f, -7.45f)
                curveToRelative(0.31f, -1.62f, 0.03f, -2.97f, -0.82f, -4.0f)
                close()
                moveTo(12.0f, 3f)
                curveToRelative(2.6f, 0f, 6.19f, 0.17f, 7.41f, 1.64f)
                curveToRelative(0.28f, 0.34f, 0.43f, 0.75f, 0.47f, 1.25f)
                lineTo(4.11f, 5.89f)
                curveToRelative(0.04f, -0.49f, 0.19f, -0.9f, 0.46f, -1.23f)
                curveToRelative(1.22f, -1.49f, 4.82f, -1.66f, 7.43f, -1.66f)
                close()
                moveTo(12.0f, 12.84f)
                curveToRelative(-4.18f, 0f, -6.62f, -1.58f, -7.59f, -4.96f)
                horizontalLineToRelative(15.19f)
                curveToRelative(-0.95f, 3.38f, -3.38f, 4.96f, -7.6f, 4.96f)
                close()
            }
        }.also { _Cocktail = it}
