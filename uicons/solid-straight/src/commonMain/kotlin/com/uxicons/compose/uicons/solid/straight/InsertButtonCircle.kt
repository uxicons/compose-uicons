package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertButtonCircle: ImageVector? = null

val Icons.Ss.InsertButtonCircle: ImageVector
    get() = _InsertButtonCircle ?: UXIcon(name = "InsertButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.91f, 13f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-2.08f, 3.18f)
                lineToRelative(-2.08f, -3.18f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(6.5f, 9f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                lineTo(6.5f, 7f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.79f, 11f)
                lineTo(6.21f, 11f)
                lineToRelative(5.79f, 8.82f)
                lineToRelative(5.79f, -8.82f)
                close()
            }
        }.also { _InsertButtonCircle = it}
