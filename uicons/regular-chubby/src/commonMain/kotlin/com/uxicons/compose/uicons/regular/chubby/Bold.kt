package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bold: ImageVector? = null

val Icons.Rc.Bold: ImageVector
    get() = _Bold ?: UXIcon(name = "Bold") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.22f, 15.96f)
                curveToRelative(-0.26f, -2.51f, -2.19f, -4.59f, -4.75f, -5.4f)
                curveToRelative(0.2f, -0.19f, 0.38f, -0.39f, 0.56f, -0.6f)
                curveToRelative(1.05f, -1.3f, 1.43f, -2.92f, 1.07f, -4.54f)
                curveToRelative(-0.57f, -2.56f, -3.09f, -4.42f, -6.01f, -4.42f)
                lineTo(5.6f, 1.0f)
                curveToRelative(-0.49f, 0f, -0.9f, 0.35f, -0.98f, 0.83f)
                curveToRelative(-1.08f, 6.21f, -1.16f, 12.53f, -0.23f, 18.77f)
                lineToRelative(0.23f, 1.55f)
                curveToRelative(0.07f, 0.49f, 0.49f, 0.85f, 0.99f, 0.85f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(6.19f, -0.02f, 7.8f, -0.02f)
                curveToRelative(2.03f, 0f, 3.94f, -0.83f, 5.25f, -2.28f)
                curveToRelative(1.19f, -1.32f, 1.75f, -3.0f, 1.57f, -4.74f)
                close()
                moveTo(11.09f, 3.0f)
                curveToRelative(1.98f, 0f, 3.69f, 1.2f, 4.05f, 2.85f)
                curveToRelative(0.23f, 1.02f, -0.01f, 2.04f, -0.68f, 2.86f)
                curveToRelative(-0.75f, 0.94f, -2.25f, 1.5f, -3.59f, 1.5f)
                lineTo(5.78f, 10.21f)
                curveToRelative(0.07f, -2.41f, 0.29f, -4.82f, 0.67f, -7.21f)
                horizontalLineToRelative(4.65f)
                close()
                moveTo(17.17f, 19.36f)
                curveToRelative(-0.93f, 1.03f, -2.3f, 1.62f, -3.77f, 1.62f)
                curveToRelative(-1.23f, 0f, -5.17f, 0.01f, -6.94f, 0.02f)
                lineToRelative(-0.1f, -0.7f)
                curveToRelative(-0.4f, -2.69f, -0.59f, -5.39f, -0.61f, -8.09f)
                horizontalLineToRelative(7.4f)
                curveToRelative(2.62f, 0f, 4.85f, 1.74f, 5.08f, 3.96f)
                curveToRelative(0.12f, 1.16f, -0.26f, 2.29f, -1.06f, 3.19f)
                close()
            }
        }.also { _Bold = it}
