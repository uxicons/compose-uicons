package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Br.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.22f, 2.78f)
            curveTo(16.99f, -1.45f, 9.42f, -0.75f, 4.33f, 4.33f)
            curveTo(-0.75f, 9.42f, -1.45f, 16.99f, 2.78f, 21.22f)
            curveToRelative(1.86f, 1.86f, 4.37f, 2.77f, 7.02f, 2.77f)
            curveToRelative(3.39f, 0f, 7.02f, -1.47f, 9.87f, -4.32f)
            curveToRelative(5.08f, -5.08f, 5.78f, -12.66f, 1.55f, -16.89f)
            close()
            moveTo(3.05f, 13.26f)
            curveToRelative(0.26f, -2.45f, 1.47f, -4.86f, 3.4f, -6.8f)
            reflectiveCurveToRelative(4.35f, -3.15f, 6.8f, -3.4f)
            curveToRelative(0.32f, -0.03f, 0.64f, -0.05f, 0.94f, -0.05f)
            curveToRelative(1.61f, 0f, 3.06f, 0.46f, 4.22f, 1.32f)
            curveToRelative(-0.3f, 1.23f, -1.58f, 4.59f, -6.87f, 6.25f)
            curveToRelative(-4.74f, 1.48f, -7.0f, 4.17f, -8.08f, 6.28f)
            curveToRelative(-0.4f, -1.08f, -0.56f, -2.29f, -0.42f, -3.59f)
            close()
            moveTo(20.95f, 10.74f)
            curveToRelative(-0.26f, 2.45f, -1.47f, 4.86f, -3.4f, 6.8f)
            reflectiveCurveToRelative(-4.35f, 3.15f, -6.8f, 3.4f)
            curveToRelative(-1.99f, 0.21f, -3.78f, -0.24f, -5.16f, -1.27f)
            curveToRelative(0.3f, -1.23f, 1.58f, -4.6f, 6.87f, -6.25f)
            curveToRelative(4.74f, -1.48f, 7.0f, -4.17f, 8.08f, -6.28f)
            curveToRelative(0.4f, 1.08f, 0.56f, 2.29f, 0.42f, 3.59f)
            close()
        }
    }.also { _CoffeeBean = it }
