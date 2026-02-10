package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrewAlt: ImageVector? = null

val Icons.Rs.ScrewAlt: ImageVector
    get() = _ScrewAlt ?: UXIcon(name = "ScrewAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(9f, 6.91f)
                verticalLineToRelative(14.06f)
                lineToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
                lineTo(3f, 6.91f)
                lineTo(0f, 3.91f)
                lineTo(0f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.91f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(5f, 16.17f)
                lineToRelative(2f, -2.07f)
                verticalLineToRelative(-2.68f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(2.75f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.59f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(-1.59f)
                close()
                moveTo(2f, 3.09f)
                lineToRelative(1.91f, 1.91f)
                horizontalLineToRelative(4.17f)
                lineToRelative(1.91f, -1.91f)
                verticalLineToRelative(-1.09f)
                lineTo(2f, 2f)
                verticalLineToRelative(1.09f)
                close()
                moveTo(7f, 20.14f)
                verticalLineToRelative(-3.17f)
                lineToRelative(-2f, 2.07f)
                verticalLineToRelative(1.09f)
                lineToRelative(1f, 1f)
                lineToRelative(1f, -1f)
                close()
                moveTo(23.84f, 18.5f)
                lineToRelative(-3.17f, 5.5f)
                horizontalLineToRelative(-6.35f)
                lineToRelative(-3.17f, -5.5f)
                lineToRelative(3.17f, -5.5f)
                horizontalLineToRelative(6.35f)
                lineToRelative(3.17f, 5.5f)
                close()
                moveTo(21.53f, 18.5f)
                lineToRelative(-2.02f, -3.5f)
                horizontalLineToRelative(-4.04f)
                lineToRelative(-2.02f, 3.5f)
                lineToRelative(2.02f, 3.5f)
                horizontalLineToRelative(4.04f)
                lineToRelative(2.02f, -3.5f)
                close()
            }
        }.also { _ScrewAlt = it}
