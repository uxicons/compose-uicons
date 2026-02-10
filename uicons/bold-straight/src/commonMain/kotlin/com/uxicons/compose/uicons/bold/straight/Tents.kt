package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tents: ImageVector? = null

val Icons.Bs.Tents: ImageVector
    get() = _Tents ?: UXIcon(name = "Tents") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 5.95f)
                lineTo(0.41f, 19.7f)
                curveToRelative(-0.54f, 0.88f, -0.56f, 1.95f, -0.05f, 2.85f)
                curveToRelative(0.51f, 0.91f, 1.48f, 1.47f, 2.53f, 1.47f)
                horizontalLineToRelative(13.21f)
                curveToRelative(1.05f, 0f, 2.02f, -0.56f, 2.53f, -1.47f)
                curveToRelative(0.51f, -0.9f, 0.49f, -1.96f, -0.08f, -2.89f)
                lineTo(9.5f, 5.95f)
                close()
                moveTo(12.62f, 21.02f)
                lineToRelative(-3.12f, -4.82f)
                lineToRelative(-3.12f, 4.82f)
                horizontalLineToRelative(-3.25f)
                lineToRelative(6.36f, -9.63f)
                lineToRelative(6.36f, 9.63f)
                horizontalLineToRelative(-3.25f)
                close()
                moveTo(23.64f, 16.55f)
                curveToRelative(-0.51f, 0.91f, -1.48f, 1.47f, -2.53f, 1.47f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(-1.98f, -3f)
                horizontalLineToRelative(2.97f)
                lineToRelative(-6.36f, -9.63f)
                lineToRelative(-1.49f, 2.25f)
                lineToRelative(-1.8f, -2.72f)
                lineTo(14.5f, -0.06f)
                lineToRelative(9.06f, 13.71f)
                curveToRelative(0.57f, 0.93f, 0.59f, 1.99f, 0.08f, 2.89f)
                close()
            }
        }.also { _Tents = it}
