package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToiletPaperXmark: ImageVector? = null

val Icons.Ss.ToiletPaperXmark: ImageVector
    get() = _ToiletPaperXmark ?: UXIcon(name = "ToiletPaperXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                curveToRelative(1.66f, 0f, 3f, -3.81f, 3f, -8.5f)
                reflectiveCurveTo(20.66f, 0f, 19f, 0f)
                reflectiveCurveToRelative(-3f, 3.81f, -3f, 8.5f)
                reflectiveCurveToRelative(1.34f, 8.5f, 3f, 8.5f)
                close()
                moveTo(19f, 6.5f)
                curveToRelative(0.55f, 0f, 1f, 0.9f, 1f, 2f)
                reflectiveCurveToRelative(-0.45f, 2f, -1f, 2f)
                reflectiveCurveToRelative(-1f, -0.9f, -1f, -2f)
                reflectiveCurveToRelative(0.45f, -2f, 1f, -2f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(11f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                curveToRelative(1.24f, 0f, 2.23f, -0.68f, 3f, -1.79f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(14f, 8.5f)
                curveToRelative(0f, -3.24f, 0.59f, -6.49f, 1.87f, -8.5f)
                lineTo(5f, 0f)
                curveTo(2.2f, 0f, 0f, 3.5f, 0f, 8.5f)
                reflectiveCurveToRelative(2.2f, 8.5f, 5f, 8.5f)
                lineTo(15.87f, 17f)
                curveToRelative(-1.27f, -2.01f, -1.87f, -5.26f, -1.87f, -8.5f)
                close()
                moveTo(10.21f, 10.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.79f, 1.79f)
                close()
            }
        }.also { _ToiletPaperXmark = it}
