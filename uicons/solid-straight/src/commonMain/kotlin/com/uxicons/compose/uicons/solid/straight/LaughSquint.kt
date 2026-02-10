package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughSquint: ImageVector? = null

val Icons.Ss.LaughSquint: ImageVector
    get() = _LaughSquint ?: UXIcon(name = "LaughSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6.38f, 7.78f)
                lineToRelative(1.25f, -1.56f)
                lineTo(11.1f, 9f)
                lineTo(7.62f, 11.78f)
                lineToRelative(-1.25f, -1.56f)
                lineTo(7.9f, 9f)
                close()
                moveTo(12f, 19f)
                curveTo(8.99f, 19f, 7.04f, 16f, 6.99f, 14f)
                horizontalLineToRelative(10f)
                curveTo(16.99f, 16f, 14.99f, 19f, 12f, 19f)
                close()
                moveTo(17.62f, 10.22f)
                lineTo(16.38f, 11.78f)
                lineTo(12.9f, 9f)
                lineToRelative(3.48f, -2.78f)
                lineToRelative(1.25f, 1.56f)
                lineTo(16.1f, 9f)
                close()
            }
        }.also { _LaughSquint = it}
