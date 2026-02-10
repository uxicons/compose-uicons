package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kpi: ImageVector? = null

val Icons.Ts.Kpi: ImageVector
    get() = _Kpi ?: UXIcon(name = "Kpi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.85f, 7f)
                lineToRelative(-2.94f, 5.22f)
                lineToRelative(2.53f, 5.78f)
                horizontalLineToRelative(-1.14f)
                lineToRelative(-2.13f, -5f)
                horizontalLineToRelative(-2.16f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                lineTo(3f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.79f)
                lineToRelative(2.93f, -5f)
                horizontalLineToRelative(1.13f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1f)
                lineTo(21f, 7f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(18f, 10.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(11f, 7f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _Kpi = it}
