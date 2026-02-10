package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeRecognition: ImageVector? = null

val Icons.Bs.EyeRecognition: ImageVector
    get() = _EyeRecognition ?: UXIcon(name = "EyeRecognition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 21f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(21.29f, 11f)
                horizontalLineToRelative(2.71f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.71f)
                curveToRelative(0.64f, -1.43f, 3.93f, -5.93f, 9.29f, -6f)
                curveToRelative(5.36f, 0.07f, 8.65f, 4.57f, 9.29f, 6f)
                close()
                moveTo(6.3f, 11f)
                horizontalLineToRelative(3.41f)
                curveToRelative(0.39f, -0.88f, 1.26f, -1.5f, 2.29f, -1.5f)
                reflectiveCurveToRelative(1.9f, 0.62f, 2.29f, 1.5f)
                horizontalLineToRelative(3.41f)
                curveToRelative(-1.08f, -1.26f, -3.1f, -3f, -5.7f, -3f)
                reflectiveCurveToRelative(-4.62f, 1.74f, -5.7f, 3f)
                close()
                moveTo(5.04f, 16f)
                curveToRelative(1.61f, 1.51f, 3.98f, 3f, 6.96f, 3f)
                reflectiveCurveToRelative(5.36f, -1.49f, 6.96f, -3f)
                horizontalLineToRelative(-13.93f)
                close()
            }
        }.also { _EyeRecognition = it}
