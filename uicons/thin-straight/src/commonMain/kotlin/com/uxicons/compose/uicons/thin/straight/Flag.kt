package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flag: ImageVector? = null

val Icons.Ts.Flag: ImageVector
    get() = _Flag ?: UXIcon(name = "Flag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(10.5f)
                lineTo(24f, 4f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(1f, 1f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                lineTo(1f, 12f)
                lineTo(1f, 1f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                lineTo(15f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _Flag = it}
