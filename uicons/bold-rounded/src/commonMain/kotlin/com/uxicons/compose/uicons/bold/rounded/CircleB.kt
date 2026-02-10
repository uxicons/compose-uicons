package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Br.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(15.84f, 10.45f)
            curveToRelative(0.1f, -0.34f, 0.16f, -0.7f, 0.16f, -1.07f)
            curveToRelative(0f, -2.0f, -1.63f, -3.62f, -3.62f, -3.62f)
            horizontalLineToRelative(-1.88f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -1.54f, -0.88f, -2.88f, -2.16f, -3.55f)
            close()
            moveTo(10f, 9.25f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.88f)
            curveToRelative(0.34f, 0f, 0.62f, 0.28f, 0.62f, 0.62f)
            reflectiveCurveToRelative(-0.28f, 0.62f, -0.62f, 0.62f)
            horizontalLineToRelative(-2.38f)
            verticalLineToRelative(-0.75f)
            close()
            moveTo(14f, 15f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
        }
    }.also { _CircleB = it }
