package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareDown: ImageVector? = null

val Icons.Ss.ArrowSquareDown: ImageVector
    get() = _ArrowSquareDown ?: UXIcon(name = "ArrowSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(13.41f, 17.41f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineTo(6.34f, 13.17f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11f, 15f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                lineToRelative(3.24f, -3.24f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _ArrowSquareDown = it}
