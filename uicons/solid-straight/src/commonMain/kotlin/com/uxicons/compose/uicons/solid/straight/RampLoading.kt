package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Ss.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.68f, 19.66f)
                curveToRelative(0.47f, 0.94f, 0.42f, 2.03f, -0.13f, 2.92f)
                curveToRelative(-0.55f, 0.89f, -1.5f, 1.42f, -2.55f, 1.42f)
                lineTo(5.0f, 24f)
                curveToRelative(-1.05f, 0f, -2.0f, -0.53f, -2.55f, -1.42f)
                curveToRelative(-0.55f, -0.89f, -0.6f, -1.98f, -0.13f, -2.92f)
                lineToRelative(3.83f, -7.66f)
                horizontalLineToRelative(11.7f)
                lineToRelative(3.83f, 7.66f)
                close()
                moveTo(22f, 3f)
                lineTo(22f, 15.82f)
                lineToRelative(-2.98f, -5.82f)
                lineTo(4.98f, 10f)
                lineToRelative(-2.98f, 5.82f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _RampLoading = it}
