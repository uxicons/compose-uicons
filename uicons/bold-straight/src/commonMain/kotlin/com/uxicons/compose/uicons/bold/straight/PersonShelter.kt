package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonShelter: ImageVector? = null

val Icons.Bs.PersonShelter: ImageVector
    get() = _PersonShelter ?: UXIcon(name = "PersonShelter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.13f)
                verticalLineToRelative(13.87f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-13.87f)
                curveToRelative(0f, -0.12f, -0.06f, -0.24f, -0.16f, -0.32f)
                lineTo(12.25f, 3.09f)
                curveToRelative(-0.15f, -0.12f, -0.35f, -0.12f, -0.5f, 0f)
                lineTo(3.16f, 9.81f)
                curveToRelative(-0.1f, 0.08f, -0.16f, 0.2f, -0.16f, 0.32f)
                verticalLineToRelative(13.87f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.87f)
                curveToRelative(0f, -1.05f, 0.48f, -2.03f, 1.31f, -2.68f)
                lineTo(9.9f, 0.72f)
                curveToRelative(1.24f, -0.97f, 2.96f, -0.97f, 4.2f, 0f)
                lineToRelative(8.59f, 6.72f)
                curveToRelative(0.83f, 0.65f, 1.31f, 1.63f, 1.31f, 2.69f)
                close()
                moveTo(14.5f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(17f, 15.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _PersonShelter = it}
