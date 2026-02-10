package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingPodiumEmpty: ImageVector? = null

val Icons.Rs.RankingPodiumEmpty: ImageVector
    get() = _RankingPodiumEmpty ?: UXIcon(name = "RankingPodiumEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 11f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineToRelative(-5.55f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.55f)
                curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.5f, -0.05f)
                lineTo(2.5f, 9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2f, 11.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(2f, 19f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(9f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 5.5f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _RankingPodiumEmpty = it}
