package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Bs.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(3f)
                lineToRelative(2f, 2.0f)
                verticalLineToRelative(14.98f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                lineTo(16f, 5.02f)
                lineToRelative(2f, -2.02f)
                lineTo(18f, 0f)
                close()
                moveTo(13f, 12.23f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-2.82f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(2.82f)
                close()
                moveTo(13f, 6.59f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-3.58f)
                lineToRelative(2f, 0.01f)
                verticalLineToRelative(1.57f)
                close()
                moveTo(12f, 19.73f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-1.67f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(3.67f)
                lineToRelative(-1f, 1f)
                close()
            }
        }.also { _Screw = it}
