package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureLow: ImageVector? = null

val Icons.Rs.TemperatureLow: ImageVector
    get() = _TemperatureLow ?: UXIcon(name = "TemperatureLow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.18f)
                lineTo(12f, 12f)
                lineTo(10f, 12f)
                verticalLineToRelative(2.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(11f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18f)
                close()
                moveTo(16f, 5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                verticalLineToRelative(7.11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(11f, 22f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -8.72f)
                lineToRelative(0.33f, -0.3f)
                lineTo(8f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(7.98f)
                lineToRelative(0.33f, 0.3f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                close()
                moveTo(21f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(21f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                close()
            }
        }.also { _TemperatureLow = it}
