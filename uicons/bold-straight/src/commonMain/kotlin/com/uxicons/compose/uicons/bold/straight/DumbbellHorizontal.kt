package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHorizontal: ImageVector? = null

val Icons.Bs.DumbbellHorizontal: ImageVector
    get() = _DumbbellHorizontal ?: UXIcon(name = "DumbbellHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 3f)
                lineTo(4.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(1f, 13.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(4f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(12f)
                close()
                moveTo(20f, 17.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 6f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _DumbbellHorizontal = it}
