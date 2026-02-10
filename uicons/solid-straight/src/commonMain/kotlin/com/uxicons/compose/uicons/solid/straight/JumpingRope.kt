package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JumpingRope: ImageVector? = null

val Icons.Ss.JumpingRope: ImageVector
    get() = _JumpingRope ?: UXIcon(name = "JumpingRope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.3f, 15.9f)
                lineToRelative(4f, 4f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-3.89f, 3.89f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.89f, -3.89f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0f, -2.21f, -0.81f, -4.25f, -2.17f, -5.91f)
                curveToRelative(-0.75f, 0.11f, -1.46f, 0.33f, -2.12f, 0.64f)
                curveToRelative(1.42f, 1.4f, 2.29f, 3.25f, 2.29f, 5.27f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -4.34f, 4.12f, -8f, 9f, -8f)
                curveToRelative(2.31f, 0f, 5f, 1.44f, 5f, 5.5f)
                curveToRelative(0f, 0.06f, -0.13f, 4.44f, -2.27f, 8.0f)
                lineToRelative(1.45f, 1.45f)
                curveToRelative(2.72f, -4.17f, 2.82f, -9.38f, 2.82f, -9.45f)
                curveToRelative(0f, -5.15f, -3.63f, -7.5f, -7f, -7.5f)
                curveTo(10.94f, 0f, 6f, 4.49f, 6f, 10f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(8.11f, 17.32f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4f, 4f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(3.89f, 3.89f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.89f, -3.89f)
                lineToRelative(1.29f, -1.29f)
                close()
                moveTo(4.27f, 15.5f)
                curveToRelative(-2.14f, -3.56f, -2.27f, -7.94f, -2.27f, -8.0f)
                curveToRelative(0f, -4.06f, 2.69f, -5.5f, 5f, -5.5f)
                curveToRelative(0.11f, 0f, 0.21f, 0.01f, 0.32f, 0.01f)
                curveToRelative(0.64f, -0.66f, 1.34f, -1.25f, 2.12f, -1.76f)
                curveToRelative(-0.79f, -0.16f, -1.6f, -0.26f, -2.44f, -0.26f)
                curveTo(3.63f, 0f, 0f, 2.35f, 0f, 7.5f)
                curveToRelative(0f, 0.07f, 0.1f, 5.28f, 2.82f, 9.45f)
                lineToRelative(1.45f, -1.45f)
                close()
            }
        }.also { _JumpingRope = it}
