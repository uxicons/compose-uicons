package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curve: ImageVector? = null

val Icons.Tr.Curve: ImageVector
    get() = _Curve ?: UXIcon(name = "Curve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.61f, 24.04f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveTo(0.12f, 10.62f, 10.62f, 0.12f, 23.54f, 0.12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                curveTo(11.17f, 1.11f, 1.11f, 11.17f, 1.11f, 23.54f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _Curve = it}
