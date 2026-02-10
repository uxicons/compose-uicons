package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StopSquare: ImageVector? = null

val Icons.Ts.StopSquare: ImageVector
    get() = _StopSquare ?: UXIcon(name = "StopSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(10f)
                lineTo(17f, 7f)
                lineTo(7f, 7f)
                verticalLineToRelative(10f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                lineTo(8f, 16f)
                lineTo(8f, 8f)
                close()
            }
        }.also { _StopSquare = it}
