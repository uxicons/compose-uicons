package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rainbow: ImageVector? = null

val Icons.Br.Rainbow: ImageVector
    get() = _Rainbow ?: UXIcon(name = "Rainbow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19.5f)
            lineTo(21f, 15f)
            curveTo(20.53f, 3.07f, 3.47f, 3.08f, 3f, 15f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            lineTo(0f, 15f)
            curveTo(0.66f, -0.92f, 23.34f, -0.91f, 24f, 15f)
            verticalLineToRelative(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 21f)
            close()
            moveTo(19f, 19.5f)
            lineTo(19f, 15f)
            curveTo(18.67f, 5.73f, 5.33f, 5.74f, 5f, 15f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(8f, 15f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(14f, 19.5f)
            lineTo(14f, 15f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
            verticalLineToRelative(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 21f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19.5f)
            close()
        }
    }.also { _Rainbow = it }
