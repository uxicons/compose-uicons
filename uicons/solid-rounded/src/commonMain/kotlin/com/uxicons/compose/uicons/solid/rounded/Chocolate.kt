package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chocolate: ImageVector? = null

val Icons.Sr.Chocolate: ImageVector
    get() = _Chocolate ?: UXIcon(name = "Chocolate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.55f, 5.67f)
                lineTo(18.36f, 1.47f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                lineTo(1.47f, 11.29f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.06f)
                lineToRelative(4.19f, 4.19f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 0f)
                lineToRelative(9.82f, -9.82f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.55f, 5.67f)
                close()
                moveTo(18.64f, 12.4f)
                lineToRelative(-2.86f, -2.86f)
                lineToRelative(-2.4f, 2.4f)
                lineTo(16.24f, 14.8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-2.86f, -2.86f)
                lineTo(9.63f, 15.69f)
                lineToRelative(2.86f, 2.86f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(8.22f, 17.1f)
                lineTo(6.32f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(1.9f, -1.9f)
                lineTo(4.06f, 12.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(2.34f, -2.34f)
                lineTo(7.81f, 9.2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.23f, 7.78f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(2.4f, -2.4f)
                lineTo(11.62f, 5.39f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(1.77f, -1.77f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.96f, 6.36f)
                lineTo(17.19f, 8.13f)
                lineToRelative(2.86f, 2.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.64f, 12.4f)
                close()
            }
        }.also { _Chocolate = it}
