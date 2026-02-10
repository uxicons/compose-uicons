package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToCircle: ImageVector? = null

val Icons.Br.ArrowsToCircle: ImageVector
    get() = _ArrowsToCircle ?: UXIcon(name = "ArrowsToCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 12f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(15f, 10f)
            horizontalLineToRelative(4.57f)
            curveToRelative(0.82f, 0f, 1.24f, -0.99f, 0.65f, -1.58f)
            lineToRelative(-1.26f, -1.26f)
            lineToRelative(4.6f, -4.6f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-4.6f, 4.6f)
            lineToRelative(-1.26f, -1.26f)
            curveToRelative(-0.58f, -0.58f, -1.58f, -0.17f, -1.58f, 0.65f)
            verticalLineToRelative(4.57f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            close()
            moveTo(8.42f, 3.77f)
            lineToRelative(-1.26f, 1.26f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.98f, 0.44f, 2.56f)
            lineTo(5.04f, 7.16f)
            lineToRelative(-1.26f, 1.26f)
            curveToRelative(-0.58f, 0.58f, -0.17f, 1.58f, 0.65f, 1.58f)
            horizontalLineToRelative(4.57f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            lineTo(10.0f, 4.43f)
            curveToRelative(0f, -0.82f, -0.99f, -1.24f, -1.58f, -0.65f)
            close()
            moveTo(18.96f, 16.84f)
            lineToRelative(1.26f, -1.26f)
            curveToRelative(0.58f, -0.58f, 0.17f, -1.58f, -0.65f, -1.58f)
            horizontalLineToRelative(-4.57f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(4.57f)
            curveToRelative(0f, 0.82f, 0.99f, 1.24f, 1.58f, 0.65f)
            lineToRelative(1.26f, -1.26f)
            lineToRelative(4.6f, 4.6f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-4.6f, -4.6f)
            close()
            moveTo(9f, 14f)
            lineTo(4.43f, 14f)
            curveToRelative(-0.82f, 0f, -1.24f, 0.99f, -0.65f, 1.58f)
            lineToRelative(1.26f, 1.26f)
            lineTo(0.44f, 21.44f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(4.6f, -4.6f)
            lineToRelative(1.26f, 1.26f)
            curveToRelative(0.58f, 0.58f, 1.58f, 0.17f, 1.58f, -0.65f)
            verticalLineToRelative(-4.57f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
        }
    }.also { _ArrowsToCircle = it }
