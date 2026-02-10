package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaDownAlt: ImageVector? = null

val Icons.Ss.SortAlphaDownAlt: ImageVector
    get() = _SortAlphaDownAlt ?: UXIcon(name = "SortAlphaDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                horizontalLineToRelative(4.7f)
                lineToRelative(-4.7f, 5.64f)
                verticalLineToRelative(2.36f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.7f)
                lineToRelative(4.7f, -5.64f)
                lineTo(22f, 0f)
                close()
                moveTo(22f, 17.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 19f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(11.91f, 18.91f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineTo(0.09f, 18.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.5f, 3.5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(2f)
                lineTo(7f, 21f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _SortAlphaDownAlt = it}
