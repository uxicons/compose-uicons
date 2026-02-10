package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Ss.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 22.82f)
                lineTo(0f, 17.55f)
                verticalLineToRelative(-3.38f)
                lineToRelative(11f, 5.28f)
                verticalLineToRelative(3.37f)
                close()
                moveTo(13f, 22.82f)
                lineToRelative(11f, -5.31f)
                verticalLineToRelative(-3.32f)
                lineToRelative(-11f, 5.27f)
                verticalLineToRelative(3.37f)
                close()
                moveTo(12f, 0.71f)
                lineTo(0f, 6.5f)
                verticalLineToRelative(5.54f)
                lineToRelative(11f, 5.27f)
                verticalLineToRelative(-3.37f)
                lineTo(2f, 9.62f)
                verticalLineToRelative(-2.17f)
                lineToRelative(10f, 4.75f)
                lineToRelative(10f, -4.75f)
                verticalLineToRelative(2.18f)
                lineToRelative(-9f, 4.31f)
                verticalLineToRelative(3.37f)
                lineToRelative(11f, -5.31f)
                verticalLineToRelative(-5.5f)
                lineTo(12f, 0.71f)
                close()
            }
        }.also { _FloorLayer = it}
