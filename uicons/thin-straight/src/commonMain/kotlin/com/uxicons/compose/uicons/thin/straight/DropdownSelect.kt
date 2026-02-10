package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownSelect: ImageVector? = null

val Icons.Ts.DropdownSelect: ImageVector
    get() = _DropdownSelect ?: UXIcon(name = "DropdownSelect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(10.67f, 15.95f)
                curveToRelative(0.36f, 0.37f, 0.85f, 0.55f, 1.33f, 0.55f)
                reflectiveCurveToRelative(0.96f, -0.18f, 1.33f, -0.55f)
                lineToRelative(5.95f, -5.95f)
                lineTo(4.72f, 10f)
                lineToRelative(5.95f, 5.95f)
                close()
                moveTo(12.62f, 15.24f)
                curveToRelative(-0.34f, 0.34f, -0.9f, 0.34f, -1.24f, 0f)
                lineToRelative(-4.24f, -4.24f)
                horizontalLineToRelative(9.72f)
                lineToRelative(-4.24f, 4.24f)
                close()
            }
        }.also { _DropdownSelect = it}
