package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Label: ImageVector? = null

val Icons.Ss.Label: ImageVector
    get() = _Label ?: UXIcon(name = "Label") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineTo(2f, 5.52f)
                lineTo(2f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(19f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(22f, 5.52f)
                close()
                moveTo(12f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8.5f)
                close()
            }
        }.also { _Label = it}
