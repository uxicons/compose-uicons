package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaUp: ImageVector? = null

val Icons.Rs.SortAlphaUp: ImageVector
    get() = _SortAlphaUp ?: UXIcon(name = "SortAlphaUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.36f)
                lineToRelative(-4.7f, 5.64f)
                horizontalLineToRelative(4.7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2.36f)
                lineToRelative(4.7f, -5.64f)
                horizontalLineToRelative(-4.7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4.59f, 0.59f)
                lineTo(0.09f, 5.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.5f, -3.5f)
                lineTo(5f, 24f)
                horizontalLineToRelative(2f)
                lineTo(7f, 3f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(7.41f, 0.59f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                close()
            }
        }.also { _SortAlphaUp = it}
