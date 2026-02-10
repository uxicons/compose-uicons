package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Br.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 6f)
            horizontalLineTo(19f)
            verticalLineTo(3.91f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 1f)
            horizontalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.91f)
            verticalLineTo(17.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 23f)
            horizontalLineToRelative(7f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, -5f)
            arcTo(0.19f, 0.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
            horizontalLineToRelative(1f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
            verticalLineTo(10f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
            close()
            moveTo(13.5f, 20f)
            horizontalLineToRelative(-7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            horizontalLineTo(16f)
            verticalLineTo(17.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 20f)
            close()
            moveTo(21f, 14f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            horizontalLineTo(19f)
            verticalLineTo(9f)
            horizontalLineToRelative(1f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
            close()
        }
    }.also { _Mug = it }
