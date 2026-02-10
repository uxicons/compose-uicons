package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Sr.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.65f, 19.54f)
                curveToRelative(-2.87f, 2.87f, -6.53f, 4.36f, -9.93f, 4.36f)
                curveToRelative(-2.4f, 0f, -4.66f, -0.74f, -6.44f, -2.26f)
                curveToRelative(0.12f, -0.86f, 1.17f, -6.32f, 9.04f, -8.78f)
                curveToRelative(6.91f, -2.16f, 9.26f, -6.46f, 10.05f, -8.88f)
                curveToRelative(2.92f, 4.34f, 1.88f, 10.95f, -2.72f, 15.55f)
                close()
                moveTo(11.72f, 10.95f)
                curveToRelative(7.86f, -2.46f, 8.92f, -7.91f, 9.04f, -8.78f)
                curveTo(16.47f, -1.49f, 9.29f, -0.62f, 4.39f, 4.28f)
                curveTo(-0.21f, 8.88f, -1.25f, 15.49f, 1.67f, 19.83f)
                curveToRelative(0.79f, -2.42f, 3.15f, -6.72f, 10.05f, -8.88f)
                close()
            }
        }.also { _CoffeeBean = it}
