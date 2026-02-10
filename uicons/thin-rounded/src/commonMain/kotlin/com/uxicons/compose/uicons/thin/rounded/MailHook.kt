package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailHook: ImageVector? = null

val Icons.Tr.MailHook: ImageVector
    get() = _MailHook ?: UXIcon(name = "MailHook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.08f, 0f, 2.04f, 0.51f, 2.69f, 1.28f)
                lineToRelative(-7.69f, 7.69f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.98f, -0.01f, -1.83f, -0.36f, -2.49f, -1.02f)
                lineToRelative(-7.69f, -7.69f)
                curveToRelative(0.64f, -0.78f, 1.6f, -1.28f, 2.69f, -1.28f)
                horizontalLineToRelative(10.96f)
                curveToRelative(0.41f, 0.71f, 0.6f, 1.54f, 0.52f, 2.4f)
                curveToRelative(-0.19f, 2.02f, -2.03f, 3.6f, -4.17f, 3.6f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.31f)
                curveToRelative(2.66f, 0f, 4.93f, -1.98f, 5.17f, -4.51f)
                curveToRelative(0.2f, -2.15f, -0.97f, -4.18f, -2.94f, -5.06f)
                curveToRelative(-0.95f, -0.43f, -1.54f, -1.28f, -1.54f, -2.23f)
                verticalLineToRelative(-1.71f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.71f)
                curveToRelative(0f, 1.35f, 0.82f, 2.55f, 2.13f, 3.14f)
                curveToRelative(0.38f, 0.17f, 0.71f, 0.39f, 1.01f, 0.65f)
                horizontalLineToRelative(-6.64f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.48f, 0.1f, -0.93f, 0.27f, -1.35f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(1.69f, 1.75f, 4.72f, 1.75f, 6.4f, 0f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(0.17f, 0.41f, 0.27f, 0.87f, 0.27f, 1.35f)
                close()
            }
        }.also { _MailHook = it}
