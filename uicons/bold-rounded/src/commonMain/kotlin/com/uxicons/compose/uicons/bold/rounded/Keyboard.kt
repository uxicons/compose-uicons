package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keyboard: ImageVector? = null

val Icons.Br.Keyboard: ImageVector
    get() = _Keyboard ?: UXIcon(name = "Keyboard") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-5f)
            verticalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.5f)
            verticalLineToRelative(7f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15.5f)
            verticalLineToRelative(-7f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            close()
            moveTo(21f, 15.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 18f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.5f)
            verticalLineToRelative(-7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 6f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 9.5f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 9.5f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 8f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 13f)
            horizontalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 13f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _Keyboard = it }
