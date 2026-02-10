package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Print: ImageVector? = null

val Icons.Br.Print: ImageVector
    get() = _Print ?: UXIcon(name = "Print") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 6f)
            lineTo(19f, 6f)
            lineTo(19f, 4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
            horizontalLineToRelative(-5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4.5f)
            lineTo(5f, 6f)
            lineTo(4.5f, 6f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.5f)
            verticalLineToRelative(6f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 21f)
            horizontalLineToRelative(0.78f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 24f)
            horizontalLineToRelative(5f)
            arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.22f, -3f)
            lineTo(19.5f, 21f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.5f)
            verticalLineToRelative(-6f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 6f)
            close()
            moveTo(8f, 4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 3f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4.5f)
            lineTo(16f, 6f)
            lineTo(8f, 6f)
            close()
            moveTo(16f, 19.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 21f)
            horizontalLineToRelative(-5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19.5f)
            verticalLineToRelative(-2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 16f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17.5f)
            close()
            moveTo(21f, 16.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 18f)
            lineTo(19f, 18f)
            verticalLineToRelative(-0.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 13f)
            horizontalLineToRelative(-5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17.5f)
            lineTo(5f, 18f)
            lineTo(4.5f, 18f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
            verticalLineToRelative(-6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 9f)
            horizontalLineToRelative(15f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.5f)
            close()
        }
    }.also { _Print = it }
