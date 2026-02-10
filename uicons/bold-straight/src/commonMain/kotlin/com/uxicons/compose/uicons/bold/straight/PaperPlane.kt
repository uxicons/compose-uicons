package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlane: ImageVector? = null

val Icons.Bs.PaperPlane: ImageVector
    get() = _PaperPlane ?: UXIcon(name = "PaperPlane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.77f, 6.21f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.61f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 1.71f)
                lineTo(4f, 13.55f)
                lineTo(4f, 20f)
                horizontalLineToRelative(6.45f)
                lineToRelative(3.27f, 3.27f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 0.71f)
                arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, -0.08f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -1.69f)
                lineTo(24f, -0.02f)
                close()
                moveTo(3.53f, 8.86f)
                lineToRelative(13.21f, -3.7f)
                lineTo(7f, 14.9f)
                lineTo(7f, 12.33f)
                close()
                moveTo(15.13f, 20.46f)
                lineTo(11.68f, 17f)
                lineTo(9.1f, 17f)
                lineToRelative(9.73f, -9.74f)
                close()
            }
        }.also { _PaperPlane = it}
