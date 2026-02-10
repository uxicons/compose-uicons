package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restock: ImageVector? = null

val Icons.Ts.Restock: ImageVector
    get() = _Restock ?: UXIcon(name = "Restock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-4.79f, 0f, -9.11f, -2.86f, -11f, -7.21f)
                verticalLineToRelative(4.21f)
                lineTo(0f, 21f)
                verticalLineToRelative(-4.49f)
                curveToRelative(0f, -0.83f, 0.68f, -1.51f, 1.51f, -1.51f)
                horizontalLineToRelative(4.49f)
                verticalLineToRelative(1f)
                lineTo(1.76f, 16f)
                curveToRelative(1.64f, 4.2f, 5.71f, 7f, 10.24f, 7f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                close()
                moveTo(23f, 3f)
                verticalLineToRelative(4.2f)
                curveTo(21.11f, 2.86f, 16.79f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(1f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                curveToRelative(4.53f, 0f, 8.6f, 2.8f, 10.24f, 7f)
                horizontalLineToRelative(-4.24f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.49f)
                curveToRelative(0.83f, 0f, 1.51f, -0.68f, 1.51f, -1.51f)
                lineTo(24f, 3f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(17f, 17f)
                lineTo(7f, 17f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7f)
                close()
                moveTo(10.5f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Restock = it}
