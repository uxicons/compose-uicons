package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartUser: ImageVector? = null

val Icons.Br.ChartUser: ImageVector
    get() = _ChartUser ?: UXIcon(name = "ChartUser") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 10.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            close()
            moveTo(6.5f, 16f)
            curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(18.5f, 0f)
            lineTo(9.96f, 0f)
            curveToRelative(-1.96f, 0f, -3.78f, 1.05f, -4.76f, 2.75f)
            curveToRelative(-0.41f, 0.72f, -0.17f, 1.63f, 0.55f, 2.05f)
            curveToRelative(0.71f, 0.41f, 1.63f, 0.17f, 2.05f, -0.55f)
            curveToRelative(0.45f, -0.77f, 1.28f, -1.25f, 2.17f, -1.25f)
            horizontalLineToRelative(8.54f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24.01f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(12.44f, 12.56f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(2.15f, -2.15f)
            lineToRelative(0.84f, 0.84f)
            curveToRelative(0.54f, 0.54f, 1.45f, 0.16f, 1.45f, -0.6f)
            verticalLineToRelative(-3.8f)
            curveToRelative(0f, -0.47f, -0.38f, -0.85f, -0.85f, -0.85f)
            horizontalLineToRelative(-3.8f)
            curveToRelative(-0.76f, 0f, -1.14f, 0.91f, -0.6f, 1.45f)
            lineToRelative(0.84f, 0.84f)
            lineToRelative(-2.15f, 2.15f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            close()
        }
    }.also { _ChartUser = it }
