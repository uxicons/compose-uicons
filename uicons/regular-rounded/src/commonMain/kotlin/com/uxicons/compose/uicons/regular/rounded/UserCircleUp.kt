package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCircleUp: ImageVector? = null

val Icons.Rr.UserCircleUp: ImageVector
    get() = _UserCircleUp ?: UXIcon(name = "UserCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(11.98f, 22.8f)
                curveToRelative(0.11f, 0.54f, -0.23f, 1.07f, -0.78f, 1.18f)
                curveToRelative(-0.53f, 0.11f, -1.07f, -0.23f, -1.18f, -0.78f)
                curveToRelative(-0.39f, -1.86f, -2.08f, -3.2f, -4.02f, -3.2f)
                reflectiveCurveToRelative(-3.64f, 1.35f, -4.02f, 3.2f)
                curveToRelative(-0.11f, 0.54f, -0.65f, 0.88f, -1.18f, 0.78f)
                curveToRelative(-0.54f, -0.11f, -0.89f, -0.64f, -0.78f, -1.18f)
                curveToRelative(0.58f, -2.78f, 3.09f, -4.8f, 5.98f, -4.8f)
                reflectiveCurveToRelative(5.4f, 2.02f, 5.98f, 4.8f)
                close()
                moveTo(6f, 16f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(6f, 10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(20.24f, 5.5f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.39f, 0.26f, 0.62f)
                curveToRelative(0.01f, 0.47f, -0.4f, 0.89f, -0.88f, 0.88f)
                horizontalLineToRelative(-1.12f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.21f, -0.81f, -0.54f)
                curveToRelative(-0.14f, -0.33f, -0.06f, -0.71f, 0.19f, -0.96f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.69f, -0.69f, 1.8f, -0.69f, 2.48f, 0f)
                lineToRelative(1.5f, 1.5f)
                close()
            }
        }.also { _UserCircleUp = it}
