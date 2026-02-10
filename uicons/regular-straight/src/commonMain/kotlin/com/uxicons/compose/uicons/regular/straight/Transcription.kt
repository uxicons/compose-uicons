package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transcription: ImageVector? = null

val Icons.Rs.Transcription: ImageVector
    get() = _Transcription ?: UXIcon(name = "Transcription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 13f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
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
                moveTo(13.41f, 22f)
                curveToRelative(0.61f, 0.56f, 1.32f, 1.01f, 2.09f, 1.35f)
                verticalLineToRelative(0.65f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9.41f)
                lineToRelative(7.59f, 7.59f)
                verticalLineToRelative(1.41f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                close()
            }
        }.also { _Transcription = it}
