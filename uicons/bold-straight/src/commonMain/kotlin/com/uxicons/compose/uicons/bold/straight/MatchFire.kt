package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MatchFire: ImageVector? = null

val Icons.Bs.MatchFire: ImageVector
    get() = _MatchFire ?: UXIcon(name = "MatchFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 9.46f)
                curveToRelative(0f, -4.03f, -4.19f, -6.8f, -6.5f, -9.46f)
                curveToRelative(-2.23f, 2.81f, -1.58f, 7f, -2.94f, 7f)
                curveToRelative(-1.05f, 0f, -1.21f, -2.5f, -1.21f, -2.5f)
                curveToRelative(-1.08f, 1.11f, -2.35f, 3.09f, -2.35f, 4.96f)
                curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                close()
                moveTo(5.08f, 13.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.42f, 1.42f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                close()
                moveTo(10.1f, 20.23f)
                curveToRelative(-0.86f, 1.44f, -1.92f, 3.0f, -2.66f, 3.4f)
                curveToRelative(-1.45f, 0.8f, -3.28f, 0.27f, -4.07f, -1.18f)
                curveToRelative(-0.8f, -1.45f, -0.27f, -3.28f, 1.18f, -4.07f)
                curveToRelative(0.71f, -0.39f, 2.44f, -0.6f, 4.0f, -0.71f)
                lineToRelative(13.83f, -8.54f)
                lineToRelative(1.58f, 2.55f)
                lineToRelative(-13.86f, 8.56f)
                close()
            }
        }.also { _MatchFire = it}
