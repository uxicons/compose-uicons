package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ear: ImageVector? = null

val Icons.Ss.Ear: ImageVector
    get() = _Ear ?: UXIcon(name = "Ear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.83f, 2.42f)
                curveTo(16.82f, 0.62f, 14.11f, -0.24f, 11.4f, 0.06f)
                curveTo(7.17f, 0.54f, 3.68f, 3.94f, 3.1f, 8.15f)
                curveToRelative(-0.23f, 1.62f, 0.03f, 3.25f, 0.54f, 4.77f)
                curveToRelative(0.36f, 1.08f, 0.36f, 2.08f, 0.42f, 4.41f)
                curveToRelative(0.05f, 2.16f, 0.64f, 4.21f, 2.38f, 5.51f)
                curveToRelative(1.04f, 0.77f, 2.3f, 1.16f, 3.57f, 1.16f)
                curveToRelative(1.16f, 0f, 2.32f, -0.33f, 3.3f, -0.99f)
                curveToRelative(0.89f, -0.59f, 1.6f, -1.41f, 2.06f, -2.34f)
                curveToRelative(0.8f, -1.63f, 1.63f, -2.71f, 2.63f, -3.42f)
                curveToRelative(2.5f, -1.78f, 4.0f, -4.67f, 4.0f, -7.74f)
                curveToRelative(0f, -2.7f, -1.16f, -5.28f, -3.17f, -7.08f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                curveToRelative(1.64f, 0.02f, 2.96f, 1.36f, 2.96f, 3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(-2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Ear = it}
