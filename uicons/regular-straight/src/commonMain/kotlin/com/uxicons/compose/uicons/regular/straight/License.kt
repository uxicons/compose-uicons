package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _License: ImageVector? = null

val Icons.Rs.License: ImageVector
    get() = _License ?: UXIcon(name = "License") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.48f, 0.81f, 2.77f, 2f, 3.46f)
                verticalLineToRelative(4.54f)
                lineToRelative(2f, -2f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-4.54f)
                curveToRelative(1.19f, -0.69f, 2f, -1.99f, 2f, -3.46f)
                close()
                moveTo(14f, 18f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(10f, 24f)
                verticalLineToRelative(-2f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(15f, 3.41f)
                close()
            }
        }.also { _License = it}
