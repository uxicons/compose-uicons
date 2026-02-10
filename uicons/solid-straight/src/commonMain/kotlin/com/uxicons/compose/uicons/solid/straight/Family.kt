package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Family: ImageVector? = null

val Icons.Ss.Family: ImageVector
    get() = _Family ?: UXIcon(name = "Family") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(12f, 10f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(23.13f, 20f)
                lineToRelative(-1.42f, -11.37f)
                curveToRelative(-0.19f, -1.5f, -1.47f, -2.63f, -2.98f, -2.63f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.34f, 0f, -0.66f, 0.06f, -0.97f, 0.16f)
                curveToRelative(0f, 0f, -0.02f, 0.0f, -0.02f, 0.01f)
                curveToRelative(0.13f, 0.42f, 0.22f, 0.87f, 0.22f, 1.33f)
                curveToRelative(0f, 0.87f, -0.26f, 1.68f, -0.69f, 2.37f)
                curveToRelative(1.32f, 0.9f, 2.19f, 2.42f, 2.19f, 4.13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.13f)
                close()
                moveTo(7.5f, 7.5f)
                curveToRelative(0f, -0.49f, 0.1f, -0.96f, 0.25f, -1.41f)
                curveToRelative(-0.01f, -0.0f, -0.01f, -0.0f, -0.02f, -0.01f)
                curveToRelative(-0.23f, -0.06f, -0.48f, -0.09f, -0.73f, -0.09f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.72f, 0.87f, -3.23f, 2.19f, -4.13f)
                curveToRelative(-0.43f, -0.69f, -0.69f, -1.5f, -0.69f, -2.37f)
                close()
            }
        }.also { _Family = it}
