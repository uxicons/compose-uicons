package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsCross: ImageVector? = null

val Icons.Rc.ArrowsCross: ImageVector
    get() = _ArrowsCross ?: UXIcon(name = "ArrowsCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.48f, 9.09f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.1f, 0.65f, 1.26f)
                curveToRelative(0.64f, 0.19f, 1.12f, -0.22f, 1.26f, -0.65f)
                curveToRelative(1.39f, -4.37f, -0.01f, -7.41f, -0.07f, -7.54f)
                curveToRelative(-0.1f, -0.21f, -0.27f, -0.38f, -0.47f, -0.47f)
                curveToRelative(-0.13f, -0.06f, -3.17f, -1.46f, -7.54f, -0.07f)
                curveToRelative(-0.53f, 0.17f, -0.82f, 0.73f, -0.65f, 1.26f)
                curveToRelative(0.17f, 0.53f, 0.73f, 0.81f, 1.26f, 0.65f)
                curveToRelative(1.93f, -0.61f, 3.51f, -0.59f, 4.58f, -0.43f)
                lineTo(1.29f, 21.29f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.03f, 0f, 1.41f)
                curveToRelative(0.58f, 0.56f, 1.22f, 0.2f, 1.41f, 0f)
                lineTo(20.91f, 4.51f)
                curveToRelative(0.16f, 1.07f, 0.19f, 2.65f, -0.42f, 4.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.13f, 13.66f)
                curveToRelative(-0.53f, 0.17f, -0.82f, 0.73f, -0.65f, 1.26f)
                curveToRelative(0.61f, 1.93f, 0.59f, 3.51f, 0.43f, 4.58f)
                lineToRelative(-5.2f, -5.2f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(5.2f, 5.2f)
                curveToRelative(-1.07f, 0.16f, -2.65f, 0.19f, -4.58f, -0.42f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(1.44f, 0.46f, 2.73f, 0.61f, 3.83f, 0.61f)
                curveToRelative(2.23f, 0f, 3.62f, -0.64f, 3.71f, -0.68f)
                curveToRelative(0.21f, -0.1f, 0.38f, -0.27f, 0.47f, -0.47f)
                curveToRelative(0.06f, -0.13f, 1.46f, -3.17f, 0.07f, -7.54f)
                curveToRelative(-0.17f, -0.53f, -0.73f, -0.82f, -1.26f, -0.65f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.29f, 9.71f)
                curveToRelative(0.2f, 0.2f, 0.82f, 0.54f, 1.41f, 0f)
                curveToRelative(0.41f, -0.37f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(2.71f, 1.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(7f, 7f)
                close()
            }
        }.also { _ArrowsCross = it}
