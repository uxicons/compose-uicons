package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podcast: ImageVector? = null

val Icons.Bs.Podcast: ImageVector
    get() = _Podcast ?: UXIcon(name = "Podcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(13.94f, 16.41f)
                curveToRelative(-0.67f, -0.22f, -1.41f, -0.41f, -1.94f, -0.41f)
                curveToRelative(-0.53f, 0f, -1.26f, 0.19f, -1.93f, 0.41f)
                curveToRelative(-0.91f, 0.3f, -1.45f, 1.23f, -1.28f, 2.17f)
                lineToRelative(1.2f, 5.42f)
                horizontalLineToRelative(4.07f)
                lineToRelative(1.15f, -5.43f)
                curveToRelative(0.17f, -0.94f, -0.38f, -1.86f, -1.28f, -2.15f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 5.13f, 3.24f, 9.51f, 7.78f, 11.22f)
                lineToRelative(-0.84f, -3.78f)
                curveToRelative(-2.37f, -1.62f, -3.94f, -4.35f, -3.94f, -7.43f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 3.08f, -1.55f, 5.8f, -3.92f, 7.42f)
                lineToRelative(-0.8f, 3.77f)
                curveToRelative(4.5f, -1.73f, 7.71f, -6.09f, 7.71f, -11.2f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 1.91f, 0.77f, 3.63f, 2.01f, 4.9f)
                curveToRelative(0.35f, -0.98f, 1.08f, -1.78f, 2.04f, -2.22f)
                curveToRelative(-0.65f, -0.71f, -1.05f, -1.65f, -1.05f, -2.68f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.03f, -0.41f, 1.97f, -1.05f, 2.68f)
                curveToRelative(0.97f, 0.44f, 1.7f, 1.24f, 2.06f, 2.21f)
                curveToRelative(1.23f, -1.26f, 2.0f, -2.98f, 2.0f, -4.88f)
                close()
            }
        }.also { _Podcast = it}
