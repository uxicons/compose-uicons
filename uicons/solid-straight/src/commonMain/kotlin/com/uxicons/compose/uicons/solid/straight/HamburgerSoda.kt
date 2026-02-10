package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HamburgerSoda: ImageVector? = null

val Icons.Ss.HamburgerSoda: ImageVector
    get() = _HamburgerSoda ?: UXIcon(name = "HamburgerSoda") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(1f)
                lineTo(8f, 17f)
                lineTo(8f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineToRelative(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(17f, 21f)
                lineTo(14f, 19f)
                lineTo(8f, 19f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(24f, 19f)
                lineTo(20f, 19f)
                close()
                moveTo(6f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 4.01f)
                lineTo(2.12f, 24.01f)
                lineTo(0.06f, 7.57f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 5.13f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4.01f)
                lineTo(9.6f, 4.01f)
                lineToRelative(0.52f, -4f)
                lineTo(17f, 0.01f)
                lineTo(17f, 2f)
                lineTo(11.88f, 2f)
                lineToRelative(-0.26f, 2.01f)
                lineTo(14f, 4.01f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 3.65f)
                lineTo(16.63f, 10f)
                lineTo(12f, 10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 16f)
                close()
                moveTo(11.36f, 6.01f)
                lineTo(11.11f, 8f)
                horizontalLineToRelative(3.77f)
                lineToRelative(0.09f, -0.68f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, -0.94f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6.01f)
                close()
                moveTo(9.09f, 8f)
                lineToRelative(0.26f, -1.99f)
                lineTo(3f, 6.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, 1.22f)
                lineToRelative(0.1f, 0.77f)
                close()
            }
        }.also { _HamburgerSoda = it}
