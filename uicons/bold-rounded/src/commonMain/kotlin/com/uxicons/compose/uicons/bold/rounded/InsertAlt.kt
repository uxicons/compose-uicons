package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertAlt: ImageVector? = null

val Icons.Br.InsertAlt: ImageVector
    get() = _InsertAlt ?: UXIcon(name = "InsertAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11.85f)
            lineToRelative(1.92f, 1.95f)
            curveToRelative(0.58f, 0.59f, 0.57f, 1.54f, -0.01f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.67f, 0.43f, -1.05f, 0.43f)
            curveToRelative(-0.39f, 0f, -0.77f, -0.15f, -1.07f, -0.45f)
            lineToRelative(-3.74f, -3.79f)
            curveToRelative(-0.97f, -0.97f, -0.97f, -2.55f, 0.01f, -3.53f)
            lineToRelative(3.73f, -3.79f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.12f, -0.01f)
            curveToRelative(0.59f, 0.58f, 0.6f, 1.53f, 0.01f, 2.12f)
            lineToRelative(-1.92f, 1.95f)
            horizontalLineToRelative(11.85f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(21.73f, 16.22f)
            curveToRelative(-0.7f, -0.43f, -1.63f, -0.21f, -2.06f, 0.49f)
            curveToRelative(-1.65f, 2.68f, -4.52f, 4.29f, -7.67f, 4.29f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            curveToRelative(3.15f, 0f, 6.01f, 1.6f, 7.67f, 4.29f)
            curveToRelative(0.43f, 0.71f, 1.36f, 0.93f, 2.06f, 0.49f)
            curveToRelative(0.71f, -0.43f, 0.93f, -1.36f, 0.49f, -2.06f)
            curveTo(20.02f, 2.14f, 16.2f, 0f, 12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            curveToRelative(4.2f, 0f, 8.02f, -2.14f, 10.22f, -5.71f)
            curveToRelative(0.43f, -0.7f, 0.21f, -1.63f, -0.49f, -2.06f)
            close()
        }
    }.also { _InsertAlt = it }
