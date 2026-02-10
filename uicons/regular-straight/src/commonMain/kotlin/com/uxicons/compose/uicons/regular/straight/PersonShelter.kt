package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonShelter: ImageVector? = null

val Icons.Rs.PersonShelter: ImageVector
    get() = _PersonShelter ?: UXIcon(name = "PersonShelter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.01f)
                verticalLineToRelative(13.99f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-13.99f)
                curveToRelative(0f, -0.31f, -0.14f, -0.6f, -0.38f, -0.79f)
                lineTo(12.62f, 2.18f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.23f, 0f)
                lineTo(2.38f, 9.22f)
                curveToRelative(-0.24f, 0.19f, -0.38f, 0.48f, -0.38f, 0.79f)
                verticalLineToRelative(13.99f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-13.99f)
                curveToRelative(0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.6f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                close()
                moveTo(12f, 10f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(17f, 14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15f, 14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _PersonShelter = it}
