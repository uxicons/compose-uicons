package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeRecognition: ImageVector? = null

val Icons.Ss.EyeRecognition: ImageVector
    get() = _EyeRecognition ?: UXIcon(name = "EyeRecognition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 24f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5.53f, 15f)
                curveToRelative(1.4f, 1.44f, 3.61f, 3f, 6.47f, 3f)
                reflectiveCurveToRelative(5.07f, -1.56f, 6.47f, -3f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.65f, -1.19f, 3.55f, -5f, 8.01f, -5f)
                reflectiveCurveToRelative(7.36f, 3.81f, 8.01f, 5f)
                close()
                moveTo(14.29f, 11f)
                curveToRelative(-0.39f, -0.88f, -1.26f, -1.5f, -2.29f, -1.5f)
                reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f)
                close()
            }
        }.also { _EyeRecognition = it}
