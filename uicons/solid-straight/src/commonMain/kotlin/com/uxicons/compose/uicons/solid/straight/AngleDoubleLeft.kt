package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleLeft: ImageVector? = null

val Icons.Ss.AngleDoubleLeft: ImageVector
    get() = _AngleDoubleLeft ?: UXIcon(name = "AngleDoubleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.12f, 11.29f)
                lineTo(13.01f, 1.4f)
                lineTo(11.6f, -0.01f)
                lineTo(1.71f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(9.88f, 9.88f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.12f, 12.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.12f, 11.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 1.42f)
                lineTo(21.58f, 0f)
                lineToRelative(-11.29f, 11.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                lineTo(21.58f, 24f)
                lineTo(23f, 22.58f)
                lineTo(12.41f, 12f)
                close()
            }
        }.also { _AngleDoubleLeft = it}
