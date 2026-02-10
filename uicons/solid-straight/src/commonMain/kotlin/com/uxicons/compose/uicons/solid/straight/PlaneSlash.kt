package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneSlash: ImageVector? = null

val Icons.Ss.PlaneSlash: ImageVector
    get() = _PlaneSlash ?: UXIcon(name = "PlaneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.15f, 15.74f)
                lineToRelative(6.81f, 6.81f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(8.96f, 8.96f)
                horizontalLineToRelative(0.6f)
                lineTo(7.97f, 0f)
                horizontalLineToRelative(2.81f)
                curveToRelative(1.1f, 0f, 2.11f, 0.6f, 2.63f, 1.56f)
                lineToRelative(4.14f, 7.44f)
                horizontalLineToRelative(3.31f)
                curveToRelative(1.52f, 0f, 2.83f, 1.08f, 3.07f, 2.5f)
                curveToRelative(0.14f, 0.88f, -0.1f, 1.77f, -0.67f, 2.44f)
                curveToRelative(-0.57f, 0.67f, -1.4f, 1.06f, -2.29f, 1.06f)
                horizontalLineToRelative(-3.41f)
                lineToRelative(-0.41f, 0.74f)
                close()
                moveTo(7.97f, 24f)
                horizontalLineToRelative(2.81f)
                curveToRelative(1.1f, 0f, 2.11f, -0.6f, 2.63f, -1.56f)
                lineToRelative(1.72f, -3.09f)
                lineToRelative(-4.18f, -4.18f)
                lineToRelative(-2.98f, 8.83f)
                close()
                moveTo(1.79f, 6f)
                lineTo(0f, 6f)
                lineToRelative(2.21f, 6.0f)
                lineTo(0.02f, 18f)
                horizontalLineToRelative(2.37f)
                curveToRelative(1.01f, 0f, 1.94f, -0.5f, 2.5f, -1.35f)
                lineToRelative(1.08f, -1.65f)
                horizontalLineToRelative(4.81f)
                lineTo(1.79f, 6f)
                close()
            }
        }.also { _PlaneSlash = it}
