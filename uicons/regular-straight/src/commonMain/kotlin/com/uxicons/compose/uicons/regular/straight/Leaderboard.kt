package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaderboard: ImageVector? = null

val Icons.Rs.Leaderboard: ImageVector
    get() = _Leaderboard ?: UXIcon(name = "Leaderboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 10f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10f, 16f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 18f)
                lineTo(2f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(8f, 12f)
                verticalLineToRelative(2f)
                lineTo(2f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(2f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(17f, 8f)
                lineTo(7f, 8f)
                lineTo(7f, 0f)
                lineToRelative(2.5f, 3f)
                lineToRelative(2.5f, -3f)
                lineToRelative(2.5f, 3f)
                lineToRelative(2.5f, -3f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Leaderboard = it}
