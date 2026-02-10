package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingStar: ImageVector? = null

val Icons.Ss.RankingStar: ImageVector
    get() = _RankingStar ?: UXIcon(name = "RankingStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                close()
                moveTo(9.35f, 7.56f)
                lineToRelative(0.48f, 0.36f)
                lineToRelative(2.18f, -1.69f)
                lineToRelative(2.17f, 1.68f)
                lineToRelative(0.5f, -0.35f)
                lineToRelative(-0.88f, -2.69f)
                lineToRelative(2.2f, -1.27f)
                verticalLineToRelative(-0.61f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(-0.78f, -3f)
                horizontalLineToRelative(-0.65f)
                lineToRelative(-0.78f, 3f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(0.61f)
                lineToRelative(2.21f, 1.23f)
                lineToRelative(-0.87f, 2.72f)
                close()
                moveTo(4.5f, 13f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(13.5f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _RankingStar = it}
