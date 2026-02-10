package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keyboard: ImageVector? = null

val Icons.Bs.Keyboard: ImageVector
    get() = _Keyboard ?: UXIcon(name = "Keyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(13.5f, 3f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 3f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 21f)
                lineTo(24f, 21f)
                lineTo(24f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
                moveTo(21f, 18f)
                lineTo(3f, 18f)
                lineTo(3f, 6f)
                lineTo(21f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Keyboard = it}
