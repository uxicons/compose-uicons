package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBeans: ImageVector? = null

val Icons.Sr.CoffeeBeans: ImageVector
    get() = _CoffeeBeans ?: UXIcon(name = "CoffeeBeans") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.46f, 23.81f)
                curveToRelative(-2.55f, -0.88f, -4.44f, -3.87f, -4.44f, -7.4f)
                curveToRelative(0f, -3.9f, 2.29f, -7.12f, 5.23f, -7.6f)
                curveToRelative(0.24f, 0.35f, 1.91f, 2.96f, -0.13f, 7.17f)
                curveToRelative(-1.72f, 3.55f, -1.26f, 6.28f, -0.66f, 7.84f)
                close()
                moveTo(19.59f, 9.01f)
                curveToRelative(0.6f, 1.56f, 1.06f, 4.29f, -0.66f, 7.84f)
                curveToRelative(-2.04f, 4.2f, -0.38f, 6.82f, -0.13f, 7.17f)
                curveToRelative(2.95f, -0.48f, 5.23f, -3.71f, 5.23f, -7.6f)
                curveToRelative(0f, -3.54f, -1.88f, -6.52f, -4.44f, -7.4f)
                close()
                moveTo(7.35f, 7.85f)
                curveToRelative(-4.25f, 1.47f, -5.14f, 4.29f, -5.3f, 5.01f)
                curveToRelative(0.91f, 0.68f, 2.03f, 1.04f, 3.28f, 1.04f)
                curveToRelative(0.32f, 0f, 0.65f, -0.02f, 0.99f, -0.07f)
                curveToRelative(1.8f, -0.26f, 3.58f, -1.19f, 5.01f, -2.62f)
                curveToRelative(2.53f, -2.53f, 3.32f, -6.0f, 2.14f, -8.46f)
                curveToRelative(-0.72f, 1.56f, -2.38f, 3.81f, -6.12f, 5.1f)
                close()
                moveTo(6.7f, 5.96f)
                curveToRelative(4.25f, -1.47f, 5.14f, -4.3f, 5.3f, -5.02f)
                curveTo(10.86f, 0.09f, 9.37f, -0.26f, 7.73f, -0.02f)
                curveToRelative(-1.8f, 0.26f, -3.58f, 1.19f, -5.01f, 2.62f)
                curveTo(0.19f, 5.13f, -0.6f, 8.6f, 0.57f, 11.06f)
                curveToRelative(0.72f, -1.56f, 2.38f, -3.81f, 6.12f, -5.1f)
                close()
            }
        }.also { _CoffeeBeans = it}
