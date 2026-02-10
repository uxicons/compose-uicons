package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ban: ImageVector? = null

val Icons.Bs.Ban: ImageVector
    get() = _Ban ?: UXIcon(name = "Ban") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 3f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.21f, 1.67f)
                lineTo(4.67f, 17.21f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(12f, 21f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.21f, -1.67f)
                lineTo(19.33f, 6.79f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
            }
        }.also { _Ban = it}
