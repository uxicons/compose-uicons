package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _N: ImageVector? = null

val Icons.Ts.N: ImageVector
    get() = _N ?: UXIcon(name = "N") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1.89f)
                curveTo(2f, 1.04f, 2.53f, 0.33f, 3.34f, 0.1f)
                curveToRelative(0.81f, -0.24f, 1.64f, 0.07f, 2.1f, 0.78f)
                lineToRelative(13.96f, 21.71f)
                curveToRelative(0.26f, 0.4f, 0.68f, 0.45f, 0.97f, 0.36f)
                curveToRelative(0.3f, -0.09f, 0.62f, -0.35f, 0.62f, -0.83f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(22.12f)
                curveToRelative(0f, 0.85f, -0.53f, 1.55f, -1.34f, 1.79f)
                curveToRelative(-0.81f, 0.24f, -1.64f, -0.07f, -2.1f, -0.78f)
                lineTo(4.6f, 1.42f)
                curveToRelative(-0.26f, -0.4f, -0.67f, -0.45f, -0.98f, -0.36f)
                curveToRelative(-0.3f, 0.09f, -0.62f, 0.35f, -0.62f, 0.83f)
                verticalLineTo(24f)
                close()
            }
        }.also { _N = it}
