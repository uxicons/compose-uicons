package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderboardTrophy: ImageVector? = null

val Icons.Bs.LeaderboardTrophy: ImageVector
    get() = _LeaderboardTrophy ?: UXIcon(name = "LeaderboardTrophy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 16f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineTo(5f, 19f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15.98f, 6f)
                horizontalLineToRelative(3.02f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.48f, -1.89f, 5f, -5.5f, 5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.61f, 0f, -5.5f, -2.52f, -5.5f, -5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.07f, -0.53f, 0.35f, -1f, 0.89f, -1f)
                curveToRelative(1.56f, 0f, 4.62f, 0f, 6.18f, 0f)
                curveToRelative(0.54f, 0f, 0.96f, 0.47f, 0.89f, 1f)
                close()
                moveTo(10.6f, 10f)
                curveToRelative(-0.14f, -0.19f, -0.3f, -0.36f, -0.49f, -0.51f)
                curveToRelative(-0.56f, -0.41f, -0.99f, -0.94f, -1.33f, -1.49f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(0.39f, 1.1f, 1.56f, 2f, 3.43f, 2f)
                close()
                moveTo(16.83f, 8f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(-0.34f, 0.56f, -0.77f, 1.08f, -1.33f, 1.49f)
                curveToRelative(-0.2f, 0.14f, -0.35f, 0.32f, -0.49f, 0.51f)
                curveToRelative(1.87f, 0f, 3.04f, -0.9f, 3.43f, -2f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _LeaderboardTrophy = it}
