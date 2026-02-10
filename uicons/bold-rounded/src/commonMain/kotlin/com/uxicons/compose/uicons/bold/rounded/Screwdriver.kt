package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screwdriver: ImageVector? = null

val Icons.Br.Screwdriver: ImageVector
    get() = _Screwdriver ?: UXIcon(name = "Screwdriver") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.54f, 1.64f)
            lineToRelative(-1.17f, -1.17f)
            curveToRelative(-0.51f, -0.51f, -1.29f, -0.61f, -1.91f, -0.25f)
            lineToRelative(-3.41f, 1.97f)
            curveToRelative(-0.65f, 0.38f, -1.05f, 1.07f, -1.05f, 1.82f)
            verticalLineToRelative(1.88f)
            lineToRelative(-5.46f, 5.46f)
            curveToRelative(-1.45f, -0.58f, -3.23f, -0.3f, -4.37f, 0.84f)
            lineToRelative(-4.9f, 4.9f)
            curveToRelative(-1.49f, 1.49f, -1.66f, 3.89f, -0.38f, 5.46f)
            curveToRelative(0.72f, 0.88f, 2.1f, 1.48f, 3.1f, 1.48f)
            curveToRelative(1.06f, 0f, 2.08f, -0.42f, 2.83f, -1.17f)
            lineToRelative(5f, -5f)
            curveToRelative(1.18f, -1.18f, 1.46f, -2.93f, 0.85f, -4.38f)
            lineToRelative(5.44f, -5.44f)
            horizontalLineToRelative(1.88f)
            curveToRelative(0.75f, 0f, 1.45f, -0.4f, 1.82f, -1.05f)
            lineToRelative(1.96f, -3.41f)
            curveToRelative(0.36f, -0.62f, 0.25f, -1.4f, -0.25f, -1.91f)
            close()
            moveTo(9.71f, 15.71f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.2f, 0.2f, -0.47f, 0.31f, -0.76f, 0.29f)
            curveToRelative(-0.17f, -0.01f, -0.48f, -0.07f, -0.73f, -0.37f)
            curveToRelative(-0.31f, -0.38f, -0.23f, -1.02f, 0.17f, -1.43f)
            lineToRelative(4.9f, -4.9f)
            horizontalLineToRelative(0f)
            curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
            reflectiveCurveToRelative(0.52f, 0.1f, 0.71f, 0.29f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            close()
        }
    }.also { _Screwdriver = it }
