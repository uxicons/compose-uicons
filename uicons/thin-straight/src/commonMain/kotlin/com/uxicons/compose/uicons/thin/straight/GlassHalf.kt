package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassHalf: ImageVector? = null

val Icons.Ts.GlassHalf: ImageVector
    get() = _GlassHalf ?: UXIcon(name = "GlassHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.21f, 0f)
                lineToRelative(1.78f, 21.7f)
                curveToRelative(0.1f, 1.29f, 1.2f, 2.29f, 2.49f, 2.29f)
                horizontalLineToRelative(12.9f)
                curveToRelative(1.31f, 0f, 2.38f, -0.98f, 2.49f, -2.28f)
                lineTo(22.79f, 0f)
                lineTo(1.21f, 0f)
                close()
                moveTo(21.69f, 1f)
                lineToRelative(-0.88f, 10f)
                lineTo(3.12f, 11f)
                lineTo(2.29f, 1f)
                horizontalLineToRelative(19.4f)
                close()
                moveTo(19.88f, 21.63f)
                curveToRelative(-0.07f, 0.78f, -0.71f, 1.37f, -1.49f, 1.37f)
                lineTo(5.49f, 23f)
                curveToRelative(-0.78f, 0f, -1.43f, -0.6f, -1.5f, -1.38f)
                lineToRelative(-0.79f, -9.62f)
                horizontalLineToRelative(17.53f)
                lineToRelative(-0.85f, 9.63f)
                close()
            }
        }.also { _GlassHalf = it}
