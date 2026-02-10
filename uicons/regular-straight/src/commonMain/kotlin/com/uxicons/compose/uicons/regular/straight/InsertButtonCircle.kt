package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertButtonCircle: ImageVector? = null

val Icons.Rs.InsertButtonCircle: ImageVector
    get() = _InsertButtonCircle ?: UXIcon(name = "InsertButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 9f)
                lineTo(6.5f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                close()
                moveTo(6.21f, 11f)
                horizontalLineToRelative(11.58f)
                lineToRelative(-5.79f, 8.82f)
                lineTo(6.21f, 11f)
                close()
                moveTo(14.09f, 13f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(2.08f, 3.18f)
                lineToRelative(2.08f, -3.18f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
            }
        }.also { _InsertButtonCircle = it}
