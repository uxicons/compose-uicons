package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Tc.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.41f, 15.33f)
                lineToRelative(5.89f, -5.95f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f)
                lineToRelative(-5.89f, 5.95f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.65f, 17.82f)
                curveToRelative(-0.07f, 0.07f, -7.37f, 7.26f, -12.06f, 2.58f)
                curveToRelative(-1.94f, -1.94f, -2.12f, -4.52f, -0.54f, -7.69f)
                curveToRelative(1.23f, -2.46f, 3.1f, -4.34f, 3.12f, -4.36f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.18f, 0.18f, -4.47f, 4.52f, -4.47f, 8.98f)
                curveToRelative(0f, 1.72f, 0.64f, 3.23f, 1.89f, 4.48f)
                curveToRelative(1.37f, 1.37f, 2.91f, 1.88f, 4.45f, 1.88f)
                curveToRelative(4.5f, 0f, 8.97f, -4.4f, 9.03f, -4.46f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.12f, 2.89f)
                curveTo(15.72f, -2.49f, 7.72f, 5.39f, 7.64f, 5.47f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                curveToRelative(0.07f, -0.07f, 7.38f, -7.26f, 12.06f, -2.58f)
                curveToRelative(1.06f, 1.06f, 1.6f, 2.33f, 1.6f, 3.78f)
                curveToRelative(0f, 4.04f, -4.14f, 8.23f, -4.18f, 8.27f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.18f, -0.18f, 4.47f, -4.51f, 4.48f, -8.97f)
                curveToRelative(0f, -1.72f, -0.64f, -3.23f, -1.9f, -4.49f)
                close()
            }
        }.also { _Link = it}
