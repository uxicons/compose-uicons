package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareLeft: ImageVector? = null

val Icons.Bs.ArrowSquareLeft: ImageVector
    get() = _ArrowSquareLeft ?: UXIcon(name = "ArrowSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(13.08f, 15.91f)
                lineTo(10.96f, 18.03f)
                lineTo(6.71f, 13.79f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.54f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.39f, 2.39f)
                horizontalLineToRelative(7.33f)
                verticalLineToRelative(3f)
                lineTo(10.69f, 13.52f)
                close()
            }
        }.also { _ArrowSquareLeft = it}
