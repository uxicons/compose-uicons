package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Rs.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.25f, 2.73f)
                curveTo(17.04f, -1.47f, 9.46f, -0.74f, 4.36f, 4.36f)
                curveTo(-0.74f, 9.46f, -1.47f, 17.04f, 2.73f, 21.25f)
                curveToRelative(1.84f, 1.84f, 4.32f, 2.73f, 6.95f, 2.73f)
                curveToRelative(3.4f, 0f, 7.06f, -1.49f, 9.93f, -4.36f)
                curveToRelative(5.1f, -5.1f, 5.83f, -12.68f, 1.63f, -16.88f)
                close()
                moveTo(5.78f, 5.78f)
                curveToRelative(2.49f, -2.49f, 5.63f, -3.79f, 8.51f, -3.79f)
                curveToRelative(1.93f, 0f, 3.74f, 0.59f, 5.14f, 1.8f)
                curveToRelative(-0.26f, 1.27f, -1.58f, 5.32f, -7.74f, 7.25f)
                curveToRelative(-5.62f, 1.76f, -7.82f, 5.14f, -8.67f, 7.33f)
                curveToRelative(-2.05f, -3.56f, -1.01f, -8.82f, 2.75f, -12.59f)
                close()
                moveTo(18.2f, 18.2f)
                curveToRelative(-4.16f, 4.16f, -10.15f, 4.99f, -13.66f, 2.0f)
                curveToRelative(0.26f, -1.26f, 1.57f, -5.33f, 7.74f, -7.26f)
                curveToRelative(5.62f, -1.76f, 7.82f, -5.14f, 8.67f, -7.33f)
                curveToRelative(2.05f, 3.56f, 1.01f, 8.82f, -2.75f, 12.59f)
                close()
            }
        }.also { _CoffeeBean = it}
