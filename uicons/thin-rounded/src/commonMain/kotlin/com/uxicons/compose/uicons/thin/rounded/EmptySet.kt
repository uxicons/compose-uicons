package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Tr.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 0.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.74f, 3.74f)
                curveToRelative(-1.96f, -1.79f, -4.55f, -2.89f, -7.4f, -2.89f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 2.85f, 1.1f, 5.45f, 2.89f, 7.4f)
                lineTo(0.15f, 23.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(3.74f, -3.74f)
                curveToRelative(1.96f, 1.79f, 4.55f, 2.89f, 7.4f, 2.89f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -2.85f, -1.1f, -5.45f, -2.89f, -7.4f)
                lineToRelative(3.74f, -3.74f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(2.58f, 0f, 4.92f, 0.99f, 6.7f, 2.6f)
                lineToRelative(-14.1f, 14.1f)
                curveToRelative(-1.61f, -1.77f, -2.6f, -4.12f, -2.6f, -6.7f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                curveToRelative(-2.58f, 0f, -4.92f, -0.99f, -6.7f, -2.6f)
                lineToRelative(14.1f, -14.1f)
                curveToRelative(1.61f, 1.77f, 2.6f, 4.12f, 2.6f, 6.7f)
                close()
            }
        }.also { _EmptySet = it}
