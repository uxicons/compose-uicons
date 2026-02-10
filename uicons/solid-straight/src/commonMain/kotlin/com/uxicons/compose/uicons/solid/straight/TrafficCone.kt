package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Ss.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.33f, 11f)
                horizontalLineToRelative(11.2f)
                lineToRelative(1.58f, 4f)
                lineTo(4.69f, 15f)
                lineToRelative(1.64f, -4f)
                close()
                moveTo(16.74f, 9f)
                lineTo(13.18f, 0f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(-3.68f, 9f)
                horizontalLineToRelative(9.59f)
                close()
                moveTo(19.9f, 17f)
                lineTo(3.87f, 17f)
                lineToRelative(-2.05f, 5f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(-1.98f, -5f)
                close()
            }
        }.also { _TrafficCone = it}
