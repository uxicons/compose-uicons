package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSquare: ImageVector? = null

val Icons.Tr.PenSquare: ImageVector
    get() = _PenSquare ?: UXIcon(name = "PenSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(14.73f, 5.73f)
                lineTo(6.03f, 14.44f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.92f, 0f, 1.82f, -0.37f, 2.48f, -1.02f)
                lineToRelative(8.71f, -8.71f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                close()
                moveTo(8.85f, 17.27f)
                curveToRelative(-0.47f, 0.47f, -1.11f, 0.73f, -1.77f, 0.73f)
                horizontalLineToRelative(-1.09f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -0.67f, 0.26f, -1.3f, 0.73f, -1.77f)
                lineToRelative(6.6f, -6.6f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-6.6f, 6.6f)
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
