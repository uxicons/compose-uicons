package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Rc.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.1f, 4.51f)
                lineTo(12.9f, 14.31f)
                curveToRelative(0.2f, 0.2f, 0.86f, 0.56f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(4.51f, 3.1f)
                curveToRelative(1.07f, -0.16f, 2.66f, -0.19f, 4.6f, 0.42f)
                curveToRelative(0.53f, 0.17f, 1.09f, -0.12f, 1.26f, -0.65f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.65f, -1.26f)
                curveToRelative(-4.38f, -1.4f, -7.43f, 0.01f, -7.56f, 0.07f)
                curveToRelative(-0.21f, 0.1f, -0.38f, 0.27f, -0.47f, 0.47f)
                curveToRelative(-0.06f, 0.13f, -1.47f, 3.17f, -0.07f, 7.56f)
                curveToRelative(0.14f, 0.42f, 0.62f, 0.86f, 1.26f, 0.65f)
                curveToRelative(0.52f, -0.17f, 0.82f, -0.73f, 0.65f, -1.26f)
                curveToRelative(-0.62f, -1.94f, -0.59f, -3.53f, -0.42f, -4.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.61f, 4.21f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.11f, -3.38f, 0.33f)
                curveToRelative(-0.54f, 0.12f, -0.88f, 0.66f, -0.75f, 1.2f)
                curveToRelative(0.12f, 0.54f, 0.66f, 0.88f, 1.2f, 0.75f)
                curveToRelative(0.83f, -0.19f, 1.79f, -0.28f, 2.93f, -0.28f)
                curveToRelative(4.44f, 0f, 7.39f, 1.26f, 7.39f, 7.39f)
                reflectiveCurveToRelative(-2.96f, 7.39f, -7.39f, 7.39f)
                reflectiveCurveToRelative(-7.39f, -1.26f, -7.39f, -7.39f)
                curveToRelative(0f, -1.1f, 0.1f, -2.08f, 0.29f, -2.92f)
                curveToRelative(0.12f, -0.54f, -0.21f, -1.07f, -0.75f, -1.2f)
                curveToRelative(-0.54f, -0.12f, -1.07f, 0.21f, -1.2f, 0.75f)
                curveToRelative(-0.23f, 0.98f, -0.34f, 2.12f, -0.34f, 3.37f)
                curveToRelative(0f, 8.33f, 5.02f, 9.39f, 9.39f, 9.39f)
                curveToRelative(4.03f, 0f, 9.39f, -0.97f, 9.39f, -9.39f)
                curveToRelative(0f, -8.32f, -5.02f, -9.39f, -9.39f, -9.39f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
