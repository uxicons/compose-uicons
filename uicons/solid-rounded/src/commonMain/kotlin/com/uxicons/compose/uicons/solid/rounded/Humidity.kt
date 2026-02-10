package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Sr.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.21f, 1.18f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.43f, 0f)
                curveTo(2.71f, 6.23f, -2.63f, 13.49f, 4.22f, 20.78f)
                arcToRelative(11.05f, 11.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.56f, 0f)
                curveTo(26.64f, 13.44f, 21.3f, 6.26f, 15.21f, 1.18f)
                close()
                moveTo(8f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                close()
                moveTo(10.83f, 16.55f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.66f, -1.11f)
                lineToRelative(4f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, 1.11f)
                close()
                moveTo(15f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                close()
            }
        }.also { _Humidity = it}
