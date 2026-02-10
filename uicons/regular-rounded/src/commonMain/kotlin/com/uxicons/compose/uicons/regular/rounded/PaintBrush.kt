package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintBrush: ImageVector? = null

val Icons.Rr.PaintBrush: ImageVector
    get() = _PaintBrush ?: UXIcon(name = "PaintBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.1f, 0.9f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, 0f)
                lineToRelative(-11.21f, 11.2f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -0.1f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.88f, 1.61f)
                curveToRelative(-1.35f, 1.35f, -2.31f, 4.98f, -2.59f, 6.95f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, 3.44f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, -0.03f)
                curveToRelative(1.97f, -0.28f, 5.6f, -1.24f, 6.95f, -2.59f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -4.94f)
                lineToRelative(11.21f, -11.21f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.33f)
                close()
                moveTo(8.98f, 19.97f)
                curveToRelative(-0.72f, 0.72f, -3.5f, 1.69f, -5.82f, 2.02f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, -0.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.28f, -0.86f)
                curveToRelative(0.33f, -2.32f, 1.3f, -5.1f, 2.02f, -5.82f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.94f, 4.94f)
                close()
                moveTo(21.69f, 3.82f)
                lineTo(11.07f, 14.44f)
                arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.51f)
                lineToRelative(10.62f, -10.62f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.0f, 1.5f)
                close()
            }
        }.also { _PaintBrush = it}
