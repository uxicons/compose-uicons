package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintBrush: ImageVector? = null

val Icons.Rs.PaintBrush: ImageVector
    get() = _PaintBrush ?: UXIcon(name = "PaintBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.1f, 0.9f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, 0f)
                lineToRelative(-11.21f, 11.2f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -0.1f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.88f, 1.61f)
                curveToRelative(-1.92f, 1.92f, -2.43f, 8.02f, -2.52f, 9.22f)
                lineToRelative(-0.08f, 1.15f)
                lineToRelative(1.15f, -0.08f)
                curveToRelative(1.2f, -0.08f, 7.3f, -0.59f, 9.22f, -2.52f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -4.94f)
                lineToRelative(11.21f, -11.21f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.33f)
                close()
                moveTo(8.98f, 19.97f)
                curveToRelative(-0.93f, 0.93f, -4.27f, 1.56f, -6.77f, 1.83f)
                curveToRelative(0.28f, -2.6f, 0.94f, -5.88f, 1.83f, -6.77f)
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
