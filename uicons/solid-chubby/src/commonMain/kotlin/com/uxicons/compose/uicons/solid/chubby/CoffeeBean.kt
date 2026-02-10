package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Sc.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.95f, 18.59f)
                curveToRelative(-1.48f, -1.87f, -2.12f, -3.72f, -1.92f, -5.63f)
                curveToRelative(0.25f, -2.3f, 1.66f, -4.67f, 4.46f, -7.46f)
                reflectiveCurveToRelative(5.17f, -4.21f, 7.46f, -4.46f)
                curveToRelative(2.2f, -0.24f, 4.33f, 0.65f, 6.5f, 2.66f)
                curveToRelative(-0.22f, 1.15f, -1.44f, 5.37f, -7.76f, 7.34f)
                curveToRelative(-5.81f, 1.82f, -7.96f, 5.37f, -8.75f, 7.54f)
                close()
                moveTo(21.05f, 5.41f)
                curveToRelative(-0.79f, 2.17f, -2.93f, 5.73f, -8.75f, 7.54f)
                curveToRelative(-6.33f, 1.98f, -7.54f, 6.2f, -7.76f, 7.35f)
                curveToRelative(1.94f, 1.8f, 3.84f, 2.7f, 5.79f, 2.7f)
                curveToRelative(2.85f, -0.09f, 5.05f, -1.46f, 8.17f, -4.5f)
                curveToRelative(2.8f, -2.8f, 4.21f, -5.17f, 4.46f, -7.46f)
                curveToRelative(0.2f, -1.91f, -0.43f, -3.76f, -1.92f, -5.63f)
                close()
            }
        }.also { _CoffeeBean = it}
