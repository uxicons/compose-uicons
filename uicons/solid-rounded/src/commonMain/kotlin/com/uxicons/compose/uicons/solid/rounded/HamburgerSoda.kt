package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HamburgerSoda: ImageVector? = null

val Icons.Sr.HamburgerSoda: ImageVector
    get() = _HamburgerSoda ?: UXIcon(name = "HamburgerSoda") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16.5f)
                lineTo(24f, 17f)
                lineTo(9f, 17f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -5f)
                horizontalLineToRelative(6f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16.5f)
                close()
                moveTo(18.2f, 20.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.11f, 0f)
                lineTo(14.34f, 19f)
                lineTo(9f, 19f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 5f)
                horizontalLineToRelative(6f)
                arcTo(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(7f, 16.5f)
                verticalLineToRelative(3f)
                arcToRelative(6.47f, 6.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.83f, 4.51f)
                horizontalLineToRelative(-2.3f)
                arcTo(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 19.63f)
                lineTo(0.06f, 7.57f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4.02f)
                lineTo(9.62f, 4.02f)
                lineTo(9.79f, 2.63f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.77f, 0.01f)
                lineTo(16f, 0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(12.77f, 2.01f)
                curveToRelative(-1.09f, 0f, -1.03f, 1.25f, -1.13f, 2.01f)
                lineTo(14f, 4.02f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 3.65f)
                lineTo(16.64f, 10f)
                lineTo(13.5f, 10f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16.5f)
                close()
                moveTo(11.38f, 6.02f)
                lineTo(11.13f, 8f)
                horizontalLineToRelative(3.74f)
                lineToRelative(0.09f, -0.68f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6.02f)
                close()
                moveTo(9.12f, 8f)
                lineToRelative(0.25f, -1.99f)
                lineTo(3f, 6.01f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, 1.22f)
                lineToRelative(0.1f, 0.77f)
                close()
            }
        }.also { _HamburgerSoda = it}
