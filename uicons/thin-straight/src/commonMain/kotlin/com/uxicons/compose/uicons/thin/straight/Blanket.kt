package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blanket: ImageVector? = null

val Icons.Ts.Blanket: ImageVector
    get() = _Blanket ?: UXIcon(name = "Blanket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 16f)
                horizontalLineToRelative(19.5f)
                lineTo(24f, 0f)
                lineTo(5.5f, 0f)
                curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(17f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(1f, 16.68f)
                lineTo(1f, 5.5f)
                curveTo(1f, 3.02f, 3.02f, 1f, 5.5f, 1f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(14f)
                lineTo(4.5f, 15f)
                curveToRelative(-1.41f, 0f, -2.67f, 0.65f, -3.5f, 1.68f)
                close()
            }
        }.also { _Blanket = it}
