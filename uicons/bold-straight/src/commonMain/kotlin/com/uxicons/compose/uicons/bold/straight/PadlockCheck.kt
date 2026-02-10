package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PadlockCheck: ImageVector? = null

val Icons.Bs.PadlockCheck: ImageVector
    get() = _PadlockCheck ?: UXIcon(name = "PadlockCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 20.44f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(3.76f)
                curveToRelative(-0.7f, 0.87f, -1.21f, 1.89f, -1.5f, 3f)
                horizontalLineToRelative(-2.26f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3f, 20f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(3f, 3.14f, 3f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8.76f)
                curveToRelative(-0.7f, -0.87f, -1.21f, -1.89f, -1.5f, -3f)
                lineTo(3f, 20f)
                close()
                moveTo(10f, 3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(6f, 7f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
        }.also { _PadlockCheck = it}
