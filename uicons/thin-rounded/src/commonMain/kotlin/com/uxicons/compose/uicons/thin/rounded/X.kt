package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _X: ImageVector? = null

val Icons.Tr.X: ImageVector
    get() = _X ?: UXIcon(name = "X") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.65f, 12f)
                lineTo(21.89f, 0.82f)
                curveToRelative(0.18f, -0.21f, 0.15f, -0.53f, -0.07f, -0.7f)
                curveToRelative(-0.21f, -0.18f, -0.53f, -0.15f, -0.7f, 0.07f)
                lineTo(12f, 11.21f)
                lineTo(2.89f, 0.18f)
                curveToRelative(-0.18f, -0.21f, -0.49f, -0.24f, -0.7f, -0.07f)
                curveToRelative(-0.21f, 0.18f, -0.24f, 0.49f, -0.07f, 0.7f)
                lineTo(11.35f, 12f)
                lineTo(2.11f, 23.18f)
                curveToRelative(-0.18f, 0.21f, -0.15f, 0.53f, 0.07f, 0.7f)
                curveToRelative(0.21f, 0.17f, 0.53f, 0.15f, 0.7f, -0.07f)
                lineTo(12f, 12.79f)
                lineToRelative(9.11f, 11.03f)
                curveToRelative(0.18f, 0.21f, 0.49f, 0.24f, 0.7f, 0.07f)
                curveToRelative(0.21f, -0.18f, 0.24f, -0.49f, 0.07f, -0.7f)
                lineTo(12.65f, 12f)
                close()
            }
        }.also { _X = it}
