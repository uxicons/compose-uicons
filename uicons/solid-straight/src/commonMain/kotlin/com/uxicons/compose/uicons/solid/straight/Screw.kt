package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Ss.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.98f, 13.67f)
                lineToRelative(6f, -5.51f)
                verticalLineToRelative(2.4f)
                lineToRelative(-6f, 5.51f)
                verticalLineToRelative(-2.4f)
                close()
                moveTo(8.98f, 20.97f)
                lineToRelative(0.09f, 0.09f)
                lineToRelative(5.91f, -5.43f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-6f, 5.51f)
                verticalLineToRelative(2.19f)
                close()
                moveTo(12.2f, 8f)
                horizontalLineToRelative(-3.22f)
                verticalLineToRelative(2.95f)
                lineToRelative(3.22f, -2.95f)
                close()
                moveTo(10.38f, 22.37f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-2.83f)
                lineToRelative(-4.6f, 4.23f)
                close()
                moveTo(17.98f, 3f)
                lineTo(17.98f, 0f)
                lineTo(5.98f, 0f)
                verticalLineToRelative(3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(3f, -3f)
                close()
            }
        }.also { _Screw = it}
