package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCircleLeft: ImageVector? = null

val Icons.Sr.UserCircleLeft: ImageVector
    get() = _UserCircleLeft ?: UXIcon(name = "UserCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 24f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.3f, 0f, -0.58f, -0.14f, -0.78f, -0.37f)
                curveToRelative(-0.19f, -0.23f, -0.27f, -0.54f, -0.2f, -0.83f)
                curveToRelative(0.58f, -2.78f, 3.09f, -4.8f, 5.98f, -4.8f)
                reflectiveCurveToRelative(5.4f, 2.02f, 5.98f, 4.8f)
                curveToRelative(0.06f, 0.29f, -0.01f, 0.6f, -0.2f, 0.83f)
                curveToRelative(-0.19f, 0.23f, -0.47f, 0.37f, -0.78f, 0.37f)
                close()
                moveTo(6f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(17.5f, 0f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(20f, 7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.12f)
                curveToRelative(0f, 0.35f, -0.21f, 0.68f, -0.54f, 0.81f)
                curveToRelative(-0.33f, 0.14f, -0.71f, 0.06f, -0.96f, -0.19f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.69f, -0.69f, -0.69f, -1.8f, 0f, -2.48f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.25f, -0.25f, 0.63f, -0.33f, 0.96f, -0.19f)
                curveToRelative(0.33f, 0.14f, 0.54f, 0.46f, 0.54f, 0.81f)
                verticalLineToRelative(1.12f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _UserCircleLeft = it}
