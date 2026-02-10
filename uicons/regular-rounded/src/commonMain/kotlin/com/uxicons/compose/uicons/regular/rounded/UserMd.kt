package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMd: ImageVector? = null

val Icons.Rr.UserMd: ImageVector
    get() = _UserMd ?: UXIcon(name = "UserMd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.79f, -1.64f, -5.2f, -4f, -6.32f)
                verticalLineToRelative(2.5f)
                curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-0.33f, -0.05f, -0.66f, -0.07f, -1f, -0.07f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.69f, 0f, -1.37f, 0.1f, -2f, 0.29f)
                verticalLineToRelative(2.98f)
                curveToRelative(0.6f, 0.35f, 1f, 0.99f, 1f, 1.73f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.74f, 0.4f, -1.39f, 1f, -1.73f)
                verticalLineToRelative(-2.01f)
                curveToRelative(-1.81f, 1.27f, -3f, 3.37f, -3f, 5.74f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                horizontalLineToRelative(2f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                close()
            }
        }.also { _UserMd = it}
