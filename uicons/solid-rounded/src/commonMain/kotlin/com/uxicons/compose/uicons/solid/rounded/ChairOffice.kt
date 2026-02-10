package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairOffice: ImageVector? = null

val Icons.Sr.ChairOffice: ImageVector
    get() = _ChairOffice ?: UXIcon(name = "ChairOffice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(3.5f, 14f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineToRelative(-3.05f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3.05f)
                curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.5f, -0.05f)
                horizontalLineTo(3.5f)
                close()
            }
        }.also { _ChairOffice = it}
