package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Detergent: ImageVector? = null

val Icons.Bs.Detergent: ImageVector
    get() = _Detergent ?: UXIcon(name = "Detergent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 5f)
                horizontalLineToRelative(-4f)
                lineTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.37f)
                curveToRelative(-2.38f, 1.26f, -4f, 3.76f, -4f, 6.63f)
                verticalLineToRelative(11.5f)
                lineTo(22f, 24f)
                lineTo(22f, 9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(9f, 5f)
                lineTo(9f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                lineTo(5f, 13f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Detergent = it}
