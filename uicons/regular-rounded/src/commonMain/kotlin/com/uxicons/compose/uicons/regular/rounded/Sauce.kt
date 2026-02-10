package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Rr.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9.42f)
                lineTo(17f, 8f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.17f, -3f)
                lineTo(13.16f, 0.99f)
                arcToRelative(1.18f, 1.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.33f, 0f)
                lineTo(10.17f, 5f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8f)
                lineTo(7f, 9.42f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(20f, 14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9.42f)
                close()
                moveTo(9f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(15f, 9f)
                lineTo(9f, 9f)
                close()
                moveTo(18f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(9f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(6f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(14.97f, 14f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(15.97f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.97f, 14f)
                close()
                moveTo(13.97f, 18f)
                horizontalLineToRelative(-4f)
                lineTo(9.97f, 16f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Sauce = it}
