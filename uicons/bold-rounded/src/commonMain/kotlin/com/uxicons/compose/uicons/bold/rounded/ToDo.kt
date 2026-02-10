package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToDo: ImageVector? = null

val Icons.Br.ToDo: ImageVector
    get() = _ToDo ?: UXIcon(name = "ToDo") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 18f)
            horizontalLineToRelative(-1.5f)
            lineTo(18f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-7f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(15f, 18f)
            lineTo(6.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(12.5f)
            close()
            moveTo(11.06f, 5.21f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-1.89f, 1.89f)
            curveToRelative(-0.52f, 0.52f, -1.2f, 0.78f, -1.88f, 0.78f)
            reflectiveCurveToRelative(-1.36f, -0.26f, -1.87f, -0.77f)
            lineToRelative(-0.98f, -0.98f)
            curveToRelative(-0.58f, -0.59f, -0.58f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
            lineToRelative(0.73f, 0.73f)
            lineToRelative(1.65f, -1.65f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            close()
            moveTo(11.06f, 11.21f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-1.89f, 1.89f)
            curveToRelative(-0.52f, 0.52f, -1.2f, 0.78f, -1.88f, 0.78f)
            reflectiveCurveToRelative(-1.36f, -0.26f, -1.87f, -0.77f)
            lineToRelative(-0.98f, -0.98f)
            curveToRelative(-0.58f, -0.59f, -0.58f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
            lineToRelative(0.73f, 0.73f)
            lineToRelative(1.65f, -1.65f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            close()
            moveTo(24f, 2.11f)
            verticalLineToRelative(11.49f)
            curveToRelative(0f, 1f, -0.4f, 1.96f, -1.1f, 2.67f)
            lineToRelative(-0.59f, 0.59f)
            curveToRelative(-0.17f, 0.17f, -0.45f, 0.17f, -0.61f, 0f)
            lineToRelative(-0.59f, -0.59f)
            curveToRelative(-0.71f, -0.71f, -1.1f, -1.67f, -1.1f, -2.67f)
            lineTo(20.0f, 2f)
            curveTo(20f, 0.83f, 21.01f, -0.11f, 22.21f, 0.01f)
            curveToRelative(1.04f, 0.1f, 1.79f, 1.06f, 1.79f, 2.1f)
            close()
        }
    }.also { _ToDo = it }
