package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subfolder: ImageVector? = null

val Icons.Ts.Subfolder: ImageVector
    get() = _Subfolder ?: UXIcon(name = "Subfolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(-4f, -2f)
                horizontalLineToRelative(-3.12f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                lineTo(24f, 23f)
                lineTo(24f, 12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 22f)
                lineTo(8f, 22f)
                lineTo(8f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.88f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(5.12f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(3.26f)
                curveToRelative(-0.31f, -0.21f, -0.65f, -0.36f, -1f, -0.48f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(11.88f, 4.0f)
                lineTo(7.88f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 22f)
                lineTo(5f, 22f)
                verticalLineToRelative(1f)
                lineTo(0f, 23f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _Subfolder = it}
