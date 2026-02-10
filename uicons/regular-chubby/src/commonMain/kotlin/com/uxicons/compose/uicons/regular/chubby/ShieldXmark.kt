package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldXmark: ImageVector? = null

val Icons.Rc.ShieldXmark: ImageVector
    get() = _ShieldXmark ?: UXIcon(name = "ShieldXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.95f, 3.5f)
                curveToRelative(-0.06f, -0.28f, -0.23f, -0.52f, -0.47f, -0.66f)
                curveToRelative(-0.13f, -0.08f, -3.2f, -1.83f, -8.38f, -1.83f)
                curveToRelative(-5.09f, 0f, -8.56f, 1.78f, -8.56f, 1.83f)
                curveToRelative(-0.24f, 0.14f, -0.42f, 0.38f, -0.47f, 0.66f)
                curveToRelative(-0.53f, 2.6f, -2.09f, 12.77f, 0.04f, 15.04f)
                curveToRelative(2.35f, 2.49f, 7.99f, 4.23f, 8.62f, 4.42f)
                curveToRelative(0.19f, 0.06f, 0.39f, 0.06f, 0.58f, 0f)
                curveToRelative(0.64f, -0.19f, 6.27f, -1.93f, 8.62f, -4.42f)
                curveToRelative(2.13f, -2.26f, 0.57f, -12.44f, 0.04f, -15.04f)
                close()
                moveTo(19.45f, 17.16f)
                curveToRelative(-1.54f, 1.64f, -5.39f, 3.15f, -7.45f, 3.79f)
                curveToRelative(-2.06f, -0.65f, -5.91f, -2.15f, -7.46f, -3.79f)
                curveToRelative(-0.8f, -0.85f, -0.76f, -6.95f, 0.37f, -12.79f)
                curveToRelative(0.85f, -0.42f, 3.58f, -1.37f, 7.17f, -1.37f)
                curveToRelative(3.63f, 0f, 6.1f, 0.96f, 7.0f, 1.37f)
                curveToRelative(1.14f, 5.84f, 1.17f, 11.95f, 0.37f, 12.79f)
                close()
                moveTo(15.71f, 9.21f)
                lineTo(13.41f, 11.5f)
                lineTo(15.71f, 13.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _ShieldXmark = it}
