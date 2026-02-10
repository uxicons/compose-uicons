package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duplicate: ImageVector? = null

val Icons.Sr.Duplicate: ImageVector
    get() = _Duplicate ?: UXIcon(name = "Duplicate", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 448f)
                curveToRelative(-82.44f, -0.09f, -149.24f, -66.9f, -149.33f, -149.33f)
                verticalLineToRelative(-192f)
                curveToRelative(0f, -4.27f, 0.28f, -8.53f, 0.64f, -12.63f)
                curveTo(68.14f, 110.86f, 42.73f, 149.37f, 42.67f, 192f)
                verticalLineToRelative(213.33f)
                curveTo(42.74f, 464.21f, 90.45f, 511.93f, 149.33f, 512f)
                horizontalLineToRelative(128f)
                curveToRelative(42.63f, -0.06f, 81.14f, -25.47f, 97.96f, -64.64f)
                curveToRelative(-4.27f, 0.36f, -8.36f, 0.64f, -12.63f, 0.64f)
                horizontalLineTo(256f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(451.31f, 69.8f)
                lineToRelative(-48.72f, -50.33f)
                curveTo(397.22f, 14.05f, 390.92f, 9.62f, 384f, 6.4f)
                verticalLineToRelative(78.93f)
                horizontalLineToRelative(78.08f)
                curveTo(459.28f, 79.65f, 455.65f, 74.42f, 451.31f, 69.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(362.67f, 85.33f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                horizontalLineToRelative(84.61f)
                curveToRelative(-1.57f, -13.85f, -7.65f, -26.81f, -17.3f, -36.86f)
                lineToRelative(-48.72f, -50.33f)
                curveToRelative(-10.66f, -10.8f, -24.8f, -17.49f, -39.92f, -18.86f)
                verticalLineTo(85.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(320f, 85.33f)
                verticalLineTo(0f)
                horizontalLineToRelative(-64f)
                curveToRelative(-58.88f, 0.07f, -106.6f, 47.79f, -106.67f, 106.67f)
                verticalLineToRelative(192f)
                curveToRelative(0.07f, 58.88f, 47.79f, 106.6f, 106.67f, 106.67f)
                horizontalLineToRelative(106.67f)
                curveToRelative(58.88f, -0.07f, 106.6f, -47.79f, 106.67f, -106.67f)
                verticalLineTo(149.33f)
                horizontalLineTo(384f)
                curveTo(348.65f, 149.33f, 320f, 120.68f, 320f, 85.33f)
                close()
            }
        }.also { _Duplicate = it}
