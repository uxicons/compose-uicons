package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Popsicle: ImageVector? = null

val Icons.Tr.Popsicle: ImageVector
    get() = _Popsicle ?: UXIcon(name = "Popsicle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(7.04f, 0f, 3f, 4.04f, 3f, 9f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.5f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                close()
                moveTo(20f, 16.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                curveTo(4f, 4.59f, 7.59f, 1f, 12f, 1f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _Popsicle = it}
