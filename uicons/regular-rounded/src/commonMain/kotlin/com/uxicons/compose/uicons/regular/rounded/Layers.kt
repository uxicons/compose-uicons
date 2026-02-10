package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Layers: ImageVector? = null

val Icons.Rr.Layers: ImageVector
    get() = _Layers ?: UXIcon(name = "Layers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.48f, 10.97f)
                lineTo(12f, 17.27f)
                lineTo(1.51f, 10.97f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.49f, 12.69f)
                lineToRelative(11f, 6.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.03f, 0f)
                lineToRelative(11f, -6.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.03f, -1.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.48f, 15.54f)
                lineTo(12f, 21.83f)
                lineTo(1.51f, 15.54f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.49f, 17.26f)
                lineToRelative(11f, 6.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.03f, 0f)
                lineToRelative(11f, -6.6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.03f, -1.72f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.77f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.53f, -0.42f)
                lineTo(0.48f, 8.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.71f)
                lineTo(10.47f, 0.65f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.06f, 0f)
                lineToRelative(9.98f, 5.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.71f)
                lineToRelative(-9.98f, 5.99f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.77f)
                close()
                moveTo(2.94f, 7.5f)
                lineTo(11.5f, 12.63f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 0f)
                lineTo(21.06f, 7.5f)
                lineTo(12.5f, 2.37f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 0f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Layers = it}
