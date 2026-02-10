package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Ss.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(3f, 23.9f)
                lineToRelative(3.67f, -2.51f)
                lineToRelative(2.67f, 1.83f)
                lineToRelative(2.67f, -1.83f)
                lineToRelative(2.67f, 1.83f)
                lineToRelative(2.66f, -1.82f)
                lineTo(21f, 23.9f)
                lineTo(21f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
                close()
                moveTo(15f, 14f)
                lineTo(7f, 14f)
                lineTo(7f, 12f)
                horizontalLineToRelative(8f)
                close()
                moveTo(17f, 9f)
                lineTo(7f, 9f)
                lineTo(7f, 7f)
                lineTo(17f, 7f)
                close()
            }
        }.also { _Receipt = it}
