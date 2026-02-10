package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Rs.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.3f)
                lineTo(24f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 3.3f)
                lineToRelative(2f, 3f)
                verticalLineToRelative(14.7f)
                lineTo(0f, 21f)
                verticalLineToRelative(2f)
                lineTo(8f, 23f)
                lineTo(8f, 15f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 6.3f)
                lineToRelative(2f, -3f)
                close()
                moveTo(21.8f, 3f)
                lineToRelative(-1.33f, 2f)
                lineTo(3.54f, 5f)
                lineToRelative(-1.33f, -2f)
                lineTo(21.8f, 3f)
                close()
                moveTo(18f, 21f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 7f)
                lineTo(20f, 7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Archway = it}
