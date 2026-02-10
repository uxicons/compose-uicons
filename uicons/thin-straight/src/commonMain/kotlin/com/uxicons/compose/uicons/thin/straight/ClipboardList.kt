package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardList: ImageVector? = null

val Icons.Ts.ClipboardList: ImageVector
    get() = _ClipboardList ?: UXIcon(name = "ClipboardList") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 21.5f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.05f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(9f, 3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5f)
                lineTo(20f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(4f, 3f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _ClipboardList = it}
