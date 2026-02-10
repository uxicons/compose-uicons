package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Revenue: ImageVector? = null

val Icons.Bs.Revenue: ImageVector
    get() = _Revenue ?: UXIcon(name = "Revenue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-15f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(18f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                lineTo(0f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.58f, -1.06f, -2.9f, -2.5f, -3.34f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.16f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.76f, -2.5f, 3.34f)
                curveToRelative(0f, 1.53f, 0.92f, 2.88f, 2.34f, 3.45f)
                lineToRelative(2.21f, 0.89f)
                curveToRelative(0.27f, 0.11f, 0.45f, 0.37f, 0.45f, 0.67f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.58f, 1.06f, 2.9f, 2.5f, 3.34f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.16f)
                curveToRelative(1.44f, -0.43f, 2.5f, -1.76f, 2.5f, -3.34f)
                curveToRelative(0f, -1.53f, -0.92f, -2.88f, -2.34f, -3.45f)
                lineToRelative(-2.21f, -0.89f)
                curveToRelative(-0.27f, -0.11f, -0.45f, -0.37f, -0.45f, -0.67f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(18f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8.35f)
                curveToRelative(0.72f, -1.02f, 1.5f, -1.93f, 3f, -2.58f)
                lineTo(18f, 3f)
                close()
                moveTo(23f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                lineTo(23f, 0f)
                close()
            }
        }.also { _Revenue = it}
