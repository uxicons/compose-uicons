package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSquare: ImageVector? = null

val Icons.Bs.PenSquare: ImageVector
    get() = _PenSquare ?: UXIcon(name = "PenSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.15f, 9.77f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(-5.15f, 5.15f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                lineToRelative(5.15f, -5.15f)
                close()
                moveTo(14.28f, 6.64f)
                lineToRelative(-1.01f, 1.01f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(1.01f, -1.01f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                reflectiveCurveToRelative(-2.23f, -0.85f, -3.09f, 0f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _PenSquare = it}
