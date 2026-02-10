package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Rs.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 23.9f)
                lineToRelative(-3.66f, -2.51f)
                lineToRelative(-2.66f, 1.82f)
                lineToRelative(-2.67f, -1.83f)
                lineTo(9.34f, 23.21f)
                lineTo(6.67f, 21.39f)
                lineTo(3f, 23.9f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(6.67f, 18.96f)
                lineToRelative(2.67f, 1.83f)
                lineToRelative(2.67f, -1.83f)
                lineToRelative(2.67f, 1.83f)
                lineToRelative(2.67f, -1.83f)
                lineTo(19f, 20.1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(20.1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _Receipt = it}
