package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Ss.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14.82f, 9.54f)
                lineToRelative(-0.11f, -0.91f)
                curveToRelative(-0.19f, -1.5f, -1.47f, -2.63f, -2.98f, -2.63f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-1.51f, 0f, -2.79f, 1.13f, -2.98f, 2.63f)
                lineToRelative(-0.22f, 1.79f)
                lineToRelative(4.88f, 2.46f)
                lineToRelative(-0.9f, 1.79f)
                lineToRelative(-4.25f, -2.14f)
                lineToRelative(-0.94f, 7.48f)
                horizontalLineToRelative(2.13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.71f)
                lineToRelative(0.23f, -0.67f)
                curveToRelative(0.11f, -0.31f, 1.05f, -3.11f, 1.05f, -4.83f)
                curveToRelative(0f, -2.15f, -1.25f, -4.07f, -3.17f, -4.96f)
                close()
            }
        }.also { _PersonPregnant = it}
