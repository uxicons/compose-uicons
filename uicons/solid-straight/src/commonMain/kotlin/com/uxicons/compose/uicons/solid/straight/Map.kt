package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Ss.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22.28f)
                lineToRelative(-6f, 1.5f)
                lineTo(9f, 1.92f)
                lineToRelative(6f, -1.61f)
                close()
                moveTo(7f, 1.42f)
                lineTo(4.16f, 0.23f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 21.75f)
                lineToRelative(7f, 2f)
                close()
                moveTo(21.87f, 1.62f)
                lineTo(17.52f, 0.15f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0.04f)
                lineTo(17f, 22.27f)
                lineToRelative(7f, 1.71f)
                lineTo(24f, 4.48f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.87f, 1.61f)
                close()
            }
        }.also { _Map = it}
