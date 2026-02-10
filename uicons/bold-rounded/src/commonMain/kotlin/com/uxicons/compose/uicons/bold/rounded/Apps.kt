package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Apps: ImageVector? = null

val Icons.Br.Apps: ImageVector
    get() = _Apps ?: UXIcon(
        name = "Apps",
        viewportWidth = 512f,
        viewportHeight = 512f
    ) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(117.33f, 234.67f)
            curveTo(52.53f, 234.67f, 0f, 182.13f, 0f, 117.33f)
            reflectiveCurveTo(52.53f, 0f, 117.33f, 0f)
            reflectiveCurveToRelative(117.33f, 52.53f, 117.33f, 117.33f)
            curveTo(234.6f, 182.11f, 182.11f, 234.6f, 117.33f, 234.67f)
            close()
            moveTo(117.33f, 64f)
            curveTo(87.88f, 64f, 64f, 87.88f, 64f, 117.33f)
            reflectiveCurveToRelative(23.88f, 53.33f, 53.33f, 53.33f)
            reflectiveCurveToRelative(53.33f, -23.88f, 53.33f, -53.33f)
            reflectiveCurveTo(146.79f, 64f, 117.33f, 64f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(394.67f, 234.67f)
            curveToRelative(-64.8f, 0f, -117.33f, -52.53f, -117.33f, -117.33f)
            reflectiveCurveTo(329.86f, 0f, 394.67f, 0f)
            reflectiveCurveTo(512f, 52.53f, 512f, 117.33f)
            curveTo(511.93f, 182.11f, 459.44f, 234.6f, 394.67f, 234.67f)
            close()
            moveTo(394.67f, 64f)
            curveToRelative(-29.45f, 0f, -53.33f, 23.88f, -53.33f, 53.33f)
            reflectiveCurveToRelative(23.88f, 53.33f, 53.33f, 53.33f)
            reflectiveCurveTo(448f, 146.79f, 448f, 117.33f)
            reflectiveCurveTo(424.12f, 64f, 394.67f, 64f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(117.33f, 512f)
            curveTo(52.53f, 512f, 0f, 459.47f, 0f, 394.67f)
            reflectiveCurveToRelative(52.53f, -117.33f, 117.33f, -117.33f)
            reflectiveCurveToRelative(117.33f, 52.53f, 117.33f, 117.33f)
            curveTo(234.6f, 459.44f, 182.11f, 511.93f, 117.33f, 512f)
            close()
            moveTo(117.33f, 341.33f)
            curveTo(87.88f, 341.33f, 64f, 365.21f, 64f, 394.67f)
            reflectiveCurveTo(87.88f, 448f, 117.33f, 448f)
            reflectiveCurveToRelative(53.33f, -23.88f, 53.33f, -53.33f)
            reflectiveCurveTo(146.79f, 341.33f, 117.33f, 341.33f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(394.67f, 512f)
            curveToRelative(-64.8f, 0f, -117.33f, -52.53f, -117.33f, -117.33f)
            reflectiveCurveToRelative(52.53f, -117.33f, 117.33f, -117.33f)
            reflectiveCurveTo(512f, 329.86f, 512f, 394.67f)
            curveTo(511.93f, 459.44f, 459.44f, 511.93f, 394.67f, 512f)
            close()
            moveTo(394.67f, 341.33f)
            curveToRelative(-29.45f, 0f, -53.33f, 23.88f, -53.33f, 53.33f)
            reflectiveCurveTo(365.21f, 448f, 394.67f, 448f)
            reflectiveCurveTo(448f, 424.12f, 448f, 394.67f)
            reflectiveCurveTo(424.12f, 341.33f, 394.67f, 341.33f)
            close()
        }
    }.also { _Apps = it }
