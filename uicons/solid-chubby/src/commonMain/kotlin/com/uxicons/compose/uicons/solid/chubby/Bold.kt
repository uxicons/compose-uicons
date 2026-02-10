package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bold: ImageVector? = null

val Icons.Sc.Bold: ImageVector
    get() = _Bold ?: UXIcon(name = "Bold") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.39f, 15.46f)
                curveToRelative(-0.22f, -2.19f, -1.6f, -4.08f, -3.55f, -5.17f)
                curveToRelative(0.82f, -1.32f, 1.1f, -2.9f, 0.76f, -4.44f)
                curveToRelative(-0.61f, -2.81f, -3.31f, -4.85f, -6.41f, -4.85f)
                lineTo(6.33f, 1.0f)
                curveToRelative(-0.97f, 0f, -1.81f, 0.7f, -1.97f, 1.66f)
                curveToRelative(-0.97f, 5.71f, -1.04f, 11.5f, -0.21f, 17.23f)
                lineToRelative(0.2f, 1.4f)
                curveToRelative(0.14f, 0.98f, 0.99f, 1.71f, 1.98f, 1.71f)
                horizontalLineToRelative(0.01f)
                reflectiveCurveToRelative(5.48f, -0.02f, 6.9f, -0.02f)
                curveToRelative(2.1f, 0f, 4.08f, -0.87f, 5.45f, -2.38f)
                curveToRelative(1.29f, -1.43f, 1.9f, -3.25f, 1.7f, -5.14f)
                close()
                moveTo(11.2f, 5f)
                curveToRelative(1.22f, 0f, 2.29f, 0.73f, 2.5f, 1.7f)
                curveToRelative(0.17f, 0.77f, -0.12f, 1.34f, -0.4f, 1.68f)
                curveToRelative(-0.46f, 0.57f, -1.2f, 0.91f, -2.03f, 0.91f)
                horizontalLineToRelative(-3.62f)
                curveToRelative(0.07f, -1.43f, 0.21f, -2.86f, 0.4f, -4.29f)
                horizontalLineToRelative(3.15f)
                close()
                moveTo(15.72f, 17.92f)
                curveToRelative(-0.61f, 0.68f, -1.51f, 1.06f, -2.48f, 1.06f)
                curveToRelative(-0.9f, 0f, -3.44f, 0.01f, -5.18f, 0.01f)
                curveToRelative(-0.26f, -1.9f, -0.42f, -3.8f, -0.47f, -5.7f)
                horizontalLineToRelative(5.42f)
                curveToRelative(1.73f, 0f, 3.25f, 1.15f, 3.39f, 2.57f)
                curveToRelative(0.07f, 0.75f, -0.17f, 1.48f, -0.69f, 2.06f)
                close()
            }
        }.also { _Bold = it}
