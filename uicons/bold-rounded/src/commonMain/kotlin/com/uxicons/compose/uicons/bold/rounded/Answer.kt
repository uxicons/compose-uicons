package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Answer: ImageVector? = null

val Icons.Br.Answer: ImageVector
    get() = _Answer ?: UXIcon(name = "Answer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.09f, 6.66f)
            curveToRelative(-0.23f, -0.99f, -1.06f, -1.66f, -2.08f, -1.66f)
            reflectiveCurveToRelative(-1.86f, 0.67f, -2.08f, 1.66f)
            lineToRelative(-1.62f, 7.12f)
            curveToRelative(-0.12f, 0.54f, 0.21f, 1.07f, 0.75f, 1.2f)
            curveToRelative(0.53f, 0.13f, 1.07f, -0.21f, 1.2f, -0.75f)
            lineToRelative(0.28f, -1.22f)
            horizontalLineToRelative(2.96f)
            lineToRelative(0.28f, 1.22f)
            curveToRelative(0.1f, 0.46f, 0.52f, 0.78f, 0.97f, 0.78f)
            curveToRelative(0.07f, 0f, 0.15f, -0.01f, 0.22f, -0.03f)
            curveToRelative(0.54f, -0.12f, 0.88f, -0.66f, 0.75f, -1.2f)
            lineToRelative(-1.62f, -7.12f)
            close()
            moveTo(10.98f, 11.01f)
            lineToRelative(0.89f, -3.9f)
            curveToRelative(0.01f, -0.04f, 0.02f, -0.11f, 0.14f, -0.11f)
            reflectiveCurveToRelative(0.12f, 0.06f, 0.14f, 0.11f)
            lineToRelative(0.89f, 3.9f)
            horizontalLineToRelative(-2.05f)
            close()
            moveTo(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.24f)
            lineToRelative(3.6f, 3.03f)
            curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.68f, 0.64f)
            curveToRelative(0.58f, 0f, 1.16f, -0.2f, 1.61f, -0.6f)
            lineToRelative(3.71f, -3.06f)
            horizontalLineToRelative(1.17f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-1.71f)
            curveToRelative(-0.35f, 0f, -0.69f, 0.12f, -0.96f, 0.34f)
            lineToRelative(-3.83f, 3.17f)
            lineToRelative(-3.75f, -3.16f)
            curveToRelative(-0.27f, -0.23f, -0.61f, -0.35f, -0.97f, -0.35f)
            horizontalLineToRelative(-1.79f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
        }
    }.also { _Answer = it }
