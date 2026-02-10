package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Popsicle: ImageVector? = null

val Icons.Bs.Popsicle: ImageVector
    get() = _Popsicle ?: UXIcon(name = "Popsicle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                reflectiveCurveTo(3f, 4.04f, 3f, 9f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-11f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Popsicle = it}
