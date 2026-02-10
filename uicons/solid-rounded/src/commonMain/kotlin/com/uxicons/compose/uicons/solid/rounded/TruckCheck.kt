package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCheck: ImageVector? = null

val Icons.Sr.TruckCheck: ImageVector
    get() = _TruckCheck ?: UXIcon(name = "TruckCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(4f, 18f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(0f, 6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(12f)
                lineTo(4f, 18f)
                close()
                moveTo(3.29f, 10.81f)
                lineToRelative(1.4f, 1.4f)
                curveToRelative(0.56f, 0.56f, 1.3f, 0.84f, 2.04f, 0.84f)
                reflectiveCurveToRelative(1.49f, -0.28f, 2.05f, -0.85f)
                lineToRelative(2.93f, -3.0f)
                curveToRelative(0.39f, -0.4f, 0.38f, -1.03f, -0.02f, -1.42f)
                curveToRelative(-0.39f, -0.38f, -1.03f, -0.38f, -1.41f, 0.02f)
                lineToRelative(-2.92f, 3.0f)
                curveToRelative(-0.35f, 0.35f, -0.91f, 0.35f, -1.26f, 0f)
                lineToRelative(-1.4f, -1.4f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15.06f, 20f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(-4.88f)
                close()
            }
        }.also { _TruckCheck = it}
