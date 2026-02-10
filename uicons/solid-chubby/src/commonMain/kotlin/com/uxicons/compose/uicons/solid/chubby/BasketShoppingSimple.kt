package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingSimple: ImageVector? = null

val Icons.Sc.BasketShoppingSimple: ImageVector
    get() = _BasketShoppingSimple ?: UXIcon(name = "BasketShoppingSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.27f, 9.04f)
                curveToRelative(-0.07f, -0.02f, -0.85f, -0.24f, -2.3f, -0.47f)
                curveToRelative(-0.23f, -4.21f, -3.71f, -7.57f, -7.98f, -7.57f)
                reflectiveCurveToRelative(-7.75f, 3.36f, -7.98f, 7.57f)
                curveToRelative(-1.45f, 0.23f, -2.23f, 0.45f, -2.3f, 0.47f)
                curveToRelative(-0.43f, 0.12f, -0.73f, 0.52f, -0.72f, 0.97f)
                curveToRelative(0.01f, 0.39f, 0.16f, 9.89f, 3.86f, 11.91f)
                curveToRelative(0.1f, 0.04f, 2.6f, 1.08f, 7.14f, 1.08f)
                reflectiveCurveToRelative(7.04f, -1.03f, 7.14f, -1.08f)
                curveToRelative(3.7f, -2.01f, 3.85f, -11.52f, 3.86f, -11.91f)
                curveToRelative(0.01f, -0.45f, -0.29f, -0.85f, -0.73f, -0.97f)
                close()
                moveTo(12f, 4f)
                curveToRelative(2.48f, 0f, 4.54f, 1.83f, 4.92f, 4.2f)
                curveToRelative(-1.39f, -0.12f, -3.02f, -0.2f, -4.92f, -0.2f)
                reflectiveCurveToRelative(-3.53f, 0.08f, -4.92f, 0.2f)
                curveToRelative(0.39f, -2.38f, 2.44f, -4.2f, 4.92f, -4.2f)
                close()
            }
        }.also { _BasketShoppingSimple = it}
