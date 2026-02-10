package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LoopSquare: ImageVector? = null

val Icons.Br.LoopSquare: ImageVector
    get() = _LoopSquare ?: UXIcon(name = "LoopSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.92f, 10f)
            horizontalLineToRelative(-1.92f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(-1.92f)
            curveToRelative(-0.96f, 0f, -1.44f, -1.16f, -0.76f, -1.84f)
            lineToRelative(3.42f, -3.24f)
            curveToRelative(0.42f, -0.42f, 1.11f, -0.42f, 1.53f, 0f)
            lineToRelative(3.42f, 3.24f)
            curveToRelative(0.68f, 0.68f, 0.2f, 1.84f, -0.76f, 1.84f)
            close()
            moveTo(9.68f, 15.84f)
            curveToRelative(0.68f, -0.68f, 0.2f, -1.84f, -0.76f, -1.84f)
            horizontalLineToRelative(-1.92f)
            lineTo(7f, 6.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-1.92f)
            curveToRelative(-0.96f, 0f, -1.44f, 1.16f, -0.76f, 1.84f)
            lineToRelative(3.42f, 3.24f)
            curveToRelative(0.42f, 0.42f, 1.11f, 0.42f, 1.53f, 0f)
            lineToRelative(3.42f, -3.24f)
            close()
        }
    }.also { _LoopSquare = it }
