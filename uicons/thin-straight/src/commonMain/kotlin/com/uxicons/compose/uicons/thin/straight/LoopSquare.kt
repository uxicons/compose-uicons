package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LoopSquare: ImageVector? = null

val Icons.Ts.LoopSquare: ImageVector
    get() = _LoopSquare ?: UXIcon(name = "LoopSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.35f, 9.65f)
                lineToRelative(-4.35f, -4.35f)
                verticalLineToRelative(15.21f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6f, 24.0f)
                verticalLineToRelative(-1f)
                lineTo(15.5f, 23.0f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(18f, 5.29f)
                lineToRelative(-4.35f, 4.35f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.5f, -4.5f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(11.06f, 15.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.35f, 4.35f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.5f)
                lineTo(18f, 0f)
                lineTo(8.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.21f)
                lineTo(0.65f, 14.35f)
                lineTo(-0.06f, 15.06f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(4.5f, -4.5f)
                close()
            }
        }.also { _LoopSquare = it}
