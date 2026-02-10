package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsHCopy: ImageVector? = null

val Icons.Ss.ArrowsHCopy: ImageVector
    get() = _ArrowsHCopy ?: UXIcon(name = "ArrowsHCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.59f, 0.59f)
                lineTo(7.34f, 3.83f)
                lineTo(8.76f, 5.24f)
                lineTo(11f, 3f)
                verticalLineTo(21f)
                lineTo(8.76f, 18.76f)
                lineTo(7.34f, 20.17f)
                lineToRelative(3.24f, 3.24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 0f)
                lineToRelative(3.24f, -3.24f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13f, 21f)
                verticalLineTo(3f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 0.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.59f, 0.59f)
                close()
            }
        }.also { _ArrowsHCopy = it}
