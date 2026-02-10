package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Br.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.12f)
            verticalLineToRelative(3.38f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(0f, 3.5f)
            curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.38f)
            lineTo(15.56f, 13.44f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(3f, 5.12f)
            close()
            moveTo(14f, 4f)
            curveToRelative(-0.59f, 0f, -1.18f, 0.05f, -1.76f, 0.15f)
            curveToRelative(-0.81f, 0.14f, -1.36f, 0.92f, -1.22f, 1.74f)
            curveToRelative(0.15f, 0.82f, 0.93f, 1.36f, 1.74f, 1.22f)
            curveToRelative(0.41f, -0.07f, 0.82f, -0.11f, 1.24f, -0.11f)
            curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
            curveToRelative(0f, -0.41f, 0.04f, -0.83f, 0.11f, -1.24f)
            curveToRelative(0.14f, -0.82f, -0.4f, -1.59f, -1.22f, -1.74f)
            curveToRelative(-0.81f, -0.14f, -1.59f, 0.4f, -1.74f, 1.22f)
            curveToRelative(-0.1f, 0.58f, -0.15f, 1.17f, -0.15f, 1.76f)
            curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
            reflectiveCurveTo(19.51f, 4f, 14f, 4f)
            close()
        }
    }.also { _ArrowUpLeftFromCircle = it }
