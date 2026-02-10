package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Br.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
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
            moveTo(9.75f, 10.93f)
            verticalLineToRelative(2.14f)
            curveToRelative(0f, 1.22f, 0.94f, 2.18f, 2.14f, 2.18f)
            horizontalLineToRelative(0.41f)
            curveToRelative(0.54f, 0f, 1.05f, -0.2f, 1.45f, -0.55f)
            curveToRelative(0.62f, -0.55f, 1.57f, -0.5f, 2.12f, 0.12f)
            curveToRelative(0.55f, 0.62f, 0.5f, 1.57f, -0.12f, 2.12f)
            curveToRelative(-0.95f, 0.85f, -2.17f, 1.31f, -3.44f, 1.31f)
            horizontalLineToRelative(-0.41f)
            curveToRelative(-2.84f, 0f, -5.14f, -2.33f, -5.14f, -5.18f)
            verticalLineToRelative(-2.14f)
            curveToRelative(0f, -2.86f, 2.31f, -5.18f, 5.14f, -5.18f)
            horizontalLineToRelative(0.41f)
            curveToRelative(1.32f, 0f, 2.58f, 0.5f, 3.55f, 1.41f)
            curveToRelative(0.6f, 0.57f, 0.63f, 1.52f, 0.07f, 2.12f)
            curveToRelative(-0.57f, 0.6f, -1.52f, 0.63f, -2.12f, 0.07f)
            curveToRelative(-0.41f, -0.38f, -0.94f, -0.59f, -1.5f, -0.59f)
            horizontalLineToRelative(-0.41f)
            curveToRelative(-1.2f, 0f, -2.14f, 0.96f, -2.14f, 2.18f)
            close()
        }
    }.also { _CircleC = it }
