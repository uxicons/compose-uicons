package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kpi: ImageVector? = null

val Icons.Rs.Kpi: ImageVector
    get() = _Kpi ?: UXIcon(name = "Kpi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 7f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14.5f, 12f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6.9f, 11.72f)
                lineToRelative(2.75f, 6.28f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(-2.25f, -5f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(2f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.83f)
                lineToRelative(2.35f, -4f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-2.66f, 4.72f)
                close()
            }
        }.also { _Kpi = it}
