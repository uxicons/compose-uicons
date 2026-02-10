package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _P: ImageVector? = null

val Icons.Tr.P: ImageVector
    get() = _P ?: UXIcon(name = "P") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                lineTo(14.5f, 0f)
                curveToRelative(9.93f, 0.35f, 9.92f, 14.65f, 0f, 15f)
                lineTo(3f, 15f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(3f, 14f)
                lineTo(14.5f, 14f)
                curveToRelative(8.59f, -0.27f, 8.59f, -12.73f, 0f, -13f)
                lineTo(6.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(3f, 14f)
                close()
            }
        }.also { _P = it}
