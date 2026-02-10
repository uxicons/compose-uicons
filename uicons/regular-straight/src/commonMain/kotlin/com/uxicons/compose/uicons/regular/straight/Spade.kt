package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Rs.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13.5f)
                curveTo(23f, 8.36f, 16.02f, 2.37f, 13.88f, 0.66f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.76f, 0f)
                curveTo(7.98f, 2.37f, 1f, 8.35f, 1f, 13.5f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                arcToRelative(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -1.66f)
                curveTo(10.75f, 20.8f, 10.12f, 22f, 8f, 22f)
                lineTo(5f, 22f)
                verticalLineToRelative(2f)
                lineTo(19f, 24f)
                lineTo(19f, 22f)
                lineTo(16f, 22f)
                curveToRelative(-2.12f, 0f, -2.75f, -1.2f, -2.93f, -3.66f)
                arcTo(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.5f)
                close()
                moveTo(11.97f, 22f)
                curveToRelative(0.01f, -0.02f, 0.02f, -0.03f, 0.03f, -0.05f)
                curveToRelative(0.01f, 0.02f, 0.02f, 0.03f, 0.03f, 0.05f)
                close()
                moveTo(12.89f, 14.92f)
                lineTo(12f, 13.13f)
                lineToRelative(-0.9f, 1.79f)
                curveTo(11.09f, 14.95f, 9.49f, 18f, 7f, 18f)
                arcToRelative(4.28f, 4.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4.5f)
                curveToRelative(0f, -3.38f, 4.51f, -8.19f, 8.37f, -11.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.26f, 0f)
                curveTo(16.49f, 5.31f, 21f, 10.12f, 21f, 13.5f)
                arcTo(4.28f, 4.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                curveTo(14.49f, 18f, 12.91f, 14.94f, 12.9f, 14.92f)
                close()
            }
        }.also { _Spade = it}
