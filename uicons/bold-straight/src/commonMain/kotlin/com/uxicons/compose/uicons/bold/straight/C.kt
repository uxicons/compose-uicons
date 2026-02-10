package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _C: ImageVector? = null

val Icons.Bs.C: ImageVector
    get() = _C ?: UXIcon(name = "C") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.96f, 24f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-5.51f, 0f, -10.0f, -4.53f, -10.0f, -10.09f)
                verticalLineToRelative(-3.82f)
                curveTo(2f, 4.53f, 6.49f, 0f, 12.0f, 0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(3.86f, 0f, 7.32f, 2.15f, 9.04f, 5.61f)
                lineToRelative(-2.69f, 1.33f)
                curveToRelative(-1.21f, -2.43f, -3.64f, -3.94f, -6.35f, -3.94f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-3.86f, 0f, -7.0f, 3.18f, -7.0f, 7.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0f, 3.91f, 3.14f, 7.09f, 7.0f, 7.09f)
                horizontalLineToRelative(0.95f)
                curveToRelative(2.66f, 0f, 5.08f, -1.47f, 6.3f, -3.84f)
                lineToRelative(2.66f, 1.38f)
                curveToRelative(-1.74f, 3.37f, -5.18f, 5.46f, -8.97f, 5.46f)
                close()
            }
        }.also { _C = it}
