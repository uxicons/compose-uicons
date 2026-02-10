package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Bs.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.01f, 21f)
                lineTo(13.51f, 0f)
                horizontalLineToRelative(-3.01f)
                lineTo(1.71f, 21f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.99f)
                close()
                moveTo(16.35f, 15f)
                lineTo(7.47f, 15f)
                lineToRelative(1.26f, -3f)
                horizontalLineToRelative(6.4f)
                lineToRelative(1.21f, 3f)
                close()
                moveTo(11.98f, 4.23f)
                lineToRelative(1.93f, 4.77f)
                horizontalLineToRelative(-3.93f)
                lineToRelative(2.0f, -4.77f)
                close()
                moveTo(6.22f, 18f)
                horizontalLineToRelative(11.34f)
                lineToRelative(1.21f, 3f)
                lineTo(4.96f, 21f)
                lineToRelative(1.26f, -3f)
                close()
            }
        }.also { _TrafficCone = it}
