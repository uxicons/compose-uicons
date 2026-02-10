package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shield: ImageVector? = null

val Icons.Ss.Shield: ImageVector
    get() = _Shield ?: UXIcon(name = "Shield") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.94f, 2.64f)
                lineTo(12f, 0.01f)
                lineTo(4.06f, 2.64f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.49f)
                verticalLineTo(12f)
                curveToRelative(0f, 7.52f, 9.2f, 11.68f, 9.59f, 11.85f)
                lineToRelative(0.35f, 0.16f)
                lineToRelative(0.37f, -0.12f)
                curveTo(12.71f, 23.75f, 22f, 20.58f, 22f, 12f)
                verticalLineTo(5.49f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.94f, 2.64f)
                close()
            }
        }.also { _Shield = it}
