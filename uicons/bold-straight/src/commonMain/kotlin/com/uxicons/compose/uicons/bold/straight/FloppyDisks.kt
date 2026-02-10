package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDisks: ImageVector? = null

val Icons.Bs.FloppyDisks: ImageVector
    get() = _FloppyDisks ?: UXIcon(name = "FloppyDisks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(15.95f)
                close()
                moveTo(14f, 8f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveTo(24f, 6.61f)
                verticalLineToRelative(12.39f)
                lineTo(5f, 19f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.89f)
                curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
                lineToRelative(3.1f, 3.11f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
                close()
                moveTo(21f, 6.61f)
                curveToRelative(0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f)
                lineToRelative(-2.85f, -2.85f)
                verticalLineToRelative(2.6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(13f)
                lineTo(21f, 6.61f)
                close()
            }
        }.also { _FloppyDisks = it}
