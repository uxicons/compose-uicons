package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareDown: ImageVector? = null

val Icons.Bs.AngleSquareDown: ImageVector
    get() = _AngleSquareDown ?: UXIcon(name = "AngleSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.5f)
                close()
                moveTo(3f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
                moveTo(13.77f, 15.27f)
                lineTo(18.02f, 11.02f)
                lineTo(15.9f, 8.9f)
                lineToRelative(-3.9f, 3.9f)
                lineTo(8.1f, 8.9f)
                lineTo(5.98f, 11.02f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
                close()
            }
        }.also { _AngleSquareDown = it}
