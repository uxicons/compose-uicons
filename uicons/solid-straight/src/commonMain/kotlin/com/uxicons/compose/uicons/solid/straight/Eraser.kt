package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Ss.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.24f, 7.44f)
                lineTo(12.75f, 1.91f)
                curveToRelative(1.17f, -1.18f, 3.21f, -1.18f, 4.38f, 0f)
                lineToRelative(5.93f, 5.96f)
                curveToRelative(1.21f, 1.21f, 1.21f, 3.18f, 0f, 4.39f)
                lineToRelative(-5.51f, 5.53f)
                lineTo(7.24f, 7.44f)
                close()
                moveTo(14.35f, 21f)
                lineToRelative(1.8f, -1.8f)
                lineTo(5.83f, 8.86f)
                lineTo(0.88f, 13.82f)
                curveToRelative(-1.21f, 1.21f, -1.21f, 3.18f, 0f, 4.39f)
                lineToRelative(4.77f, 4.79f)
                horizontalLineToRelative(18.34f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9.65f)
                close()
            }
        }.also { _Eraser = it}
