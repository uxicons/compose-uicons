package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaderboard: ImageVector? = null

val Icons.Ss.Leaderboard: ImageVector
    get() = _Leaderboard ?: UXIcon(name = "Leaderboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(0f, 19f)
                close()
                moveTo(0f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                lineTo(0f, 11f)
                close()
                moveTo(10f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-14f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-14f)
                close()
                moveTo(8f, 21f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 0f)
                verticalLineToRelative(9f)
                lineTo(7f, 9f)
                lineTo(7f, 0f)
                lineToRelative(2.5f, 3f)
                lineToRelative(2.5f, -3f)
                lineToRelative(2.5f, 3f)
                lineToRelative(2.5f, -3f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Leaderboard = it}
