package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Ss.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineTo(5.37f, 23f)
                lineTo(18.63f, 23f)
                lineToRelative(0.26f, -0.18f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
                moveTo(12f, 15f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.51f, -3.93f)
                lineToRelative(4.78f, -4.78f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.78f, 4.78f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.also { _Tachometer = it}
