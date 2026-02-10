package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Tc.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22.15f)
                lineToRelative(-2.44f, -2.44f)
                curveToRelative(-0.69f, -2.08f, -2.04f, -3.43f, -4.13f, -4.13f)
                lineToRelative(-2.7f, -2.7f)
                curveToRelative(3.06f, -0.43f, 4.41f, -2.23f, 4.41f, -5.88f)
                curveToRelative(0f, -4.21f, -1.79f, -6f, -6f, -6f)
                curveToRelative(-3.65f, 0f, -5.45f, 1.34f, -5.88f, 4.41f)
                lineToRelative(-4.26f, -4.26f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.65f, 0f, 5f, 1.35f, 5f, 5f)
                curveToRelative(0f, 3.44f, -1.19f, 4.8f, -4.32f, 4.97f)
                lineToRelative(-5.65f, -5.65f)
                curveToRelative(0.17f, -3.13f, 1.53f, -4.32f, 4.97f, -4.32f)
                close()
                moveTo(12f, 15.49f)
                curveToRelative(0.01f, 0.28f, -0.21f, 0.51f, -0.49f, 0.51f)
                curveToRelative(-4.94f, 0.12f, -7.1f, 2.01f, -7.46f, 6.53f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, -0.0f)
                curveToRelative(-0.28f, -0.02f, -0.48f, -0.26f, -0.46f, -0.54f)
                curveToRelative(0.4f, -5.03f, 3.0f, -7.33f, 8.43f, -7.46f)
                curveToRelative(0.28f, -0.01f, 0.51f, 0.21f, 0.51f, 0.49f)
                close()
            }
        }.also { _UserSlash = it}
