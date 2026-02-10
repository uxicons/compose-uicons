package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vector: ImageVector? = null

val Icons.Bs.Vector: ImageVector
    get() = _Vector ?: UXIcon(name = "Vector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 0f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.5f)
                verticalLineTo(9f)
                horizontalLineTo(2.99f)
                lineToRelative(-0.01f, 1.99f)
                lineToRelative(3f, 0.01f)
                lineTo(5.99f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(6.01f)
                lineToRelative(1.99f, 0.01f)
                lineToRelative(0.02f, -3f)
                lineTo(9f, 3.01f)
                close()
                moveTo(6f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(2.99f)
                lineToRelative(-1.99f, -0.01f)
                lineToRelative(-0.02f, 3f)
                lineTo(15f, 5.99f)
                verticalLineTo(9f)
                horizontalLineToRelative(2.99f)
                lineToRelative(-0.01f, 1.99f)
                lineToRelative(3f, 0.01f)
                lineTo(20.99f, 9f)
                horizontalLineTo(24f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 0f)
                close()
                moveTo(21f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineToRelative(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.02f, 13.01f)
                lineToRelative(-3f, -0.01f)
                lineTo(18.01f, 15f)
                horizontalLineTo(15f)
                verticalLineToRelative(2.99f)
                lineToRelative(-1.99f, -0.01f)
                lineToRelative(-0.02f, 3f)
                lineTo(15f, 20.99f)
                verticalLineTo(24f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.5f)
                verticalLineTo(15f)
                horizontalLineTo(21.01f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineToRelative(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 15f)
                horizontalLineTo(6.01f)
                lineToRelative(0.01f, -1.99f)
                lineToRelative(-3f, -0.01f)
                lineTo(3.01f, 15f)
                horizontalLineTo(0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(21.01f)
                lineToRelative(1.99f, 0.01f)
                lineToRelative(0.02f, -3f)
                lineTo(9f, 18.01f)
                close()
                moveTo(6f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                close()
            }
        }.also { _Vector = it}
