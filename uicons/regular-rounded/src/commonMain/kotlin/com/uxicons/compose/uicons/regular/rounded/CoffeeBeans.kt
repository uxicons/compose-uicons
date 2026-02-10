package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBeans: ImageVector? = null

val Icons.Rr.CoffeeBeans: ImageVector
    get() = _CoffeeBeans ?: UXIcon(name = "CoffeeBeans") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9.01f)
                curveToRelative(-3.31f, 0f, -6f, 3.37f, -6f, 7.5f)
                reflectiveCurveToRelative(2.69f, 7.5f, 6f, 7.5f)
                reflectiveCurveToRelative(6f, -3.36f, 6f, -7.5f)
                reflectiveCurveToRelative(-2.69f, -7.5f, -6f, -7.5f)
                close()
                moveTo(14f, 16.51f)
                curveToRelative(0f, -2.76f, 1.49f, -5.05f, 3.41f, -5.44f)
                curveToRelative(0.38f, 0.57f, 1.24f, 2.32f, -0.28f, 4.94f)
                curveToRelative(-1.3f, 2.26f, -1.29f, 4.11f, -0.94f, 5.41f)
                curveToRelative(-1.3f, -0.91f, -2.2f, -2.77f, -2.2f, -4.91f)
                close()
                moveTo(18.59f, 21.95f)
                curveToRelative(-0.38f, -0.57f, -1.23f, -2.32f, 0.28f, -4.94f)
                curveToRelative(1.3f, -2.25f, 1.29f, -4.11f, 0.94f, -5.4f)
                curveToRelative(1.3f, 0.91f, 2.19f, 2.77f, 2.19f, 4.9f)
                curveToRelative(0f, 2.76f, -1.48f, 5.04f, -3.41f, 5.44f)
                close()
                moveTo(12.51f, 1.49f)
                curveTo(11.32f, 0.3f, 9.61f, -0.2f, 7.71f, 0.07f)
                curveToRelative(-1.8f, 0.26f, -3.58f, 1.19f, -5.01f, 2.62f)
                curveTo(-0.34f, 5.73f, -0.88f, 10.13f, 1.49f, 12.51f)
                curveToRelative(0.98f, 0.98f, 2.31f, 1.5f, 3.81f, 1.5f)
                curveToRelative(0.32f, 0f, 0.65f, -0.02f, 0.99f, -0.07f)
                curveToRelative(1.8f, -0.26f, 3.58f, -1.19f, 5.01f, -2.62f)
                curveToRelative(3.04f, -3.04f, 3.58f, -7.44f, 1.2f, -9.81f)
                close()
                moveTo(4.11f, 4.11f)
                curveToRelative(1.13f, -1.13f, 2.51f, -1.86f, 3.88f, -2.06f)
                curveToRelative(0.24f, -0.03f, 0.47f, -0.05f, 0.7f, -0.05f)
                curveToRelative(0.73f, 0f, 1.38f, 0.17f, 1.91f, 0.51f)
                curveToRelative(-0.22f, 0.72f, -1.04f, 2.54f, -3.93f, 3.54f)
                curveToRelative(-2.55f, 0.88f, -3.89f, 2.33f, -4.59f, 3.51f)
                curveToRelative(-0.38f, -1.65f, 0.35f, -3.79f, 2.02f, -5.46f)
                close()
                moveTo(9.89f, 9.89f)
                curveToRelative(-1.13f, 1.13f, -2.51f, 1.86f, -3.88f, 2.06f)
                curveToRelative(-1.01f, 0.14f, -1.91f, -0.02f, -2.61f, -0.46f)
                curveToRelative(0.22f, -0.72f, 1.04f, -2.54f, 3.93f, -3.54f)
                curveToRelative(2.55f, -0.88f, 3.89f, -2.33f, 4.59f, -3.51f)
                curveToRelative(0.38f, 1.65f, -0.35f, 3.79f, -2.02f, 5.46f)
                close()
            }
        }.also { _CoffeeBeans = it}
