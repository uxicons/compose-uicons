package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToLeft: ImageVector? = null

val Icons.Br.ArrowToLeft: ImageVector
    get() = _ArrowToLeft ?: UXIcon(name = "ArrowToLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 17.75f)
            verticalLineToRelative(-3f)
            lineToRelative(4.07f, 4.07f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.19f, 16.7f)
            lineTo(6.0f, 13.52f)
            horizontalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(6.0f)
            lineTo(9.19f, 7.33f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 5.21f)
            lineTo(3f, 9.28f)
            verticalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(17.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
        }
    }.also { _ArrowToLeft = it }
