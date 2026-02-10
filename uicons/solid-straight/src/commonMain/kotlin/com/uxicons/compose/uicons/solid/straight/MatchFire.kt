package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MatchFire: ImageVector? = null

val Icons.Ss.MatchFire: ImageVector
    get() = _MatchFire ?: UXIcon(name = "MatchFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 11.1f)
                lineToRelative(-1.03f, -1.71f)
                lineToRelative(-12.6f, 7.63f)
                curveToRelative(-1.31f, 0.02f, -4.49f, 0.13f, -5.64f, 0.76f)
                curveToRelative(-0.78f, 0.43f, -1.34f, 1.13f, -1.59f, 1.98f)
                curveToRelative(-0.25f, 0.85f, -0.15f, 1.75f, 0.28f, 2.52f)
                reflectiveCurveToRelative(1.13f, 1.34f, 1.98f, 1.59f)
                curveToRelative(0.31f, 0.09f, 0.62f, 0.13f, 0.93f, 0.13f)
                curveToRelative(0.55f, 0f, 1.1f, -0.14f, 1.59f, -0.41f)
                curveToRelative(1.2f, -0.66f, 2.84f, -3.63f, 3.49f, -4.87f)
                lineToRelative(12.59f, -7.62f)
                close()
                moveTo(6.76f, 0f)
                curveToRelative(-1.83f, 2.69f, -0.97f, 7f, -3.26f, 7f)
                curveToRelative(-1f, 0f, -1f, -3f, -1f, -3f)
                curveToRelative(-1.08f, 1.11f, -2.5f, 3.41f, -2.5f, 5.5f)
                curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                curveToRelative(0f, -4.11f, -4.21f, -7.14f, -6.24f, -9.5f)
                close()
                moveTo(7.94f, 13.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.41f, 1.42f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _MatchFire = it}
