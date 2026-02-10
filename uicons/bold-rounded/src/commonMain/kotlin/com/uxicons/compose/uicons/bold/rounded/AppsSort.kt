package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsSort: ImageVector? = null

val Icons.Br.AppsSort: ImageVector
    get() = _AppsSort ?: UXIcon(
        name = "AppsSort",
        viewportWidth = 512f,
        viewportHeight = 512f
    ) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(121.75f, 0f)
            curveTo(56.95f, 0f, 4.42f, 52.53f, 4.42f, 117.33f)
            reflectiveCurveTo(56.95f, 234.67f, 121.75f, 234.67f)
            reflectiveCurveToRelative(117.33f, -52.53f, 117.33f, -117.33f)
            curveTo(239.01f, 52.56f, 186.52f, 0.07f, 121.75f, 0f)
            close()
            moveTo(121.75f, 170.67f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            reflectiveCurveTo(92.3f, 64f, 121.75f, 64f)
            reflectiveCurveToRelative(53.33f, 23.88f, 53.33f, 53.33f)
            reflectiveCurveTo(151.21f, 170.67f, 121.75f, 170.67f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(121.75f, 277.33f)
            curveToRelative(-64.8f, 0f, -117.33f, 52.53f, -117.33f, 117.33f)
            reflectiveCurveTo(56.95f, 512f, 121.75f, 512f)
            reflectiveCurveToRelative(117.33f, -52.53f, 117.33f, -117.33f)
            curveTo(239.01f, 329.89f, 186.52f, 277.4f, 121.75f, 277.33f)
            close()
            moveTo(121.75f, 448f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            reflectiveCurveToRelative(23.88f, -53.33f, 53.33f, -53.33f)
            reflectiveCurveToRelative(53.33f, 23.88f, 53.33f, 53.33f)
            reflectiveCurveTo(151.21f, 448f, 121.75f, 448f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(486.25f, 392.83f)
            horizontalLineToRelative(-44.5f)
            verticalLineTo(119.17f)
            horizontalLineToRelative(44.5f)
            curveToRelative(11.78f, -0f, 21.33f, -9.56f, 21.33f, -21.34f)
            curveToRelative(-0f, -5.66f, -2.25f, -11.08f, -6.25f, -15.08f)
            lineTo(424.83f, 6.25f)
            curveToRelative(-8.33f, -8.33f, -21.83f, -8.33f, -30.17f, 0f)
            lineToRelative(-76.5f, 76.5f)
            curveToRelative(-8.33f, 8.33f, -8.33f, 21.84f, 0f, 30.17f)
            curveToRelative(4f, 4f, 9.42f, 6.24f, 15.08f, 6.25f)
            horizontalLineToRelative(44.5f)
            verticalLineToRelative(273.66f)
            horizontalLineTo(333.25f)
            curveToRelative(-11.78f, 0f, -21.33f, 9.56f, -21.33f, 21.34f)
            curveToRelative(0f, 5.66f, 2.25f, 11.08f, 6.25f, 15.08f)
            lineToRelative(76.5f, 76.5f)
            curveToRelative(8.33f, 8.33f, 21.83f, 8.33f, 30.17f, 0f)
            lineToRelative(76.5f, -76.5f)
            curveToRelative(8.33f, -8.33f, 8.33f, -21.84f, -0f, -30.17f)
            curveTo(497.33f, 395.08f, 491.91f, 392.83f, 486.25f, 392.83f)
            close()
        }
    }.also { _AppsSort = it }
