package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRifle: ImageVector? = null

val Icons.Rs.PersonRifle: ImageVector
    get() = _PersonRifle ?: UXIcon(name = "PersonRifle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.4f, 11f)
                horizontalLineToRelative(6.6f)
                verticalLineToRelative(2f)
                lineTo(7.4f, 13f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.03f, -0.4f, 0.06f)
                verticalLineToRelative(8.94f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                lineTo(5f, 15.39f)
                lineToRelative(-3.1f, 6.54f)
                lineToRelative(-1.81f, -0.85f)
                lineToRelative(3.69f, -7.78f)
                curveToRelative(0.66f, -1.39f, 2.08f, -2.29f, 3.62f, -2.29f)
                close()
                moveTo(14f, 5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(7.79f, 1f, 10f, 1f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(19f, 15f)
                curveToRelative(2.1f, -0.42f, 5f, -2.08f, 5f, -6f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.73f, -1.8f, 3.6f, -3f, 3.87f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-1.28f, -5.5f)
                horizontalLineToRelative(4.28f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _PersonRifle = it}
