package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleDown: ImageVector? = null

val Icons.Ss.ArrowCircleDown: ImageVector
    get() = _ArrowCircleDown ?: UXIcon(name = "ArrowCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(13.41f, 17.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineTo(6.34f, 13.17f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11f, 15f)
                lineTo(11f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                lineToRelative(3.24f, -3.24f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _ArrowCircleDown = it}
