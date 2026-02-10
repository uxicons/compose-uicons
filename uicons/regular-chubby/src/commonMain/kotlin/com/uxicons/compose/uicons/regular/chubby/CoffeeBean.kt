package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Rc.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.9f, 4.09f)
                curveToRelative(-2.32f, -2.31f, -4.59f, -3.32f, -6.93f, -3.07f)
                curveToRelative(-2.29f, 0.25f, -4.67f, 1.66f, -7.46f, 4.46f)
                reflectiveCurveToRelative(-4.21f, 5.17f, -4.46f, 7.46f)
                curveToRelative(-0.25f, 2.35f, 0.75f, 4.61f, 3.07f, 6.93f)
                curveToRelative(2.08f, 2.08f, 4.13f, 3.11f, 6.23f, 3.11f)
                curveToRelative(2.85f, -0.09f, 5.05f, -1.46f, 8.17f, -4.5f)
                curveToRelative(2.8f, -2.8f, 4.21f, -5.17f, 4.46f, -7.46f)
                curveToRelative(0.25f, -2.35f, -0.75f, -4.61f, -3.07f, -6.93f)
                close()
                moveTo(3.03f, 13.16f)
                curveToRelative(0.19f, -1.79f, 1.46f, -3.84f, 3.89f, -6.26f)
                reflectiveCurveToRelative(4.47f, -3.69f, 6.26f, -3.89f)
                curveToRelative(1.75f, -0.16f, 3.17f, 0.53f, 4.91f, 2.12f)
                curveToRelative(-0.25f, 1.1f, -1.4f, 4.34f, -6.38f, 5.9f)
                curveToRelative(-4.68f, 1.46f, -6.57f, 4.25f, -7.33f, 6.12f)
                curveToRelative(-1.05f, -1.38f, -1.48f, -2.67f, -1.34f, -4.0f)
                close()
                moveTo(20.98f, 10.81f)
                curveToRelative(-0.19f, 1.79f, -1.46f, 3.84f, -3.89f, 6.26f)
                reflectiveCurveToRelative(-4.47f, 3.69f, -6.26f, 3.89f)
                curveToRelative(-1.61f, 0.17f, -3.18f, -0.51f, -4.91f, -2.12f)
                curveToRelative(0.25f, -1.1f, 1.41f, -4.34f, 6.38f, -5.9f)
                curveToRelative(4.68f, -1.46f, 6.57f, -4.25f, 7.33f, -6.12f)
                curveToRelative(1.05f, 1.38f, 1.48f, 2.67f, 1.34f, 4.0f)
                close()
            }
        }.also { _CoffeeBean = it}
