package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clone: ImageVector? = null

val Icons.Ts.Clone: ImageVector
    get() = _Clone ?: UXIcon(name = "Clone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(8f, 16f)
                lineTo(8f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(14f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _Clone = it}
