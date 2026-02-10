package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clock: ImageVector? = null

val Icons.Ss.Clock: ImageVector
    get() = _Clock ?: UXIcon(name = "Clock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(13f, 12.43f)
                lineTo(7.95f, 15.6f)
                lineTo(6.89f, 13.9f)
                lineTo(11f, 11.32f)
                lineTo(11f, 6f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Clock = it}
