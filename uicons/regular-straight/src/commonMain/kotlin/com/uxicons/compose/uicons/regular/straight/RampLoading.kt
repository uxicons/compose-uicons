package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Rs.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15.82f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 15.82f)
                lineToRelative(-2f, -4f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 11.82f)
                lineToRelative(-2f, 4f)
                close()
                moveTo(21.55f, 22.58f)
                curveToRelative(0.55f, -0.89f, 0.6f, -1.98f, 0.13f, -2.92f)
                lineToRelative(-3.83f, -7.66f)
                lineTo(6.15f, 12f)
                lineToRelative(-3.83f, 7.66f)
                curveToRelative(-0.47f, 0.94f, -0.42f, 2.03f, 0.13f, 2.92f)
                curveToRelative(0.55f, 0.89f, 1.5f, 1.42f, 2.55f, 1.42f)
                horizontalLineToRelative(13.99f)
                curveToRelative(1.05f, 0f, 2.0f, -0.53f, 2.55f, -1.42f)
                close()
                moveTo(16.61f, 14f)
                lineToRelative(3.28f, 6.55f)
                curveToRelative(0.23f, 0.45f, 0.04f, 0.83f, -0.04f, 0.97f)
                curveToRelative(-0.09f, 0.14f, -0.35f, 0.47f, -0.85f, 0.47f)
                lineTo(5.0f, 22f)
                curveToRelative(-0.5f, 0f, -0.76f, -0.33f, -0.85f, -0.47f)
                curveToRelative(-0.09f, -0.14f, -0.27f, -0.52f, -0.04f, -0.97f)
                lineToRelative(3.28f, -6.55f)
                horizontalLineToRelative(9.23f)
                close()
            }
        }.also { _RampLoading = it}
