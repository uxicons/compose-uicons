package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bone: ImageVector? = null

val Icons.Ss.Bone: ImageVector
    get() = _Bone ?: UXIcon(name = "Bone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.04f, 4f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.03f, 0.39f, 1.97f, 1.03f, 2.68f)
                lineToRelative(-6.37f, 6.37f)
                curveToRelative(-0.71f, -0.65f, -1.66f, -1.05f, -2.7f, -1.05f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.77f, 3.98f, 3.96f, 4f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.03f, -0.39f, -1.97f, -1.03f, -2.68f)
                lineToRelative(6.37f, -6.37f)
                curveToRelative(0.71f, 0.65f, 1.66f, 1.05f, 2.7f, 1.05f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.77f, -3.98f, -3.96f, -4f)
                close()
            }
        }.also { _Bone = it}
