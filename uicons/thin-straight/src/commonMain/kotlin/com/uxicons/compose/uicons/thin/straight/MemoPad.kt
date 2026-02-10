package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoPad: ImageVector? = null

val Icons.Ts.MemoPad: ImageVector
    get() = _MemoPad ?: UXIcon(name = "MemoPad") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(17f)
                lineTo(3f, 23f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(6f, 15f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _MemoPad = it}
