package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Rc.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.57f, 21f)
                horizontalLineToRelative(-2.16f)
                curveToRelative(3.48f, -2.98f, 3.5f, -8.11f, 0.03f, -12.54f)
                curveToRelative(-1.08f, -1.38f, -2.38f, -2.44f, -3.39f, -3.15f)
                curveToRelative(0.51f, -0.64f, 0.51f, -1.46f, 0.51f, -1.74f)
                curveToRelative(-0.01f, -2.23f, -1.6f, -2.56f, -2.55f, -2.57f)
                curveToRelative(-0.82f, 0.03f, -1.46f, 0.22f, -1.9f, 0.66f)
                curveToRelative(-0.66f, 0.66f, -0.65f, 1.59f, -0.65f, 1.9f)
                curveToRelative(0.0f, 0.8f, 0.21f, 1.35f, 0.52f, 1.74f)
                curveToRelative(-1.0f, 0.71f, -2.32f, 1.78f, -3.4f, 3.16f)
                curveToRelative(-3.47f, 4.43f, -3.45f, 9.56f, 0.03f, 12.54f)
                horizontalLineToRelative(-2.16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(7.99f, 19.56f)
                curveToRelative(-3.18f, -2.62f, -2.22f, -6.85f, 0.15f, -9.87f)
                curveToRelative(1.3f, -1.66f, 3.04f, -2.83f, 3.86f, -3.34f)
                curveToRelative(0.8f, 0.49f, 2.48f, 1.63f, 3.77f, 3.23f)
                curveToRelative(-0.47f, 1.47f, -1.42f, 2.74f, -2.71f, 3.62f)
                curveToRelative(-0.46f, 0.31f, -0.58f, 0.93f, -0.27f, 1.39f)
                curveToRelative(0.19f, 0.28f, 0.51f, 0.44f, 0.83f, 0.44f)
                curveToRelative(0.19f, 0f, 0.39f, -0.06f, 0.56f, -0.17f)
                curveToRelative(1.23f, -0.83f, 2.22f, -1.95f, 2.9f, -3.24f)
                curveToRelative(1.37f, 2.72f, 1.48f, 5.85f, -1.07f, 7.95f)
                curveToRelative(-1.13f, 0.93f, -2.55f, 1.44f, -4.01f, 1.44f)
                reflectiveCurveToRelative(-2.88f, -0.51f, -4.01f, -1.44f)
                close()
            }
        }.also { _ChessBishop = it}
