package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Rc.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 21.29f)
                lineToRelative(-2.19f, -2.19f)
                curveToRelative(-0.7f, -2.41f, -2.22f, -3.92f, -4.63f, -4.63f)
                lineToRelative(-1.72f, -1.72f)
                curveToRelative(2.61f, -0.6f, 3.83f, -2.43f, 3.83f, -5.76f)
                curveToRelative(0f, -4.15f, -1.85f, -6f, -6f, -6f)
                curveToRelative(-3.33f, 0f, -5.16f, 1.22f, -5.76f, 3.83f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(20f, 20f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.03f, 0f, 4f, 0.97f, 4f, 4f)
                curveToRelative(0f, 2.88f, -0.9f, 3.89f, -3.6f, 3.98f)
                lineToRelative(-4.38f, -4.38f)
                curveToRelative(0.09f, -2.7f, 1.1f, -3.6f, 3.98f, -3.6f)
                close()
                moveTo(10.99f, 14.99f)
                curveToRelative(0.07f, 0.55f, -0.32f, 1.05f, -0.87f, 1.11f)
                curveToRelative(-3.46f, 0.42f, -4.89f, 2.09f, -5.1f, 5.95f)
                curveToRelative(-0.03f, 0.55f, -0.51f, 0.98f, -1.05f, 0.95f)
                curveToRelative(-0.55f, -0.03f, -0.97f, -0.5f, -0.95f, -1.05f)
                curveToRelative(0.25f, -4.8f, 2.43f, -7.29f, 6.85f, -7.83f)
                curveToRelative(0.54f, -0.07f, 1.05f, 0.32f, 1.11f, 0.87f)
                close()
            }
        }.also { _UserSlash = it}
