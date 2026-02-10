package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pallet: ImageVector? = null

val Icons.Br.Pallet: ImageVector
    get() = _Pallet ?: UXIcon(name = "Pallet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 19.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineTo(3.5f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(17f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            close()
        }
    }.also { _Pallet = it }
