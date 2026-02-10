package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transcription: ImageVector? = null

val Icons.Ts.Transcription: ImageVector
    get() = _Transcription ?: UXIcon(name = "Transcription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 13f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(4.5f, 17f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(19f, 12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(19f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 2.59f, 1.98f, 4.69f, 4.5f, 4.95f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.05f)
                curveToRelative(2.52f, -0.26f, 4.5f, -2.36f, 4.5f, -4.95f)
                close()
                moveTo(1f, 23f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                verticalLineToRelative(2.85f)
                curveToRelative(-0.32f, -0.08f, -0.65f, -0.14f, -1f, -0.14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(5.29f)
                lineToRelative(-5.29f, -5.29f)
                close()
            }
        }.also { _Transcription = it}
