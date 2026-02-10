package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallLeft: ImageVector? = null

val Icons.Br.AngleDoubleSmallLeft: ImageVector
    get() = _AngleDoubleSmallLeft ?: UXIcon(name = "AngleDoubleSmallLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.48f, 19.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
            lineTo(4.84f, 14.47f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.95f)
            lineTo(9.42f, 4.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            lineTo(6.96f, 11.65f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.71f)
            lineToRelative(4.59f, 4.58f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.48f, 19.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.48f, 19.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
            lineToRelative(-6f, -6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.12f)
            lineToRelative(6f, -6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.12f, 2.12f)
            lineTo(13.6f, 12f)
            lineToRelative(4.94f, 4.94f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.48f, 19.5f)
            close()
        }
    }.also { _AngleDoubleSmallLeft = it }
