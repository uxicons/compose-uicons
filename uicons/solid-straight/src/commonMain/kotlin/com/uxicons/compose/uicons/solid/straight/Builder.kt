package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Builder: ImageVector? = null

val Icons.Ss.Builder: ImageVector
    get() = _Builder ?: UXIcon(name = "Builder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                close()
                moveTo(24f, 21f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14.98f, 4.98f)
                curveToRelative(-0.24f, -2.63f, -2.34f, -4.74f, -4.98f, -4.98f)
                verticalLineToRelative(3.98f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 0f)
                curveTo(5.37f, 0.24f, 3.26f, 2.34f, 3.02f, 4.98f)
                horizontalLineToRelative(-1.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.02f)
                close()
                moveTo(3f, 8.98f)
                horizontalLineToRelative(12f)
                lineToRelative(-0.0f, 0.15f)
                curveToRelative(-0.08f, 3.24f, -2.74f, 5.85f, -6.0f, 5.85f)
                reflectiveCurveToRelative(-5.92f, -2.61f, -6.0f, -5.85f)
                lineToRelative(-0.0f, -0.15f)
                close()
            }
        }.also { _Builder = it}
