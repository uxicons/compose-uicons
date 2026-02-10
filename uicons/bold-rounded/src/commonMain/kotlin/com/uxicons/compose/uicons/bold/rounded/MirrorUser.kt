package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MirrorUser: ImageVector? = null

val Icons.Br.MirrorUser: ImageVector
    get() = _MirrorUser ?: UXIcon(name = "MirrorUser") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 0f)
            curveToRelative(-3.94f, 0f, -6f, 6.04f, -6f, 12f)
            reflectiveCurveToRelative(2.06f, 12f, 6f, 12f)
            reflectiveCurveToRelative(6f, -6.04f, 6f, -12f)
            reflectiveCurveTo(21.94f, 0f, 18f, 0f)
            close()
            moveTo(18f, 21f)
            curveToRelative(-1.06f, 0f, -3f, -3.42f, -3f, -9f)
            reflectiveCurveToRelative(1.94f, -9f, 3f, -9f)
            curveToRelative(0.59f, 0f, 1.44f, 1.05f, 2.09f, 2.94f)
            curveToRelative(-1.31f, 2.08f, -3.09f, 5.35f, -3.09f, 6.61f)
            curveToRelative(0f, 1.15f, 0.8f, 2.36f, 2.28f, 2.45f)
            lineToRelative(0.15f, 1.19f)
            curveToRelative(0.09f, 0.7f, 0.32f, 1.34f, 0.64f, 1.93f)
            curveToRelative(-0.65f, 1.85f, -1.49f, 2.89f, -2.07f, 2.89f)
            close()
            moveTo(5.88f, 3.33f)
            curveToRelative(1.25f, 1.55f, 4.12f, 7.86f, 4.12f, 9.43f)
            curveToRelative(0f, 1.15f, -0.8f, 2.36f, -2.28f, 2.45f)
            lineToRelative(-0.15f, 1.19f)
            curveToRelative(-0.31f, 2.44f, -2.2f, 4.35f, -4.57f, 4.74f)
            verticalLineToRelative(1.36f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.79f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.61f)
            curveToRelative(1.26f, 0f, 2.32f, -0.94f, 2.48f, -2.19f)
            lineToRelative(0.32f, -2.5f)
            curveToRelative(0.1f, -0.75f, 0.73f, -1.31f, 1.49f, -1.31f)
            horizontalLineToRelative(0.44f)
            curveToRelative(-0.56f, -1.72f, -2.36f, -5.86f, -3.32f, -7.04f)
            curveToRelative(-0.75f, -1.0f, -1.68f, -1.79f, -2.72f, -2.35f)
            curveTo(0.06f, 2.44f, -0.21f, 1.53f, 0.17f, 0.8f)
            curveTo(0.56f, 0.07f, 1.47f, -0.21f, 2.2f, 0.18f)
            curveToRelative(1.43f, 0.76f, 2.7f, 1.85f, 3.68f, 3.15f)
            close()
        }
    }.also { _MirrorUser = it }
