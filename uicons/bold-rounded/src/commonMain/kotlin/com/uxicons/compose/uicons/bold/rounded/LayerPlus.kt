package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerPlus: ImageVector? = null

val Icons.Br.LayerPlus: ImageVector
    get() = _LayerPlus ?: UXIcon(name = "LayerPlus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 8.5f)
            curveToRelative(0f, -0.52f, -0.27f, -1.01f, -0.72f, -1.28f)
            lineTo(13.86f, 1.52f)
            curveToRelative(-1.15f, -0.69f, -2.58f, -0.7f, -3.73f, 0f)
            lineTo(0.72f, 7.22f)
            curveToRelative(-0.45f, 0.27f, -0.72f, 0.76f, -0.72f, 1.28f)
            reflectiveCurveToRelative(0.27f, 1.01f, 0.72f, 1.28f)
            lineToRelative(9.41f, 5.7f)
            curveToRelative(0.57f, 0.35f, 1.22f, 0.52f, 1.86f, 0.52f)
            reflectiveCurveToRelative(1.29f, -0.17f, 1.86f, -0.52f)
            lineToRelative(9.41f, -5.7f)
            curveToRelative(0.45f, -0.27f, 0.72f, -0.76f, 0.72f, -1.28f)
            close()
            moveTo(12.31f, 12.91f)
            curveToRelative(-0.19f, 0.11f, -0.43f, 0.11f, -0.62f, 0f)
            lineToRelative(-7.29f, -4.41f)
            lineToRelative(7.29f, -4.41f)
            horizontalLineToRelative(0f)
            curveToRelative(0.19f, -0.12f, 0.43f, -0.12f, 0.62f, 0f)
            lineToRelative(7.29f, 4.41f)
            lineToRelative(-7.29f, 4.41f)
            close()
            moveTo(24f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12.79f, 21.27f)
            curveToRelative(-0.28f, 0.47f, -0.78f, 0.73f, -1.29f, 0.73f)
            curveToRelative(-0.26f, 0f, -0.53f, -0.07f, -0.77f, -0.21f)
            lineTo(0.82f, 15.84f)
            curveToRelative(-0.71f, -0.43f, -0.94f, -1.35f, -0.51f, -2.06f)
            curveToRelative(0.43f, -0.71f, 1.35f, -0.94f, 2.06f, -0.52f)
            lineToRelative(9.91f, 5.94f)
            curveToRelative(0.71f, 0.43f, 0.94f, 1.35f, 0.51f, 2.06f)
            close()
        }
    }.also { _LayerPlus = it }
