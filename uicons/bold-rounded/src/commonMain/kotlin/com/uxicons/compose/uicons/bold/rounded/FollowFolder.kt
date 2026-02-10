package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FollowFolder: ImageVector? = null

val Icons.Br.FollowFolder: ImageVector
    get() = _FollowFolder ?: UXIcon(name = "FollowFolder") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 17.75f)
            curveToRelative(0f, 2.16f, -2.82f, 4.85f, -4.22f, 5.98f)
            curveToRelative(-0.45f, 0.36f, -1.1f, 0.36f, -1.55f, 0f)
            curveToRelative(-1.4f, -1.13f, -4.22f, -3.81f, -4.22f, -5.98f)
            curveToRelative(0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
            curveToRelative(1.22f, 0f, 2.27f, 0.96f, 2.49f, 2.22f)
            horizontalLineToRelative(0f)
            curveToRelative(0.22f, -1.27f, 1.29f, -2.22f, 2.51f, -2.22f)
            curveToRelative(1.38f, 0f, 2.5f, 1.23f, 2.5f, 2.75f)
            close()
            moveTo(18.5f, 2f)
            horizontalLineToRelative(-5.53f)
            curveToRelative(-0.08f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
            lineTo(9.59f, 0.37f)
            curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
            horizontalLineToRelative(-2.53f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(5.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineTo(7f)
            horizontalLineTo(20.95f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.also { _FollowFolder = it }
