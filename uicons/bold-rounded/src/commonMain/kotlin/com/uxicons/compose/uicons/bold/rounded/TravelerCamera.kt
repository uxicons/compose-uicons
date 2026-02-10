package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TravelerCamera: ImageVector? = null

val Icons.Br.TravelerCamera: ImageVector
    get() = _TravelerCamera ?: UXIcon(name = "TravelerCamera") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 23f)
            reflectiveCurveToRelative(0f, 1f, -1f, 1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4.5f)
            curveToRelative(-0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            lineToRelative(-0.14f, -0.28f)
            curveToRelative(-0.22f, -0.44f, -0.67f, -0.72f, -1.16f, -0.72f)
            horizontalLineToRelative(-1.39f)
            curveToRelative(-0.49f, 0f, -0.94f, 0.28f, -1.16f, 0.72f)
            lineToRelative(-0.14f, 0.28f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.81f, 0f, -1f, -1f, -1f, -1f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            close()
            moveTo(12f, 19.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(4f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.17f)
            lineToRelative(0.28f, -0.62f)
            curveToRelative(0.64f, -1.45f, 2.07f, -2.38f, 3.65f, -2.38f)
            horizontalLineToRelative(2.8f)
            curveToRelative(1.58f, 0f, 3.01f, 0.93f, 3.65f, 2.38f)
            lineToRelative(0.28f, 0.62f)
            horizontalLineToRelative(1.17f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(15f, 6f)
            horizontalLineToRelative(-6f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            close()
        }
    }.also { _TravelerCamera = it }
