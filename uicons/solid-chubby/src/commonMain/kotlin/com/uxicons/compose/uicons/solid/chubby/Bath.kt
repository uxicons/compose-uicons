package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bath: ImageVector? = null

val Icons.Sc.Bath: ImageVector
    get() = _Bath ?: UXIcon(name = "Bath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.72f, 11.31f)
                curveToRelative(-0.19f, -0.2f, -0.45f, -0.31f, -0.72f, -0.31f)
                horizontalLineToRelative(-17.99f)
                curveToRelative(0.04f, -1.63f, 0.26f, -3.72f, 1.51f, -5.81f)
                curveToRelative(0.33f, -0.09f, 0.89f, -0.17f, 1.55f, -0.16f)
                curveToRelative(-0.04f, 0.2f, -0.07f, 0.4f, -0.07f, 0.6f)
                curveToRelative(0f, 1.03f, 0.5f, 2.01f, 1.56f, 3.07f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(4.73f, -4.73f)
                curveToRelative(0.39f, -0.37f, 0.39f, -1.04f, 0f, -1.41f)
                curveToRelative(-1.94f, -1.94f, -3.83f, -2.04f, -5.77f, -0.33f)
                curveToRelative(-0.66f, -0.15f, -1.31f, -0.23f, -1.94f, -0.23f)
                curveToRelative(-1.78f, 0f, -2.96f, 0.52f, -3.09f, 0.58f)
                curveToRelative(-0.25f, 0.12f, -0.46f, 0.3f, -0.62f, 0.53f)
                curveToRelative(-2.29f, 3.43f, -2.29f, 6.85f, -2.29f, 8.89f)
                curveToRelative(0.14f, 3.52f, 1.11f, 6.08f, 3f, 7.71f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.9f, 0.01f, 1.5f, -0.5f, 1.5f, -1.67f)
                curveToRelative(1.4f, 0.45f, 3.06f, 0.67f, 5f, 0.67f)
                reflectiveCurveToRelative(3.6f, -0.22f, 5f, -0.67f)
                curveToRelative(0f, 1.17f, 0.6f, 1.67f, 1.5f, 1.67f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.79f)
                curveToRelative(1.88f, -1.63f, 2.85f, -4.14f, 3.0f, -7.67f)
                curveToRelative(0.01f, -0.27f, -0.09f, -0.54f, -0.28f, -0.73f)
                close()
            }
        }.also { _Bath = it}
