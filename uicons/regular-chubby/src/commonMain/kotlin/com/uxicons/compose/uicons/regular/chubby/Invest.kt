package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Rc.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.41f, 7.78f)
                curveToRelative(-0.5f, -0.23f, -1.09f, -0.01f, -1.32f, 0.5f)
                curveToRelative(-0.23f, 0.5f, -0.01f, 1.1f, 0.5f, 1.32f)
                curveToRelative(1.19f, 0.54f, 2.41f, 1.61f, 2.41f, 5.4f)
                curveToRelative(0f, 1.34f, -0.15f, 2.41f, -0.47f, 3.26f)
                curveToRelative(-1.67f, -1.3f, -3.18f, -2.61f, -4.53f, -4.57f)
                verticalLineToRelative(-9.43f)
                curveToRelative(0.24f, 0.27f, 0.48f, 0.54f, 0.7f, 0.83f)
                curveToRelative(0.33f, 0.44f, 0.96f, 0.53f, 1.4f, 0.2f)
                curveToRelative(0.44f, -0.33f, 0.53f, -0.96f, 0.2f, -1.4f)
                curveToRelative(-0.74f, -0.99f, -1.61f, -1.86f, -2.59f, -2.61f)
                curveToRelative(-0.19f, -0.17f, -0.45f, -0.29f, -0.7f, -0.29f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.12f, -0.71f, 0.29f)
                curveToRelative(-0.98f, 0.75f, -1.85f, 1.62f, -2.59f, 2.61f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                curveToRelative(0.22f, -0.29f, 0.46f, -0.57f, 0.7f, -0.83f)
                verticalLineToRelative(2.76f)
                curveToRelative(-4.83f, 0.29f, -7f, 2.78f, -7f, 7.97f)
                curveToRelative(0f, 5.53f, 2.47f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -2.47f, 8f, -8f)
                curveToRelative(0f, -2.4f, -0.37f, -5.76f, -3.59f, -7.22f)
                close()
                moveTo(6f, 15f)
                curveToRelative(0f, -4.08f, 1.34f, -5.73f, 5f, -5.97f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 0.2f, 0.06f, 0.39f, 0.17f, 0.56f)
                curveToRelative(1.58f, 2.37f, 3.31f, 3.87f, 5.22f, 5.35f)
                curveToRelative(-0.95f, 0.77f, -2.37f, 1.1f, -4.38f, 1.1f)
                curveToRelative(-4.43f, 0f, -6f, -1.57f, -6f, -6f)
                close()
            }
        }.also { _Invest = it}
