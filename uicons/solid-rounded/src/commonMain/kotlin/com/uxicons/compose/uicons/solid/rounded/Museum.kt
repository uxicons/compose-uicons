package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Museum: ImageVector? = null

val Icons.Sr.Museum: ImageVector
    get() = _Museum ?: UXIcon(name = "Museum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11.01f)
                curveToRelative(1.66f, -0.03f, 3f, -1.39f, 3f, -3.05f)
                curveToRelative(0f, -1.12f, -0.61f, -2.15f, -1.59f, -2.68f)
                lineToRelative(-8.97f, -4.89f)
                curveToRelative(-0.9f, -0.49f, -1.97f, -0.49f, -2.87f, 0f)
                lineToRelative(-8.97f, 4.89f)
                curveToRelative(-0.98f, 0.54f, -1.59f, 1.56f, -1.59f, 2.68f)
                curveToRelative(0f, 1.67f, 1.34f, 3.02f, 3f, 3.05f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(16f, 11.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(4f)
                close()
                moveTo(12f, 4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5f, 11.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Museum = it}
