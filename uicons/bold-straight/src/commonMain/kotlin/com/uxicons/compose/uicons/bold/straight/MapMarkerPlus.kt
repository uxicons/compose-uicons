package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerPlus: ImageVector? = null

val Icons.Bs.MapMarkerPlus: ImageVector
    get() = _MapMarkerPlus ?: UXIcon(name = "MapMarkerPlus", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.67f, 511.89f)
                lineToRelative(150.67f, -147.36f)
                curveToRelative(83.58f, -82.85f, 84.17f, -217.76f, 1.32f, -301.33f)
                reflectiveCurveToRelative(-217.76f, -84.17f, -301.33f, -1.32f)
                curveToRelative(-0.44f, 0.44f, -0.88f, 0.88f, -1.32f, 1.32f)
                curveToRelative(-83.21f, 83.21f, -83.21f, 218.13f, 0f, 301.34f)
                curveToRelative(0.08f, 0.08f, 0.17f, 0.17f, 0.25f, 0.25f)
                lineTo(255.67f, 511.89f)
                close()
                moveTo(150.22f, 108.38f)
                curveToRelative(58.76f, -57.73f, 153.2f, -56.9f, 210.93f, 1.86f)
                curveToRelative(56.92f, 57.94f, 57.03f, 150.77f, 0.23f, 208.83f)
                lineTo(255.67f, 422.48f)
                lineTo(150.19f, 319.33f)
                curveToRelative(-58.25f, -58.24f, -58.26f, -152.68f, -0.01f, -210.94f)
                curveToRelative(0f, -0f, 0.01f, -0.01f, 0.01f, -0.01f)
                horizontalLineTo(150.22f)
                close()
                moveTo(223.71f, 245.82f)
                horizontalLineToRelative(-53.27f)
                verticalLineToRelative(-63.92f)
                horizontalLineToRelative(53.27f)
                verticalLineToRelative(-53.27f)
                horizontalLineToRelative(63.92f)
                verticalLineToRelative(53.27f)
                horizontalLineToRelative(53.27f)
                verticalLineToRelative(63.92f)
                horizontalLineToRelative(-53.27f)
                verticalLineToRelative(53.27f)
                horizontalLineToRelative(-63.92f)
                verticalLineTo(245.82f)
                close()
            }
        }.also { _MapMarkerPlus = it}
