package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMaximize: ImageVector? = null

val Icons.Sc.WindowMaximize: ImageVector
    get() = _WindowMaximize ?: UXIcon(name = "WindowMaximize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.41f, 7f)
                curveToRelative(0.28f, -1.84f, 0.6f, -3.15f, 0.62f, -3.24f)
                curveToRelative(0.08f, -0.33f, 0.33f, -0.6f, 0.65f, -0.71f)
                curveToRelative(0.13f, -0.04f, 3.22f, -1.05f, 9.32f, -1.05f)
                reflectiveCurveToRelative(9.19f, 1.01f, 9.32f, 1.05f)
                curveToRelative(0.32f, 0.11f, 0.57f, 0.37f, 0.65f, 0.71f)
                curveToRelative(0.02f, 0.09f, 0.34f, 1.4f, 0.62f, 3.24f)
                close()
                moveTo(1.16f, 9f)
                curveToRelative(-0.09f, 0.95f, -0.16f, 1.98f, -0.16f, 3f)
                curveToRelative(0f, 4.08f, 0.99f, 8.07f, 1.03f, 8.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.13f, 0.04f, 3.22f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.37f, 0.65f, -0.71f)
                curveToRelative(0.04f, -0.17f, 1.03f, -4.17f, 1.03f, -8.24f)
                curveToRelative(0f, -1.02f, -0.06f, -2.04f, -0.16f, -3f)
                close()
            }
        }.also { _WindowMaximize = it}
