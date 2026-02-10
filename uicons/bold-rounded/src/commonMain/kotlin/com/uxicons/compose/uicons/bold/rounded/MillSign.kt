package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MillSign: ImageVector? = null

val Icons.Br.MillSign: ImageVector
    get() = _MillSign ?: UXIcon(name = "MillSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 9.75f)
            verticalLineToRelative(9.75f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(9.75f)
            curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
            curveToRelative(-0.39f, 0f, -0.77f, 0.06f, -1.12f, 0.17f)
            lineToRelative(-2.63f, 6.14f)
            verticalLineToRelative(7.19f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.19f)
            lineToRelative(-1.62f, 3.78f)
            curveToRelative(-0.24f, 0.57f, -0.8f, 0.91f, -1.38f, 0.91f)
            curveToRelative(-0.2f, 0f, -0.4f, -0.04f, -0.59f, -0.12f)
            curveToRelative(-0.76f, -0.33f, -1.11f, -1.21f, -0.79f, -1.97f)
            lineToRelative(4.38f, -10.22f)
            verticalLineToRelative(-1.94f)
            curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
            reflectiveCurveToRelative(-3.75f, 1.68f, -3.75f, 3.75f)
            verticalLineToRelative(9.75f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.71f, 0f, 1.31f, 0.5f, 1.46f, 1.17f)
            curveToRelative(1.08f, -0.74f, 2.38f, -1.17f, 3.79f, -1.17f)
            curveToRelative(2.12f, 0f, 4.01f, 0.98f, 5.25f, 2.51f)
            curveToRelative(0.51f, -0.63f, 1.13f, -1.16f, 1.82f, -1.58f)
            lineToRelative(1.3f, -3.03f)
            curveToRelative(0.33f, -0.76f, 1.21f, -1.11f, 1.97f, -0.79f)
            curveToRelative(0.76f, 0.33f, 1.11f, 1.21f, 0.79f, 1.97f)
            lineToRelative(-0.39f, 0.91f)
            curveToRelative(3.61f, 0.13f, 6.51f, 3.1f, 6.51f, 6.75f)
            close()
        }
    }.also { _MillSign = it }
