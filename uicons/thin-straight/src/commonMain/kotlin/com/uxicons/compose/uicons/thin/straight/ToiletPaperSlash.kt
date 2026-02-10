package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Ts.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 8f)
                curveToRelative(0f, -1.38f, 0.45f, -2.5f, 1f, -2.5f)
                reflectiveCurveToRelative(1f, 1.12f, 1f, 2.5f)
                reflectiveCurveToRelative(-0.45f, 2.5f, -1f, 2.5f)
                reflectiveCurveToRelative(-1f, -1.12f, -1f, -2.5f)
                close()
                moveTo(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineToRelative(2.4f, 2.4f)
                curveTo(3.95f, 0.87f, 5.17f, 0f, 6.5f, 0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(2.24f, 0f, 4f, 3.51f, 4f, 8f)
                reflectiveCurveToRelative(-1.76f, 8f, -4f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.29f)
                lineToRelative(7.0f, 7.0f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(1.03f)
                curveToRelative(-0.39f, -0.43f, -0.74f, -0.99f, -1.03f, -1.66f)
                verticalLineToRelative(1.66f)
                close()
                moveTo(20f, 1f)
                curveToRelative(-1.42f, 0f, -3f, 2.88f, -3f, 7f)
                reflectiveCurveToRelative(1.58f, 7f, 3f, 7f)
                reflectiveCurveToRelative(3f, -2.88f, 3f, -7f)
                reflectiveCurveToRelative(-1.58f, -7f, -3f, -7f)
                close()
                moveTo(3.84f, 3.13f)
                lineToRelative(12.16f, 12.16f)
                verticalLineToRelative(-7.29f)
                curveToRelative(0f, -3.05f, 0.81f, -5.65f, 2.04f, -7f)
                lineTo(6.5f, 1f)
                curveToRelative(-1.02f, 0f, -1.98f, 0.78f, -2.66f, 2.13f)
                close()
                moveTo(16f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.23f, 23f)
                curveToRelative(0.48f, -0.53f, 0.77f, -1.23f, 0.77f, -2f)
                lineTo(3f, 7f)
                curveToRelative(0f, -0.15f, 0.02f, -0.29f, 0.02f, -0.44f)
                lineToRelative(-0.93f, -0.93f)
                curveToRelative(-0.06f, 0.45f, -0.09f, 0.9f, -0.09f, 1.37f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.92f, 0f, 3.48f, -1.55f, 3.5f, -3.47f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(0.96f)
                close()
            }
        }.also { _ToiletPaperSlash = it}
