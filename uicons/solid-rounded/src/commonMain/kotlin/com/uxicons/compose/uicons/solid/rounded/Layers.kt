package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Layers: ImageVector? = null

val Icons.Sr.Layers: ImageVector
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
                moveTo(0.48f, 8.36f)
                lineToRelative(9.98f, 5.99f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.06f, 0f)
                lineToRelative(9.98f, -5.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.71f)
                lineTo(13.53f, 0.65f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.06f, 0f)
                lineTo(0.48f, 6.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.71f)
                close()
            }
        }.also { _Layers = it}
