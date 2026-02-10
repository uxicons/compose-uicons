package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderAll: ImageVector? = null

val Icons.Ts.BorderAll: ImageVector
    get() = _BorderAll ?: UXIcon(name = "BorderAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 2.5f)
                lineTo(23f, 11.5f)
                lineTo(12.5f, 11.5f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(2.5f, 1f)
                lineTo(11.5f, 1f)
                lineTo(11.5f, 11.5f)
                lineTo(1f, 11.5f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 12.5f)
                lineTo(11.5f, 12.5f)
                verticalLineToRelative(10.5f)
                lineTo(1f, 23f)
                lineTo(1f, 12.5f)
                close()
                moveTo(12.5f, 23f)
                lineTo(12.5f, 12.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(10.5f)
                lineTo(12.5f, 23f)
                close()
            }
        }.also { _BorderAll = it}
