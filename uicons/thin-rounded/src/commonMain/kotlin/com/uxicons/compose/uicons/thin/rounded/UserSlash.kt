package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Tr.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.99f, 14.54f)
                curveToRelative(0.05f, 0.27f, -0.13f, 0.53f, -0.4f, 0.58f)
                curveToRelative(-3.82f, 0.68f, -6.59f, 3.99f, -6.59f, 7.88f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.37f, 3.12f, -8.1f, 7.41f, -8.86f)
                curveToRelative(0.28f, -0.05f, 0.53f, 0.13f, 0.58f, 0.4f)
                close()
                moveTo(23.85f, 23.85f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.15f, 0.85f)
                curveTo(-0.05f, 0.66f, -0.05f, 0.34f, 0.15f, 0.15f)
                reflectiveCurveTo(0.66f, -0.05f, 0.85f, 0.15f)
                lineTo(6.04f, 5.33f)
                curveToRelative(0.33f, -3.0f, 2.88f, -5.33f, 5.96f, -5.33f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.08f, -2.34f, 5.63f, -5.33f, 5.96f)
                lineToRelative(11.18f, 11.18f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(7.01f, 6.3f)
                lineToRelative(4.69f, 4.69f)
                curveToRelative(0.1f, 0.01f, 0.2f, 0.01f, 0.3f, 0.01f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 1f, 12f, 1f)
                reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                curveToRelative(0f, 0.1f, 0.0f, 0.2f, 0.01f, 0.3f)
                close()
            }
        }.also { _UserSlash = it}
