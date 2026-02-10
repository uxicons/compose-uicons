package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRifle: ImageVector? = null

val Icons.Ss.PersonRifle: ImageVector
    get() = _PersonRifle ?: UXIcon(name = "PersonRifle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(7.4f, 11f)
                curveToRelative(-1.54f, 0f, -2.96f, 0.9f, -3.62f, 2.29f)
                lineTo(0.1f, 21.07f)
                lineToRelative(1.81f, 0.85f)
                lineToRelative(3.1f, -6.54f)
                verticalLineToRelative(8.61f)
                lineTo(14f, 24.0f)
                lineTo(14f, 11f)
                lineTo(7.4f, 11f)
                close()
                moveTo(24f, 9f)
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
                curveToRelative(2.1f, -0.42f, 5f, -2.08f, 5f, -6f)
                close()
            }
        }.also { _PersonRifle = it}
