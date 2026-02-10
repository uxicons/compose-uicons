package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crown: ImageVector? = null

val Icons.Ts.Crown: ImageVector
    get() = _Crown ?: UXIcon(name = "Crown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8.59f)
                lineTo(12f, 2.59f)
                lineToRelative(-6f, 6f)
                lineTo(0f, 2.59f)
                lineTo(0f, 19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 22f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 2.59f)
                lineToRelative(-6f, 6f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(3f, 21f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(1f, 5f)
                lineToRelative(5f, 5f)
                lineToRelative(6f, -6f)
                lineToRelative(6f, 6f)
                lineToRelative(5f, -5f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _Crown = it}
