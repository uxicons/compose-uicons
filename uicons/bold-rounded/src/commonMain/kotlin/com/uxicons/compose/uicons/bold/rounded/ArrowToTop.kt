package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToTop: ImageVector? = null

val Icons.Br.ArrowToTop: ImageVector
    get() = _ArrowToTop ?: UXIcon(name = "ArrowToTop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.26f, 3.02f)
            horizontalLineToRelative(3f)
            lineTo(5.19f, 7.08f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.32f, 9.21f)
            lineTo(10.5f, 6.02f)
            verticalLineToRelative(16.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(6.02f)
            lineToRelative(3.19f, 3.19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, -2.12f)
            lineTo(14.74f, 3.02f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(6.26f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
        }
    }.also { _ArrowToTop = it }
