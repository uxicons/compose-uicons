package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToolCrop: ImageVector? = null

val Icons.Br.ToolCrop: ImageVector
    get() = _ToolCrop ?: UXIcon(name = "ToolCrop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 17f)
            lineTo(20f, 17f)
            lineTo(20f, 8.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 4f)
            lineTo(7f, 4f)
            lineTo(7f, 1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1.5f)
            lineTo(4f, 4f)
            lineTo(1.5f, 4f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            lineTo(0f, 5.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 7f)
            lineTo(4f, 7f)
            verticalLineToRelative(8.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 20f)
            lineTo(17f, 20f)
            verticalLineToRelative(2.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 24f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 22.5f)
            lineTo(20f, 20f)
            horizontalLineToRelative(2.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 17f)
            close()
            moveTo(8.5f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15.5f)
            lineTo(7f, 7f)
            horizontalLineToRelative(8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8.5f)
            lineTo(17f, 17f)
            close()
        }
    }.also { _ToolCrop = it }
