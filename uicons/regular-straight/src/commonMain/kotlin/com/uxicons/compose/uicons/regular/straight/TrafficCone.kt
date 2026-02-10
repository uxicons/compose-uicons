package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrafficCone: ImageVector? = null

val Icons.Rs.TrafficCone: ImageVector
    get() = _TrafficCone ?: UXIcon(name = "TrafficCone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.88f, 22f)
                lineTo(13.18f, 0f)
                horizontalLineToRelative(-2.35f)
                lineTo(1.83f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.12f)
                close()
                moveTo(17.36f, 16f)
                lineTo(6.44f, 16f)
                lineToRelative(1.64f, -4f)
                horizontalLineToRelative(7.69f)
                lineToRelative(1.58f, 4f)
                close()
                moveTo(11.99f, 2.44f)
                lineToRelative(2.99f, 7.56f)
                horizontalLineToRelative(-6.08f)
                lineToRelative(3.1f, -7.56f)
                close()
                moveTo(5.62f, 18f)
                horizontalLineToRelative(12.52f)
                lineToRelative(1.58f, 4f)
                lineTo(3.99f, 22f)
                lineToRelative(1.64f, -4f)
                close()
            }
        }.also { _TrafficCone = it}
