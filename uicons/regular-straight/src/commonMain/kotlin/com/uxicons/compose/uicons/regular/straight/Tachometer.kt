package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Rs.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(17.99f, 21f)
                lineTo(6.01f, 21f)
                curveTo(-1.63f, 15.32f, 2.47f, 2.98f, 12f, 3f)
                curveTo(21.53f, 2.98f, 25.63f, 15.32f, 17.99f, 21f)
                close()
                moveTo(16.79f, 6.79f)
                lineTo(18.2f, 8.21f)
                lineTo(13.93f, 12.48f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, -1.41f)
                close()
            }
        }.also { _Tachometer = it}
