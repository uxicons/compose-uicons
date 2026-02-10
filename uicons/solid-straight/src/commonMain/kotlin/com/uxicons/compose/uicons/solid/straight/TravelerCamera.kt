package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TravelerCamera: ImageVector? = null

val Icons.Ss.TravelerCamera: ImageVector
    get() = _TravelerCamera ?: UXIcon(name = "TravelerCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 14f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(0.5f, -1f)
                horizontalLineToRelative(3f)
                lineToRelative(0.5f, 1f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(13.5f, 21f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(4f, 5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.47f)
                lineToRelative(0.28f, -1.11f)
                curveToRelative(0.28f, -1.11f, 1.28f, -1.89f, 2.42f, -1.89f)
                horizontalLineToRelative(5.66f)
                curveToRelative(1.15f, 0f, 2.15f, 0.78f, 2.42f, 1.89f)
                lineToRelative(0.28f, 1.11f)
                horizontalLineToRelative(2.47f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.91f, 7f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                reflectiveCurveToRelative(-5.43f, -2.17f, -5.91f, -5f)
                horizontalLineToRelative(11.82f)
                close()
            }
        }.also { _TravelerCamera = it}
