package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FollowFolder: ImageVector? = null

val Icons.Ss.FollowFolder: ImageVector
    get() = _FollowFolder ?: UXIcon(name = "FollowFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16.24f)
                curveToRelative(0f, 3.39f, -6f, 7.56f, -6f, 7.56f)
                curveToRelative(0f, 0f, -6f, -4.17f, -6f, -7.56f)
                curveToRelative(0f, -1.79f, 1.34f, -3.24f, 3f, -3.24f)
                reflectiveCurveToRelative(3f, 1.16f, 3f, 2.95f)
                curveToRelative(0f, -1.79f, 1.34f, -2.95f, 3f, -2.95f)
                reflectiveCurveToRelative(3f, 1.45f, 3f, 3.24f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(12.24f, 2f)
                lineTo(8.24f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(3f)
                lineTo(24f, 6f)
                close()
                moveTo(10f, 16.24f)
                curveToRelative(0f, -2.89f, 2.24f, -5.24f, 5f, -5.24f)
                curveToRelative(1.14f, 0f, 2.18f, 0.34f, 3f, 0.94f)
                curveToRelative(0.82f, -0.59f, 1.86f, -0.94f, 3f, -0.94f)
                reflectiveCurveToRelative(2.16f, 0.41f, 3f, 1.07f)
                verticalLineToRelative(-4.07f)
                lineTo(0f, 8f)
                verticalLineToRelative(14f)
                lineTo(12.89f, 22f)
                curveToRelative(-1.53f, -1.65f, -2.89f, -3.7f, -2.89f, -5.76f)
                close()
            }
        }.also { _FollowFolder = it}
