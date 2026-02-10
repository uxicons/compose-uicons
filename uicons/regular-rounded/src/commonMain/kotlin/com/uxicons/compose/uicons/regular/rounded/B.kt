package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _B: ImageVector? = null

val Icons.Rr.B: ImageVector
    get() = _B ?: UXIcon(name = "B") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 24f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(5.79f, -0.07f, 8.69f, 7.28f, 4.51f, 11.18f)
                curveToRelative(7.37f, 1.84f, 6.17f, 12.72f, -1.51f, 12.82f)
                close()
                moveTo(4f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(15.5f, 22f)
                curveToRelative(5.93f, -0.16f, 5.93f, -8.85f, 0f, -9f)
                lineTo(4f, 13f)
                close()
                moveTo(4f, 11f)
                lineTo(12.5f, 11f)
                curveToRelative(5.93f, -0.16f, 5.93f, -8.85f, 0f, -9f)
                lineTo(7f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _B = it}
