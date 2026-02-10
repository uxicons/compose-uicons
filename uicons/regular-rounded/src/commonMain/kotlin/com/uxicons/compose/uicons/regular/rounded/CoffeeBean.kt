package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Rr.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.26f, 2.74f)
                curveTo(17.05f, -1.47f, 9.47f, -0.73f, 4.37f, 4.37f)
                curveTo(-0.73f, 9.48f, -1.46f, 17.05f, 2.74f, 21.26f)
                curveToRelative(1.84f, 1.84f, 4.32f, 2.73f, 6.95f, 2.73f)
                curveToRelative(3.4f, 0f, 7.06f, -1.49f, 9.93f, -4.36f)
                curveToRelative(5.1f, -5.1f, 5.83f, -12.68f, 1.63f, -16.89f)
                close()
                moveTo(5.79f, 5.79f)
                curveToRelative(2.49f, -2.49f, 5.64f, -3.79f, 8.51f, -3.79f)
                curveToRelative(1.93f, 0f, 3.74f, 0.59f, 5.14f, 1.79f)
                curveToRelative(-0.26f, 1.26f, -1.57f, 5.33f, -7.74f, 7.26f)
                curveToRelative(-5.62f, 1.76f, -7.82f, 5.14f, -8.67f, 7.33f)
                curveToRelative(-2.05f, -3.56f, -1.01f, -8.82f, 2.75f, -12.59f)
                close()
                moveTo(18.21f, 18.21f)
                curveToRelative(-4.16f, 4.16f, -10.15f, 5.0f, -13.66f, 2.0f)
                curveToRelative(0.26f, -1.26f, 1.57f, -5.33f, 7.74f, -7.26f)
                curveToRelative(5.62f, -1.76f, 7.82f, -5.14f, 8.67f, -7.33f)
                curveToRelative(2.05f, 3.56f, 1.01f, 8.82f, -2.75f, 12.59f)
                close()
            }
        }.also { _CoffeeBean = it}
