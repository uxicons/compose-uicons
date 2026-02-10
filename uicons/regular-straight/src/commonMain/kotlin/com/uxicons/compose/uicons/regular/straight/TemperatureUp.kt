package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemperatureUp: ImageVector? = null

val Icons.Rs.TemperatureUp: ImageVector
    get() = _TemperatureUp ?: UXIcon(name = "TemperatureUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14.17f)
                lineTo(8f, 4.88f)
                lineTo(6f, 4.88f)
                verticalLineToRelative(9.29f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(7f, 17.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17.98f)
                close()
                moveTo(12f, 4.99f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 0f)
                lineTo(2f, 12.1f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(7f, 21.98f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -8.72f)
                lineToRelative(0.33f, -0.3f)
                lineTo(4f, 4.99f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(7.98f)
                lineToRelative(0.33f, 0.3f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.29f, 5.29f)
                lineToRelative(1.41f, -1.41f)
                lineTo(20.41f, 0.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(14.29f, 3.88f)
                lineToRelative(1.41f, 1.41f)
                lineTo(18f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
            }
        }.also { _TemperatureUp = it}
