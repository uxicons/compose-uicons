package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailHook: ImageVector? = null

val Icons.Bs.MailHook: ImageVector
    get() = _MailHook ?: UXIcon(name = "MailHook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 6f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(0.28f, 0.95f, 0.35f, 1.97f, 0.21f, 3f)
                horizontalLineToRelative(1.05f)
                lineToRelative(-6.32f, 6.32f)
                curveToRelative(-0.9f, 0.9f, -2.38f, 0.9f, -3.28f, 0f)
                lineToRelative(-6.32f, -6.32f)
                horizontalLineToRelative(9.7f)
                curveToRelative(-0.27f, 0.47f, -0.72f, 0.82f, -1.25f, 0.94f)
                curveToRelative(-0.17f, 0.04f, -0.33f, 0.06f, -0.49f, 0.06f)
                curveToRelative(-0.94f, 0f, -1.67f, 0.86f, -1.46f, 1.83f)
                curveToRelative(0.15f, 0.7f, 0.82f, 1.18f, 1.54f, 1.17f)
                curveToRelative(0.46f, -0.01f, 0.93f, -0.08f, 1.39f, -0.21f)
                curveToRelative(1.6f, -0.46f, 2.89f, -1.77f, 3.34f, -3.37f)
                curveToRelative(0.65f, -2.31f, -0.34f, -4.67f, -2.39f, -5.8f)
                curveToRelative(-0.57f, -0.31f, -0.91f, -0.82f, -0.91f, -1.35f)
                verticalLineToRelative(-2.27f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.27f)
                curveToRelative(0f, 1.5f, 0.77f, 2.86f, 2.07f, 3.73f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-8.8f)
                lineToRelative(5.24f, 5.24f)
                curveToRelative(1.98f, 2.06f, 5.54f, 2.06f, 7.52f, 0f)
                lineToRelative(5.24f, -5.24f)
                verticalLineToRelative(8.8f)
                close()
            }
        }.also { _MailHook = it}
