package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LoopSquare: ImageVector? = null

val Icons.Ss.LoopSquare: ImageVector
    get() = _LoopSquare ?: UXIcon(name = "LoopSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 10.5f)
                lineToRelative(-2.5f, -2.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(18f, 8f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(9.91f, 14.91f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(6f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                lineTo(18f, 0f)
                lineTo(8f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(12f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.09f, 14.91f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
        }.also { _LoopSquare = it}
