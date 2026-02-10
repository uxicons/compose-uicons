package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moustache: ImageVector? = null

val Icons.Sr.Moustache: ImageVector
    get() = _Moustache ?: UXIcon(name = "Moustache") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 17f)
                curveToRelative(-3.2f, 0f, -4.69f, -1.98f, -5.5f, -3f)
                curveToRelative(-0.81f, 1.02f, -2.3f, 3f, -5.5f, 3f)
                curveToRelative(-2.2f, 0f, -4.74f, -1.65f, -6.1f, -3.29f)
                curveToRelative(-0.4f, -0.48f, -0.5f, -1.11f, -0.28f, -1.69f)
                curveToRelative(0.23f, -0.59f, 0.77f, -1.01f, 1.4f, -1.1f)
                curveToRelative(1.67f, -0.22f, 2.71f, -1.01f, 4.27f, -2.2f)
                curveToRelative(1.27f, -0.98f, 2.26f, -1.76f, 3.93f, -1.73f)
                curveToRelative(0.92f, 0f, 1.74f, 0.4f, 2.28f, 0.75f)
                curveToRelative(0.55f, -0.35f, 1.36f, -0.75f, 2.28f, -0.75f)
                curveToRelative(1.53f, 0f, 2.37f, 0.55f, 3.56f, 1.45f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.44f, 0.34f, 0.44f, 0.34f)
                curveToRelative(1.53f, 1.17f, 2.54f, 1.94f, 4.2f, 2.16f)
                curveToRelative(0.61f, 0.08f, 1.13f, 0.49f, 1.36f, 1.06f)
                curveToRelative(0.23f, 0.58f, 0.12f, 1.23f, -0.27f, 1.71f)
                curveToRelative(-1.31f, 1.58f, -3.77f, 3.29f, -6.07f, 3.29f)
                close()
            }
        }.also { _Moustache = it}
