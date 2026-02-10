package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaderboard: ImageVector? = null

val Icons.Sr.Leaderboard: ImageVector
    get() = _Leaderboard ?: UXIcon(name = "Leaderboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                curveToRelative(2.04f, 0f, 3.8f, -1.24f, 4.58f, -3f)
                horizontalLineToRelative(-13.58f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-14f)
                close()
                moveTo(0.42f, 21f)
                curveToRelative(0.77f, 1.76f, 2.53f, 3f, 4.58f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineTo(0.42f, 21f)
                close()
                moveTo(16.42f, 8.43f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.42f)
                lineTo(17.0f, 0.89f)
                curveToRelative(0f, -0.39f, -0.24f, -0.72f, -0.6f, -0.86f)
                curveToRelative(-0.37f, -0.13f, -0.76f, -0.02f, -1.03f, 0.31f)
                lineToRelative(-1.15f, 1.58f)
                lineToRelative(-1.32f, -1.56f)
                curveToRelative(-0.5f, -0.49f, -1.32f, -0.48f, -1.86f, 0.06f)
                lineToRelative(-1.27f, 1.51f)
                reflectiveCurveToRelative(-1.32f, -1.76f, -1.36f, -1.79f)
                curveToRelative(-0.23f, -0.17f, -0.59f, -0.19f, -0.89f, -0.05f)
                curveToRelative(-0.33f, 0.15f, -0.53f, 0.47f, -0.53f, 0.82f)
                verticalLineToRelative(6.09f)
                curveToRelative(0f, 1.1f, 0.9f, 2.0f, 2.0f, 2f)
                lineToRelative(6f, 0.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.53f, 0f, 1.03f, -0.21f, 1.41f, -0.58f)
                close()
                moveTo(19.0f, 7.01f)
                curveToRelative(0f, 0.71f, -0.2f, 1.39f, -0.55f, 1.99f)
                horizontalLineToRelative(5.12f)
                curveToRelative(-0.77f, -1.76f, -2.53f, -3.0f, -4.57f, -3f)
                verticalLineToRelative(1.01f)
                close()
                moveTo(5.0f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-2.04f, 0f, -3.8f, 1.24f, -4.58f, 3f)
                horizontalLineToRelative(5.14f)
                curveToRelative(-0.34f, -0.59f, -0.56f, -1.27f, -0.56f, -2f)
                close()
            }
        }.also { _Leaderboard = it}
