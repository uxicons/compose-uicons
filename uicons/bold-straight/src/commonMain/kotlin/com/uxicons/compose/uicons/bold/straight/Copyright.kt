package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copyright: ImageVector? = null

val Icons.Bs.Copyright: ImageVector
    get() = _Copyright ?: UXIcon(name = "Copyright") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.93f, 18.77f)
                arcTo(6.77f, 6.77f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.72f, 7.21f)
                lineTo(14.6f, 9.33f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 5.33f)
                lineToRelative(2.12f, 2.12f)
                arcTo(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.93f, 18.77f)
                close()
            }
        }.also { _Copyright = it}
