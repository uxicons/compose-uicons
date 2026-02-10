package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperSlash: ImageVector? = null

val Icons.Ss.ToiletPaperSlash: ImageVector
    get() = _ToiletPaperSlash ?: UXIcon(name = "ToiletPaperSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.06f, 6.3f)
                lineToRelative(13.93f, 13.93f)
                curveToRelative(-0.12f, 2.1f, -1.87f, 3.77f, -3.99f, 3.77f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(2f, 7.5f)
                curveToRelative(0f, -0.41f, 0.02f, -0.81f, 0.06f, -1.2f)
                close()
                moveTo(16f, 8.5f)
                curveToRelative(0f, -3.24f, 0.59f, -6.49f, 1.87f, -8.5f)
                lineTo(7f, 0f)
                curveToRelative(-1.37f, 0f, -2.59f, 0.8f, -3.48f, 2.1f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-7.96f, -7.96f)
                verticalLineToRelative(-6.09f)
                close()
                moveTo(18f, 8.5f)
                curveToRelative(0f, -4.69f, 1.34f, -8.5f, 3f, -8.5f)
                reflectiveCurveToRelative(3f, 3.81f, 3f, 8.5f)
                reflectiveCurveToRelative(-1.34f, 8.5f, -3f, 8.5f)
                reflectiveCurveToRelative(-3f, -3.81f, -3f, -8.5f)
                close()
                moveTo(20f, 8.5f)
                curveToRelative(0f, 1.66f, 0.45f, 3f, 1f, 3f)
                reflectiveCurveToRelative(1f, -1.34f, 1f, -3f)
                reflectiveCurveToRelative(-0.45f, -3f, -1f, -3f)
                reflectiveCurveToRelative(-1f, 1.34f, -1f, 3f)
                close()
            }
        }.also { _ToiletPaperSlash = it}
