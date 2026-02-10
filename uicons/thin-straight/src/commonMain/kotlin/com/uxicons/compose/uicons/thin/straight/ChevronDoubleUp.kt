package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleUp: ImageVector? = null

val Icons.Ts.ChevronDoubleUp: ImageVector
    get() = _ChevronDoubleUp ?: UXIcon(name = "ChevronDoubleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.18f, 12.97f)
                lineTo(12.35f, 2.15f)
                curveToRelative(-0.19f, -0.19f, -0.52f, -0.19f, -0.71f, 0f)
                lineTo(0.82f, 12.97f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(10.94f, 1.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(10.83f, 10.83f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(23.89f, 21.65f)
                lineTo(12.47f, 10.23f)
                curveToRelative(-0.26f, -0.26f, -0.68f, -0.26f, -0.94f, 0f)
                lineTo(0.11f, 21.65f)
                lineToRelative(0.71f, 0.71f)
                lineTo(12f, 11.17f)
                lineToRelative(11.18f, 11.18f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _ChevronDoubleUp = it}
