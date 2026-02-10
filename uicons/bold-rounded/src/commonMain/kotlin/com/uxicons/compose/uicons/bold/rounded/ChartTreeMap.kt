package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartTreeMap: ImageVector? = null

val Icons.Br.ChartTreeMap: ImageVector
    get() = _ChartTreeMap ?: UXIcon(name = "ChartTreeMap") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            close()
            moveTo(16f, 6f)
            horizontalLineToRelative(5f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            close()
            moveTo(21f, 18f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            close()
            moveTo(11f, 17f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-3f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(3f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
            moveTo(8f, 17f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-3f)
            close()
            moveTo(11f, 4f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-3f)
            curveTo(1.79f, 11f, 0f, 9.21f, 0f, 7f)
            verticalLineToRelative(-3f)
            curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
            horizontalLineToRelative(3f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
            moveTo(8f, 4f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-3f)
            close()
        }
    }.also { _ChartTreeMap = it }
