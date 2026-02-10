package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Layers: ImageVector? = null

val Icons.Bs.Layers: ImageVector
    get() = _Layers ?: UXIcon(name = "Layers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.7f)
                lineTo(12f, 1.5f)
                lineTo(0f, 8.7f)
                lineTo(0f, 9.8f)
                lineTo(12f, 17f)
                lineTo(24f, 9.8f)
                close()
                moveTo(4.92f, 9.25f)
                lineTo(12f, 5f)
                lineToRelative(7.08f, 4.25f)
                lineTo(12f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.8f)
                lineToRelative(-12f, 7.2f)
                lineToRelative(-12f, -7.2f)
                lineToRelative(0f, 3.5f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                lineToRelative(0f, -3.5f)
                close()
            }
        }.also { _Layers = it}
