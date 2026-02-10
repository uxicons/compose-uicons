package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureDown: ImageVector? = null

val Icons.Rs.TemperatureDown: ImageVector
    get() = _TemperatureDown ?: UXIcon(name = "TemperatureDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14.18f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineToRelative(2.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(7f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18f)
                close()
                moveTo(12f, 5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineToRelative(7.11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(7f, 22f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -8.72f)
                lineToRelative(0.33f, -0.3f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(7.98f)
                lineToRelative(0.33f, 0.3f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 22f)
                close()
                moveTo(15.71f, 6.71f)
                lineTo(14.29f, 8.12f)
                lineToRelative(3.29f, 3.29f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 0f)
                lineToRelative(3.29f, -3.29f)
                lineTo(22.29f, 6.71f)
                lineTo(20f, 9f)
                verticalLineTo(0f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                close()
            }
        }.also { _TemperatureDown = it}
