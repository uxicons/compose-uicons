package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _XRay: ImageVector? = null

val Icons.Br.XRay: ImageVector
    get() = _XRay ?: UXIcon(name = "XRay") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.5f)
            lineTo(22f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(1.5f, 0f)
            curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(18f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(5f, 3f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(18f)
            lineTo(5f, 21f)
            lineTo(5f, 3f)
            close()
            moveTo(17.39f, 17.55f)
            lineToRelative(-0.72f, 0.72f)
            curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
            horizontalLineToRelative(-5.77f)
            curveToRelative(-0.66f, 0f, -1.3f, -0.26f, -1.77f, -0.73f)
            lineToRelative(-0.75f, -0.75f)
            curveToRelative(-1.29f, -1.29f, -0.39f, -3.5f, 1.44f, -3.52f)
            horizontalLineToRelative(0.04f)
            reflectiveCurveToRelative(2.41f, 0f, 2.41f, 0f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.44f)
            curveToRelative(1.84f, 0.01f, 2.76f, 2.24f, 1.45f, 3.55f)
            close()
        }
    }.also { _XRay = it }
