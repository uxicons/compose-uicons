package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderboardTrophy: ImageVector? = null

val Icons.Ss.LeaderboardTrophy: ImageVector
    get() = _LeaderboardTrophy ?: UXIcon(name = "LeaderboardTrophy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.22f, 7f)
                horizontalLineToRelative(1.61f)
                curveToRelative(-0.39f, 1.1f, -1.46f, 2f, -3.33f, 2f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(0.14f, -0.19f, 0.3f, -0.36f, 0.49f, -0.51f)
                curveToRelative(0.56f, -0.41f, 0.99f, -0.94f, 1.33f, -1.49f)
                close()
                moveTo(10.11f, 8.49f)
                curveToRelative(-0.56f, -0.41f, -0.99f, -0.94f, -1.33f, -1.49f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(0.39f, 1.1f, 1.46f, 2f, 3.33f, 2f)
                horizontalLineToRelative(0.1f)
                curveToRelative(-0.14f, -0.19f, -0.3f, -0.36f, -0.49f, -0.51f)
                close()
                moveTo(24.0f, 3f)
                verticalLineToRelative(21f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19.0f, 18f)
                lineTo(5f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.0f, 5f)
                horizontalLineToRelative(-3.02f)
                curveToRelative(0.07f, -0.53f, -0.35f, -1f, -0.89f, -1f)
                curveToRelative(-1.56f, 0f, -4.62f, 0f, -6.18f, 0f)
                curveToRelative(-0.54f, 0f, -0.96f, 0.47f, -0.89f, 1f)
                horizontalLineToRelative(-3.02f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.48f, 1.89f, 5f, 5.5f, 5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.72f)
                curveToRelative(0f, 1.33f, -1.22f, 1.27f, -1.22f, 1.27f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.78f)
                reflectiveCurveToRelative(-1.22f, 0.06f, -1.22f, -1.27f)
                verticalLineToRelative(-0.72f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.61f, 0f, 5.5f, -2.52f, 5.5f, -5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _LeaderboardTrophy = it}
