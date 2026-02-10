package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModePortrait: ImageVector? = null

val Icons.Br.ModePortrait: ImageVector
    get() = _ModePortrait ?: UXIcon(name = "ModePortrait") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
            verticalLineToRelative(1.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            horizontalLineTo(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineTo(17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 15.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineTo(7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineTo(7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 8.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 21f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(1.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineTo(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            horizontalLineTo(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
            verticalLineTo(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7.5f)
            moveToRelative(-3.5f, 0f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 0f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.11f, 17.85f)
            arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.1f, 19f)
            horizontalLineToRelative(9.8f)
            arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, -1.15f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.78f, 0f)
            close()
        }
    }.also { _ModePortrait = it }
