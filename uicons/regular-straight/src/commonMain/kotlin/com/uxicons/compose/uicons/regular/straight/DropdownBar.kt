package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownBar: ImageVector? = null

val Icons.Rs.DropdownBar: ImageVector
    get() = _DropdownBar ?: UXIcon(name = "DropdownBar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                lineTo(9f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 16f)
                lineTo(6f, 16f)
                verticalLineToRelative(-4f)
                lineTo(2f, 12f)
                verticalLineToRelative(4f)
                close()
                moveTo(9f, 21f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                lineTo(9f, 19f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 22f)
                lineTo(6f, 22f)
                verticalLineToRelative(-4f)
                lineTo(2f, 18f)
                verticalLineToRelative(4f)
                close()
                moveTo(15.85f, 6.71f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0f)
                lineToRelative(2.76f, -2.71f)
                horizontalLineToRelative(-6.91f)
                lineToRelative(2.76f, 2.71f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(7f)
                lineTo(0f, 10f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                lineTo(22f, 8f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _DropdownBar = it}
