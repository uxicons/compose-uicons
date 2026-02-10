package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equality: ImageVector? = null

val Icons.Bs.Equality: ImageVector
    get() = _Equality ?: UXIcon(name = "Equality") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.74f)
                lineToRelative(-3.44f, -9.74f)
                horizontalLineToRelative(-7.06f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                lineTo(3.44f, 2f)
                lineTo(0f, 11.74f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, 2.01f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-0.76f)
                lineToRelative(-2.38f, -6.74f)
                horizontalLineToRelative(3.88f)
                lineTo(10.5f, 21f)
                lineTo(4f, 21f)
                verticalLineToRelative(3f)
                lineTo(20f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.5f)
                lineTo(13.5f, 5f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-2.38f, 6.74f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, 2.01f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-0.76f)
                close()
                moveTo(3.09f, 12f)
                lineToRelative(1.41f, -3.99f)
                lineToRelative(1.41f, 3.99f)
                lineTo(3.09f, 12f)
                close()
                moveTo(18.09f, 12f)
                lineToRelative(1.41f, -3.99f)
                lineToRelative(1.41f, 3.99f)
                horizontalLineToRelative(-2.82f)
                close()
            }
        }.also { _Equality = it}
