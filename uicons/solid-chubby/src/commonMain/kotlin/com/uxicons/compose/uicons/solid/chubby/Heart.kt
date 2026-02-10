package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Sc.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 4.7f)
                curveToRelative(-1.22f, -1.14f, -2.81f, -1.75f, -4.38f, -1.69f)
                curveToRelative(-1.42f, 0.06f, -2.73f, 0.67f, -3.69f, 1.73f)
                lineToRelative(-0.52f, 0.57f)
                lineToRelative(-0.52f, -0.57f)
                curveToRelative(-0.96f, -1.05f, -2.27f, -1.67f, -3.69f, -1.73f)
                curveToRelative(-1.57f, -0.07f, -3.17f, 0.55f, -4.38f, 1.69f)
                curveToRelative(-1.13f, 1.05f, -2.43f, 3.19f, -2.4f, 5.74f)
                curveToRelative(0.03f, 2.58f, 1.35f, 5.05f, 3.93f, 7.33f)
                curveToRelative(0.86f, 0.76f, 1.87f, 1.47f, 3.1f, 2.16f)
                curveToRelative(1.22f, 0.69f, 2.6f, 1.05f, 3.98f, 1.05f)
                reflectiveCurveToRelative(2.75f, -0.36f, 3.98f, -1.05f)
                curveToRelative(1.22f, -0.69f, 2.24f, -1.4f, 3.09f, -2.16f)
                curveToRelative(2.57f, -2.28f, 3.9f, -4.75f, 3.93f, -7.33f)
                curveToRelative(0.03f, -2.56f, -1.27f, -4.69f, -2.4f, -5.74f)
                close()
            }
        }.also { _Heart = it}
