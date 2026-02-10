package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Bs.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(5f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                lineTo(2f, 19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                close()
                moveTo(8f, 3f)
                lineTo(8f, 15f)
                lineTo(6.5f, 15f)
                arcToRelative(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0.28f)
                lineTo(5f, 3f)
                close()
                moveTo(19f, 21f)
                lineTo(6.5f, 21f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                lineTo(19f, 18f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 15f)
                lineTo(11f, 3f)
                horizontalLineToRelative(8f)
                lineTo(19f, 15f)
                close()
            }
        }.also { _Book = it}
