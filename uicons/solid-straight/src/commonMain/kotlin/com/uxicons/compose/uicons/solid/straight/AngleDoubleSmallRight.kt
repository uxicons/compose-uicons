package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallRight: ImageVector? = null

val Icons.Ss.AngleDoubleSmallRight: ImageVector
    get() = _AngleDoubleSmallRight ?: UXIcon(name = "AngleDoubleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.1f, 10.59f)
                lineTo(13.81f, 5.29f)
                lineTo(12.4f, 6.71f)
                lineTo(17.69f, 12f)
                lineTo(12.4f, 17.29f)
                lineToRelative(1.42f, 1.41f)
                lineTo(19.1f, 13.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.1f, 10.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.81f, 11.29f)
                lineToRelative(-6f, -6f)
                lineTo(5.4f, 6.71f)
                lineTo(10.69f, 12f)
                lineTo(5.4f, 17.29f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(6f, -6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.81f, 11.29f)
                close()
            }
        }.also { _AngleDoubleSmallRight = it}
