package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iron: ImageVector? = null

val Icons.Ts.Iron: ImageVector
    get() = _Iron ?: UXIcon(name = "Iron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 2f)
                lineTo(8f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                lineTo(10f, 10f)
                curveTo(4.49f, 10f, 0f, 14.49f, 0f, 20f)
                verticalLineToRelative(2f)
                lineTo(24f, 22f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(23f, 21f)
                lineTo(1f, 21f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(10f)
                close()
                moveTo(11f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(9f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Iron = it}
