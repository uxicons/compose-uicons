package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorLayer: ImageVector? = null

val Icons.Rs.FloorLayer: ImageVector
    get() = _FloorLayer ?: UXIcon(name = "FloorLayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1.03f)
                lineTo(0f, 6.79f)
                verticalLineToRelative(5.57f)
                lineToRelative(12.0f, 5.75f)
                lineToRelative(12.0f, -5.79f)
                verticalLineToRelative(-5.53f)
                lineTo(12f, 1.03f)
                close()
                moveTo(12f, 3.25f)
                lineToRelative(8.69f, 4.17f)
                lineToRelative(-8.69f, 4.17f)
                lineTo(3.31f, 7.42f)
                lineTo(12f, 3.25f)
                close()
                moveTo(2f, 9.01f)
                lineToRelative(9f, 4.32f)
                verticalLineToRelative(2.09f)
                lineTo(2f, 11.1f)
                verticalLineToRelative(-2.09f)
                close()
                moveTo(22f, 11.06f)
                lineToRelative(-9f, 4.34f)
                verticalLineToRelative(-2.09f)
                lineToRelative(9f, -4.32f)
                verticalLineToRelative(2.06f)
                close()
                moveTo(12f, 20.28f)
                lineToRelative(12f, -5.75f)
                verticalLineToRelative(2.22f)
                lineToRelative(-12f, 5.75f)
                lineTo(0f, 16.75f)
                verticalLineToRelative(-2.22f)
                lineToRelative(12f, 5.75f)
                close()
            }
        }.also { _FloorLayer = it}
