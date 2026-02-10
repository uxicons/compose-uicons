package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Alien: ImageVector? = null

val Icons.Sr.Alien: ImageVector
    get() = _Alien ?: UXIcon(name = "Alien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.43f, 2f, 9.88f)
                curveToRelative(0f, 5.18f, 4.58f, 10.39f, 7.31f, 13.03f)
                curveToRelative(0.75f, 0.73f, 1.72f, 1.09f, 2.69f, 1.09f)
                reflectiveCurveToRelative(1.94f, -0.36f, 2.69f, -1.09f)
                curveToRelative(2.73f, -2.64f, 7.31f, -7.85f, 7.31f, -13.03f)
                curveTo(22f, 4.43f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(9.89f, 13.0f)
                curveToRelative(-0.91f, -0.05f, -2.15f, -0.27f, -2.88f, -1.0f)
                curveToRelative(-0.73f, -0.73f, -0.95f, -1.98f, -1.0f, -2.88f)
                curveToRelative(-0.04f, -0.63f, 0.48f, -1.15f, 1.11f, -1.11f)
                curveToRelative(0.91f, 0.05f, 2.15f, 0.27f, 2.88f, 1.0f)
                curveToRelative(0.73f, 0.73f, 0.95f, 1.98f, 1.0f, 2.88f)
                curveToRelative(0.04f, 0.63f, -0.48f, 1.15f, -1.11f, 1.11f)
                close()
                moveTo(18.0f, 9.11f)
                curveToRelative(-0.05f, 0.91f, -0.27f, 2.15f, -1.0f, 2.88f)
                curveToRelative(-0.73f, 0.73f, -1.98f, 0.95f, -2.88f, 1.0f)
                curveToRelative(-0.63f, 0.04f, -1.15f, -0.48f, -1.11f, -1.11f)
                curveToRelative(0.05f, -0.91f, 0.27f, -2.15f, 1.0f, -2.88f)
                curveToRelative(0.73f, -0.73f, 1.98f, -0.95f, 2.88f, -1.0f)
                curveToRelative(0.63f, -0.04f, 1.15f, 0.48f, 1.11f, 1.11f)
                close()
            }
        }.also { _Alien = it}
