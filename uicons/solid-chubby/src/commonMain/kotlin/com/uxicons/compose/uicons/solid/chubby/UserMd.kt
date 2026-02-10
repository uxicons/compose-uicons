package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMd: ImageVector? = null

val Icons.Sc.UserMd: ImageVector
    get() = _UserMd ?: UXIcon(name = "UserMd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(-4.15f, 0f, -6f, -1.85f, -6f, -6f)
                reflectiveCurveToRelative(1.85f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.85f, 6f, 6f)
                reflectiveCurveToRelative(-1.85f, 6f, -6f, 6f)
                close()
                moveTo(15.5f, 14.38f)
                verticalLineToRelative(2.83f)
                curveToRelative(0.88f, 0.39f, 1.5f, 1.27f, 1.5f, 2.29f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.02f, 0.62f, -1.9f, 1.5f, -2.29f)
                verticalLineToRelative(-3.15f)
                curveToRelative(-0.48f, -0.04f, -0.97f, -0.07f, -1.5f, -0.07f)
                curveToRelative(-0.71f, 0f, -1.37f, 0.04f, -1.99f, 0.11f)
                lineToRelative(-0.01f, 3.04f)
                curveToRelative(0.69f, 0.25f, 1.0f, 0.83f, 1.0f, 1.85f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                curveToRelative(0f, -1.03f, 0.3f, -1.61f, 1.0f, -1.85f)
                lineToRelative(0.01f, -2.64f)
                curveToRelative(-3.21f, 0.97f, -4.8f, 3.37f, -5.01f, 7.44f)
                curveToRelative(-0.01f, 0.27f, 0.09f, 0.54f, 0.27f, 0.74f)
                reflectiveCurveToRelative(0.45f, 0.31f, 0.73f, 0.31f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.27f, 0f, 0.54f, -0.11f, 0.73f, -0.31f)
                curveToRelative(0.19f, -0.2f, 0.29f, -0.47f, 0.27f, -0.74f)
                curveToRelative(-0.23f, -4.27f, -1.96f, -6.69f, -5.5f, -7.57f)
                close()
            }
        }.also { _UserMd = it}
