package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sleigh: ImageVector? = null

val Icons.Ss.Sleigh: ImageVector
    get() = _Sleigh ?: UXIcon(name = "Sleigh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 6f)
                lineTo(18f, 6f)
                lineTo(18f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(11.69f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -0.76f)
                lineTo(9.85f, 4.79f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 12f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(6f, 17f)
                verticalLineToRelative(4f)
                lineTo(0f, 21f)
                verticalLineToRelative(2f)
                lineTo(20f, 23f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(22f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(18f, 21f)
                lineTo(18f, 17f)
                close()
                moveTo(16f, 21f)
                lineTo(8f, 21f)
                lineTo(8f, 17f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Sleigh = it}
