package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderboardTrophy: ImageVector? = null

val Icons.Rs.LeaderboardTrophy: ImageVector
    get() = _LeaderboardTrophy ?: UXIcon(name = "LeaderboardTrophy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.09f, 4f)
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
                horizontalLineToRelative(-3.02f)
                curveToRelative(0.07f, -0.53f, -0.35f, -1f, -0.89f, -1f)
                close()
                moveTo(7.17f, 7f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.34f, 0.56f, 0.77f, 1.08f, 1.33f, 1.49f)
                curveToRelative(0.2f, 0.14f, 0.35f, 0.32f, 0.49f, 0.51f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-1.87f, 0f, -2.94f, -0.9f, -3.33f, -2f)
                close()
                moveTo(13.5f, 9f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(0.14f, -0.19f, 0.3f, -0.36f, 0.49f, -0.51f)
                curveToRelative(0.56f, -0.41f, 0.99f, -0.94f, 1.33f, -1.49f)
                horizontalLineToRelative(1.61f)
                curveToRelative(-0.39f, 1.1f, -1.46f, 2f, -3.33f, 2f)
                close()
            }
        }.also { _LeaderboardTrophy = it}
