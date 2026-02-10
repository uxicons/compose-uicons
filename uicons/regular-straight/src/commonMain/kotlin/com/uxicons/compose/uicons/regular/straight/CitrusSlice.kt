package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CitrusSlice: ImageVector? = null

val Icons.Rs.CitrusSlice: ImageVector
    get() = _CitrusSlice ?: UXIcon(name = "CitrusSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.98f, 0.79f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.09f, 19.27f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(2.65f, 2.65f, 6.12f, 3.97f, 9.59f, 3.97f)
                reflectiveCurveToRelative(6.95f, -1.32f, 9.59f, -3.97f)
                curveToRelative(2.56f, -2.56f, 3.97f, -5.97f, 3.97f, -9.59f)
                reflectiveCurveToRelative(-1.41f, -7.03f, -3.97f, -9.59f)
                close()
                moveTo(11f, 12.41f)
                lineToRelative(6.82f, 6.82f)
                curveToRelative(-1.98f, 1.66f, -4.38f, 2.56f, -6.82f, 2.69f)
                verticalLineToRelative(-9.51f)
                close()
                moveTo(12.41f, 11f)
                horizontalLineToRelative(9.51f)
                curveToRelative(-0.13f, 2.52f, -1.06f, 4.9f, -2.69f, 6.82f)
                lineToRelative(-6.82f, -6.82f)
                close()
                moveTo(21.86f, 9f)
                horizontalLineToRelative(-8.68f)
                lineToRelative(6.05f, -6.06f)
                curveToRelative(1.46f, 1.73f, 2.35f, 3.82f, 2.62f, 6.06f)
                close()
                moveTo(9f, 13.19f)
                verticalLineToRelative(8.67f)
                curveToRelative(-2.17f, -0.26f, -4.29f, -1.13f, -6.06f, -2.61f)
                lineToRelative(6.06f, -6.06f)
                close()
            }
        }.also { _CitrusSlice = it}
