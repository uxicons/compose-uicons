package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListDropdown: ImageVector? = null

val Icons.Rs.ListDropdown: ImageVector
    get() = _ListDropdown ?: UXIcon(name = "ListDropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 2f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                lineTo(2f, 8f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 10f)
                lineTo(22f, 10f)
                verticalLineToRelative(12f)
                lineTo(2f, 22f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.85f, 6.71f)
                lineToRelative(-2.76f, -2.71f)
                horizontalLineToRelative(6.91f)
                lineToRelative(-2.76f, 2.71f)
                curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0f)
                close()
            }
        }.also { _ListDropdown = it}
