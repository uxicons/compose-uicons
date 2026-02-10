package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Br.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 0f)
            horizontalLineToRelative(-8f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6.5f)
            verticalLineToRelative(13f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 24f)
            horizontalLineToRelative(10f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18.5f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 0f)
            close()
            moveTo(8f, 3.05f)
            verticalLineTo(15f)
            horizontalLineTo(6.5f)
            arcToRelative(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0.28f)
            verticalLineTo(6.5f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3.05f)
            close()
            moveTo(19f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 21f)
            horizontalLineTo(6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(19f)
            close()
            moveTo(11f, 15f)
            verticalLineTo(3f)
            horizontalLineToRelative(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5.5f)
            verticalLineTo(15f)
            close()
        }
    }.also { _Book = it }
