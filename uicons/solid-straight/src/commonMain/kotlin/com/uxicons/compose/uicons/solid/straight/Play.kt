package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Ss.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.75f, 9.46f)
                lineTo(5f, 0.05f)
                verticalLineTo(23.99f)
                lineTo(19.74f, 14.54f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -5.08f)
                close()
            }
        }.also { _Play = it}
