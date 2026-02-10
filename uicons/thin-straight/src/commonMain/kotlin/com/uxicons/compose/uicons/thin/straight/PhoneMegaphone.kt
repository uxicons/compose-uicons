package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneMegaphone: ImageVector? = null

val Icons.Ts.PhoneMegaphone: ImageVector
    get() = _PhoneMegaphone ?: UXIcon(name = "PhoneMegaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-15f)
                close()
                moveTo(18f, 18f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                close()
                moveTo(23f, 7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.23f, 1.21f, -1.1f, 2.02f, -2.49f, 2f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.73f, 0.4f, 1.36f, 0.98f, 1.71f)
                lineToRelative(1.64f, 4.29f)
                horizontalLineToRelative(0.91f)
                curveToRelative(1.12f, 0.04f, 1.95f, -1.23f, 1.47f, -2.25f)
                lineToRelative(-0.68f, -1.75f)
                horizontalLineToRelative(1.18f)
                curveToRelative(1.39f, -0.02f, 2.25f, 0.79f, 2.49f, 2f)
                horizontalLineToRelative(1.01f)
                verticalLineToRelative(-4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.07f, 13.12f)
                curveToRelative(0.2f, 0.39f, -0.11f, 0.89f, -0.54f, 0.88f)
                horizontalLineToRelative(-0.22f)
                lineToRelative(-1.15f, -3f)
                horizontalLineToRelative(1.09f)
                lineToRelative(0.82f, 2.12f)
                close()
                moveTo(22f, 10.92f)
                curveToRelative(-0.61f, -0.59f, -1.48f, -0.92f, -2.5f, -0.92f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1.0f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.02f, 0f, 1.89f, -0.33f, 2.5f, -0.92f)
                verticalLineToRelative(5.85f)
                close()
            }
        }.also { _PhoneMegaphone = it}
