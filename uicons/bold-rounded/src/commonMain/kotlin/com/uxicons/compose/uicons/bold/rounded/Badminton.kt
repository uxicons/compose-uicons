package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badminton: ImageVector? = null

val Icons.Br.Badminton: ImageVector
    get() = _Badminton ?: UXIcon(name = "Badminton") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.34f, 16.99f)
            curveToRelative(2.35f, 0f, 4.82f, -0.98f, 6.75f, -2.91f)
            curveToRelative(3.53f, -3.53f, 3.9f, -8.91f, 0.82f, -11.99f)
            curveToRelative(-3.08f, -3.08f, -8.46f, -2.71f, -11.99f, 0.82f)
            curveToRelative(-3.12f, 3.12f, -3.77f, 7.67f, -1.77f, 10.81f)
            lineToRelative(-3.3f, 3.3f)
            curveToRelative(-0.75f, -0.11f, -1.54f, 0.13f, -2.12f, 0.71f)
            lineToRelative(-2.0f, 2.0f)
            curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
            reflectiveCurveToRelative(2.56f, 0.97f, 3.54f, 0f)
            lineToRelative(2.0f, -2.0f)
            curveToRelative(0.58f, -0.58f, 0.81f, -1.37f, 0.71f, -2.12f)
            lineToRelative(3.3f, -3.3f)
            curveToRelative(1.2f, 0.77f, 2.61f, 1.14f, 4.06f, 1.14f)
            close()
            moveTo(12.04f, 5.04f)
            curveToRelative(1.34f, -1.34f, 3.05f, -2.04f, 4.62f, -2.04f)
            curveToRelative(1.19f, 0f, 2.3f, 0.4f, 3.12f, 1.22f)
            curveToRelative(1.91f, 1.91f, 1.54f, 5.38f, -0.82f, 7.74f)
            curveToRelative(-2.36f, 2.36f, -5.83f, 2.73f, -7.74f, 0.82f)
            curveToRelative(-1.91f, -1.91f, -1.54f, -5.38f, 0.82f, -7.74f)
            close()
            moveTo(23.46f, 22.8f)
            curveToRelative(0.24f, 0.57f, -0.17f, 1.2f, -0.79f, 1.2f)
            horizontalLineToRelative(-4.29f)
            curveToRelative(-0.62f, 0f, -1.04f, -0.63f, -0.79f, -1.2f)
            lineToRelative(1.42f, -2.3f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            lineToRelative(1.46f, 2.3f)
            close()
        }
    }.also { _Badminton = it }
