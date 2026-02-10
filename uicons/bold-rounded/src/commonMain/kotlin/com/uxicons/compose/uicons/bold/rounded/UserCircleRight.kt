package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCircleRight: ImageVector? = null

val Icons.Br.UserCircleRight: ImageVector
    get() = _UserCircleRight ?: UXIcon(name = "UserCircleRight") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(21.72f, 7.18f)
            lineTo(18.65f, 10.25f)
            curveToRelative(-0.61f, 0.61f, -1.65f, 0.18f, -1.65f, -0.69f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, 1.04f, -1.29f, 1.65f, -0.69f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.38f, 0.38f, 0.38f, 0.99f, 0f, 1.37f)
            close()
            moveTo(12.85f, 21.86f)
            curveToRelative(0.36f, 0.75f, 0.04f, 1.64f, -0.71f, 2.0f)
            curveToRelative(-0.73f, 0.35f, -1.64f, 0.05f, -2.0f, -0.71f)
            curveToRelative(-0.62f, -1.3f, -2.05f, -2.15f, -3.65f, -2.15f)
            reflectiveCurveToRelative(-3.02f, 0.84f, -3.65f, 2.15f)
            curveToRelative(-0.36f, 0.75f, -1.25f, 1.06f, -2.0f, 0.71f)
            curveToRelative(-0.75f, -0.36f, -1.06f, -1.25f, -0.71f, -2.0f)
            curveToRelative(1.12f, -2.34f, 3.61f, -3.85f, 6.35f, -3.85f)
            reflectiveCurveToRelative(5.24f, 1.51f, 6.35f, 3.85f)
            close()
            moveTo(2.5f, 12f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
        }
    }.also { _UserCircleRight = it }
