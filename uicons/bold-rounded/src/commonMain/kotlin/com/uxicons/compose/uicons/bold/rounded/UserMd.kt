package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMd: ImageVector? = null

val Icons.Br.UserMd: ImageVector
    get() = _UserMd ?: UXIcon(name = "UserMd") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(15.31f, 0f, 12f, 0f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(12f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(22f, 23f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            lineTo(3f, 24f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -3.52f, 2.04f, -6.57f, 5f, -8.05f)
            verticalLineToRelative(3.33f)
            curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
            verticalLineToRelative(-4.05f)
            curveToRelative(0.64f, -0.15f, 1.31f, -0.23f, 2f, -0.23f)
            horizontalLineToRelative(2f)
            curveToRelative(0.34f, 0f, 0.67f, 0.02f, 1f, 0.06f)
            verticalLineToRelative(4.12f)
            curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
            verticalLineToRelative(-3.66f)
            curveToRelative(3.49f, 1.24f, 6f, 4.57f, 6f, 8.47f)
            close()
        }
    }.also { _UserMd = it }
