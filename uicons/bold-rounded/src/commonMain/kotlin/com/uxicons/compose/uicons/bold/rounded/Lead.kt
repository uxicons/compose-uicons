package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Br.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(11.31f, 0f, 8f, 0f)
            reflectiveCurveTo(2f, 2.69f, 2f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(8f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(22f, 19f)
            horizontalLineToRelative(1.91f)
            curveToRelative(-0.42f, 2.51f, -2.4f, 4.49f, -4.91f, 4.91f)
            verticalLineToRelative(-1.91f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(1.91f)
            curveToRelative(-2.51f, -0.42f, -4.49f, -2.4f, -4.91f, -4.91f)
            horizontalLineToRelative(1.91f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-1.91f)
            curveToRelative(0.42f, -2.51f, 2.4f, -4.49f, 4.91f, -4.91f)
            verticalLineToRelative(1.91f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-1.91f)
            curveToRelative(2.51f, 0.42f, 4.49f, 2.4f, 4.91f, 4.91f)
            horizontalLineToRelative(-1.91f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            close()
            moveTo(10.0f, 15.62f)
            curveToRelative(-0.06f, 0.83f, -0.78f, 1.45f, -1.6f, 1.39f)
            curveToRelative(-0.13f, -0.01f, -0.26f, -0.01f, -0.39f, -0.01f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            curveToRelative(0.2f, 0f, 0.41f, 0.01f, 0.61f, 0.02f)
            curveToRelative(0.83f, 0.06f, 1.45f, 0.78f, 1.39f, 1.6f)
            close()
        }
    }.also { _Lead = it }
