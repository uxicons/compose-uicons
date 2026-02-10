package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Rs.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                verticalLineToRelative(12f)
                lineTo(9f, 24f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(22f, 12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.54f)
                curveToRelative(0.3f, 0.95f, 0.46f, 1.96f, 0.46f, 3f)
                close()
                moveTo(20.66f, 7f)
                horizontalLineToRelative(-7.66f)
                lineTo(13f, 2.05f)
                curveToRelative(3.27f, 0.33f, 6.08f, 2.24f, 7.66f, 4.95f)
                close()
                moveTo(11f, 2.05f)
                lineTo(11f, 7f)
                lineTo(3.34f, 7f)
                curveToRelative(1.57f, -2.71f, 4.39f, -4.62f, 7.66f, -4.95f)
                close()
                moveTo(2.46f, 9f)
                horizontalLineToRelative(3.54f)
                verticalLineToRelative(6f)
                lineTo(2f, 15f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.04f, 0.16f, -2.05f, 0.46f, -3f)
                close()
                moveTo(7f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-5f)
                lineTo(7f, 17f)
                verticalLineToRelative(5f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.63f, 0f, -3.09f, 0.79f, -4f, 2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5.0f)
                curveToRelative(-0.91f, -1.22f, -2.37f, -2.0f, -4f, -2.0f)
                close()
                moveTo(17f, 22f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Igloo = it}
