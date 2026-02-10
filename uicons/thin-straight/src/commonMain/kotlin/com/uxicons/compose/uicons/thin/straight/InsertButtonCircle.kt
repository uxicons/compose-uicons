package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertButtonCircle: ImageVector? = null

val Icons.Ts.InsertButtonCircle: ImageVector
    get() = _InsertButtonCircle ?: UXIcon(name = "InsertButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.96f)
                lineToRelative(5.23f, -7.96f)
                lineTo(6.77f, 11f)
                lineToRelative(5.23f, 7.96f)
                close()
                moveTo(12f, 17.14f)
                lineToRelative(-3.37f, -5.14f)
                horizontalLineToRelative(6.75f)
                lineToRelative(-3.37f, 5.14f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(17f, 7f)
                lineTo(7f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16f, 9f)
                lineTo(8f, 9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _InsertButtonCircle = it}
