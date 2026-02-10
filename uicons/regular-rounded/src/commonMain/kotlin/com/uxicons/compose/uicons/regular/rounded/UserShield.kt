package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Rr.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.96f, 15.58f)
                curveToRelative(-0.16f, 0.53f, -0.71f, 0.83f, -1.24f, 0.67f)
                curveToRelative(-0.55f, -0.17f, -1.13f, -0.25f, -1.71f, -0.25f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(0.78f, 0f, 1.55f, 0.11f, 2.29f, 0.33f)
                curveToRelative(0.53f, 0.16f, 0.83f, 0.71f, 0.67f, 1.24f)
                close()
                moveTo(24f, 14.44f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 4.03f, -3.97f, 5.94f, -5.13f, 6.41f)
                curveToRelative(-0.12f, 0.05f, -0.25f, 0.07f, -0.37f, 0.07f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.46f, -0.11f)
                curveToRelative(-1.12f, -0.56f, -5.04f, -2.8f, -5.04f, -6.37f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineToRelative(3.13f, -1.04f)
                curveToRelative(0.2f, -0.07f, 0.43f, -0.07f, 0.63f, 0f)
                lineToRelative(3.13f, 1.04f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                close()
                moveTo(22f, 14.44f)
                curveToRelative(0f, -0.43f, -0.28f, -0.81f, -0.69f, -0.95f)
                lineToRelative(-2.81f, -0.93f)
                lineToRelative(-2.81f, 0.93f)
                curveToRelative(-0.41f, 0.14f, -0.69f, 0.52f, -0.69f, 0.95f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 2.28f, 2.63f, 3.89f, 3.54f, 4.38f)
                curveToRelative(1.03f, -0.45f, 3.46f, -1.8f, 3.46f, -4.38f)
                verticalLineToRelative(-3.08f)
                close()
                moveTo(14f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _UserShield = it}
