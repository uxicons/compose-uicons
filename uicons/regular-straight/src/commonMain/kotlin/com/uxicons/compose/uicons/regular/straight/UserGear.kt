package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGear: ImageVector? = null

val Icons.Rs.UserGear: ImageVector
    get() = _UserGear ?: UXIcon(name = "UserGear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(9f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -0.55f, -0.09f, -1.08f, -0.26f, -1.58f)
                lineToRelative(1.82f, -1.05f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.82f, 1.05f)
                curveToRelative(-0.71f, -0.8f, -1.66f, -1.37f, -2.74f, -1.59f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.1f)
                curveToRelative(-1.08f, 0.22f, -2.04f, 0.79f, -2.74f, 1.59f)
                lineToRelative(-1.82f, -1.05f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.82f, 1.05f)
                curveToRelative(-0.17f, 0.5f, -0.26f, 1.03f, -0.26f, 1.58f)
                reflectiveCurveToRelative(0.09f, 1.08f, 0.26f, 1.58f)
                lineToRelative(-1.82f, 1.05f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.82f, -1.05f)
                curveToRelative(0.71f, 0.8f, 1.66f, 1.37f, 2.74f, 1.59f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.1f)
                curveToRelative(1.08f, -0.22f, 2.04f, -0.79f, 2.74f, -1.59f)
                lineToRelative(1.82f, 1.05f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.82f, -1.05f)
                curveToRelative(0.17f, -0.5f, 0.26f, -1.03f, 0.26f, -1.58f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
            }
        }.also { _UserGear = it}
