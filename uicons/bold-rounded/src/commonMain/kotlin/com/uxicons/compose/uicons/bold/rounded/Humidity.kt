package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Br.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.74f, 5.11f)
            lineTo(16f, 1.64f)
            arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.98f, -0.03f)
            lineTo(4.22f, 5.15f)
            arcTo(11.02f, 11.02f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19.78f, 20.76f)
            arcTo(11.1f, 11.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.74f, 5.11f)
            close()
            moveTo(17.65f, 18.65f)
            horizontalLineToRelative(0f)
            arcTo(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.3f, 7.3f)
            lineToRelative(3.8f, -3.52f)
            arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.83f, 0.03f)
            lineToRelative(3.72f, 3.45f)
            arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.65f, 18.65f)
            close()
            moveTo(15.72f, 10.37f)
            lineTo(10.72f, 17.37f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.44f, -1.74f)
            lineToRelative(5f, -7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.44f, 1.74f)
            close()
            moveTo(10f, 9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9.5f)
            close()
            moveTo(15.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 15f)
            close()
        }
    }.also { _Humidity = it }
