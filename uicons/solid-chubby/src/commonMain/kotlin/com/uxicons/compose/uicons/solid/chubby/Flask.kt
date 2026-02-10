package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Sc.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 21.32f)
                curveToRelative(-0.03f, 0.45f, -0.37f, 0.83f, -0.82f, 0.91f)
                curveToRelative(-1.56f, 0.29f, -4.82f, 0.77f, -9.13f, 0.77f)
                reflectiveCurveToRelative(-7.57f, -0.48f, -9.13f, -0.77f)
                curveToRelative(-0.45f, -0.08f, -0.78f, -0.46f, -0.82f, -0.91f)
                curveToRelative(-0.01f, -0.07f, -0.12f, -1.78f, 0.36f, -4.32f)
                horizontalLineToRelative(14.55f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-14.05f)
                curveToRelative(0.85f, -2.38f, 2.85f, -4.4f, 6.12f, -6.13f)
                curveToRelative(-0.02f, -0.71f, -0.03f, -1.44f, -0.03f, -2.03f)
                curveToRelative(0f, -0.95f, 0.04f, -1.92f, 0.1f, -2.89f)
                curveToRelative(-0.65f, -0.16f, -1.14f, -0.75f, -1.14f, -1.45f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.68f, -0.45f, 1.24f, -1.07f, 1.43f)
                curveToRelative(0.06f, 0.98f, 0.1f, 1.95f, 0.1f, 2.91f)
                curveToRelative(0f, 0.59f, -0.01f, 1.32f, -0.03f, 2.03f)
                curveToRelative(3.61f, 1.91f, 5.7f, 4.17f, 6.36f, 6.89f)
                curveToRelative(0.57f, 1.85f, 0.72f, 5.92f, 0.62f, 5.56f)
                close()
            }
        }.also { _Flask = it}
