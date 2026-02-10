package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSquare: ImageVector? = null

val Icons.Ts.PenSquare: ImageVector
    get() = _PenSquare ?: UXIcon(name = "PenSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(14.73f, 5.73f)
                lineTo(5f, 15.46f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(3.54f)
                lineToRelative(9.73f, -9.73f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                close()
                moveTo(8.12f, 18f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                lineToRelative(7.34f, -7.34f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-7.34f, 7.34f)
                close()
                moveTo(17.56f, 8.56f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.4f, -1.4f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                close()
            }
        }.also { _PenSquare = it}
