package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mirror: ImageVector? = null

val Icons.Rr.Mirror: ImageVector
    get() = _Mirror ?: UXIcon(name = "Mirror") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.52f, 3.52f)
                lineToRelative(-0.44f, 1.09f)
                curveToRelative(-0.19f, 0.52f, -0.97f, 0.52f, -1.16f, 0f)
                lineToRelative(-0.44f, -1.1f)
                lineToRelative(-1.1f, -0.46f)
                curveToRelative(-0.51f, -0.2f, -0.5f, -0.98f, 0.02f, -1.16f)
                lineToRelative(1.08f, -0.41f)
                lineTo(1.92f, 0.39f)
                curveTo(2.11f, -0.12f, 2.89f, -0.12f, 3.08f, 0.39f)
                lineToRelative(0.44f, 1.09f)
                lineToRelative(1.09f, 0.44f)
                curveToRelative(0.52f, 0.19f, 0.52f, 0.97f, 0f, 1.16f)
                lineToRelative(-1.09f, 0.44f)
                close()
                moveTo(3.96f, 8.16f)
                lineToRelative(1.32f, 0.56f)
                lineToRelative(0.53f, 1.32f)
                curveToRelative(0.22f, 0.62f, 1.17f, 0.62f, 1.39f, 0f)
                lineToRelative(0.52f, -1.31f)
                lineToRelative(1.31f, -0.52f)
                curveToRelative(0.62f, -0.22f, 0.62f, -1.17f, 0f, -1.39f)
                lineToRelative(-1.31f, -0.52f)
                lineToRelative(-0.52f, -1.31f)
                curveToRelative(-0.22f, -0.62f, -1.17f, -0.62f, -1.39f, 0f)
                lineToRelative(-0.52f, 1.3f)
                lineToRelative(-1.3f, 0.49f)
                curveToRelative(-0.62f, 0.21f, -0.64f, 1.16f, -0.03f, 1.39f)
                close()
                moveTo(20.97f, 9.5f)
                curveTo(20.97f, 4.26f, 16.95f, 0f, 12f, 0f)
                curveToRelative(-1.59f, 0f, -3.16f, 0.45f, -4.53f, 1.3f)
                curveToRelative(-0.47f, 0.29f, -0.61f, 0.91f, -0.32f, 1.38f)
                curveToRelative(0.29f, 0.47f, 0.91f, 0.62f, 1.38f, 0.32f)
                curveToRelative(1.05f, -0.65f, 2.25f, -1.0f, 3.47f, -1.0f)
                curveToRelative(3.84f, 0f, 6.97f, 3.36f, 6.97f, 7.5f)
                reflectiveCurveToRelative(-3.13f, 7.5f, -6.97f, 7.5f)
                curveToRelative(-2.72f, 0f, -5.21f, -1.72f, -6.34f, -4.39f)
                curveToRelative(-0.22f, -0.51f, -0.81f, -0.74f, -1.31f, -0.53f)
                curveToRelative(-0.51f, 0.22f, -0.75f, 0.8f, -0.53f, 1.31f)
                curveToRelative(1.23f, 2.9f, 3.73f, 4.9f, 6.62f, 5.45f)
                lineToRelative(-0.49f, 2.7f)
                curveToRelative(-0.23f, 1.28f, 0.75f, 2.46f, 2.05f, 2.46f)
                reflectiveCurveToRelative(2.29f, -1.18f, 2.05f, -2.46f)
                lineToRelative(-0.49f, -2.69f)
                curveToRelative(4.2f, -0.79f, 7.41f, -4.67f, 7.41f, -9.35f)
                close()
            }
        }.also { _Mirror = it}
