package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailHook: ImageVector? = null

val Icons.Rs.MailHook: ImageVector
    get() = _MailHook ?: UXIcon(name = "MailHook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(0.19f, 0.63f, 0.29f, 1.3f, 0.29f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.07f, 0f, 0.13f, 0.03f, 0.2f, 0.04f)
                lineToRelative(-7.08f, 7.08f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                lineToRelative(-7.08f, -7.08f)
                curveToRelative(0.07f, -0.01f, 0.13f, -0.04f, 0.2f, -0.04f)
                horizontalLineToRelative(11.99f)
                curveToRelative(0f, 0.24f, -0.01f, 0.48f, -0.07f, 0.72f)
                curveToRelative(-0.24f, 1.07f, -1.13f, 1.95f, -2.2f, 2.2f)
                curveToRelative(-0.24f, 0.06f, -0.48f, 0.08f, -0.72f, 0.08f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(0.39f, 0f, 0.78f, -0.04f, 1.17f, -0.13f)
                curveToRelative(1.83f, -0.42f, 3.28f, -1.87f, 3.7f, -3.7f)
                curveToRelative(0.54f, -2.37f, -0.61f, -4.72f, -2.79f, -5.72f)
                curveToRelative(-0.66f, -0.3f, -1.07f, -0.91f, -1.07f, -1.58f)
                verticalLineToRelative(-2.87f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.87f)
                curveToRelative(0f, 1.44f, 0.88f, 2.78f, 2.24f, 3.4f)
                curveToRelative(0.39f, 0.18f, 0.71f, 0.43f, 0.98f, 0.73f)
                horizontalLineToRelative(-5.22f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-10.93f)
                lineToRelative(6.46f, 6.46f)
                curveToRelative(1.86f, 1.94f, 5.21f, 1.94f, 7.07f, 0f)
                lineToRelative(6.46f, -6.46f)
                verticalLineToRelative(10.93f)
                close()
            }
        }.also { _MailHook = it}
