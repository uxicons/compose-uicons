package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrewAlt: ImageVector? = null

val Icons.Bs.ScrewAlt: ImageVector
    get() = _ScrewAlt ?: UXIcon(name = "ScrewAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.88f, 14f)
                horizontalLineToRelative(-5.77f)
                lineToRelative(-2.89f, 5f)
                lineToRelative(2.89f, 5f)
                horizontalLineToRelative(5.77f)
                lineToRelative(2.89f, -5f)
                lineToRelative(-2.89f, -5f)
                close()
                moveTo(18f, 21f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(0f, 3f)
                lineToRelative(2f, 2.0f)
                verticalLineToRelative(14.98f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                lineTo(10f, 5.02f)
                lineToRelative(2f, -2.02f)
                lineTo(12f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 12.23f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-2.82f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(2.82f)
                close()
                moveTo(7f, 6.59f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-3.58f)
                lineToRelative(2f, 0.01f)
                verticalLineToRelative(1.57f)
                close()
                moveTo(6f, 19.73f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-1.67f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(3.67f)
                lineToRelative(-1f, 1f)
                close()
            }
        }.also { _ScrewAlt = it}
