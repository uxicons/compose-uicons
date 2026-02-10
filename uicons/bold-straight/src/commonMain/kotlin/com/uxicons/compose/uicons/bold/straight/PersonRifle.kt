package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonRifle: ImageVector? = null

val Icons.Bs.PersonRifle: ImageVector
    get() = _PersonRifle ?: UXIcon(name = "PersonRifle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.9f, 11f)
                horizontalLineToRelative(5.1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                lineTo(5f, 24f)
                verticalLineToRelative(-5.88f)
                lineToRelative(-2.15f, 4.53f)
                lineTo(0.14f, 21.36f)
                lineToRelative(3.69f, -7.78f)
                curveToRelative(0.74f, -1.56f, 2.34f, -2.57f, 4.07f, -2.57f)
                close()
                moveTo(19.0f, 13.84f)
                curveToRelative(2.38f, -0.5f, 5.0f, -2.23f, 5.0f, -5.84f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.68f, -1.04f, 2.42f, -2f, 2.74f)
                lineTo(19.0f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(16.0f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(15.0f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.98f, -4f)
                horizontalLineToRelative(2.98f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.71f)
                lineToRelative(-0.28f, -1.16f)
                close()
                moveTo(10f, 1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(12.21f, 1f, 10f, 1f)
                close()
            }
        }.also { _PersonRifle = it}
