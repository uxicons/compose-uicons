package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Sr.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.4f, 24f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -6.4f)
                curveToRelative(0f, -3.06f, 3.95f, -4.33f, 6.29f, -4.59f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, 0.29f)
                lineToRelative(3.6f, 3.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, 0.82f)
                curveToRelative(-0.27f, 2.33f, -1.54f, 6.29f, -4.59f, 6.29f)
                close()
                moveTo(10.16f, 9.23f)
                lineTo(7.88f, 11.24f)
                lineTo(12.76f, 16.12f)
                lineTo(14.77f, 13.84f)
                close()
                moveTo(23.28f, 0.72f)
                arcToRelative(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.34f, -0.11f)
                lineToRelative(-8.28f, 7.29f)
                lineToRelative(4.44f, 4.44f)
                lineToRelative(7.3f, -8.29f)
                arcToRelative(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, -3.33f)
                close()
            }
        }.also { _MakeupBrush = it}
