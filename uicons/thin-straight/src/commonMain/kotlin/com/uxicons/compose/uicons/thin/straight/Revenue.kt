package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Revenue: ImageVector? = null

val Icons.Ts.Revenue: ImageVector
    get() = _Revenue ?: UXIcon(name = "Revenue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.04f, 8f)
                horizontalLineToRelative(-1f)
                lineTo(21.04f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(6f, 9.0f)
                lineToRelative(0.04f, 15f)
                lineToRelative(1f, -0.0f)
                lineToRelative(-0.04f, -15f)
                lineToRelative(-1f, 0.0f)
                close()
                moveTo(1.04f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-12f)
                close()
                moveTo(12f, 6.0f)
                lineToRelative(0.04f, 18f)
                lineToRelative(-1f, 0.0f)
                lineToRelative(-0.04f, -18f)
                lineToRelative(1f, -0.0f)
                close()
                moveTo(23f, 15.08f)
                verticalLineToRelative(-0.51f)
                curveToRelative(0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.01f)
                curveToRelative(-0.82f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.66f, 0.45f, 1.25f, 1.08f, 1.44f)
                lineToRelative(4.11f, 1.17f)
                curveToRelative(1.06f, 0.3f, 1.81f, 1.29f, 1.81f, 2.4f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.92f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.51f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.51f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.01f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.66f, -0.45f, -1.25f, -1.08f, -1.44f)
                lineToRelative(-4.11f, -1.17f)
                curveToRelative(-1.06f, -0.3f, -1.81f, -1.29f, -1.81f, -2.4f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.51f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(16f, 11.03f)
                lineTo(16f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.76f)
                curveToRelative(-0.4f, 0.37f, -0.71f, 0.78f, -1f, 1.26f)
                close()
            }
        }.also { _Revenue = it}
