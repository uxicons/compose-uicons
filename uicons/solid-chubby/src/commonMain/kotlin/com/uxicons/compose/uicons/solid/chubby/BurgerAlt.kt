package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Sc.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 9f)
                curveToRelative(0f, -0.57f, 0.02f, -0.43f, 0.04f, -0.93f)
                curveToRelative(0.18f, -3.37f, 2.7f, -6.19f, 6.0f, -6.7f)
                curveToRelative(3.13f, -0.49f, 6.79f, -0.49f, 9.92f, 0f)
                curveToRelative(3.3f, 0.52f, 5.82f, 3.34f, 6.0f, 6.7f)
                curveToRelative(0.03f, 0.5f, 0.04f, 0.35f, 0.04f, 0.93f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 17f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.63f, -0.02f, -1.14f, 0.64f, -0.97f, 1.25f)
                curveToRelative(0.54f, 2.09f, 2.19f, 3.66f, 4.32f, 4.11f)
                curveToRelative(4.02f, 0.86f, 9.29f, 0.86f, 13.31f, 0f)
                curveToRelative(2.12f, -0.44f, 3.77f, -2.02f, 4.32f, -4.11f)
                curveToRelative(0.17f, -0.61f, -0.33f, -1.27f, -0.97f, -1.25f)
                close()
                moveTo(21.5f, 12f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _BurgerAlt = it}
