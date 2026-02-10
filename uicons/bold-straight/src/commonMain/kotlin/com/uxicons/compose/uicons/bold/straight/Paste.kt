package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paste: ImageVector? = null

val Icons.Bs.Paste: ImageVector
    get() = _Paste ?: UXIcon(name = "Paste") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 9f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(14f)
                lineTo(24f, 12.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(13f, 21f)
                lineTo(13f, 12.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(15f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3f, 5.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 5.5f)
                curveTo(0f, 3.57f, 1.57f, 2f, 3.5f, 2f)
                horizontalLineToRelative(2.35f)
                curveToRelative(0.56f, -1.18f, 1.76f, -2f, 3.15f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.39f, 0f, 2.59f, 0.82f, 3.15f, 2f)
                horizontalLineToRelative(2.35f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.35f)
                curveToRelative(-0.56f, 1.18f, -1.76f, 2f, -3.15f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.39f, 0f, -2.59f, -0.82f, -3.15f, -2f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }.also { _Paste = it}
