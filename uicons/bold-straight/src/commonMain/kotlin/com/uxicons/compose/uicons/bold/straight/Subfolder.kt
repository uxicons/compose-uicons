package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subfolder: ImageVector? = null

val Icons.Bs.Subfolder: ImageVector
    get() = _Subfolder ?: UXIcon(name = "Subfolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                verticalLineToRelative(2.76f)
                curveToRelative(-0.83f, -0.69f, -1.87f, -1.13f, -3f, -1.24f)
                verticalLineToRelative(-1.52f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(11.65f, 6.0f)
                lineToRelative(-4f, -2f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(0f, 23.0f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(9.5f)
                lineTo(7f, 23f)
                lineTo(7f, 11.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(3.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.85f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _Subfolder = it}
