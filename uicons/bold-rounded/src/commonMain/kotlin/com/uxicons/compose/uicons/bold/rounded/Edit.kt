package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Edit: ImageVector? = null

val Icons.Br.Edit: ImageVector
    get() = _Edit ?: UXIcon(name = "Edit") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 11.5f)
            verticalLineTo(15f)
            horizontalLineTo(18f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
            verticalLineToRelative(3f)
            horizontalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.5f)
            verticalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 3f)
            horizontalLineToRelative(9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 1.5f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 0f)
            horizontalLineToRelative(-9f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
            verticalLineToRelative(15f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 24f)
            horizontalLineTo(16.48f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.18f, -1.32f)
            lineToRelative(3.02f, -3.02f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.48f)
            verticalLineTo(11.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 10f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.79f, 1.79f)
            lineToRelative(-12.5f, 12.5f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
            verticalLineToRelative(3f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
            horizontalLineTo(9f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -0.29f)
            lineTo(22.04f, 6.38f)
            arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, -3.17f)
            arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.79f, 1.79f)
            close()
        }
    }.also { _Edit = it }
