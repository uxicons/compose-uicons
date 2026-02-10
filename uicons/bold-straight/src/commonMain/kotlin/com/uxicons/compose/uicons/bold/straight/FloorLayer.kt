package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Bs.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0.27f)
                lineTo(0f, 6.02f)
                verticalLineToRelative(3.89f)
                lineToRelative(12.0f, 5.75f)
                lineToRelative(12.0f, -5.79f)
                verticalLineToRelative(-3.85f)
                lineTo(12f, 0.27f)
                close()
                moveTo(19.03f, 6.96f)
                lineToRelative(-7.03f, 3.37f)
                lineToRelative(-7.03f, -3.37f)
                lineToRelative(7.03f, -3.37f)
                lineToRelative(7.03f, 3.37f)
                close()
                moveTo(12f, 18.95f)
                lineToRelative(12f, -5.75f)
                verticalLineToRelative(4.98f)
                lineToRelative(-12f, 5.75f)
                lineTo(0f, 18.18f)
                verticalLineToRelative(-4.98f)
                lineToRelative(12f, 5.75f)
                close()
            }
        }.also { _FloorLayer = it}
