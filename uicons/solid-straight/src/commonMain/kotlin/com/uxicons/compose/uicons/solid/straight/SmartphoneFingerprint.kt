package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartphoneFingerprint: ImageVector? = null

val Icons.Ss.SmartphoneFingerprint: ImageVector
    get() = _SmartphoneFingerprint ?: UXIcon(name = "SmartphoneFingerprint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(16f)
                close()
                moveTo(9.2f, 11.98f)
                lineTo(8.8f, 10.02f)
                curveToRelative(0.54f, -0.11f, 2.2f, -0.44f, 2.2f, -3.02f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 2.68f, -1.39f, 4.5f, -3.8f, 4.98f)
                close()
                moveTo(13.57f, 13.19f)
                lineTo(12.19f, 11.74f)
                curveToRelative(0.6f, -0.58f, 1.04f, -1.19f, 1.34f, -1.87f)
                lineToRelative(1.84f, 0.79f)
                curveToRelative(-0.4f, 0.92f, -1f, 1.77f, -1.79f, 2.52f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(0.01f, 0.63f, -0.01f, 1.48f, -0.22f, 2.38f)
                lineToRelative(-1.95f, -0.44f)
                curveToRelative(0.16f, -0.69f, 0.17f, -1.36f, 0.17f, -1.93f)
                curveToRelative(0f, -0.32f, -0.07f, -0.61f, -0.2f, -0.88f)
                lineToRelative(1.8f, -0.87f)
                curveToRelative(0.27f, 0.55f, 0.4f, 1.13f, 0.4f, 1.74f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(0.87f, 0f, 1.7f, 0.28f, 2.4f, 0.8f)
                lineToRelative(-1.2f, 1.6f)
                curveToRelative(-0.35f, -0.26f, -0.76f, -0.4f, -1.2f, -0.4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-16.0f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _SmartphoneFingerprint = it}
