package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Detergent: ImageVector? = null

val Icons.Sr.Detergent: ImageVector
    get() = _Detergent ?: UXIcon(name = "Detergent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 4f)
                lineTo(7f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.41f, 0f, -4.43f, -1.72f, -4.9f, -4f)
                horizontalLineToRelative(6.9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(2.08f, 12f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                horizontalLineToRelative(9f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-7f)
                close()
                moveTo(9f, 14f)
                lineTo(2f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Detergent = it}
