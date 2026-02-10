package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Ts.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                lineTo(12.5f, 4f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(3.5f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                lineTo(0f, 4f)
                verticalLineToRelative(1f)
                lineTo(2f, 5f)
                lineTo(2f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(22f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(3f, 5f)
                lineTo(21f, 5f)
                lineTo(21f, 21.5f)
                close()
            }
        }.also { _Pot = it}
