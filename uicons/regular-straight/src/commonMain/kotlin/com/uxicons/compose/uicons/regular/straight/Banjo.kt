package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Rs.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.05f, 6f)
                lineToRelative(2.95f, -2.94f)
                lineToRelative(-3.05f, -3.06f)
                lineToRelative(-2.95f, 2.94f)
                verticalLineToRelative(1.64f)
                lineToRelative(-5.1f, 5.1f)
                curveToRelative(-1.35f, -1.05f, -3.06f, -1.68f, -4.9f, -1.68f)
                curveTo(3.59f, 8f, 0f, 11.59f, 0f, 16f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -1.85f, -0.63f, -3.55f, -1.68f, -4.9f)
                lineToRelative(5.1f, -5.1f)
                horizontalLineToRelative(1.64f)
                close()
                moveTo(8f, 22f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(5.71f, 14.29f)
                lineToRelative(4f, 4f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-4f, -4f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _Banjo = it}
