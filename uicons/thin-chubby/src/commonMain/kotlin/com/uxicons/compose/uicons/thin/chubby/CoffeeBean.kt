package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeBean: ImageVector? = null

val Icons.Tc.CoffeeBean: ImageVector
    get() = _CoffeeBean ?: UXIcon(name = "CoffeeBean") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.89f, 3.98f)
                curveToRelative(-4.55f, -4.55f, -8.68f, -4.13f, -14.27f, 1.46f)
                curveToRelative(-2.83f, 2.83f, -4.26f, 5.2f, -4.5f, 7.47f)
                curveToRelative(-0.25f, 2.31f, 0.72f, 4.47f, 3.05f, 6.8f)
                curveToRelative(2.06f, 2.06f, 4.04f, 3.1f, 6.11f, 3.1f)
                curveToRelative(2.49f, 0f, 5.11f, -1.51f, 8.16f, -4.56f)
                curveToRelative(2.83f, -2.83f, 4.26f, -5.2f, 4.5f, -7.47f)
                curveToRelative(0.25f, -2.31f, -0.72f, -4.47f, -3.05f, -6.8f)
                close()
                moveTo(2.11f, 13.01f)
                curveToRelative(0.22f, -2.03f, 1.56f, -4.21f, 4.22f, -6.87f)
                curveToRelative(2.83f, -2.83f, 5.2f, -4.23f, 7.44f, -4.23f)
                curveToRelative(1.76f, 0f, 3.44f, 0.88f, 5.21f, 2.58f)
                curveToRelative(-0.13f, 0.86f, -1.07f, 4.99f, -7.1f, 6.88f)
                curveToRelative(-5.54f, 1.73f, -7.16f, 5.28f, -7.63f, 6.97f)
                curveToRelative(-1.64f, -1.84f, -2.33f, -3.55f, -2.14f, -5.33f)
                close()
                moveTo(21.95f, 10.67f)
                curveToRelative(-0.22f, 2.03f, -1.56f, 4.21f, -4.22f, 6.87f)
                curveToRelative(-5.07f, 5.06f, -8.64f, 5.53f, -12.65f, 1.65f)
                curveToRelative(0.13f, -0.86f, 1.08f, -4.99f, 7.1f, -6.87f)
                curveToRelative(5.54f, -1.73f, 7.16f, -5.28f, 7.63f, -6.97f)
                curveToRelative(1.64f, 1.84f, 2.33f, 3.55f, 2.14f, 5.33f)
                close()
            }
        }.also { _CoffeeBean = it}
