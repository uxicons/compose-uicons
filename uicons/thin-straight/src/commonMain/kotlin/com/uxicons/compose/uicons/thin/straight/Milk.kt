package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Milk: ImageVector? = null

val Icons.Ts.Milk: ImageVector
    get() = _Milk ?: UXIcon(name = "Milk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 4.33f)
                lineTo(19f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.83f)
                lineTo(1f, 9.32f)
                verticalLineToRelative(12.18f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-12.18f)
                lineToRelative(-4f, -5f)
                close()
                moveTo(14.26f, 9f)
                lineTo(2.54f, 9f)
                lineToRelative(3.2f, -4f)
                horizontalLineToRelative(11.72f)
                lineToRelative(-3.2f, 4f)
                close()
                moveTo(6.5f, 1f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineTo(6f, 4f)
                lineTo(6f, 1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(2f, 21.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 0.56f, 0.2f, 1.08f, 0.51f, 1.5f)
                lineTo(3.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(22f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-11.82f)
                lineToRelative(3.5f, -4.38f)
                lineToRelative(3.5f, 4.38f)
                verticalLineToRelative(11.82f)
                close()
            }
        }.also { _Milk = it}
