package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _N: ImageVector? = null

val Icons.Rs.N: ImageVector
    get() = _N ?: UXIcon(name = "N") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.74f, 24.0f)
                curveToRelative(-0.75f, 0f, -1.46f, -0.38f, -1.88f, -1.03f)
                lineTo(4.45f, 2.12f)
                curveToRelative(-0.02f, -0.04f, -0.1f, -0.15f, -0.28f, -0.1f)
                curveToRelative(-0.18f, 0.05f, -0.18f, 0.19f, -0.18f, 0.24f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                verticalLineTo(2.25f)
                curveTo(2f, 1.24f, 2.65f, 0.38f, 3.61f, 0.09f)
                curveToRelative(0.96f, -0.28f, 1.98f, 0.09f, 2.52f, 0.94f)
                lineToRelative(13.41f, 20.86f)
                curveToRelative(0.03f, 0.04f, 0.1f, 0.16f, 0.28f, 0.1f)
                curveToRelative(0.18f, -0.05f, 0.18f, -0.19f, 0.18f, -0.24f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(21.76f)
                curveToRelative(0f, 1.01f, -0.65f, 1.87f, -1.61f, 2.15f)
                curveToRelative(-0.21f, 0.06f, -0.43f, 0.09f, -0.64f, 0.09f)
                close()
            }
        }.also { _N = it}
