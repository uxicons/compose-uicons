package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MatchFire: ImageVector? = null

val Icons.Sr.MatchFire: ImageVector
    get() = _MatchFire ?: UXIcon(name = "MatchFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.86f, 10.01f)
                curveToRelative(-0.29f, -0.47f, -0.9f, -0.62f, -1.37f, -0.34f)
                lineToRelative(-12.12f, 7.34f)
                curveToRelative(-1.31f, 0.02f, -4.49f, 0.13f, -5.64f, 0.76f)
                curveToRelative(-0.78f, 0.43f, -1.34f, 1.13f, -1.59f, 1.98f)
                curveToRelative(-0.25f, 0.85f, -0.15f, 1.75f, 0.28f, 2.52f)
                reflectiveCurveToRelative(1.13f, 1.34f, 1.98f, 1.59f)
                curveToRelative(0.31f, 0.09f, 0.62f, 0.13f, 0.93f, 0.13f)
                curveToRelative(0.55f, 0f, 1.1f, -0.14f, 1.59f, -0.41f)
                curveToRelative(1.2f, -0.66f, 2.84f, -3.63f, 3.49f, -4.87f)
                lineToRelative(12.12f, -7.34f)
                curveToRelative(0.47f, -0.29f, 0.62f, -0.9f, 0.34f, -1.37f)
                close()
                moveTo(7.68f, 0.28f)
                curveToRelative(-0.5f, -0.49f, -1.34f, -0.32f, -1.6f, 0.33f)
                curveToRelative(-0.94f, 2.41f, -0.64f, 5.38f, -2.58f, 5.38f)
                curveToRelative(-0.53f, 0f, -0.81f, -1.3f, -1.02f, -2f)
                curveToRelative(-0.13f, -0.45f, -0.73f, -0.52f, -0.98f, -0.13f)
                curveToRelative(-0.8f, 1.28f, -1.5f, 3.19f, -1.5f, 4.63f)
                curveToRelative(0f, 3.98f, 3.57f, 7.12f, 7.68f, 6.4f)
                curveToRelative(2.31f, -0.41f, 4.23f, -2.13f, 4.97f, -4.35f)
                curveTo(14.19f, 5.97f, 10.24f, 2.83f, 7.68f, 0.28f)
                close()
                moveTo(8.05f, 12.28f)
                curveToRelative(-0.8f, 0.94f, -2.24f, 0.94f, -3.04f, 0f)
                curveToRelative(-0.69f, -0.81f, -0.56f, -2.05f, 0.2f, -2.8f)
                lineToRelative(0.74f, -0.74f)
                curveToRelative(0.33f, -0.33f, 0.85f, -0.33f, 1.18f, 0f)
                lineToRelative(0.74f, 0.74f)
                curveToRelative(0.75f, 0.75f, 0.89f, 1.99f, 0.2f, 2.8f)
                close()
            }
        }.also { _MatchFire = it}
