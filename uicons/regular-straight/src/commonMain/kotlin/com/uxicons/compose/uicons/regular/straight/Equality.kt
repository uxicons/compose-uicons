package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equality: ImageVector? = null

val Icons.Rs.Equality: ImageVector
    get() = _Equality ?: UXIcon(name = "Equality") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.21f, 2f)
                horizontalLineToRelative(-7.21f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                lineTo(3.79f, 2f)
                lineTo(0f, 12.83f)
                verticalLineToRelative(0.67f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.67f)
                lineTo(5.91f, 4f)
                horizontalLineToRelative(5.09f)
                lineTo(11f, 22f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                lineTo(20f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 4f)
                horizontalLineToRelative(5.09f)
                lineToRelative(-3.09f, 8.83f)
                verticalLineToRelative(0.67f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.67f)
                lineToRelative(-3.79f, -10.83f)
                close()
                moveTo(4.5f, 16f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                lineTo(6.95f, 14f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                close()
                moveTo(6.59f, 12f)
                lineTo(2.41f, 12f)
                lineToRelative(2.09f, -5.97f)
                lineToRelative(2.09f, 5.97f)
                close()
                moveTo(19.5f, 6.03f)
                lineToRelative(2.09f, 5.97f)
                horizontalLineToRelative(-4.18f)
                lineToRelative(2.09f, -5.97f)
                close()
                moveTo(19.5f, 16f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                horizontalLineToRelative(4.9f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                close()
            }
        }.also { _Equality = it}
