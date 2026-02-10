package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltSlash: ImageVector? = null

val Icons.Sr.BoltSlash: ImageVector
    get() = _BoltSlash ?: UXIcon(name = "BoltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-6.32f, -6.32f)
                lineToRelative(2.1f, -3.43f)
                curveToRelative(0.61f, -0.89f, 0.67f, -2.04f, 0.16f, -3.0f)
                curveToRelative(-0.51f, -0.95f, -1.49f, -1.55f, -2.57f, -1.55f)
                lineToRelative(-3.83f, -0.0f)
                lineToRelative(1.21f, -5.23f)
                curveToRelative(0.31f, -1.08f, -0.14f, -2.17f, -1.06f, -2.6f)
                curveToRelative(-0.88f, -0.41f, -1.86f, -0.09f, -2.47f, 0.83f)
                lineToRelative(-3.24f, 5.27f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(15.24f, 19.48f)
                lineToRelative(-2.16f, 3.52f)
                curveToRelative(-0.43f, 0.65f, -1.06f, 1f, -1.7f, 1f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.06f, -0.77f, -0.17f)
                curveToRelative(-0.93f, -0.43f, -1.37f, -1.52f, -1.06f, -2.6f)
                lineToRelative(1.2f, -5.23f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-1.08f, 0f, -2.06f, -0.59f, -2.57f, -1.55f)
                curveToRelative(-0.51f, -0.95f, -0.44f, -2.1f, 0.16f, -3.0f)
                lineToRelative(1.03f, -1.68f)
                lineToRelative(9.7f, 9.7f)
                close()
            }
        }.also { _BoltSlash = it}
