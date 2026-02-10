package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Sr.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                verticalLineToRelative(5f)
                lineTo(13f, 11f)
                lineTo(13f, 6f)
                close()
                moveTo(11f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(9f)
                close()
                moveTo(18f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(16f, 13f)
                lineTo(8f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(6f, 13f)
                lineTo(2f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.28f, 4.93f)
                lineTo(4.14f, 22.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 1.03f)
                lineTo(8.57f, 19f)
                horizontalLineToRelative(6.87f)
                lineToRelative(2.71f, 4.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, -1.03f)
                lineToRelative(-2.13f, -3.56f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 14f)
                lineTo(22f, 13f)
                lineTo(18f, 13f)
                close()
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, 4f)
                lineTo(21.9f, 4f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                close()
            }
        }.also { _Subway = it}
