package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerSpeaker: ImageVector? = null

val Icons.Bs.ComputerSpeaker: ImageVector
    get() = _ComputerSpeaker ?: UXIcon(name = "ComputerSpeaker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(13f)
                lineTo(24f, 8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                close()
                moveTo(15f, 17.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(3f, 13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                lineTo(3f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                lineTo(0f, 16f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(13.05f)
                curveToRelative(1.76f, 0f, 3.2f, 1.31f, 3.45f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                close()
            }
        }.also { _ComputerSpeaker = it}
