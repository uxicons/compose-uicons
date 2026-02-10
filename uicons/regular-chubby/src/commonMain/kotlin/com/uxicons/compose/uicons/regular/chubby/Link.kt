package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Rc.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.99f, 15.46f)
                lineToRelative(5.43f, -5.51f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.03f, -0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.38f, -1.41f, 0.01f)
                lineToRelative(-5.43f, 5.51f)
                curveToRelative(-0.39f, 0.39f, -0.38f, 1.03f, 0.01f, 1.41f)
                curveToRelative(0.2f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.71f, -0.3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.75f, 3.14f)
                curveTo(17.47f, -0.19f, 13.57f, 0.38f, 8.49f, 4.93f)
                curveToRelative(-0.41f, 0.37f, -0.45f, 1.0f, -0.08f, 1.41f)
                curveToRelative(0.37f, 0.41f, 1f, 0.45f, 1.41f, 0.08f)
                curveToRelative(5.3f, -4.75f, 7.7f, -3.71f, 9.51f, -1.88f)
                curveToRelative(1.82f, 1.84f, 2.85f, 4.29f, -1.85f, 9.68f)
                curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.1f, 1.41f)
                curveToRelative(0.19f, 0.17f, 0.42f, 0.25f, 0.66f, 0.25f)
                curveToRelative(0.28f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(4.54f, -5.21f, 5.09f, -9.03f, 1.77f, -12.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.17f, 17.58f)
                curveToRelative(-5.3f, 4.75f, -7.7f, 3.71f, -9.51f, 1.88f)
                curveToRelative(-1.82f, -1.84f, -2.85f, -4.29f, 1.85f, -9.68f)
                curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.1f, -1.41f)
                reflectiveCurveToRelative(-1.05f, -0.32f, -1.41f, 0.1f)
                curveTo(0.47f, 13.67f, -0.08f, 17.49f, 3.25f, 20.86f)
                curveToRelative(1.4f, 1.42f, 2.9f, 2.13f, 4.57f, 2.13f)
                curveToRelative(2.25f, 0f, 4.78f, -1.3f, 7.7f, -3.92f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1.0f, 0.08f, -1.41f)
                curveToRelative(-0.37f, -0.41f, -1.0f, -0.45f, -1.41f, -0.08f)
                close()
            }
        }.also { _Link = it}
