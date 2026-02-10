package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Layers: ImageVector? = null

val Icons.Ss.Layers: ImageVector
    get() = _Layers ?: UXIcon(name = "Layers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.94f, 7.66f)
                lineTo(12f, 0.5f)
                lineTo(0.06f, 7.66f)
                lineTo(12f, 14.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.96f)
                lineToRelative(-12f, 7.2f)
                lineToRelative(-12f, -7.2f)
                lineToRelative(0f, 2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                lineToRelative(0f, -2.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.63f)
                lineToRelative(-2.52f, 1.51f)
                lineToRelative(0f, 0f)
                lineToRelative(-9.48f, 5.69f)
                lineToRelative(-9.48f, -5.69f)
                lineToRelative(0f, 0f)
                lineToRelative(-2.52f, -1.51f)
                lineToRelative(0f, 2.33f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                lineToRelative(0f, -2.33f)
                close()
            }
        }.also { _Layers = it}
