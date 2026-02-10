package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldMinus: ImageVector? = null

val Icons.Rc.ShieldMinus: ImageVector
    get() = _ShieldMinus ?: UXIcon(name = "ShieldMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(20.91f, 18.53f)
                curveToRelative(-2.35f, 2.49f, -7.99f, 4.23f, -8.62f, 4.42f)
                curveToRelative(-0.19f, 0.06f, -0.39f, 0.06f, -0.58f, 0f)
                curveToRelative(-0.64f, -0.19f, -6.28f, -1.93f, -8.62f, -4.42f)
                curveToRelative(-2.13f, -2.26f, -0.57f, -12.44f, -0.04f, -15.04f)
                curveToRelative(0.06f, -0.28f, 0.23f, -0.52f, 0.47f, -0.66f)
                curveToRelative(0.01f, -0.06f, 3.47f, -1.83f, 8.56f, -1.83f)
                curveToRelative(5.18f, 0f, 8.26f, 1.76f, 8.38f, 1.83f)
                curveToRelative(0.24f, 0.14f, 0.42f, 0.38f, 0.47f, 0.66f)
                curveToRelative(0.53f, 2.6f, 2.09f, 12.77f, -0.04f, 15.04f)
                close()
                moveTo(19.09f, 4.37f)
                curveToRelative(-0.9f, -0.42f, -3.38f, -1.37f, -7.0f, -1.37f)
                curveToRelative(-3.58f, 0f, -6.31f, 0.95f, -7.17f, 1.37f)
                curveToRelative(-1.14f, 5.84f, -1.17f, 11.94f, -0.37f, 12.79f)
                curveToRelative(1.54f, 1.64f, 5.4f, 3.15f, 7.46f, 3.79f)
                curveToRelative(2.06f, -0.65f, 5.91f, -2.15f, 7.45f, -3.79f)
                curveToRelative(0.8f, -0.84f, 0.77f, -6.95f, -0.37f, -12.79f)
                close()
            }
        }.also { _ShieldMinus = it}
