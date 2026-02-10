package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSlash: ImageVector? = null

val Icons.Tc.TextSlash: ImageVector
    get() = _TextSlash ?: UXIcon(name = "TextSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22.15f)
                lineToRelative(-10.35f, -10.35f)
                verticalLineToRelative(-8.79f)
                curveToRelative(4.46f, 0.04f, 7.47f, 0.64f, 8.48f, 0.88f)
                curveToRelative(-0.04f, 0.78f, -0.23f, 2.62f, -0.95f, 4.43f)
                curveToRelative(-0.1f, 0.26f, 0.02f, 0.55f, 0.28f, 0.65f)
                curveToRelative(0.25f, 0.1f, 0.55f, -0.02f, 0.65f, -0.28f)
                curveToRelative(1.02f, -2.56f, 1.04f, -5.08f, 1.04f, -5.19f)
                curveToRelative(0f, -0.22f, -0.15f, -0.42f, -0.36f, -0.48f)
                curveToRelative(-0.15f, -0.04f, -3.64f, -1.02f, -9.64f, -1.02f)
                curveToRelative(-4.13f, 0f, -7.09f, 0.47f, -8.53f, 0.76f)
                lineToRelative(-1.62f, -1.62f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(11.5f, 3.01f)
                verticalLineToRelative(7.79f)
                lineToRelative(-7.17f, -7.17f)
                curveToRelative(1.48f, -0.26f, 3.94f, -0.58f, 7.17f, -0.61f)
                close()
                moveTo(12.5f, 15.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(3.96f, 8.31f)
                curveToRelative(0.1f, 0.26f, -0.02f, 0.55f, -0.28f, 0.65f)
                curveToRelative(-0.25f, 0.1f, -0.55f, -0.02f, -0.65f, -0.28f)
                curveToRelative(-0.32f, -0.79f, -0.57f, -1.66f, -0.75f, -2.59f)
                curveToRelative(-0.05f, -0.27f, 0.12f, -0.53f, 0.4f, -0.59f)
                curveToRelative(0.27f, -0.05f, 0.53f, 0.12f, 0.59f, 0.4f)
                curveToRelative(0.17f, 0.86f, 0.4f, 1.68f, 0.7f, 2.41f)
                close()
            }
        }.also { _TextSlash = it}
