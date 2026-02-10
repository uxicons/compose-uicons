package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Ts.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.84f, 23f)
                lineTo(12.97f, 0.32f)
                lineToRelative(-0.12f, -0.32f)
                horizontalLineToRelative(-1.68f)
                lineTo(2.16f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.16f)
                close()
                moveTo(16.86f, 13f)
                lineTo(7.14f, 13f)
                lineToRelative(1.56f, -4f)
                horizontalLineToRelative(6.58f)
                lineToRelative(1.56f, 4f)
                close()
                moveTo(17.25f, 14f)
                lineToRelative(1.56f, 4f)
                lineTo(5.19f, 18f)
                lineToRelative(1.56f, -4f)
                horizontalLineToRelative(10.49f)
                close()
                moveTo(11.84f, 1f)
                horizontalLineToRelative(0.32f)
                lineToRelative(2.74f, 7f)
                horizontalLineToRelative(-5.8f)
                lineToRelative(2.74f, -7f)
                close()
                moveTo(4.8f, 19f)
                horizontalLineToRelative(14.4f)
                lineToRelative(1.56f, 4f)
                lineTo(3.23f, 23f)
                lineToRelative(1.56f, -4f)
                close()
            }
        }.also { _TrafficCone = it}
