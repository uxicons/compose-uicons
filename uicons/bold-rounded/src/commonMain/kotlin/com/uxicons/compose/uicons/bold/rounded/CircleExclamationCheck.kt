package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Br.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11.5f, 11.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            close()
            moveTo(8.5f, 15.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(14.12f, 17.66f)
            curveToRelative(-1.2f, 0.88f, -2.62f, 1.34f, -4.12f, 1.34f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
            curveToRelative(2.74f, 0f, 5.25f, 1.62f, 6.38f, 4.12f)
            curveToRelative(0.34f, 0.76f, 1.23f, 1.09f, 1.98f, 0.75f)
            curveToRelative(0.76f, -0.34f, 1.09f, -1.23f, 0.75f, -1.98f)
            curveToRelative(-1.62f, -3.57f, -5.19f, -5.88f, -9.11f, -5.88f)
            curveTo(4.49f, 2f, 0f, 6.49f, 0f, 12f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.13f, 0f, 4.17f, -0.66f, 5.88f, -1.91f)
            curveToRelative(0.67f, -0.49f, 0.82f, -1.43f, 0.33f, -2.1f)
            curveToRelative(-0.49f, -0.67f, -1.43f, -0.82f, -2.1f, -0.33f)
            close()
            moveTo(23.58f, 9.96f)
            curveToRelative(-0.57f, -0.6f, -1.52f, -0.62f, -2.12f, -0.04f)
            lineToRelative(-3.01f, 2.9f)
            curveToRelative(-0.24f, 0.25f, -0.65f, 0.25f, -0.94f, -0.04f)
            lineToRelative(-1.49f, -1.38f)
            curveToRelative(-0.61f, -0.56f, -1.56f, -0.52f, -2.12f, 0.09f)
            curveToRelative(-0.56f, 0.61f, -0.52f, 1.56f, 0.09f, 2.12f)
            lineToRelative(1.45f, 1.33f)
            curveToRelative(0.71f, 0.71f, 1.65f, 1.06f, 2.58f, 1.06f)
            curveToRelative(0.92f, 0f, 1.84f, -0.35f, 2.54f, -1.04f)
            lineToRelative(2.99f, -2.88f)
            curveToRelative(0.6f, -0.57f, 0.62f, -1.52f, 0.04f, -2.12f)
            close()
        }
    }.also { _CircleExclamationCheck = it }
