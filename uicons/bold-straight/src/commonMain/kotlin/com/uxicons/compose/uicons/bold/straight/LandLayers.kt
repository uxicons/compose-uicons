package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayers: ImageVector? = null

val Icons.Bs.LandLayers: ImageVector
    get() = _LandLayers ?: UXIcon(name = "LandLayers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 19.0f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(3.5f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 15.3f)
                verticalLineToRelative(-3.5f)
                lineToRelative(12f, 7.2f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(1.1f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 10.1f)
                verticalLineToRelative(-1.1f)
                lineTo(12f, 1.8f)
                lineToRelative(12f, 7.2f)
                close()
                moveTo(12f, 5.3f)
                lineToRelative(-2.53f, 1.52f)
                lineToRelative(2.57f, 1.54f)
                lineToRelative(2.53f, -1.52f)
                lineToRelative(-2.57f, -1.54f)
                close()
                moveTo(4.92f, 9.55f)
                lineToRelative(2.57f, 1.54f)
                lineToRelative(2.61f, -1.57f)
                lineToRelative(-2.57f, -1.54f)
                lineToRelative(-2.61f, 1.57f)
                close()
                moveTo(12f, 13.8f)
                lineToRelative(2.61f, -1.57f)
                lineToRelative(-2.57f, -1.54f)
                lineToRelative(-2.61f, 1.57f)
                lineToRelative(2.57f, 1.54f)
                close()
                moveTo(19.08f, 9.55f)
                lineToRelative(-2.57f, -1.54f)
                lineToRelative(-2.53f, 1.52f)
                lineToRelative(2.57f, 1.54f)
                lineToRelative(2.53f, -1.52f)
                close()
            }
        }.also { _LandLayers = it}
