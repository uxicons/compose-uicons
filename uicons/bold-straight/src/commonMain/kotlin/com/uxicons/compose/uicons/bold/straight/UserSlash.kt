package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Bs.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.0f, 18.88f)
                curveToRelative(-0.06f, -2.66f, -2.22f, -4.81f, -4.88f, -4.88f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(2.41f, -0.78f, 4.17f, -3.04f, 4.17f, -5.71f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-2.67f, 0f, -4.94f, 1.75f, -5.71f, 4.17f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.96f, -2.96f)
                close()
                moveTo(9f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                curveToRelative(-0.38f, 0f, -0.74f, -0.07f, -1.08f, -0.2f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(0.04f, -0.01f)
                curveToRelative(-0.11f, -0.32f, -0.17f, -0.66f, -0.17f, -1.0f)
                close()
                moveTo(9.05f, 14f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-4.05f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(1.05f)
                close()
            }
        }.also { _UserSlash = it}
