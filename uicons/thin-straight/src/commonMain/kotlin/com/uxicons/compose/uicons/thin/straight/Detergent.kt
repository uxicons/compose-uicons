package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Detergent: ImageVector? = null

val Icons.Ts.Detergent: ImageVector
    get() = _Detergent ?: UXIcon(name = "Detergent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                horizontalLineToRelative(-3f)
                lineTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.68f)
                curveToRelative(-2.86f, 0.68f, -5f, 3.25f, -5f, 6.32f)
                verticalLineToRelative(12.5f)
                lineTo(21f, 24f)
                lineTo(21f, 9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(9f, 5f)
                lineTo(9f, 1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(11f, 12f)
                verticalLineToRelative(6f)
                lineTo(4f, 18f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(-4f)
                lineTo(12f, 19f)
                lineTo(12f, 11f)
                lineTo(4.03f, 11f)
                curveToRelative(0.25f, -2.8f, 2.61f, -5f, 5.47f, -5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 15f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                lineTo(19f, 9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Detergent = it}
