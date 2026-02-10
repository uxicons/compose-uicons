package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerPlus: ImageVector? = null

val Icons.Rs.MapMarkerPlus: ImageVector
    get() = _MapMarkerPlus ?: UXIcon(name = "MapMarkerPlus", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.67f, 511.89f)
                lineToRelative(150.67f, -147.36f)
                curveToRelative(83.58f, -82.85f, 84.17f, -217.76f, 1.32f, -301.33f)
                reflectiveCurveToRelative(-217.76f, -84.17f, -301.33f, -1.32f)
                curveToRelative(-0.44f, 0.44f, -0.88f, 0.88f, -1.32f, 1.32f)
                curveToRelative(-83.21f, 83.21f, -83.21f, 218.13f, 0f, 301.34f)
                curveToRelative(0.06f, 0.06f, 0.11f, 0.11f, 0.17f, 0.17f)
                lineTo(255.67f, 511.89f)
                close()
                moveTo(135.13f, 93.32f)
                curveToRelative(66.52f, -66.62f, 174.46f, -66.69f, 241.08f, -0.17f)
                reflectiveCurveToRelative(66.69f, 174.46f, 0.17f, 241.08f)
                lineTo(255.67f, 452.27f)
                lineTo(135.13f, 334.39f)
                curveToRelative(-66.57f, -66.57f, -66.57f, -174.5f, -0.01f, -241.07f)
                curveTo(135.13f, 93.32f, 135.13f, 93.32f, 135.13f, 93.32f)
                lineTo(135.13f, 93.32f)
                close()
                moveTo(234.36f, 235.16f)
                horizontalLineToRelative(-63.92f)
                verticalLineToRelative(-42.62f)
                horizontalLineToRelative(63.92f)
                verticalLineToRelative(-63.92f)
                horizontalLineToRelative(42.62f)
                verticalLineToRelative(63.92f)
                horizontalLineToRelative(63.92f)
                verticalLineToRelative(42.62f)
                horizontalLineToRelative(-63.92f)
                verticalLineToRelative(63.92f)
                horizontalLineTo(234.36f)
                verticalLineTo(235.16f)
                close()
            }
        }.also { _MapMarkerPlus = it}
