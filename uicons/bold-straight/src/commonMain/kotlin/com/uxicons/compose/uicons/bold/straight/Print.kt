package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Print: ImageVector? = null

val Icons.Bs.Print: ImageVector
    get() = _Print ?: UXIcon(name = "Print") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(19f, 6f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                lineTo(3f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                lineTo(0f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                lineTo(19f, 24f)
                lineTo(19f, 21f)
                horizontalLineToRelative(5f)
                close()
                moveTo(8f, 3f)
                horizontalLineToRelative(8f)
                lineTo(16f, 6f)
                lineTo(8f, 6f)
                close()
                moveTo(16f, 21f)
                lineTo(8f, 21f)
                lineTo(8f, 16f)
                horizontalLineToRelative(8f)
                close()
                moveTo(21f, 18f)
                lineTo(19f, 18f)
                lineTo(19f, 13f)
                lineTo(5f, 13f)
                verticalLineToRelative(5f)
                lineTo(3f, 18f)
                lineTo(3f, 9f)
                lineTo(21f, 9f)
                close()
            }
        }.also { _Print = it}
