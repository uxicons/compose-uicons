package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Detergent: ImageVector? = null

val Icons.Ss.Detergent: ImageVector
    get() = _Detergent ?: UXIcon(name = "Detergent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 18f)
                verticalLineToRelative(-4f)
                lineTo(2f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                close()
                moveTo(22f, 9.5f)
                verticalLineToRelative(14.5f)
                lineTo(2f, 24f)
                verticalLineToRelative(-4f)
                lineTo(11f, 20f)
                lineTo(11f, 12f)
                lineTo(2.08f, 12f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 9.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.also { _Detergent = it}
