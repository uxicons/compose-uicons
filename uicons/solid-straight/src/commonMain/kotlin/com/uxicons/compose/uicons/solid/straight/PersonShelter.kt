package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonShelter: ImageVector? = null

val Icons.Ss.PersonShelter: ImageVector
    get() = _PersonShelter ?: UXIcon(name = "PersonShelter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 10.01f)
                verticalLineToRelative(13.99f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.99f)
                curveToRelative(0f, -0.92f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.6f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.44f, 1.15f, 2.36f)
                close()
                moveTo(14.5f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(14.5f, 12f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _PersonShelter = it}
