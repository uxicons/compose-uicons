package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Br.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
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
            moveTo(18.23f, 8.73f)
            lineToRelative(-1.09f, 7.09f)
            curveToRelative(-0.23f, 1.25f, -1.06f, 2.08f, -2.12f, 2.17f)
            curveToRelative(-1.02f, 0.1f, -1.97f, -0.56f, -2.4f, -1.65f)
            lineToRelative(-0.62f, -1.32f)
            lineToRelative(-0.62f, 1.32f)
            curveToRelative(-0.41f, 1.03f, -1.25f, 1.66f, -2.21f, 1.66f)
            curveToRelative(-1.17f, 0f, -2.08f, -0.94f, -2.3f, -2.14f)
            lineToRelative(-1.1f, -7.13f)
            curveToRelative(-0.13f, -0.82f, 0.44f, -1.58f, 1.25f, -1.71f)
            curveToRelative(0.82f, -0.12f, 1.58f, 0.44f, 1.71f, 1.25f)
            lineToRelative(0.77f, 5.01f)
            lineToRelative(1.14f, -2.42f)
            curveToRelative(0.25f, -0.53f, 0.78f, -0.86f, 1.36f, -0.86f)
            reflectiveCurveToRelative(1.11f, 0.34f, 1.36f, 0.86f)
            lineToRelative(1.14f, 2.42f)
            lineToRelative(0.77f, -5.01f)
            curveToRelative(0.13f, -0.82f, 0.89f, -1.38f, 1.71f, -1.25f)
            curveToRelative(0.82f, 0.13f, 1.38f, 0.89f, 1.25f, 1.71f)
            close()
        }
    }.also { _CircleW = it }
