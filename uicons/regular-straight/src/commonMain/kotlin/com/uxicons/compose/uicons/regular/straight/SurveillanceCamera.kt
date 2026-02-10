package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SurveillanceCamera: ImageVector? = null

val Icons.Rs.SurveillanceCamera: ImageVector
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
                moveTo(4f, 7f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14.88f)
                lineToRelative(-0.88f, 1.76f)
                verticalLineToRelative(4.24f)
                lineTo(5f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(23.8f, 19.04f)
                curveToRelative(-0.49f, -0.95f, -2.38f, -4.04f, -6.33f, -4.04f)
                reflectiveCurveToRelative(-5.84f, 3.1f, -6.33f, 4.04f)
                lineToRelative(-0.23f, 0.46f)
                lineToRelative(0.23f, 0.46f)
                curveToRelative(0.49f, 0.95f, 2.38f, 4.04f, 6.33f, 4.04f)
                reflectiveCurveToRelative(5.84f, -3.1f, 6.33f, -4.04f)
                lineToRelative(0.23f, -0.46f)
                lineToRelative(-0.23f, -0.46f)
                close()
                moveTo(17.47f, 22f)
                curveToRelative(-2.34f, 0f, -3.67f, -1.51f, -4.29f, -2.5f)
                curveToRelative(0.62f, -0.99f, 1.95f, -2.5f, 4.29f, -2.5f)
                reflectiveCurveToRelative(3.67f, 1.51f, 4.29f, 2.5f)
                curveToRelative(-0.62f, 0.99f, -1.95f, 2.5f, -4.29f, 2.5f)
                close()
                moveTo(18.97f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SurveillanceCamera = it}
