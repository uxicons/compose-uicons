package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Br.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 6.0f)
            curveToRelative(0f, -0.56f, -0.45f, -1.0f, -1.0f, -1.0f)
            horizontalLineToRelative(-3.26f)
            curveToRelative(-0.65f, 0f, -0.98f, 0.79f, -0.52f, 1.25f)
            lineToRelative(0.71f, 0.71f)
            lineToRelative(-1.57f, 1.57f)
            curveToRelative(-1.38f, -0.96f, -3.05f, -1.53f, -4.85f, -1.53f)
            curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
            reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
            curveToRelative(0f, -1.8f, -0.57f, -3.47f, -1.53f, -4.85f)
            lineToRelative(1.57f, -1.57f)
            lineToRelative(0.71f, 0.71f)
            curveToRelative(0.46f, 0.46f, 1.25f, 0.13f, 1.25f, -0.52f)
            verticalLineToRelative(-3.26f)
            close()
            moveTo(8.5f, 21f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(24f, 8.5f)
            curveToRelative(0f, 2.24f, -0.86f, 4.35f, -2.43f, 5.95f)
            curveToRelative(-0.29f, 0.3f, -0.68f, 0.45f, -1.07f, 0.45f)
            curveToRelative(-0.38f, 0f, -0.76f, -0.14f, -1.05f, -0.43f)
            curveToRelative(-0.59f, -0.58f, -0.6f, -1.53f, -0.02f, -2.12f)
            curveToRelative(1.01f, -1.03f, 1.57f, -2.4f, 1.57f, -3.85f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            curveToRelative(-1.49f, 0f, -2.88f, 0.59f, -3.93f, 1.65f)
            curveToRelative(-0.58f, 0.59f, -1.53f, 0.6f, -2.12f, 0.02f)
            curveToRelative(-0.59f, -0.58f, -0.6f, -1.53f, -0.02f, -2.12f)
            curveToRelative(1.61f, -1.65f, 3.77f, -2.55f, 6.07f, -2.55f)
            curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
            close()
        }
    }.also { _TransformationCircle = it }
