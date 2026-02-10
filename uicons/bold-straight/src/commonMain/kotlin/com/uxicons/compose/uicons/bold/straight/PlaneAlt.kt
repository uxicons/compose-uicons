package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneAlt: ImageVector? = null

val Icons.Bs.PlaneAlt: ImageVector
    get() = _PlaneAlt ?: UXIcon(name = "PlaneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 11.34f)
                arcTo(4.11f, 4.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.88f, 8f)
                lineTo(17.88f, 8f)
                lineTo(14.42f, 1.78f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.42f, 0f)
                lineTo(6.41f, 0f)
                lineToRelative(2.7f, 8f)
                lineTo(4.93f, 8f)
                lineToRelative(-0.62f, -0.93f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, 6f)
                lineTo(0f, 6f)
                lineToRelative(2.21f, 6f)
                lineToRelative(-2.2f, 6f)
                horizontalLineToRelative(2.31f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1.07f)
                lineTo(4.94f, 16f)
                lineTo(9.11f, 16f)
                lineToRelative(-2.7f, 8f)
                horizontalLineToRelative(5.01f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.99f, -1.76f)
                lineTo(17.88f, 16f)
                horizontalLineToRelative(2.13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.95f, -4.66f)
                close()
                moveTo(20.77f, 12.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.76f, 0.35f)
                lineTo(16.12f, 13f)
                lineToRelative(-4.34f, 7.79f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.36f, 0.21f)
                lineTo(10.59f, 21f)
                lineToRelative(2.7f, -8f)
                lineTo(6f, 13f)
                lineTo(6f, 11f)
                horizontalLineToRelative(7.29f)
                lineToRelative(-2.7f, -8f)
                horizontalLineToRelative(0.83f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, 0.23f)
                lineTo(16.12f, 11f)
                horizontalLineToRelative(3.76f)
                arcTo(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.82f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.77f, 12.65f)
                close()
            }
        }.also { _PlaneAlt = it}
