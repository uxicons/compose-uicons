package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Barefoot: ImageVector? = null

val Icons.Ts.Barefoot: ImageVector
    get() = _Barefoot ?: UXIcon(name = "Barefoot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6.46f)
                curveToRelative(-1.37f, 0f, -2.66f, -0.6f, -3.56f, -1.65f)
                curveToRelative(-3.5f, -4.09f, -6.67f, -6.8f, -8.49f, -7.26f)
                curveToRelative(-2.22f, -0.56f, -3.5f, -1.99f, -3.5f, -3.93f)
                curveToRelative(0f, -1.6f, 0.88f, -2.33f, 1.74f, -3.04f)
                curveToRelative(0.53f, -0.44f, 1.08f, -0.89f, 1.44f, -1.59f)
                lineTo(6.23f, 0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(-3.26f, 6.98f)
                curveToRelative(-0.46f, 0.89f, -1.12f, 1.44f, -1.7f, 1.92f)
                curveToRelative(-0.8f, 0.66f, -1.38f, 1.14f, -1.38f, 2.27f)
                curveToRelative(0f, 1.98f, 1.72f, 2.7f, 2.74f, 2.96f)
                curveToRelative(2.79f, 0.7f, 6.84f, 5.05f, 9.01f, 7.58f)
                curveToRelative(0.7f, 0.82f, 1.73f, 1.3f, 2.8f, 1.3f)
                horizontalLineToRelative(6.46f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.85f)
                reflectiveCurveToRelative(-2.73f, -4.07f, -3.89f, -5.97f)
                curveToRelative(-1.22f, -1.99f, -2.37f, -3.88f, -3.64f, -5.31f)
                lineToRelative(-0.22f, -0.24f)
                lineTo(15.75f, 0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(-4.26f, 9.3f)
                curveToRelative(1.24f, 1.46f, 2.35f, 3.28f, 3.53f, 5.21f)
                curveToRelative(1.11f, 1.81f, 2.25f, 3.68f, 3.63f, 5.49f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Barefoot = it}
