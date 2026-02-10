package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMusic: ImageVector? = null

val Icons.Sr.UserMusic: ImageVector
    get() = _UserMusic ?: UXIcon(name = "UserMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.5f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0.0f)
                curveToRelative(0f, 0f, 0f, 0.0f, 0f, 0.0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.17f, 0f, 0.34f, 0.02f, 0.5f, 0.05f)
                verticalLineToRelative(-3.92f)
                curveToRelative(0f, -0.29f, -0.12f, -0.56f, -0.34f, -0.76f)
                curveToRelative(-0.22f, -0.19f, -0.5f, -0.28f, -0.8f, -0.23f)
                lineToRelative(-2.57f, 0.37f)
                curveToRelative(-0.73f, 0.1f, -1.29f, 0.74f, -1.29f, 1.49f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.17f, 0f, 0.34f, 0.02f, 0.5f, 0.05f)
                verticalLineToRelative(-4.05f)
                curveToRelative(0f, -1.73f, 1.29f, -3.22f, 3.0f, -3.46f)
                lineToRelative(2.57f, -0.37f)
                curveToRelative(0.86f, -0.12f, 1.73f, 0.13f, 2.39f, 0.7f)
                curveToRelative(0.66f, 0.57f, 1.03f, 1.4f, 1.03f, 2.27f)
                verticalLineToRelative(6.36f)
                close()
                moveTo(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(13f, 17.26f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f)
                curveToRelative(-1.21f, -0.6f, -2.56f, -0.95f, -4.0f, -0.95f)
                curveTo(4.04f, 14f, 0f, 18.04f, 0f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9.76f)
                curveToRelative(-0.48f, -0.71f, -0.76f, -1.57f, -0.76f, -2.5f)
                curveToRelative(0f, -1.96f, 1.25f, -3.62f, 3f, -4.24f)
                close()
            }
        }.also { _UserMusic = it}
