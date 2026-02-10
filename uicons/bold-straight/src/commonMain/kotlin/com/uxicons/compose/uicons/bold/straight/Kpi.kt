package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kpi: ImageVector? = null

val Icons.Bs.Kpi: ImageVector
    get() = _Kpi ?: UXIcon(name = "Kpi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.56f, 7f)
                horizontalLineToRelative(-3.56f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2.2f)
                verticalLineToRelative(-4.12f)
                horizontalLineToRelative(1.36f)
                curveToRelative(1.9f, 0f, 3.44f, -1.54f, 3.44f, -3.44f)
                reflectiveCurveToRelative(-1.54f, -3.44f, -3.44f, -3.44f)
                close()
                moveTo(14.56f, 11.68f)
                horizontalLineToRelative(-1.36f)
                verticalLineToRelative(-2.48f)
                horizontalLineToRelative(1.36f)
                curveToRelative(0.68f, 0f, 1.24f, 0.56f, 1.24f, 1.24f)
                reflectiveCurveToRelative(-0.56f, 1.24f, -1.24f, 1.24f)
                close()
                moveTo(21.5f, 7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2.2f)
                lineTo(19.3f, 7f)
                horizontalLineToRelative(2.2f)
                close()
                moveTo(6.9f, 11.72f)
                lineToRelative(2.75f, 6.28f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-2.19f, -4.86f)
                horizontalLineToRelative(-0.84f)
                verticalLineToRelative(4.86f)
                horizontalLineToRelative(-2.2f)
                lineTo(2.0f, 7f)
                horizontalLineToRelative(2.2f)
                verticalLineToRelative(3.94f)
                horizontalLineToRelative(0.49f)
                lineToRelative(2.32f, -3.94f)
                horizontalLineToRelative(2.56f)
                lineToRelative(-2.66f, 4.72f)
                close()
            }
        }.also { _Kpi = it}
