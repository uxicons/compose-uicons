package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandZoomIn: ImageVector? = null

val Icons.Bs.HandZoomIn: ImageVector
    get() = _HandZoomIn ?: UXIcon(name = "HandZoomIn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.56f, 11.56f)
                lineToRelative(1.44f, 1.44f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(8f, -8f)
                lineToRelative(-1.44f, -1.44f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineToRelative(-1.44f, -1.44f)
                close()
                moveTo(12.99f, 14.11f)
                verticalLineToRelative(-5.53f)
                curveToRelative(0f, -0.74f, -0.53f, -1.43f, -1.27f, -1.55f)
                curveToRelative(-0.94f, -0.15f, -1.73f, 0.57f, -1.73f, 1.47f)
                verticalLineToRelative(9.2f)
                lineToRelative(-1.64f, -1.22f)
                curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
                curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
                lineToRelative(5.29f, 4.39f)
                horizontalLineToRelative(1.97f)
                verticalLineToRelative(-6.77f)
                lineToRelative(8.01f, 2.29f)
                verticalLineToRelative(4.48f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.75f)
                lineToRelative(-11.01f, -3.15f)
                close()
            }
        }.also { _HandZoomIn = it}
