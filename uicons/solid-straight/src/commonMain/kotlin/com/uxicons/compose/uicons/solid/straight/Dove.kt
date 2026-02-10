package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dove: ImageVector? = null

val Icons.Ss.Dove: ImageVector
    get() = _Dove ?: UXIcon(name = "Dove") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.29f)
                lineToRelative(-2.1f, -0.9f)
                curveToRelative(-0.23f, -1.37f, -0.94f, -2.43f, -2.03f, -2.97f)
                curveToRelative(-0.95f, -0.48f, -2.04f, -0.56f, -3.05f, -0.22f)
                curveToRelative(-1.01f, 0.34f, -1.83f, 1.05f, -2.3f, 1.98f)
                lineToRelative(-1.3f, 2.5f)
                curveToRelative(-3.25f, -1.25f, -5.53f, -3.3f, -5.56f, -3.33f)
                lineTo(6.21f, 0.03f)
                reflectiveCurveToRelative(-0.24f, 1.45f, -0.24f, 2.33f)
                curveToRelative(1.34f, 1.29f, 3.62f, 3.03f, 6.36f, 4.03f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.84f, 1.62f)
                curveTo(6f, 6.5f, 2.27f, 0.01f, 2.27f, 0.01f)
                curveToRelative(0f, 0f, -0.26f, 3.33f, -0.27f, 4.49f)
                curveToRelative(-0.04f, 3.11f, 0.54f, 9.05f, 6f, 12.5f)
                lineToRelative(-8f, 0.62f)
                curveToRelative(0f, 2.42f, 1.24f, 5.36f, 4.73f, 6.34f)
                lineToRelative(0.36f, 0.1f)
                lineToRelative(5.91f, -3.33f)
                reflectiveCurveToRelative(1.5f, 1.27f, 4.25f, 1.27f)
                curveToRelative(3.72f, 0f, 6.75f, -3.03f, 6.75f, -6.75f)
                curveToRelative(0f, -1.64f, -0.01f, -5.92f, -0.01f, -8.59f)
                lineToRelative(2.01f, -0.86f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _Dove = it}
