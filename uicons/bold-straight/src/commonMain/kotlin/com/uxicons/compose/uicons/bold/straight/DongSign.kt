package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DongSign: ImageVector? = null

val Icons.Bs.DongSign: ImageVector
    get() = _DongSign ?: UXIcon(name = "DongSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                lineTo(2f, 24f)
                verticalLineToRelative(-3f)
                lineTo(22f, 21f)
                close()
                moveTo(6f, 13f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(1.09f, 0f, 2.12f, 0.29f, 3f, 0.81f)
                verticalLineToRelative(-2.81f)
                horizontalLineToRelative(-4f)
                lineTo(11f, 2f)
                horizontalLineToRelative(4f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.81f)
                curveToRelative(-0.88f, 0.51f, -1.91f, 0.81f, -3f, 0.81f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
                moveTo(9f, 13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _DongSign = it}
