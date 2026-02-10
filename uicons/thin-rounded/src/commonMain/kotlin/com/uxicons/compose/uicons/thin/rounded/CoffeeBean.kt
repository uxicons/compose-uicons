package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Tr.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 2.71f)
                curveTo(17.11f, -1.48f, 9.53f, -0.71f, 4.41f, 4.41f)
                curveTo(-0.71f, 9.54f, -1.48f, 17.11f, 2.71f, 21.29f)
                curveToRelative(1.82f, 1.82f, 4.27f, 2.7f, 6.89f, 2.7f)
                curveToRelative(3.41f, 0f, 7.1f, -1.5f, 9.99f, -4.4f)
                curveToRelative(5.12f, -5.12f, 5.89f, -12.7f, 1.7f, -16.88f)
                close()
                moveTo(5.12f, 5.12f)
                curveTo(7.83f, 2.41f, 11.25f, 1.0f, 14.4f, 1.0f)
                curveToRelative(2.25f, 0f, 4.37f, 0.72f, 5.97f, 2.21f)
                curveToRelative(-0.14f, 0.91f, -1.25f, 6.04f, -8.52f, 8.31f)
                curveToRelative(-6.7f, 2.09f, -8.55f, 6.43f, -9.05f, 8.36f)
                curveTo(-0.28f, 15.98f, 0.66f, 9.57f, 5.12f, 5.12f)
                close()
                moveTo(18.88f, 18.88f)
                curveToRelative(-4.65f, 4.65f, -11.42f, 5.47f, -15.25f, 1.91f)
                curveToRelative(0.14f, -0.91f, 1.25f, -6.04f, 8.52f, -8.31f)
                curveToRelative(6.7f, -2.09f, 8.55f, -6.43f, 9.05f, -8.36f)
                curveToRelative(3.07f, 3.9f, 2.13f, 10.31f, -2.32f, 14.77f)
                close()
            }
        }.also { _CoffeeBean = it}
