package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Ts.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 24f)
                curveToRelative(-2.14f, 0f, -4.15f, -0.83f, -5.66f, -2.34f)
                curveToRelative(-1.51f, -1.51f, -2.34f, -3.52f, -2.34f, -5.66f)
                curveTo(0f, 9.54f, 6.31f, 4.93f, 12.23f, 1.11f)
                lineToRelative(0.77f, -0.5f)
                lineTo(13f, 4.65f)
                curveTo(18.01f, 1.91f, 22.95f, 0.39f, 23.01f, 0.37f)
                lineToRelative(0.9f, -0.27f)
                lineToRelative(-0.27f, 0.9f)
                curveToRelative(-0.02f, 0.05f, -1.54f, 5.0f, -4.28f, 10.01f)
                horizontalLineToRelative(4.04f)
                lineToRelative(-0.5f, 0.77f)
                curveToRelative(-3.82f, 5.92f, -8.43f, 12.23f, -14.89f, 12.23f)
                close()
                moveTo(12f, 2.45f)
                curveTo(6.54f, 6.02f, 1f, 10.31f, 1f, 16f)
                curveToRelative(0f, 1.87f, 0.73f, 3.63f, 2.05f, 4.95f)
                reflectiveCurveToRelative(3.08f, 2.05f, 4.95f, 2.05f)
                curveToRelative(5.69f, 0f, 9.98f, -5.54f, 13.55f, -11f)
                horizontalLineToRelative(-3.91f)
                lineToRelative(0.43f, -0.75f)
                curveToRelative(2.22f, -3.88f, 3.7f, -7.86f, 4.3f, -9.62f)
                curveToRelative(-1.76f, 0.6f, -5.74f, 2.08f, -9.62f, 4.3f)
                lineToRelative(-0.75f, 0.43f)
                lineTo(12.0f, 2.45f)
                close()
                moveTo(8f, 19.96f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(8f, 12.96f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _Comet = it}
