package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Rc.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.26f, 14.28f)
                curveToRelative(-1.6f, -0.85f, -3.1f, -1.07f, -4.48f, -0.66f)
                curveToRelative(-0.53f, 0.16f, -0.83f, 0.71f, -0.67f, 1.24f)
                curveToRelative(0.16f, 0.53f, 0.71f, 0.83f, 1.24f, 0.67f)
                curveToRelative(0.85f, -0.25f, 1.85f, -0.08f, 2.97f, 0.51f)
                curveToRelative(0.15f, 0.08f, 0.31f, 0.12f, 0.47f, 0.12f)
                curveToRelative(0.36f, 0f, 0.7f, -0.19f, 0.89f, -0.53f)
                curveToRelative(0.26f, -0.49f, 0.07f, -1.09f, -0.42f, -1.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.1f, 12.71f)
                curveToRelative(-0.31f, -0.17f, -0.69f, -0.17f, -0.99f, 0.01f)
                curveToRelative(-0.38f, 0.23f, -2.3f, 1.43f, -2.32f, 3.18f)
                curveToRelative(0.04f, 1.47f, 1.36f, 2.78f, 2.84f, 2.8f)
                curveToRelative(1.46f, -0.02f, 2.81f, -1.33f, 2.81f, -2.8f)
                curveToRelative(0f, -1.87f, -2.11f, -3.06f, -2.35f, -3.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.93f, 1.04f, 1f, 4.84f, 1f, 11.98f)
                curveToRelative(0f, 7.02f, 3.93f, 10.98f, 11.01f, 11.02f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.94f, -11.01f, -10.98f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-6.03f, -0.04f, -8.89f, -2.9f, -9.01f, -9f)
                curveToRelative(0.11f, -6.02f, 3.06f, -8.96f, 8.99f, -9f)
                curveToRelative(5.87f, 0.04f, 8.9f, 3.07f, 9.01f, 8.98f)
                curveToRelative(-0.11f, 6.12f, -2.97f, 8.98f, -8.99f, 9.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.62f, 10.31f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.0f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.38f, 10.31f)
                moveToRelative(-1.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.0f, 0f)
            }
        }.also { _SadTear = it}
