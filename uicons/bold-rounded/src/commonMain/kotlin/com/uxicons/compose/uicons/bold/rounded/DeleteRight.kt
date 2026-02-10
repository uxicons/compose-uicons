package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteRight: ImageVector? = null

val Icons.Br.DeleteRight: ImageVector
    get() = _DeleteRight ?: UXIcon(name = "DeleteRight") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.69f, 11.09f)
            lineToRelative(-5.3f, -6.93f)
            curveToRelative(-1.03f, -1.35f, -2.67f, -2.16f, -4.37f, -2.16f)
            lineTo(5f, 2f)
            curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(9.02f)
            curveToRelative(1.7f, 0f, 3.33f, -0.81f, 4.37f, -2.16f)
            lineToRelative(5.3f, -6.93f)
            curveToRelative(0.41f, -0.54f, 0.41f, -1.28f, 0f, -1.82f)
            close()
            moveTo(16.01f, 18.02f)
            curveToRelative(-0.47f, 0.61f, -1.21f, 0.98f, -1.99f, 0.98f)
            lineTo(5f, 19f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(3f, 7f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(9.02f)
            curveToRelative(0.77f, 0f, 1.52f, 0.37f, 1.99f, 0.98f)
            lineToRelative(4.6f, 6.02f)
            lineToRelative(-4.6f, 6.02f)
            close()
            moveTo(13.56f, 10.56f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
        }
    }.also { _DeleteRight = it }
