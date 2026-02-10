package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LuggageRolling: ImageVector? = null

val Icons.Bs.LuggageRolling: ImageVector
    get() = _LuggageRolling ?: UXIcon(name = "LuggageRolling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 7f)
                lineTo(18f, 7f)
                lineTo(18f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
                horizontalLineToRelative(-5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.5f)
                lineTo(6f, 7f)
                lineTo(3.5f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.5f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                lineTo(5f, 22f)
                lineTo(19f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                lineTo(24f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 7f)
                close()
                moveTo(9f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 3f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(15f, 7f)
                lineTo(9f, 7f)
                close()
                moveTo(3f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(21f, 19f)
                lineTo(3f, 19f)
                close()
                moveTo(7f, 12f)
                lineTo(17f, 12f)
                verticalLineToRelative(3f)
                lineTo(7f, 15f)
                close()
            }
        }.also { _LuggageRolling = it}
