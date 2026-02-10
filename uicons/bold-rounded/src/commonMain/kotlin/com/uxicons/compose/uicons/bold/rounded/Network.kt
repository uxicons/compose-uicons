package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Network: ImageVector? = null

val Icons.Br.Network: ImageVector
    get() = _Network ?: UXIcon(name = "Network") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 19f)
            horizontalLineTo(15.15f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 17.35f)
            verticalLineTo(14f)
            horizontalLineToRelative(7.65f)
            arcTo(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12.15f)
            verticalLineTo(11f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
            verticalLineTo(4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 0f)
            horizontalLineToRelative(-9f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.5f)
            verticalLineTo(9f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            verticalLineToRelative(1.15f)
            arcTo(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.85f, 14f)
            horizontalLineTo(10.5f)
            verticalLineToRelative(3.35f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.85f, 19f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(8.85f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
            horizontalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(8.93f, 9.68f)
            lineToRelative(-0.33f, -0.36f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, 9f)
            horizontalLineTo(6f)
            verticalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 3f)
            horizontalLineToRelative(9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4.5f)
            verticalLineTo(9f)
            horizontalLineTo(16.13f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, 0.32f)
            lineToRelative(-0.33f, 0.36f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.73f, 0.32f)
            horizontalLineTo(9.67f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.93f, 9.68f)
            close()
        }
    }.also { _Network = it }
