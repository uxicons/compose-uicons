package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Sc.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.17f, 2.58f)
                curveToRelative(-0.07f, -0.33f, -0.3f, -0.6f, -0.6f, -0.72f)
                curveToRelative(-0.08f, -0.03f, -1.27f, -0.51f, -3.02f, -0.86f)
                curveToRelative(-0.09f, 1.05f, -0.23f, 1.67f, -0.24f, 1.7f)
                curveToRelative(-0.07f, 0.32f, -0.3f, 0.58f, -0.6f, 0.7f)
                curveToRelative(-0.05f, 0.02f, -1.28f, 0.51f, -2.71f, 0.51f)
                curveToRelative(-1.38f, 0f, -2.64f, -0.48f, -2.7f, -0.5f)
                curveToRelative(-0.31f, -0.12f, -0.54f, -0.39f, -0.61f, -0.71f)
                curveToRelative(-0.01f, -0.03f, -0.15f, -0.65f, -0.24f, -1.7f)
                curveToRelative(-1.73f, 0.35f, -2.93f, 0.82f, -3.01f, 0.85f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.61f, 0.73f)
                curveToRelative(-0.03f, 0.16f, -0.83f, 4.3f, -0.83f, 9.38f)
                reflectiveCurveToRelative(0.79f, 8.93f, 0.83f, 9.09f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.61f, 0.62f, 0.73f)
                curveToRelative(0.13f, 0.05f, 3.19f, 1.22f, 6.55f, 1.22f)
                curveToRelative(3.48f, 0f, 6.44f, -1.18f, 6.57f, -1.23f)
                curveToRelative(0.31f, -0.12f, 0.54f, -0.4f, 0.61f, -0.72f)
                curveToRelative(0.03f, -0.16f, 0.83f, -3.98f, 0.83f, -9.09f)
                curveToRelative(0f, -5.15f, -0.79f, -9.22f, -0.83f, -9.38f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MobileNotch = it}
