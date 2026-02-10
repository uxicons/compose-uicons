package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Egg: ImageVector? = null

val Icons.Rc.Egg: ImageVector
    get() = _Egg ?: UXIcon(name = "Egg") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 23f)
                curveToRelative(-5.73f, 0f, -9.51f, -3.53f, -9.64f, -8.99f)
                curveTo(2.46f, 7.36f, 7.87f, 1.06f, 12f, 1f)
                curveToRelative(1.98f, -0.03f, 4.41f, 1.43f, 6.31f, 3.81f)
                curveToRelative(2.09f, 2.61f, 3.27f, 5.87f, 3.32f, 9.16f)
                curveToRelative(0f, 0.01f, 0f, 0.03f, 0f, 0.04f)
                curveToRelative(-0.13f, 5.46f, -3.9f, 8.99f, -9.61f, 8.99f)
                close()
                moveTo(12.06f, 3f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-2.83f, 0.04f, -7.58f, 5.2f, -7.66f, 11.0f)
                curveToRelative(0.1f, 4.37f, 2.96f, 7.0f, 7.64f, 7.0f)
                curveToRelative(4.66f, 0f, 7.5f, -2.62f, 7.61f, -7.02f)
                curveToRelative(-0.06f, -3.84f, -1.83f, -6.61f, -2.88f, -7.92f)
                curveToRelative(-1.49f, -1.87f, -3.33f, -3.06f, -4.69f, -3.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.74f, 10.89f)
                moveToRelative(-1.01f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.03f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.03f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.18f, 8.06f)
                moveToRelative(-1.01f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.03f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.03f, 0f)
            }
        }.also { _Egg = it}
