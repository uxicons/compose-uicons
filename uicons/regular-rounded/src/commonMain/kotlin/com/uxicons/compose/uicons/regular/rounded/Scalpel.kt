package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scalpel: ImageVector? = null

val Icons.Rr.Scalpel: ImageVector
    get() = _Scalpel ?: UXIcon(name = "Scalpel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 1.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineTo(0.29f, 20.46f)
                curveToRelative(-0.15f, 0.15f, -0.25f, 0.34f, -0.28f, 0.56f)
                curveToRelative(-0.06f, 0.37f, 0.01f, 0.92f, 0.39f, 1.36f)
                curveToRelative(0.24f, 0.28f, 0.71f, 0.62f, 1.52f, 0.62f)
                curveToRelative(0.47f, 0f, 0.88f, 0.01f, 1.12f, 0f)
                curveToRelative(1.8f, -0.07f, 3.55f, -0.48f, 5.21f, -1.21f)
                curveToRelative(2.59f, -1.15f, 4.37f, -3.2f, 5.16f, -5.96f)
                lineToRelative(9.71f, -9.71f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(7.44f, 19.96f)
                curveToRelative(-1.43f, 0.63f, -2.93f, 0.98f, -4.48f, 1.04f)
                curveToRelative(-0.19f, 0.01f, -0.34f, 0.01f, -0.38f, 0.01f)
                lineToRelative(7.03f, -7.03f)
                lineToRelative(1.77f, 1.65f)
                curveToRelative(-0.67f, 2.02f, -1.99f, 3.47f, -3.94f, 4.33f)
                close()
                moveTo(21.71f, 4.71f)
                lineToRelative(-9.22f, 9.22f)
                lineToRelative(-1.46f, -1.36f)
                lineTo(20.29f, 3.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _Scalpel = it}
