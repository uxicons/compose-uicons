package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chocolate: ImageVector? = null

val Icons.Ss.Chocolate: ImageVector
    get() = _Chocolate ?: UXIcon(name = "Chocolate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 7.24f)
                lineTo(16.76f, 0.88f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineTo(0.88f, 12.52f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(6.36f, 6.36f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(23.12f, 11.48f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                close()
                moveTo(18.99f, 12.78f)
                lineTo(15.78f, 9.57f)
                lineToRelative(-2.4f, 2.4f)
                lineTo(16.6f, 15.18f)
                lineTo(15.18f, 16.6f)
                lineToRelative(-3.21f, -3.21f)
                lineToRelative(-2.34f, 2.34f)
                lineToRelative(3.21f, 3.21f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(8.21f, 17.14f)
                lineTo(6.15f, 19.2f)
                lineTo(4.74f, 17.79f)
                lineTo(6.8f, 15.72f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(2.34f, -2.34f)
                lineTo(7.4f, 8.82f)
                lineTo(8.82f, 7.4f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(-3.15f, -3.15f)
                lineTo(12.63f, 3.59f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(2.01f, -2.01f)
                lineTo(19.2f, 6.15f)
                lineTo(17.19f, 8.16f)
                lineToRelative(3.21f, 3.21f)
                close()
            }
        }.also { _Chocolate = it}
