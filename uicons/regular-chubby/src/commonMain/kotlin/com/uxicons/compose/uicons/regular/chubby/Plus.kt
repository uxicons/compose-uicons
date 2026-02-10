package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plus: ImageVector? = null

val Icons.Rc.Plus: ImageVector
    get() = _Plus ?: UXIcon(name = "Plus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.25f, 11.53f)
                curveToRelative(-0.16f, -0.04f, -3.89f, -0.97f, -9.73f, -1.03f)
                curveToRelative(0.14f, -5.01f, 0.94f, -8.22f, 0.95f, -8.26f)
                curveToRelative(0.14f, -0.54f, -0.19f, -1.08f, -0.72f, -1.22f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.19f, -1.22f, 0.72f)
                curveToRelative(-0.04f, 0.15f, -0.87f, 3.48f, -1.01f, 8.77f)
                curveToRelative(-5.31f, 0.14f, -8.62f, 0.97f, -8.77f, 1.01f)
                curveToRelative(-0.54f, 0.14f, -0.86f, 0.68f, -0.72f, 1.22f)
                curveToRelative(0.14f, 0.54f, 0.68f, 0.86f, 1.22f, 0.72f)
                curveToRelative(0.03f, -0.01f, 3.21f, -0.81f, 8.25f, -0.95f)
                curveToRelative(0.05f, 5.87f, 0.98f, 9.57f, 1.03f, 9.73f)
                curveToRelative(0.29f, 0.91f, 1.13f, 0.74f, 1.22f, 0.72f)
                curveToRelative(0.54f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                curveToRelative(-0.01f, -0.04f, -0.91f, -3.64f, -0.96f, -9.25f)
                curveToRelative(5.58f, 0.05f, 9.21f, 0.96f, 9.25f, 0.97f)
                curveToRelative(0.08f, 0.02f, 0.95f, 0.19f, 1.22f, -0.72f)
                curveToRelative(0.15f, -0.53f, -0.19f, -1.08f, -0.72f, -1.22f)
                close()
            }
        }.also { _Plus = it}
