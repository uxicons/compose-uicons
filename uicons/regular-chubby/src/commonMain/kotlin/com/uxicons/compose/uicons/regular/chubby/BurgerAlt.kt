package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Rc.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(1f, 10f)
                curveToRelative(0f, -0.57f, 0.02f, -1.43f, 0.04f, -1.93f)
                curveToRelative(0.18f, -3.37f, 2.7f, -6.19f, 6.0f, -6.7f)
                curveToRelative(3.13f, -0.49f, 6.79f, -0.49f, 9.92f, 0f)
                curveToRelative(3.3f, 0.52f, 5.82f, 3.34f, 6.0f, 6.7f)
                curveToRelative(0.03f, 0.5f, 0.04f, 1.35f, 0.04f, 1.93f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(3.01f, 9f)
                horizontalLineToRelative(17.98f)
                curveToRelative(-0.01f, -0.31f, -0.02f, -0.6f, -0.03f, -0.82f)
                curveToRelative(-0.13f, -2.43f, -1.94f, -4.46f, -4.31f, -4.83f)
                curveToRelative(-2.92f, -0.46f, -6.38f, -0.46f, -9.3f, 0f)
                curveToRelative(-2.37f, 0.37f, -4.18f, 2.4f, -4.31f, 4.83f)
                curveToRelative(-0.01f, 0.22f, -0.02f, 0.52f, -0.03f, 0.82f)
                close()
                moveTo(22.79f, 17.39f)
                curveToRelative(0.19f, 0.24f, 0.26f, 0.56f, 0.18f, 0.86f)
                curveToRelative(-0.54f, 2.09f, -2.19f, 3.66f, -4.32f, 4.11f)
                curveToRelative(-2.04f, 0.43f, -4.28f, 0.65f, -6.65f, 0.65f)
                reflectiveCurveToRelative(-4.61f, -0.22f, -6.65f, -0.65f)
                curveToRelative(-2.12f, -0.44f, -3.77f, -2.02f, -4.32f, -4.11f)
                curveToRelative(-0.17f, -0.61f, 0.33f, -1.27f, 0.97f, -1.25f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.31f, 0f, 0.6f, 0.14f, 0.79f, 0.39f)
                close()
                moveTo(20.44f, 19f)
                horizontalLineToRelative(-16.88f)
                curveToRelative(0.52f, 0.71f, 1.29f, 1.21f, 2.19f, 1.4f)
                curveToRelative(1.91f, 0.4f, 4.01f, 0.6f, 6.24f, 0.6f)
                reflectiveCurveToRelative(4.33f, -0.2f, 6.24f, -0.6f)
                curveToRelative(0.9f, -0.19f, 1.67f, -0.69f, 2.19f, -1.4f)
                close()
            }
        }.also { _BurgerAlt = it}
