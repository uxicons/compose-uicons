package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SurveillanceCamera: ImageVector? = null

val Icons.Ss.SurveillanceCamera: ImageVector
    get() = _SurveillanceCamera ?: UXIcon(name = "SurveillanceCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(23f, 3f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(1.5f, -3f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5.06f)
                lineToRelative(-2.01f, 5.35f)
                curveToRelative(-0.15f, 0.39f, -0.52f, 0.65f, -0.94f, 0.65f)
                lineTo(2f, 16f)
                verticalLineToRelative(-4f)
                lineTo(0f, 12f)
                verticalLineToRelative(10f)
                lineTo(2f, 22f)
                verticalLineToRelative(-4f)
                lineTo(7.11f, 18f)
                curveToRelative(1.24f, 0f, 2.37f, -0.78f, 2.81f, -1.95f)
                lineToRelative(2.27f, -6.05f)
                horizontalLineToRelative(8.81f)
                close()
                moveTo(23.39f, 19.04f)
                curveToRelative(-0.49f, -0.95f, -2.41f, -4.04f, -6.39f, -4.04f)
                reflectiveCurveToRelative(-5.9f, 3.09f, -6.39f, 4.04f)
                lineToRelative(-0.24f, 0.46f)
                lineToRelative(0.24f, 0.46f)
                curveToRelative(0.49f, 0.95f, 2.41f, 4.04f, 6.39f, 4.04f)
                reflectiveCurveToRelative(5.9f, -3.09f, 6.39f, -4.04f)
                lineToRelative(0.24f, -0.46f)
                lineToRelative(-0.24f, -0.46f)
                close()
                moveTo(17f, 21.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _SurveillanceCamera = it}
