package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareDown: ImageVector? = null

val Icons.Bs.ArrowSquareDown: ImageVector
    get() = _ArrowSquareDown ?: UXIcon(name = "ArrowSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(15.89f, 10.94f)
                lineToRelative(2.12f, 2.12f)
                lineTo(13.77f, 17.3f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.54f, 0f)
                lineTo(5.99f, 13.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.39f, 2.39f)
                verticalLineTo(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.33f)
                close()
            }
        }.also { _ArrowSquareDown = it}
