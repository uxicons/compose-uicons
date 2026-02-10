package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBeans: ImageVector? = null

val Icons.Br.CoffeeBeans: ImageVector
    get() = _CoffeeBeans ?: UXIcon(name = "CoffeeBeans") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 9f)
            curveToRelative(-3.31f, 0f, -6f, 3.36f, -6f, 7.5f)
            reflectiveCurveToRelative(2.69f, 7.5f, 6f, 7.5f)
            reflectiveCurveToRelative(6f, -3.36f, 6f, -7.5f)
            reflectiveCurveToRelative(-2.69f, -7.5f, -6f, -7.5f)
            close()
            moveTo(17.11f, 12.24f)
            curveToRelative(0.22f, 0.7f, 0.36f, 1.94f, -0.45f, 3.61f)
            curveToRelative(-0.64f, 1.33f, -0.89f, 2.52f, -0.92f, 3.53f)
            curveToRelative(-0.45f, -0.79f, -0.73f, -1.79f, -0.73f, -2.88f)
            curveToRelative(0f, -1.97f, 0.9f, -3.67f, 2.1f, -4.26f)
            close()
            moveTo(18.9f, 20.76f)
            curveToRelative(-0.22f, -0.7f, -0.36f, -1.94f, 0.45f, -3.61f)
            curveToRelative(0.64f, -1.33f, 0.89f, -2.52f, 0.92f, -3.53f)
            curveToRelative(0.45f, 0.79f, 0.73f, 1.79f, 0.73f, 2.88f)
            curveToRelative(0f, 1.97f, -0.9f, 3.67f, -2.1f, 4.26f)
            close()
            moveTo(12.46f, 1.54f)
            curveTo(11.26f, 0.33f, 9.47f, -0.2f, 7.57f, 0.07f)
            curveToRelative(-1.77f, 0.25f, -3.52f, 1.17f, -4.93f, 2.57f)
            curveTo(-0.37f, 5.65f, -0.86f, 10.06f, 1.54f, 12.46f)
            curveToRelative(1f, 1f, 2.4f, 1.54f, 3.93f, 1.54f)
            curveToRelative(0.32f, 0f, 0.64f, -0.02f, 0.96f, -0.07f)
            curveToRelative(1.77f, -0.25f, 3.52f, -1.17f, 4.93f, -2.57f)
            curveToRelative(3.01f, -3.01f, 3.5f, -7.42f, 1.1f, -9.82f)
            close()
            moveTo(7.99f, 3.04f)
            curveToRelative(0.15f, -0.02f, 0.34f, -0.04f, 0.55f, -0.04f)
            curveToRelative(0.31f, 0f, 0.67f, 0.05f, 1.01f, 0.17f)
            curveToRelative(-0.34f, 0.69f, -1.15f, 1.75f, -3.04f, 2.41f)
            curveToRelative(-1.53f, 0.53f, -2.62f, 1.27f, -3.39f, 2.04f)
            curveToRelative(0.23f, -0.97f, 0.78f, -2.0f, 1.64f, -2.87f)
            curveToRelative(0.93f, -0.93f, 2.11f, -1.56f, 3.23f, -1.72f)
            close()
            moveTo(6.01f, 10.96f)
            curveToRelative(-0.38f, 0.05f, -0.99f, 0.08f, -1.56f, -0.13f)
            curveToRelative(0.34f, -0.69f, 1.15f, -1.75f, 3.05f, -2.41f)
            curveToRelative(1.53f, -0.53f, 2.62f, -1.27f, 3.39f, -2.04f)
            curveToRelative(-0.23f, 0.97f, -0.78f, 2.0f, -1.64f, 2.87f)
            curveToRelative(-0.93f, 0.93f, -2.11f, 1.56f, -3.23f, 1.72f)
            close()
        }
    }.also { _CoffeeBeans = it }
