package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAlt: ImageVector? = null

val Icons.Br.ArrowsAlt: ImageVector
    get() = _ArrowsAlt ?: UXIcon(name = "ArrowsAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.68f, 12.79f)
            lineToRelative(-4.01f, 3.96f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, -0.7f)
            verticalLineTo(13.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(2.54f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, 1.67f)
            lineToRelative(-3.96f, 4.01f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, 0f)
            lineTo(7.27f, 19.67f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.96f, 18f)
            horizontalLineTo(10.5f)
            verticalLineTo(13.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(2.54f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, 0.7f)
            lineTo(0.32f, 12.77f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.55f)
            lineToRelative(4.01f, -3.96f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7.96f)
            verticalLineTo(10.5f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(6f)
            horizontalLineTo(7.96f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, -1.67f)
            lineTo(11.23f, 0.32f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.55f, 0f)
            lineToRelative(3.96f, 4.01f)
            arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.04f, 6f)
            horizontalLineTo(13.5f)
            verticalLineToRelative(4.5f)
            horizontalLineTo(18f)
            verticalLineTo(7.98f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, -0.7f)
            lineToRelative(4.01f, 3.96f)
            arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.68f, 12.79f)
            close()
        }
    }.also { _ArrowsAlt = it }
