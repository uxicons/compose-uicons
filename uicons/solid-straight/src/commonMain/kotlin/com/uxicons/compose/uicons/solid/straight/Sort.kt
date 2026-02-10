package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Ss.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.24f, 10.02f)
                horizontalLineTo(1.76f)
                lineToRelative(8.4f, -9.18f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.69f, 0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24.01f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, -0.83f)
                lineTo(1.76f, 14.01f)
                horizontalLineTo(22.24f)
                lineToRelative(-8.4f, 9.18f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24.01f)
                close()
            }
        }.also { _Sort = it}
