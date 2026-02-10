package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListDropdown: ImageVector? = null

val Icons.Bs.ListDropdown: ImageVector
    get() = _ListDropdown ?: UXIcon(name = "ListDropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20f, 3f)
                lineToRelative(-2.76f, 2.71f)
                curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0f)
                lineToRelative(-2.76f, -2.71f)
                horizontalLineToRelative(6.91f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 8f)
                lineTo(21f, 8f)
                verticalLineToRelative(13f)
                lineTo(3f, 21f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineTo(5f, 18f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineTo(5f, 13f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _ListDropdown = it}
