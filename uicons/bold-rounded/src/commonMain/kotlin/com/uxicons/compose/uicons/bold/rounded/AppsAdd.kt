package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsAdd: ImageVector? = null

val Icons.Br.AppsAdd: ImageVector
    get() = _AppsAdd ?: UXIcon(
        name = "AppsAdd",
        viewportWidth = 512f,
        viewportHeight = 512f
    ) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(309.33f, 149.33f)
            horizontalLineToRelative(53.33f)
            verticalLineToRelative(53.33f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
            verticalLineToRelative(-53.33f)
            horizontalLineTo(480f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
            horizontalLineToRelative(-53.33f)
            verticalLineTo(32f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(53.33f)
            horizontalLineToRelative(-53.33f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveTo(291.66f, 149.33f, 309.33f, 149.33f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(117.33f, 0f)
            curveTo(52.53f, 0f, 0f, 52.53f, 0f, 117.33f)
            reflectiveCurveToRelative(52.53f, 117.33f, 117.33f, 117.33f)
            reflectiveCurveToRelative(117.33f, -52.53f, 117.33f, -117.33f)
            curveTo(234.6f, 52.56f, 182.11f, 0.07f, 117.33f, 0f)
            close()
            moveTo(117.33f, 170.67f)
            curveTo(87.88f, 170.67f, 64f, 146.79f, 64f, 117.33f)
            reflectiveCurveTo(87.88f, 64f, 117.33f, 64f)
            reflectiveCurveToRelative(53.33f, 23.88f, 53.33f, 53.33f)
            reflectiveCurveTo(146.79f, 170.67f, 117.33f, 170.67f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(117.33f, 277.33f)
            curveTo(52.53f, 277.33f, 0f, 329.86f, 0f, 394.67f)
            reflectiveCurveTo(52.53f, 512f, 117.33f, 512f)
            reflectiveCurveToRelative(117.33f, -52.53f, 117.33f, -117.33f)
            curveTo(234.6f, 329.89f, 182.11f, 277.4f, 117.33f, 277.33f)
            close()
            moveTo(117.33f, 448f)
            curveTo(87.88f, 448f, 64f, 424.12f, 64f, 394.67f)
            reflectiveCurveToRelative(23.88f, -53.33f, 53.33f, -53.33f)
            reflectiveCurveToRelative(53.33f, 23.88f, 53.33f, 53.33f)
            reflectiveCurveTo(146.79f, 448f, 117.33f, 448f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(394.67f, 277.33f)
            curveToRelative(-64.8f, 0f, -117.33f, 52.53f, -117.33f, 117.33f)
            reflectiveCurveTo(329.86f, 512f, 394.67f, 512f)
            reflectiveCurveTo(512f, 459.47f, 512f, 394.67f)
            curveTo(511.93f, 329.89f, 459.44f, 277.4f, 394.67f, 277.33f)
            close()
            moveTo(394.67f, 448f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            reflectiveCurveToRelative(23.88f, -53.33f, 53.33f, -53.33f)
            reflectiveCurveTo(448f, 365.21f, 448f, 394.67f)
            reflectiveCurveTo(424.12f, 448f, 394.67f, 448f)
            close()
        }
    }.also { _AppsAdd = it }
