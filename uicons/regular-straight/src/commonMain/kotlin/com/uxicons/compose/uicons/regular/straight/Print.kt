package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Print: ImageVector? = null

val Icons.Rs.Print: ImageVector
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
                moveTo(7f, 2f)
                lineTo(17f, 2f)
                lineTo(17f, 6f)
                lineTo(7f, 6f)
                close()
                moveTo(17f, 22f)
                lineTo(7f, 22f)
                lineTo(7f, 16f)
                lineTo(17f, 16f)
                close()
                moveTo(22f, 19f)
                lineTo(19f, 19f)
                lineTo(19f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(5f)
                lineTo(2f, 19f)
                lineTo(2f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8f)
                lineTo(21f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Print = it}
