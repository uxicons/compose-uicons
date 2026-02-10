package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Detergent: ImageVector? = null

val Icons.Rs.Detergent: ImageVector
    get() = _Detergent ?: UXIcon(name = "Detergent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 5f)
                horizontalLineToRelative(-4.5f)
                lineTo(14f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3.29f)
                curveToRelative(-2.89f, 0.86f, -5f, 3.54f, -5f, 6.71f)
                verticalLineToRelative(12f)
                lineTo(22f, 24f)
                lineTo(22f, 8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                lineTo(9f, 2f)
                close()
                moveTo(9f, 13f)
                verticalLineToRelative(4f)
                lineTo(4f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                lineTo(11f, 11f)
                lineTo(4.1f, 11f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(17f, 7f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _Detergent = it}
