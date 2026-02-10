package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Bs.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.5f)
                close()
                moveTo(15.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 15f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(3.2f)
                lineTo(16f, 10f)
                lineTo(12.8f, 10f)
                close()
                moveTo(19.07f, 21.07f)
                horizontalLineToRelative(0f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.01f, -14.15f)
                lineTo(12f, 0.01f)
                lineTo(4.93f, 6.93f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.07f, 21.07f)
                close()
                moveTo(16.95f, 9.05f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9.91f, 0.01f)
                lineTo(12f, 4.21f)
                close()
            }
        }.also { _Humidity = it}
