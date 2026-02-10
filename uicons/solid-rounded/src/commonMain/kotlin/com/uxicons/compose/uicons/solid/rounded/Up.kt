package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Sr.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineTo(13f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-1.17f, 0f, -2.29f, -0.62f, -2.8f, -1.67f)
                curveToRelative(-0.57f, -1.18f, -0.34f, -2.51f, 0.57f, -3.43f)
                lineTo(9.17f, 1.18f)
                curveToRelative(1.57f, -1.57f, 4.09f, -1.57f, 5.64f, -0.02f)
                curveToRelative(0f, 0f, 6.37f, 6.77f, 6.37f, 6.77f)
                curveToRelative(0.85f, 0.84f, 1.1f, 2.09f, 0.63f, 3.22f)
                curveToRelative(-0.47f, 1.13f, -1.52f, 1.84f, -2.74f, 1.85f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Up = it}
