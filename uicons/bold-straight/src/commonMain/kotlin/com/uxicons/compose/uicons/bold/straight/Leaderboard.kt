package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaderboard: ImageVector? = null

val Icons.Bs.Leaderboard: ImageVector
    get() = _Leaderboard ?: UXIcon(name = "Leaderboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 6f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(3f, 11f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                close()
                moveTo(7f, 14f)
                verticalLineToRelative(2f)
                lineTo(3f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(18f, 9f)
                lineTo(6f, 9f)
                lineTo(6f, 0f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Leaderboard = it}
