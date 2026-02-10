package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Rs.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.97f, 18f)
                curveToRelative(-0.7f, 0f, -1.38f, -0.3f, -1.85f, -0.82f)
                lineTo(1.73f, 8f)
                horizontalLineTo(22.22f)
                lineToRelative(-8.4f, 9.18f)
                curveToRelative(-0.46f, 0.52f, -1.14f, 0.82f, -1.84f, 0.82f)
                close()
                moveTo(6.27f, 10f)
                lineToRelative(5.34f, 5.83f)
                curveToRelative(0.13f, 0.15f, 0.28f, 0.17f, 0.36f, 0.17f)
                reflectiveCurveToRelative(0.23f, -0.02f, 0.36f, -0.16f)
                lineToRelative(5.34f, -5.84f)
                horizontalLineTo(6.27f)
                close()
            }
        }.also { _SortDown = it}
