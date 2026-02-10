package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grate: ImageVector? = null

val Icons.Bs.Grate: ImageVector
    get() = _Grate ?: UXIcon(name = "Grate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 3.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(10f, 10.5f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(14f, 13.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 10.5f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 13.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 21f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(17f, 21f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Grate = it}
