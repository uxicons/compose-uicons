package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartSlash: ImageVector? = null

val Icons.Sr.HeartSlash: ImageVector
    get() = _HeartSlash ?: UXIcon(name = "HeartSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 19.49f)
                curveToRelative(0.48f, 0.48f, 0.44f, 1.25f, -0.13f, 1.72f)
                lineToRelative(-0.21f, 0.17f)
                curveToRelative(-1.67f, 1.37f, -4.09f, 1.42f, -5.76f, 0.05f)
                curveTo(3.92f, 17.16f, -0.72f, 11.3f, 0.1f, 6.41f)
                curveToRelative(0.12f, -0.74f, 1.03f, -1.04f, 1.55f, -0.51f)
                curveToRelative(2.91f, 2.91f, 10.92f, 10.92f, 13.59f, 13.59f)
                close()
                moveTo(23.71f, 22.29f)
                lineToRelative(-4.75f, -4.75f)
                curveToRelative(4.08f, -4.48f, 6.59f, -9.67f, 3.92f, -13.69f)
                curveToRelative(-0.6f, -0.9f, -1.44f, -1.63f, -2.44f, -2.11f)
                curveToRelative(-1.04f, -0.5f, -2.11f, -0.75f, -3.16f, -0.75f)
                curveToRelative(-1.21f, 0f, -2.39f, 0.33f, -3.44f, 0.99f)
                curveToRelative(-0.75f, 0.47f, -1.37f, 1.08f, -1.84f, 1.77f)
                curveToRelative(-0.47f, -0.69f, -1.09f, -1.3f, -1.84f, -1.77f)
                curveToRelative(-1.96f, -1.23f, -4.37f, -1.32f, -6.6f, -0.24f)
                curveToRelative(-0.09f, 0.04f, -0.16f, 0.1f, -0.24f, 0.15f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _HeartSlash = it}
