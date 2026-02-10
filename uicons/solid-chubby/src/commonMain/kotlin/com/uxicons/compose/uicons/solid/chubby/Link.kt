package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Sc.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.49f, 8.33f)
                lineToRelative(-5.12f, 5.24f)
                curveToRelative(-0.58f, 0.59f, -0.57f, 1.54f, 0.02f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
                curveToRelative(0.39f, 0f, 0.78f, -0.15f, 1.07f, -0.45f)
                lineToRelative(5.12f, -5.24f)
                curveToRelative(0.58f, -0.59f, 0.57f, -1.54f, -0.02f, -2.12f)
                reflectiveCurveToRelative(-1.54f, -0.57f, -2.12f, 0.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.13f, 17.36f)
                curveToRelative(-4.49f, 3.85f, -6.3f, 2.71f, -7.64f, 1.34f)
                curveToRelative(-1.35f, -1.38f, -2.49f, -3.24f, 1.22f, -7.81f)
                curveToRelative(0.52f, -0.64f, 0.42f, -1.59f, -0.22f, -2.11f)
                curveToRelative(-0.64f, -0.52f, -1.59f, -0.42f, -2.11f, 0.22f)
                curveTo(0.49f, 13.79f, 0.16f, 17.54f, 3.35f, 20.8f)
                curveToRelative(1.43f, 1.46f, 2.98f, 2.19f, 4.69f, 2.19f)
                curveToRelative(2.11f, 0f, 4.45f, -1.11f, 7.05f, -3.34f)
                curveToRelative(0.63f, -0.54f, 0.7f, -1.49f, 0.16f, -2.12f)
                reflectiveCurveToRelative(-1.49f, -0.7f, -2.12f, -0.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.65f, 3.2f)
                curveTo(17.46f, -0.06f, 13.62f, 0.32f, 8.91f, 4.36f)
                curveToRelative(-0.63f, 0.54f, -0.7f, 1.49f, -0.16f, 2.12f)
                curveToRelative(0.54f, 0.63f, 1.49f, 0.7f, 2.12f, 0.16f)
                curveToRelative(4.49f, -3.85f, 6.3f, -2.71f, 7.64f, -1.34f)
                curveToRelative(1.35f, 1.38f, 2.49f, 3.24f, -1.22f, 7.81f)
                curveToRelative(-0.52f, 0.64f, -0.42f, 1.59f, 0.22f, 2.11f)
                curveToRelative(0.28f, 0.23f, 0.61f, 0.34f, 0.94f, 0.34f)
                curveToRelative(0.44f, 0f, 0.87f, -0.19f, 1.17f, -0.55f)
                curveToRelative(3.9f, -4.79f, 4.23f, -8.54f, 1.04f, -11.8f)
                close()
            }
        }.also { _Link = it}
