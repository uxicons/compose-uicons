package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoPad: ImageVector? = null

val Icons.Ss.MemoPad: ImageVector
    get() = _MemoPad ?: UXIcon(name = "MemoPad") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(2f, 5f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                lineTo(2f, 24f)
                lineTo(2f, 7f)
                horizontalLineToRelative(20f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _MemoPad = it}
