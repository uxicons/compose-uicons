package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LacrosseStickBall: ImageVector? = null

val Icons.Sr.LacrosseStickBall: ImageVector
    get() = _LacrosseStickBall ?: UXIcon(name = "LacrosseStickBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.89f, 14.04f)
                curveToRelative(1.37f, -0.12f, 2.58f, -0.67f, 3.49f, -1.59f)
                curveToRelative(1.23f, -1.23f, 1.78f, -2.95f, 1.57f, -4.86f)
                curveToRelative(-0.2f, -1.83f, -1.1f, -3.62f, -2.52f, -5.04f)
                curveToRelative(-2.99f, -2.99f, -7.43f, -3.41f, -9.9f, -0.94f)
                curveToRelative(-0.91f, 0.91f, -1.46f, 2.12f, -1.58f, 3.49f)
                curveToRelative(-0.08f, 0.89f, -0.64f, 1.76f, -1.52f, 2.39f)
                curveToRelative(-1.96f, 1.39f, -2.84f, 3.83f, -2.24f, 6.2f)
                curveToRelative(0.17f, 0.67f, 0.47f, 1.28f, 0.86f, 1.84f)
                lineTo(0.29f, 22.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(6.76f, -6.76f)
                curveToRelative(0.55f, 0.39f, 1.17f, 0.69f, 1.84f, 0.86f)
                curveToRelative(0.49f, 0.12f, 0.99f, 0.19f, 1.48f, 0.19f)
                curveToRelative(1.86f, 0f, 3.62f, -0.88f, 4.72f, -2.43f)
                curveToRelative(0.63f, -0.89f, 1.5f, -1.44f, 2.39f, -1.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _LacrosseStickBall = it}
