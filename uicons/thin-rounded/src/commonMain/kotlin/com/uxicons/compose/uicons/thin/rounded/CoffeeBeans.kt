package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBeans: ImageVector? = null

val Icons.Tr.CoffeeBeans: ImageVector
    get() = _CoffeeBeans ?: UXIcon(name = "CoffeeBeans") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9.01f)
                curveToRelative(-3.31f, 0f, -6.0f, 3.36f, -6.0f, 7.49f)
                reflectiveCurveToRelative(2.69f, 7.49f, 6.0f, 7.49f)
                reflectiveCurveToRelative(6.0f, -3.36f, 6.0f, -7.49f)
                reflectiveCurveToRelative(-2.69f, -7.49f, -6.0f, -7.49f)
                close()
                moveTo(13.0f, 16.5f)
                curveToRelative(0f, -3.41f, 2.04f, -6.22f, 4.62f, -6.47f)
                curveToRelative(0.11f, 0.14f, 1.87f, 2.45f, -0.06f, 6.25f)
                curveToRelative(-1.63f, 3.19f, -0.93f, 5.53f, -0.38f, 6.63f)
                curveToRelative(-2.37f, -0.51f, -4.18f, -3.19f, -4.18f, -6.4f)
                close()
                moveTo(18.39f, 22.97f)
                curveToRelative(-0.11f, -0.14f, -1.87f, -2.45f, 0.06f, -6.25f)
                curveToRelative(1.63f, -3.19f, 0.93f, -5.53f, 0.38f, -6.63f)
                curveToRelative(2.37f, 0.51f, 4.18f, 3.19f, 4.18f, 6.4f)
                curveToRelative(0f, 3.41f, -2.04f, 6.22f, -4.62f, 6.47f)
                close()
                moveTo(12.55f, 1.45f)
                curveTo(10.2f, -0.89f, 5.81f, -0.31f, 2.75f, 2.75f)
                curveTo(-0.31f, 5.81f, -0.89f, 10.2f, 1.45f, 12.55f)
                curveToRelative(0.97f, 0.97f, 2.29f, 1.44f, 3.72f, 1.44f)
                curveToRelative(2.03f, 0f, 4.28f, -0.94f, 6.08f, -2.74f)
                curveToRelative(3.06f, -3.06f, 3.64f, -7.45f, 1.3f, -9.79f)
                close()
                moveTo(3.46f, 3.46f)
                curveToRelative(1.6f, -1.6f, 3.6f, -2.45f, 5.36f, -2.45f)
                curveToRelative(1.03f, 0f, 1.98f, 0.29f, 2.73f, 0.89f)
                curveToRelative(-0.03f, 0.19f, -0.51f, 3.17f, -4.71f, 4.63f)
                curveToRelative(-3.55f, 1.23f, -4.77f, 3.49f, -5.18f, 4.68f)
                curveToRelative(-1.31f, -2.06f, -0.6f, -5.35f, 1.8f, -7.75f)
                close()
                moveTo(10.54f, 10.54f)
                curveToRelative(-2.54f, 2.54f, -6.07f, 3.19f, -8.09f, 1.56f)
                curveToRelative(0.03f, -0.18f, 0.51f, -3.17f, 4.71f, -4.63f)
                curveToRelative(3.55f, -1.23f, 4.77f, -3.49f, 5.18f, -4.68f)
                curveToRelative(1.31f, 2.06f, 0.6f, 5.35f, -1.8f, 7.75f)
                close()
            }
        }.also { _CoffeeBeans = it}
