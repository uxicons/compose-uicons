package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaDownAlt: ImageVector? = null

val Icons.Ts.SortAlphaDownAlt: ImageVector
    get() = _SortAlphaDownAlt ?: UXIcon(name = "SortAlphaDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.62f, 18.12f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.72f, 4.72f)
                curveToRelative(-0.29f, 0.3f, -0.69f, 0.46f, -1.11f, 0.46f)
                reflectiveCurveToRelative(-0.81f, -0.16f, -1.11f, -0.46f)
                lineTo(0.68f, 18.82f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.62f, 4.62f)
                lineTo(6f, 0f)
                horizontalLineToRelative(1f)
                lineTo(7f, 22.73f)
                lineToRelative(4.62f, -4.62f)
                close()
                moveTo(22f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 17f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(16f, 1f)
                horizontalLineToRelative(4.89f)
                lineToRelative(-4.89f, 6.84f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.89f)
                lineTo(22f, 1.16f)
                lineTo(22f, 0f)
                close()
            }
        }.also { _SortAlphaDownAlt = it}
