package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontalAlt: ImageVector? = null

val Icons.Br.ReflectHorizontalAlt: ImageVector
    get() = _ReflectHorizontalAlt ?: UXIcon(name = "ReflectHorizontalAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.81f, 5.7f)
            curveToRelative(-0.64f, -0.64f, -1.59f, -0.84f, -2.43f, -0.49f)
            curveToRelative(-0.84f, 0.34f, -1.38f, 1.15f, -1.38f, 2.06f)
            verticalLineToRelative(9.46f)
            curveToRelative(0f, 0.91f, 0.54f, 1.72f, 1.38f, 2.06f)
            curveToRelative(0.28f, 0.11f, 0.56f, 0.17f, 0.85f, 0.17f)
            curveToRelative(0.58f, 0f, 1.15f, -0.23f, 1.58f, -0.66f)
            lineToRelative(4.32f, -4.36f)
            curveToRelative(0.55f, -0.49f, 0.87f, -1.2f, 0.87f, -1.94f)
            reflectiveCurveToRelative(-0.32f, -1.45f, -0.8f, -1.89f)
            lineTo(3.81f, 5.7f)
            close()
            moveTo(3f, 14.86f)
            verticalLineToRelative(-5.72f)
            lineToRelative(2.84f, 2.85f)
            lineToRelative(-2.84f, 2.86f)
            close()
            moveTo(22.62f, 5.21f)
            curveToRelative(-0.84f, -0.35f, -1.79f, -0.15f, -2.43f, 0.49f)
            lineToRelative(-4.33f, 4.36f)
            curveToRelative(-0.55f, 0.49f, -0.86f, 1.2f, -0.86f, 1.94f)
            reflectiveCurveToRelative(0.32f, 1.45f, 0.8f, 1.88f)
            lineToRelative(4.38f, 4.42f)
            curveToRelative(0.43f, 0.43f, 1.0f, 0.66f, 1.58f, 0.66f)
            curveToRelative(0.29f, 0f, 0.57f, -0.06f, 0.85f, -0.17f)
            curveToRelative(0.84f, -0.35f, 1.38f, -1.16f, 1.38f, -2.06f)
            lineTo(24f, 7.27f)
            curveToRelative(0f, -0.91f, -0.54f, -1.72f, -1.38f, -2.06f)
            close()
            moveTo(21f, 14.86f)
            lineToRelative(-2.84f, -2.86f)
            lineToRelative(2.84f, -2.86f)
            verticalLineToRelative(5.72f)
            close()
            moveTo(13.5f, 1.5f)
            lineTo(13.5f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(10.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ReflectHorizontalAlt = it }
