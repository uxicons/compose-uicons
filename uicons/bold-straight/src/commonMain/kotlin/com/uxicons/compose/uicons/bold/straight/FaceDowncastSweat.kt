package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceDowncastSweat: ImageVector? = null

val Icons.Bs.FaceDowncastSweat: ImageVector
    get() = _FaceDowncastSweat ?: UXIcon(name = "FaceDowncastSweat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                curveToRelative(2.09f, 0f, 3.72f, 1.16f, 3.9f, 1.3f)
                lineToRelative(-1.79f, 2.41f)
                reflectiveCurveToRelative(-0.99f, -0.7f, -2.1f, -0.7f)
                reflectiveCurveToRelative(-2.1f, 0.7f, -2.11f, 0.71f)
                lineToRelative(-1.78f, -2.41f)
                curveToRelative(0.18f, -0.13f, 1.8f, -1.3f, 3.9f, -1.3f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(6f, 10f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(12f, 0f)
                curveToRelative(-1.82f, 0f, -3.54f, 0.42f, -5.09f, 1.15f)
                curveToRelative(0.51f, 0.85f, 0.94f, 1.82f, 1.05f, 2.82f)
                curveToRelative(1.22f, -0.61f, 2.58f, -0.97f, 4.03f, -0.97f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                curveToRelative(0f, -1.05f, 0.19f, -2.06f, 0.53f, -3.0f)
                curveToRelative(-0.01f, 0f, -0.02f, 0.0f, -0.03f, 0.0f)
                curveToRelative(-1.06f, 0f, -2.03f, -0.39f, -2.8f, -1.0f)
                curveToRelative(-0.45f, 1.25f, -0.7f, 2.6f, -0.7f, 4.0f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(3.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveTo(6f, 2.51f, 3.5f, 0f, 3.5f, 0f)
                curveTo(3.5f, 0f, 1f, 2.46f, 1f, 4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _FaceDowncastSweat = it}
