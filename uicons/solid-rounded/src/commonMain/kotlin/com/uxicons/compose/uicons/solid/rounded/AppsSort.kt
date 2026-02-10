package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsSort: ImageVector? = null

val Icons.Sr.AppsSort: ImageVector
    get() = _AppsSort ?: UXIcon(name = "AppsSort", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(85.34f, 0.03f)
                horizontalLineToRelative(64f)
                curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 47.13f, -38.21f, 85.33f, -85.33f, 85.33f)
                horizontalLineToRelative(-64f)
                curveToRelative(-47.13f, 0f, -85.33f, -38.21f, -85.33f, -85.33f)
                verticalLineToRelative(-64f)
                curveTo(0.01f, 38.23f, 38.21f, 0.03f, 85.34f, 0.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(85.34f, 277.36f)
                horizontalLineToRelative(64f)
                curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 47.13f, -38.21f, 85.33f, -85.33f, 85.33f)
                horizontalLineToRelative(-64f)
                curveToRelative(-47.13f, 0f, -85.33f, -38.21f, -85.33f, -85.33f)
                verticalLineToRelative(-64f)
                curveTo(0.01f, 315.57f, 38.21f, 277.36f, 85.34f, 277.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(475.59f, 408.05f)
                lineToRelative(-48.92f, 48.85f)
                verticalLineTo(55.15f)
                lineToRelative(48.92f, 48.85f)
                curveToRelative(8.34f, 8.33f, 21.85f, 8.32f, 30.18f, -0.01f)
                reflectiveCurveToRelative(8.32f, -21.85f, -0.01f, -30.18f)
                lineToRelative(-55.19f, -55.1f)
                curveToRelative(-24.99f, -24.96f, -65.47f, -24.96f, -90.45f, 0f)
                lineToRelative(-55.19f, 55.1f)
                curveToRelative(-8.34f, 8.33f, -8.34f, 21.84f, -0.01f, 30.18f)
                curveToRelative(8.33f, 8.34f, 21.84f, 8.34f, 30.18f, 0.01f)
                lineToRelative(48.92f, -48.85f)
                verticalLineToRelative(401.75f)
                lineToRelative(-48.92f, -48.85f)
                curveToRelative(-8.34f, -8.33f, -21.86f, -8.32f, -30.19f, 0.02f)
                curveToRelative(-8.33f, 8.34f, -8.32f, 21.86f, 0.02f, 30.19f)
                lineToRelative(55.19f, 55.1f)
                curveToRelative(25.02f, 24.89f, 65.44f, 24.89f, 90.45f, 0f)
                lineToRelative(55.19f, -55.1f)
                curveToRelative(8.34f, -8.33f, 8.35f, -21.84f, 0.02f, -30.19f)
                curveTo(497.45f, 399.73f, 483.93f, 399.72f, 475.59f, 408.05f)
                close()
            }
        }.also { _AppsSort = it}
