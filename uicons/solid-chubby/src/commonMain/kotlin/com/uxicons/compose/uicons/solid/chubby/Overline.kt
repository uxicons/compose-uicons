package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Sc.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-5.38f, 0f, -8f, 2.94f, -8f, 9f)
                curveToRelative(0f, 6.14f, 2.54f, 9f, 8f, 9f)
                reflectiveCurveToRelative(8f, -2.86f, 8f, -9f)
                reflectiveCurveToRelative(-2.54f, -9f, -8f, -9f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-2.73f, 0f, -5f, -0.45f, -5f, -6f)
                curveToRelative(0f, -5.02f, 1.83f, -6f, 5f, -6f)
                curveToRelative(2.73f, 0f, 5f, 0.45f, 5f, 6f)
                curveToRelative(0f, 5.04f, -1.76f, 6f, -5f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.06f, 4.84f)
                curveToRelative(0.02f, -0.01f, 2.16f, -0.84f, 5.94f, -0.84f)
                reflectiveCurveToRelative(5.92f, 0.83f, 5.93f, 0.84f)
                curveToRelative(0.19f, 0.08f, 0.38f, 0.11f, 0.57f, 0.11f)
                curveToRelative(0.59f, 0f, 1.15f, -0.35f, 1.39f, -0.93f)
                curveToRelative(0.31f, -0.77f, -0.05f, -1.64f, -0.82f, -1.96f)
                curveToRelative(-0.11f, -0.04f, -2.65f, -1.06f, -7.07f, -1.06f)
                reflectiveCurveToRelative(-6.96f, 1.02f, -7.07f, 1.06f)
                curveToRelative(-0.76f, 0.31f, -1.13f, 1.18f, -0.82f, 1.95f)
                curveToRelative(0.31f, 0.77f, 1.18f, 1.14f, 1.95f, 0.83f)
                close()
            }
        }.also { _Overline = it}
