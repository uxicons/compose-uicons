package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transcription: ImageVector? = null

val Icons.Bs.Transcription: ImageVector
    get() = _Transcription ?: UXIcon(name = "Transcription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 13f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(18.5f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 16f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.69f, 1.94f, 4.93f, 4.5f, 5.4f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.1f)
                curveToRelative(2.56f, -0.47f, 4.5f, -2.71f, 4.5f, -5.4f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(12.51f, 21f)
                horizontalLineToRelative(-9.51f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.3f)
                curveToRelative(0.46f, -0.19f, 0.97f, -0.3f, 1.5f, -0.3f)
                reflectiveCurveToRelative(1.04f, 0.11f, 1.5f, 0.3f)
                verticalLineToRelative(-3.63f)
                lineToRelative(-5.62f, -5.66f)
                horizontalLineToRelative(-11.38f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-0.64f)
                curveToRelative(-1.19f, -0.52f, -2.22f, -1.33f, -2.99f, -2.36f)
                close()
            }
        }.also { _Transcription = it}
