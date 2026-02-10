package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Revenue: ImageVector? = null

val Icons.Rs.Revenue: ImageVector
    get() = _Revenue ?: UXIcon(name = "Revenue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11.03f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                curveToRelative(-0.94f, 0.6f, -1.5f, 1.19f, -2f, 2.03f)
                close()
                moveTo(21.68f, 16.27f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-0.37f, -0.06f, -0.64f, -0.38f, -0.64f, -0.76f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.36f, 0.97f, 2.51f, 2.31f, 2.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(0.37f, 0.06f, 0.64f, 0.38f, 0.64f, 0.76f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                close()
                moveTo(6f, 24.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(15f)
                close()
                moveTo(1f, 24.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12f)
                lineTo(1f, 12.0f)
                verticalLineToRelative(12f)
                close()
                moveTo(11f, 24.0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(18f)
                close()
                moveTo(23f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                lineTo(23f, 0f)
                close()
            }
        }.also { _Revenue = it}
