package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayers: ImageVector? = null

val Icons.Rs.LandLayers: ImageVector
    get() = _LandLayers ?: UXIcon(name = "LandLayers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.64f)
                verticalLineToRelative(2.33f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 11.97f)
                verticalLineToRelative(-2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                close()
                moveTo(0f, 13.97f)
                verticalLineToRelative(2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 13.97f)
                close()
                moveTo(12f, 14.67f)
                lineTo(0.06f, 7.5f)
                lineTo(12f, 0.33f)
                lineToRelative(11.94f, 7.17f)
                lineToRelative(-11.94f, 7.17f)
                close()
                moveTo(12f, 12.33f)
                lineToRelative(3.08f, -1.85f)
                lineToRelative(-3.04f, -1.82f)
                lineToRelative(-3.08f, 1.85f)
                lineToRelative(3.04f, 1.82f)
                close()
                moveTo(20.06f, 7.5f)
                lineToRelative(-3.04f, -1.82f)
                lineToRelative(-3.04f, 1.82f)
                lineToRelative(3.04f, 1.82f)
                lineToRelative(3.04f, -1.82f)
                close()
                moveTo(12f, 2.67f)
                lineToRelative(-3.04f, 1.82f)
                lineToRelative(3.08f, 1.85f)
                lineToRelative(3.04f, -1.82f)
                lineToRelative(-3.08f, -1.85f)
                close()
                moveTo(3.94f, 7.5f)
                lineToRelative(3.08f, 1.85f)
                lineToRelative(3.08f, -1.85f)
                lineToRelative(-3.08f, -1.85f)
                lineToRelative(-3.08f, 1.85f)
                close()
            }
        }.also { _LandLayers = it}
