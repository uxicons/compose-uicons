package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DongSign: ImageVector? = null

val Icons.Rs.DongSign: ImageVector
    get() = _DongSign ?: UXIcon(name = "DongSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineToRelative(2f)
                lineTo(2f, 24f)
                verticalLineToRelative(-2f)
                lineTo(22f, 22f)
                close()
                moveTo(6f, 14f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(1.54f, 0f, 2.94f, 0.59f, 4f, 1.54f)
                lineTo(16f, 4f)
                horizontalLineToRelative(-5f)
                lineTo(11f, 2f)
                horizontalLineToRelative(5f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.54f)
                curveToRelative(-1.06f, 0.95f, -2.46f, 1.54f, -4f, 1.54f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
                moveTo(8f, 14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
            }
        }.also { _DongSign = it}
