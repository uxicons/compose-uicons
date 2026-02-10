package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Android: ImageVector? = null

val Icons.Brand.Android: ImageVector
    get() = _Android ?: UXIcon(name = "Android") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.52f, 15.34f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1.0f)
            reflectiveCurveToRelative(0.45f, -1f, 1.0f, -1f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1.0f)
            curveTo(18.52f, 14.89f, 18.07f, 15.34f, 17.52f, 15.34f)
            moveTo(6.48f, 15.34f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1.0f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1.0f, -1f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1.0f)
            curveTo(7.48f, 14.89f, 7.03f, 15.34f, 6.48f, 15.34f)
            moveTo(17.88f, 9.32f)
            lineToRelative(2.0f, -3.46f)
            curveToRelative(0.12f, -0.2f, 0.05f, -0.45f, -0.15f, -0.57f)
            curveToRelative(-0.2f, -0.12f, -0.45f, -0.05f, -0.57f, 0.15f)
            lineToRelative(0f, 0f)
            lineToRelative(-2.02f, 3.5f)
            curveTo(15.59f, 8.24f, 13.85f, 7.85f, 12f, 7.85f)
            reflectiveCurveTo(8.41f, 8.24f, 6.86f, 8.95f)
            lineTo(4.84f, 5.45f)
            curveTo(4.73f, 5.25f, 4.47f, 5.18f, 4.27f, 5.29f)
            curveTo(4.08f, 5.41f, 4.01f, 5.66f, 4.12f, 5.86f)
            lineToRelative(0f, 0f)
            lineToRelative(2.0f, 3.46f)
            curveToRelative(-3.43f, 1.86f, -5.78f, 5.34f, -6.12f, 9.44f)
            horizontalLineToRelative(24f)
            curveTo(23.66f, 14.66f, 21.31f, 11.19f, 17.88f, 9.32f)
        }
    }.also { _Android = it }
