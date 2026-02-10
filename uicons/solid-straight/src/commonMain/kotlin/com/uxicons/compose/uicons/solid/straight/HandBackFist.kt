package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Ss.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.0f, 0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2f)
                verticalLineTo(11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5.08f)
                lineToRelative(-3.12f, 3.55f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.85f, 2.1f)
                lineToRelative(5.15f, 5.15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6.81f)
                lineToRelative(1.43f, -3.57f)
                curveToRelative(0.38f, -0.94f, 0.57f, -1.95f, 0.57f, -2.97f)
                verticalLineTo(2.81f)
                reflectiveCurveTo(9.75f, -0.0f, 9.0f, 0f)
                close()
            }
        }.also { _HandBackFist = it}
