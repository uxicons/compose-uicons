package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBeans: ImageVector? = null

val Icons.Sc.CoffeeBeans: ImageVector
    get() = _CoffeeBeans ?: UXIcon(name = "CoffeeBeans") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.12f, 3.99f)
                curveToRelative(-0.56f, 1.38f, -1.94f, 3.41f, -5.32f, 4.47f)
                curveToRelative(-4.07f, 1.32f, -4.24f, 4.0f, -4.34f, 4.26f)
                curveToRelative(1.11f, 0.92f, 2.16f, 1.29f, 3.14f, 1.29f)
                curveToRelative(1.85f, 0f, 3.46f, -1.28f, 4.79f, -2.61f)
                curveToRelative(1.92f, -1.92f, 3.74f, -4.45f, 1.72f, -7.41f)
                close()
                moveTo(7.2f, 6.55f)
                curveToRelative(4.08f, -1.32f, 4.24f, -3.99f, 4.34f, -4.27f)
                curveToRelative(-3.18f, -2.64f, -5.9f, -0.71f, -7.94f, 1.33f)
                curveToRelative(-1.92f, 1.92f, -3.74f, 4.45f, -1.72f, 7.41f)
                curveToRelative(0.56f, -1.38f, 1.94f, -3.41f, 5.32f, -4.47f)
                close()
                moveTo(16.55f, 16.18f)
                curveToRelative(1.16f, -3.5f, 0.29f, -5.73f, 0.1f, -6.15f)
                curveToRelative(-4.1f, 0.39f, -4.65f, 3.62f, -4.65f, 6.46f)
                curveToRelative(0f, 2.73f, 0.52f, 5.83f, 4.22f, 6.4f)
                curveToRelative(-0.36f, -1.28f, -0.69f, -3.62f, 0.34f, -6.71f)
                close()
                moveTo(18.78f, 10.1f)
                curveToRelative(0.36f, 1.28f, 0.69f, 3.62f, -0.34f, 6.71f)
                curveToRelative(-1.16f, 3.5f, -0.29f, 5.73f, -0.1f, 6.15f)
                curveToRelative(4.1f, -0.39f, 4.65f, -3.62f, 4.65f, -6.46f)
                curveToRelative(0f, -2.73f, -0.52f, -5.83f, -4.22f, -6.4f)
                close()
            }
        }.also { _CoffeeBeans = it}
