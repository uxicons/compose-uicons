package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallRight: ImageVector? = null

val Icons.Br.AngleDoubleSmallRight: ImageVector
    get() = _AngleDoubleSmallRight ?: UXIcon(name = "AngleDoubleSmallRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.1f, 19.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -2.56f)
            lineToRelative(4.59f, -4.58f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.71f)
            lineTo(12.04f, 7.06f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineTo(18.75f, 9.53f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.95f)
            lineToRelative(-4.59f, 4.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.1f, 19.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.1f, 19.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -2.56f)
            lineTo(9.98f, 12f)
            lineTo(5.04f, 7.06f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 4.94f)
            lineToRelative(6f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.12f)
            lineToRelative(-6f, 6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.1f, 19.5f)
            close()
        }
    }.also { _AngleDoubleSmallRight = it }
