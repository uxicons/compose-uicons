package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Bs.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.99f, 3.66f)
                curveToRelative(0.0f, -0.01f, -0.5f, -0.61f, -0.77f, -0.88f)
                curveTo(16.99f, -1.45f, 9.42f, -0.75f, 4.33f, 4.33f)
                curveTo(-0.42f, 9.08f, -1.34f, 16.01f, 2.01f, 20.34f)
                curveToRelative(0f, 0f, 0.5f, 0.61f, 0.77f, 0.88f)
                curveToRelative(1.86f, 1.86f, 4.37f, 2.77f, 7.02f, 2.77f)
                curveToRelative(3.39f, 0f, 7.02f, -1.47f, 9.87f, -4.32f)
                curveToRelative(4.75f, -4.75f, 5.67f, -11.67f, 2.33f, -16.01f)
                close()
                moveTo(3.05f, 13.26f)
                curveToRelative(0.26f, -2.45f, 1.47f, -4.86f, 3.4f, -6.8f)
                reflectiveCurveToRelative(4.35f, -3.15f, 6.8f, -3.4f)
                curveToRelative(0.32f, -0.03f, 0.64f, -0.05f, 0.94f, -0.05f)
                curveToRelative(1.75f, 0f, 3.31f, 0.53f, 4.51f, 1.54f)
                curveToRelative(-0.59f, 1.62f, -2.29f, 4.51f, -7.15f, 6.03f)
                curveToRelative(-4.55f, 1.42f, -6.94f, 3.9f, -8.19f, 6.0f)
                curveToRelative(-0.33f, -1.0f, -0.44f, -2.13f, -0.31f, -3.32f)
                close()
                moveTo(17.55f, 17.55f)
                curveToRelative(-1.94f, 1.94f, -4.35f, 3.15f, -6.8f, 3.4f)
                curveToRelative(-2.13f, 0.23f, -4.04f, -0.3f, -5.45f, -1.49f)
                curveToRelative(0.59f, -1.62f, 2.29f, -4.51f, 7.15f, -6.03f)
                curveToRelative(4.55f, -1.42f, 6.94f, -3.9f, 8.19f, -6.0f)
                curveToRelative(0.33f, 1.0f, 0.44f, 2.13f, 0.31f, 3.32f)
                curveToRelative(-0.26f, 2.45f, -1.47f, 4.86f, -3.4f, 6.8f)
                close()
            }
        }.also { _CoffeeBean = it}
