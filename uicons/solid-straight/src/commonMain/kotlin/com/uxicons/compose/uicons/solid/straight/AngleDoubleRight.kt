package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleRight: ImageVector? = null

val Icons.Ss.AngleDoubleRight: ImageVector
    get() = _AngleDoubleRight ?: UXIcon(name = "AngleDoubleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.12f, 9.88f)
                lineTo(12.25f, 0f)
                lineTo(10.83f, 1.42f)
                lineToRelative(9.88f, 9.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                lineTo(10.82f, 22.6f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(9.89f, -9.89f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.54f, 11.29f)
                lineTo(2.26f, 0.02f)
                lineTo(0.85f, 1.43f)
                lineTo(11.41f, 12f)
                lineTo(0.84f, 22.58f)
                lineTo(2.25f, 23.99f)
                lineTo(13.54f, 12.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.54f, 11.29f)
                close()
            }
        }.also { _AngleDoubleRight = it}
