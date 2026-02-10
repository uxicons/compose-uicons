package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailHook: ImageVector? = null

val Icons.Ts.MailHook: ImageVector
    get() = _MailHook ?: UXIcon(name = "MailHook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(0.15f, 0.32f, 0.28f, 0.66f, 0.39f, 1f)
                horizontalLineToRelative(2.81f)
                curveToRelative(0.53f, 0f, 1f, 0.28f, 1.27f, 0.7f)
                lineToRelative(-8.27f, 8.27f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.98f, -0.01f, -1.83f, -0.36f, -2.49f, -1.02f)
                lineToRelative(-8.27f, -8.27f)
                curveToRelative(0.27f, -0.42f, 0.73f, -0.7f, 1.27f, -0.7f)
                horizontalLineToRelative(12.96f)
                curveToRelative(0.41f, 0.71f, 0.6f, 1.54f, 0.52f, 2.4f)
                curveToRelative(-0.19f, 2.14f, -2.25f, 3.74f, -4.48f, 3.6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(2.75f, 0.14f, 5.24f, -1.87f, 5.48f, -4.51f)
                curveToRelative(0.2f, -2.15f, -0.97f, -4.18f, -2.94f, -5.06f)
                curveToRelative(-0.95f, -0.43f, -1.54f, -1.28f, -1.54f, -2.23f)
                verticalLineToRelative(-2.21f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.21f)
                curveToRelative(0f, 1.35f, 0.82f, 2.55f, 2.13f, 3.14f)
                curveToRelative(0.38f, 0.17f, 0.71f, 0.39f, 1.01f, 0.65f)
                horizontalLineToRelative(-6.64f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-14.12f)
                lineToRelative(7.8f, 7.8f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.2f, 0f, 2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(7.8f, -7.8f)
                verticalLineToRelative(14.12f)
                close()
            }
        }.also { _MailHook = it}
