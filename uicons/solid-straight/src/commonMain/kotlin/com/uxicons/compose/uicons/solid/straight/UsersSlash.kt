package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersSlash: ImageVector? = null

val Icons.Ss.UsersSlash: ImageVector
    get() = _UsersSlash ?: UXIcon(name = "UsersSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.35f)
                curveToRelative(0.74f, -2.07f, 0.28f, -4.37f, -1.19f, -6f)
                horizontalLineToRelative(4.54f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0.24f, 0f, 0.47f, -0.02f, 0.7f, -0.06f)
                lineToRelative(-4.64f, -4.64f)
                curveToRelative(-0.04f, 0.23f, -0.06f, 0.46f, -0.06f, 0.7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.47f, 0f, -0.93f, 0.08f, -1.35f, 0.23f)
                lineToRelative(-2.13f, -2.13f)
                curveToRelative(0.9f, -0.73f, 1.48f, -1.85f, 1.48f, -3.11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.25f, 0f, -2.37f, 0.58f, -3.11f, 1.48f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-8.19f, -8.19f)
                curveToRelative(0.15f, -0.42f, 0.23f, -0.88f, 0.23f, -1.35f)
                close()
                moveTo(18f, 8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(9f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.76f)
                lineToRelative(-4.24f, -4.24f)
                horizontalLineToRelative(-4.76f)
                close()
                moveTo(6f, 13f)
                curveToRelative(0f, -0.8f, 0.16f, -1.58f, 0.46f, -2.3f)
                lineToRelative(-1.7f, -1.7f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.35f)
                curveToRelative(-0.23f, -0.64f, -0.35f, -1.32f, -0.35f, -2f)
                close()
            }
        }.also { _UsersSlash = it}
