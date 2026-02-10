package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddImage: ImageVector? = null

val Icons.Ts.AddImage: ImageVector
    get() = _AddImage ?: UXIcon(name = "AddImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 20f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(0f, 21f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.34f)
                lineToRelative(5.13f, -5.13f)
                curveToRelative(0.9f, -0.9f, 2.37f, -0.9f, 3.28f, 0f)
                lineToRelative(7.59f, 7.59f)
                verticalLineToRelative(0.71f)
                horizontalLineToRelative(-0.71f)
                lineToRelative(-7.59f, -7.59f)
                curveToRelative(-0.51f, -0.51f, -1.35f, -0.51f, -1.86f, 0f)
                lineTo(1f, 15.25f)
                verticalLineToRelative(4.75f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(14.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _AddImage = it}
