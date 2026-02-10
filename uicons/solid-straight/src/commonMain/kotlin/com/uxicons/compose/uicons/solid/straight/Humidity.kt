package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Ss.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.06f, 6.92f)
                lineTo(12f, 0.01f)
                lineTo(4.93f, 6.93f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.13f, -0.01f)
                close()
                moveTo(8f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11f)
                close()
                moveTo(10.77f, 18f)
                lineTo(8.43f, 18f)
                lineToRelative(4.8f, -8f)
                horizontalLineToRelative(2.33f)
                close()
                moveTo(15f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 18f)
                close()
            }
        }.also { _Humidity = it}
