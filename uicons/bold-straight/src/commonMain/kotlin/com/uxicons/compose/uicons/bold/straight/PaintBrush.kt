package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintBrush: ImageVector? = null

val Icons.Bs.PaintBrush: ImageVector
    get() = _PaintBrush ?: UXIcon(name = "PaintBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.83f, 1.17f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.63f, 0f)
                lineToRelative(-9.85f, 9.85f)
                curveToRelative(-0.12f, -0.01f, -0.23f, -0.02f, -0.34f, -0.02f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 1.75f)
                curveToRelative(-2.05f, 2.05f, -2.56f, 8.29f, -2.64f, 9.52f)
                lineToRelative(-0.11f, 1.71f)
                lineToRelative(1.71f, -0.11f)
                curveToRelative(1.23f, -0.08f, 7.47f, -0.59f, 9.52f, -2.64f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, -4.57f)
                lineToRelative(9.87f, -9.87f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.63f)
                close()
                moveTo(9.12f, 19.11f)
                curveToRelative(-0.68f, 0.68f, -3.28f, 1.29f, -5.84f, 1.6f)
                curveToRelative(0.31f, -2.56f, 0.92f, -5.16f, 1.6f, -5.84f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.24f, 4.24f)
                close()
                moveTo(20.71f, 4.68f)
                lineTo(11.87f, 13.52f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, -0.77f)
                arcToRelative(6.21f, 6.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.76f, -0.63f)
                lineToRelative(8.83f, -8.83f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.39f, 0f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.39f)
                close()
            }
        }.also { _PaintBrush = it}
