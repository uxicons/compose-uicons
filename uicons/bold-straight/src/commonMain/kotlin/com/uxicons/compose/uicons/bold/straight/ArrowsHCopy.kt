package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsHCopy: ImageVector? = null

val Icons.Bs.ArrowsHCopy: ImageVector
    get() = _ArrowsHCopy ?: UXIcon(name = "ArrowsHCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.77f, 23.27f)
                lineToRelative(3.75f, -3.75f)
                lineTo(15.4f, 17.4f)
                lineToRelative(-1.9f, 1.9f)
                verticalLineTo(4.71f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(2.12f, -2.12f)
                lineTo(13.77f, 0.73f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                lineToRelative(-3.75f, 3.75f)
                lineTo(8.6f, 6.6f)
                lineToRelative(1.9f, -1.9f)
                verticalLineTo(19.29f)
                lineTo(8.6f, 17.4f)
                lineTo(6.48f, 19.52f)
                lineToRelative(3.75f, 3.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.77f, 23.27f)
                close()
            }
        }.also { _ArrowsHCopy = it}
