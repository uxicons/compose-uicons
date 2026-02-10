package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertButtonCircle: ImageVector? = null

val Icons.Bs.InsertButtonCircle: ImageVector
    get() = _InsertButtonCircle ?: UXIcon(name = "InsertButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 12f)
                horizontalLineToRelative(10f)
                lineToRelative(-5f, 7f)
                lineToRelative(-5f, -7f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(7f, 7f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _InsertButtonCircle = it}
