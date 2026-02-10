package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerMinus: ImageVector? = null

val Icons.Br.LayerMinus: ImageVector
    get() = _LayerMinus ?: UXIcon(name = "LayerMinus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16.0f)
            curveToRelative(-0.65f, 0f, -1.29f, -0.17f, -1.86f, -0.52f)
            lineTo(0.72f, 9.78f)
            curveToRelative(-0.45f, -0.27f, -0.72f, -0.76f, -0.72f, -1.28f)
            reflectiveCurveToRelative(0.27f, -1.01f, 0.72f, -1.28f)
            lineTo(10.14f, 1.52f)
            curveToRelative(1.15f, -0.7f, 2.58f, -0.69f, 3.73f, 0f)
            lineToRelative(9.41f, 5.7f)
            curveToRelative(0.45f, 0.27f, 0.72f, 0.76f, 0.72f, 1.28f)
            reflectiveCurveToRelative(-0.27f, 1.01f, -0.72f, 1.28f)
            lineToRelative(-9.41f, 5.7f)
            curveToRelative(-0.57f, 0.35f, -1.22f, 0.52f, -1.86f, 0.52f)
            close()
            moveTo(4.4f, 8.5f)
            lineToRelative(7.29f, 4.41f)
            curveToRelative(0.19f, 0.11f, 0.43f, 0.11f, 0.62f, 0f)
            lineToRelative(7.29f, -4.41f)
            lineToRelative(-7.29f, -4.41f)
            curveToRelative(-0.19f, -0.12f, -0.43f, -0.12f, -0.62f, 0f)
            horizontalLineToRelative(0f)
            lineToRelative(-7.29f, 4.41f)
            close()
            moveTo(24f, 19.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(12.79f, 21.27f)
            curveToRelative(0.43f, -0.71f, 0.2f, -1.63f, -0.51f, -2.06f)
            lineTo(2.37f, 13.27f)
            curveToRelative(-0.71f, -0.43f, -1.63f, -0.2f, -2.06f, 0.52f)
            curveToRelative(-0.43f, 0.71f, -0.2f, 1.63f, 0.51f, 2.06f)
            lineToRelative(9.91f, 5.94f)
            curveToRelative(0.24f, 0.15f, 0.51f, 0.21f, 0.77f, 0.21f)
            curveToRelative(0.51f, 0f, 1.01f, -0.26f, 1.29f, -0.73f)
            close()
        }
    }.also { _LayerMinus = it }
