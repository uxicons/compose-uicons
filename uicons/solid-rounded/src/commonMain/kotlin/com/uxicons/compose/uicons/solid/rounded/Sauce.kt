package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Sr.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.97f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(20f, 15f)
                verticalLineToRelative(4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(9f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(4f, 15f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 15f)
                close()
                moveTo(15.97f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(9f, 8f)
                curveToRelative(1.5f, 0.08f, 6.64f, -0.23f, 8f, 0.29f)
                curveToRelative(0.21f, -2.14f, -0.98f, -3.49f, -3.17f, -3.29f)
                lineTo(13.16f, 0.99f)
                arcToRelative(1.18f, 1.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.33f, 0f)
                lineTo(10.17f, 5f)
                curveTo(7.98f, 4.81f, 6.8f, 6.16f, 7f, 8.3f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 8f)
                close()
            }
        }.also { _Sauce = it}
