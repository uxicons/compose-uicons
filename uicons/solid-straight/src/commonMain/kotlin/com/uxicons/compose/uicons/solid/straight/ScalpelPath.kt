package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScalpelPath: ImageVector? = null

val Icons.Ss.ScalpelPath: ImageVector
    get() = _ScalpelPath ?: UXIcon(name = "ScalpelPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 24f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(23.19f, 0.81f)
                curveToRelative(-1.08f, -1.08f, -2.83f, -1.08f, -3.91f, 0f)
                lineToRelative(-9.16f, 9.16f)
                lineToRelative(4.04f, 3.77f)
                lineToRelative(9.03f, -9.03f)
                curveToRelative(1.08f, -1.08f, 1.08f, -2.83f, 0f, -3.91f)
                close()
                moveTo(8.65f, 11.44f)
                lineToRelative(4.37f, 4.06f)
                lineToRelative(-0.22f, 2.11f)
                lineToRelative(-0.19f, 0.19f)
                curveToRelative(-2.56f, 2.56f, -5.96f, 4.05f, -9.56f, 4.19f)
                curveToRelative(-0.23f, 0.01f, -3.04f, 0f, -3.04f, 0f)
                verticalLineToRelative(-1.91f)
                lineToRelative(8.65f, -8.65f)
                close()
            }
        }.also { _ScalpelPath = it}
