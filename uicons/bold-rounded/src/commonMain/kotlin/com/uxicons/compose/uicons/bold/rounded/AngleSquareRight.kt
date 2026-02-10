package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareRight: ImageVector? = null

val Icons.Br.AngleSquareRight: ImageVector
    get() = _AngleSquareRight ?: UXIcon(name = "AngleSquareRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 24f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5.5f)
            close()
            moveTo(3f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            close()
            moveTo(14.78f, 9.04f)
            lineTo(12.23f, 6.45f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.14f, 2.1f)
            lineToRelative(2.55f, 2.6f)
            arcToRelative(1.22f, 1.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 1.71f)
            lineToRelative(-2.54f, 2.59f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.14f, 2.1f)
            lineTo(14.77f, 14.97f)
            arcToRelative(4.2f, 4.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -5.93f)
            close()
        }
    }.also { _AngleSquareRight = it }
