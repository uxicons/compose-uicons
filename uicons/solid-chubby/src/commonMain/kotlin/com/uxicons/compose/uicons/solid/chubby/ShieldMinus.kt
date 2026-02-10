package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldMinus: ImageVector? = null

val Icons.Sc.ShieldMinus: ImageVector
    get() = _ShieldMinus ?: UXIcon(name = "ShieldMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.95f, 3.5f)
                curveToRelative(-0.06f, -0.28f, -0.23f, -0.52f, -0.47f, -0.66f)
                curveToRelative(-0.13f, -0.08f, -3.2f, -1.83f, -8.38f, -1.83f)
                curveToRelative(-4.99f, -0.09f, -8.56f, 1.78f, -8.56f, 1.83f)
                curveToRelative(-0.24f, 0.14f, -0.42f, 0.38f, -0.47f, 0.66f)
                curveToRelative(-0.53f, 2.6f, -2.09f, 12.77f, 0.04f, 15.04f)
                curveToRelative(2.35f, 2.49f, 7.99f, 4.23f, 8.62f, 4.42f)
                curveToRelative(0.19f, 0.06f, 0.39f, 0.06f, 0.58f, 0f)
                curveToRelative(0.64f, -0.19f, 6.27f, -1.93f, 8.62f, -4.42f)
                reflectiveQuadToRelative(0f, 0f)
                curveToRelative(2.13f, -2.26f, 0.57f, -12.44f, 0.04f, -15.04f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ShieldMinus = it}
