package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayers: ImageVector? = null

val Icons.Ss.LandLayers: ImageVector
    get() = _LandLayers ?: UXIcon(name = "LandLayers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.02f, 3.32f)
                lineTo(12f, 0.33f)
                lineToRelative(5.02f, 3.01f)
                lineToRelative(-4.98f, 2.99f)
                lineToRelative(-5.02f, -3.01f)
                close()
                moveTo(13.99f, 7.5f)
                lineToRelative(4.98f, 2.99f)
                lineToRelative(4.98f, -2.99f)
                lineToRelative(-4.98f, -2.99f)
                lineToRelative(-4.98f, 2.99f)
                close()
                moveTo(10.1f, 7.5f)
                lineToRelative(-5.02f, -3.01f)
                lineTo(0.06f, 7.5f)
                lineToRelative(5.02f, 3.01f)
                lineToRelative(5.02f, -3.01f)
                close()
                moveTo(12.04f, 8.67f)
                lineToRelative(-5.02f, 3.01f)
                lineToRelative(4.98f, 2.99f)
                lineToRelative(5.02f, -3.01f)
                lineToRelative(-4.98f, -2.99f)
                close()
                moveTo(24.0f, 9.64f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 9.64f)
                verticalLineToRelative(2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(-2.33f)
                close()
                moveTo(24.0f, 13.97f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 13.97f)
                verticalLineToRelative(2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(-2.33f)
                close()
            }
        }.also { _LandLayers = it}
