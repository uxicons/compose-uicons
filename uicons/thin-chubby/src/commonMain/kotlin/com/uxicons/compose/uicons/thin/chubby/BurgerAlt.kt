package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Tc.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(21f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(1f, 10.5f)
                curveToRelative(0f, -0.53f, 0.01f, -2.06f, 0.04f, -2.6f)
                curveToRelative(0.17f, -3.28f, 2.63f, -6.02f, 5.83f, -6.52f)
                curveToRelative(3.23f, -0.51f, 7.01f, -0.51f, 10.24f, 0f)
                curveToRelative(3.21f, 0.5f, 5.66f, 3.25f, 5.83f, 6.52f)
                curveToRelative(0.03f, 0.54f, 0.04f, 2.06f, 0.04f, 2.59f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-21.0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(2.0f, 10f)
                horizontalLineToRelative(20.0f)
                curveToRelative(-0.01f, -0.7f, -0.02f, -1.66f, -0.04f, -2.04f)
                curveToRelative(-0.15f, -2.81f, -2.25f, -5.16f, -4.99f, -5.59f)
                curveToRelative(-3.13f, -0.49f, -6.8f, -0.49f, -9.94f, 0f)
                curveToRelative(-2.74f, 0.43f, -4.84f, 2.78f, -4.99f, 5.59f)
                curveToRelative(-0.02f, 0.38f, -0.04f, 1.34f, -0.04f, 2.04f)
                close()
                moveTo(22.87f, 16.17f)
                curveToRelative(0.1f, 0.11f, 0.14f, 0.25f, 0.12f, 0.39f)
                curveToRelative(-0.36f, 3.02f, -1.22f, 5.07f, -4.37f, 5.92f)
                curveToRelative(-1.51f, 0.41f, -4.88f, 0.52f, -6.63f, 0.52f)
                reflectiveCurveToRelative(-5.12f, -0.11f, -6.63f, -0.52f)
                curveToRelative(-3.12f, -0.84f, -3.94f, -2.81f, -4.31f, -5.92f)
                curveToRelative(-0.04f, -0.29f, 0.2f, -0.57f, 0.5f, -0.56f)
                horizontalLineToRelative(20.95f)
                curveToRelative(0.14f, 0f, 0.28f, 0.06f, 0.37f, 0.17f)
                close()
                moveTo(21.93f, 17f)
                horizontalLineToRelative(-19.81f)
                curveToRelative(0.36f, 2.46f, 1.09f, 3.86f, 3.51f, 4.52f)
                curveToRelative(1.17f, 0.32f, 4.09f, 0.48f, 6.37f, 0.48f)
                reflectiveCurveToRelative(5.2f, -0.17f, 6.37f, -0.48f)
                curveToRelative(2.46f, -0.67f, 3.2f, -2.06f, 3.56f, -4.52f)
                close()
            }
        }.also { _BurgerAlt = it}
