package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Sc.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(0.47f, 0.9f, 0.74f, 1.92f, 0.74f, 3f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                curveToRelative(-3.08f, 0f, -5.76f, -2.19f, -6.37f, -5.2f)
                curveToRelative(-0.17f, -0.81f, 0.36f, -1.6f, 1.17f, -1.77f)
                curveToRelative(0.8f, -0.17f, 1.6f, 0.36f, 1.77f, 1.17f)
                curveToRelative(0.33f, 1.62f, 1.77f, 2.8f, 3.43f, 2.8f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.28f, -0.7f, -2.39f, -1.73f, -3f)
                horizontalLineToRelative(-11.28f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.64f)
                curveToRelative(-0.71f, -0.99f, -1.14f, -2.19f, -1.14f, -3.5f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(2.29f, 0f, 4.35f, 1.28f, 5.38f, 3.33f)
                curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.68f, 2.01f)
                curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.68f)
                curveToRelative(-0.51f, -1.03f, -1.54f, -1.67f, -2.69f, -1.67f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(0.88f, 0f, 1.73f, 0.18f, 2.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Strikethrough = it}
