package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Print: ImageVector? = null

val Icons.Ss.Print: ImageVector
    get() = _Print ?: UXIcon(name = "Print") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 15f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                lineTo(3f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(0f, 20f)
                lineTo(4f, 20f)
                lineTo(4f, 13f)
                lineTo(20f, 13f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                lineTo(24f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7f)
                close()
                moveTo(19f, 11f)
                lineTo(15f, 11f)
                lineTo(15f, 9f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Print = it}
