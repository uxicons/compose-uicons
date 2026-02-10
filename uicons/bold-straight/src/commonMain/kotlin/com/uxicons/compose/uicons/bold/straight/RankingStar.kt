package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingStar: ImageVector? = null

val Icons.Bs.RankingStar: ImageVector
    get() = _RankingStar ?: UXIcon(name = "RankingStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                lineTo(3f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-9f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                lineTo(3f, 21f)
                verticalLineToRelative(-5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(10.21f, 4.85f)
                lineToRelative(-2.21f, -1.23f)
                verticalLineToRelative(-0.61f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.78f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(0.61f)
                lineToRelative(-2.2f, 1.27f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineToRelative(-2.17f, -1.68f)
                lineToRelative(-2.18f, 1.69f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.87f, -2.72f)
                close()
            }
        }.also { _RankingStar = it}
