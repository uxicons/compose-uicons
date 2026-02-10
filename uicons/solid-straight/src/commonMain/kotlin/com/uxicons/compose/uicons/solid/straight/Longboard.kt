package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Longboard: ImageVector? = null

val Icons.Ss.Longboard: ImageVector
    get() = _Longboard ?: UXIcon(name = "Longboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.91f, 10.41f)
                lineToRelative(1.3f, 1.3f)
                lineToRelative(-3f, 3f)
                lineToRelative(-1.09f, -1.09f)
                curveToRelative(-1.7f, 1.67f, -3.47f, 3.21f, -5.35f, 4.65f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-3f, 3f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(-1.61f, 1.06f, -3.33f, 2.09f, -5.07f, 3.03f)
                lineToRelative(-4.99f, -4.99f)
                curveToRelative(0.94f, -1.74f, 1.96f, -3.46f, 3.02f, -5.07f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(3f, -3f)
                lineToRelative(0.94f, 0.94f)
                curveToRelative(1.44f, -1.88f, 2.98f, -3.65f, 4.65f, -5.35f)
                lineToRelative(-1.09f, -1.09f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(2.76f, -1.89f, 5.01f, -2.09f, 7.24f, -2.09f)
                curveToRelative(1.8f, 0f, 3.17f, 1.36f, 3.17f, 3.17f)
                curveToRelative(0f, 2.23f, -0.2f, 4.48f, -2.09f, 7.24f)
                close()
            }
        }.also { _Longboard = it}
