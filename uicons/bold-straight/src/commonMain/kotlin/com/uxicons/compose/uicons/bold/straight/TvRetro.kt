package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TvRetro: ImageVector? = null

val Icons.Bs.TvRetro: ImageVector
    get() = _TvRetro ?: UXIcon(name = "TvRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 6f)
                horizontalLineToRelative(-5.15f)
                lineToRelative(3.72f, -3.72f)
                lineTo(16.95f, 0.16f)
                lineToRelative(-4.95f, 4.95f)
                lineTo(7.05f, 0.16f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.72f, 3.72f)
                lineTo(3.5f, 6f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                lineTo(5f, 19f)
                verticalLineToRelative(-8f)
                close()
                moveTo(16f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _TvRetro = it}
