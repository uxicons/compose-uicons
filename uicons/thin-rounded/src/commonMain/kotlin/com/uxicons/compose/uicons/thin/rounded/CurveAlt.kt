package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveAlt: ImageVector? = null

val Icons.Tr.CurveAlt: ImageVector
    get() = _CurveAlt ?: UXIcon(name = "CurveAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(5.58f, 0f, 10.31f, -4.75f, 11.0f, -11.05f)
                curveTo(12.25f, 5.14f, 17.4f, 0f, 23.5f, 0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-5.58f, 0f, -10.31f, 4.75f, -11.0f, 11.05f)
                curveToRelative(-0.74f, 6.81f, -5.9f, 11.95f, -12.0f, 11.95f)
                close()
            }
        }.also { _CurveAlt = it}
