package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Rs.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.93f, 6.93f)
                lineTo(12f, 0.01f)
                lineToRelative(7.06f, 6.91f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 14.15f)
                horizontalLineToRelative(0f)
                arcTo(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2.81f)
                lineTo(6.33f, 8.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.32f, -0.01f)
                close()
                moveTo(9f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10f)
                close()
                moveTo(15f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16f)
                close()
                moveTo(8.43f, 18f)
                horizontalLineToRelative(2.33f)
                lineToRelative(4.8f, -8f)
                lineTo(13.23f, 10f)
                close()
            }
        }.also { _Humidity = it}
