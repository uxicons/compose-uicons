package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Rs.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.24f, 10.02f)
                lineTo(1.76f, 10.02f)
                lineToRelative(8.4f, -9.18f)
                arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.69f, 0.01f)
                close()
                moveTo(6.3f, 8.02f)
                lineTo(17.7f, 8.02f)
                lineTo(12.37f, 2.19f)
                arcTo(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.02f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, 0.16f)
                close()
                moveTo(12f, 24.01f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, -0.83f)
                lineTo(1.76f, 14.01f)
                lineTo(22.24f, 14.01f)
                lineToRelative(-8.4f, 9.18f)
                arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24.01f)
                close()
                moveTo(6.3f, 16.01f)
                lineTo(11.64f, 21.84f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, 0.17f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, -0.16f)
                lineToRelative(5.34f, -5.84f)
                close()
            }
        }.also { _Sort = it}
