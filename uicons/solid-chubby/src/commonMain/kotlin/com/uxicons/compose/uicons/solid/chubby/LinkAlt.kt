package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkAlt: ImageVector? = null

val Icons.Sc.LinkAlt: ImageVector
    get() = _LinkAlt ?: UXIcon(name = "LinkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.96f, 17.82f)
                curveToRelative(-3.54f, 3.38f, -4.87f, 2.05f, -5.85f, 1.07f)
                curveToRelative(-1.07f, -1.07f, -2.4f, -2.4f, 1.38f, -6.18f)
                curveToRelative(1.64f, -1.65f, 3.02f, -2.48f, 4.09f, -2.48f)
                curveToRelative(0.42f, 0f, 1.1f, 0.11f, 2.08f, 1.1f)
                curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0.0f, -2.12f)
                curveToRelative(-3.03f, -3.03f, -6.39f, -2.64f, -10.42f, 1.38f)
                curveToRelative(-3.97f, 3.97f, -4.42f, 7.38f, -1.38f, 10.43f)
                curveToRelative(1.32f, 1.33f, 2.72f, 1.99f, 4.19f, 1.99f)
                curveToRelative(1.81f, 0f, 3.75f, -1.0f, 5.85f, -3.01f)
                curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.05f, -2.12f)
                curveToRelative(-0.57f, -0.6f, -1.52f, -0.62f, -2.12f, -0.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.01f, 2.98f)
                curveToRelative(-2.95f, -2.96f, -6.24f, -2.62f, -10.04f, 1.02f)
                curveToRelative(-0.6f, 0.57f, -0.62f, 1.52f, -0.05f, 2.12f)
                reflectiveCurveToRelative(1.52f, 0.62f, 2.12f, 0.05f)
                curveToRelative(3.54f, -3.38f, 4.87f, -2.05f, 5.85f, -1.07f)
                curveToRelative(1.07f, 1.07f, 2.4f, 2.4f, -1.38f, 6.18f)
                curveToRelative(-1.65f, 1.65f, -3.03f, 2.49f, -4.09f, 2.49f)
                curveToRelative(-0.42f, 0f, -1.09f, -0.12f, -2.08f, -1.11f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, -0.0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                curveToRelative(1.34f, 1.34f, 2.71f, 1.99f, 4.21f, 1.99f)
                curveToRelative(1.94f, 0f, 3.91f, -1.07f, 6.21f, -3.37f)
                curveToRelative(3.97f, -3.97f, 4.42f, -7.38f, 1.38f, -10.42f)
                close()
            }
        }.also { _LinkAlt = it}
