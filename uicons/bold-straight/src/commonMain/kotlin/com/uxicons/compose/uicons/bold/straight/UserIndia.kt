package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserIndia: ImageVector? = null

val Icons.Bs.UserIndia: ImageVector
    get() = _UserIndia ?: UXIcon(name = "UserIndia") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.17f, -0.91f, -2.23f, -2f, -2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.12f)
                curveToRelative(-0.32f, 0.07f, -0.65f, 0.12f, -1f, 0.12f)
                reflectiveCurveToRelative(-0.68f, -0.05f, -1f, -0.12f)
                verticalLineToRelative(3.12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                curveToRelative(-1.09f, 0.27f, -2f, 1.33f, -2f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.6f, 0.78f, 1.32f, 1.86f, 2.75f, 2f)
                curveToRelative(1.43f, -0.13f, 2.14f, -1.22f, 2.75f, -1.99f)
                lineToRelative(0.74f, -0.01f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(12f, 15f)
                curveToRelative(3.08f, 0f, 5.61f, -2.33f, 5.96f, -5.31f)
                curveToRelative(0.44f, -0.93f, 1.04f, -2.65f, 1.04f, -5.19f)
                curveToRelative(0f, -3f, -3.5f, -4.5f, -7f, -4.5f)
                curveToRelative(-1.97f, 0f, -3.95f, 0.48f, -5.29f, 1.43f)
                lineToRelative(0.8f, 0.84f)
                curveToRelative(2.29f, 2.41f, 4.8f, 4.59f, 7.49f, 6.53f)
                curveToRelative(0.1f, 1.72f, -1.27f, 3.21f, -3f, 3.2f)
                curveToRelative(-1.74f, 0.01f, -3.11f, -1.5f, -3f, -3.23f)
                curveToRelative(0.47f, -0.34f, 0.94f, -0.69f, 1.41f, -1.04f)
                curveToRelative(-1.52f, -1.28f, -2.98f, -2.64f, -4.35f, -4.08f)
                lineToRelative(-0.69f, -0.72f)
                curveToRelative(-0.24f, 0.47f, -0.37f, 0.99f, -0.37f, 1.57f)
                curveToRelative(0f, 2.54f, 0.6f, 4.26f, 1.04f, 5.19f)
                curveToRelative(0.34f, 2.98f, 2.88f, 5.31f, 5.96f, 5.31f)
                close()
            }
        }.also { _UserIndia = it}
