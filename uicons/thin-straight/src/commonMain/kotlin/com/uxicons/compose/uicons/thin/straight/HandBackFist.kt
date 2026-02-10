package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Ts.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.79f)
                lineTo(1.73f, 8.49f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.3f, 0.72f, 1.75f)
                lineToRelative(5.28f, 5.68f)
                verticalLineToRelative(6.3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6.4f)
                lineToRelative(1.68f, -4.2f)
                curveToRelative(0.21f, -0.53f, 0.32f, -1.1f, 0.32f, -1.67f)
                lineTo(23f, 3.1f)
                reflectiveCurveTo(9.63f, 0f, 8.5f, 0f)
                close()
                moveTo(22f, 11.73f)
                curveToRelative(0f, 0.45f, -0.08f, 0.89f, -0.25f, 1.3f)
                lineToRelative(-1.71f, 4.29f)
                lineToRelative(-0.04f, 5.69f)
                lineTo(8f, 23f)
                verticalLineToRelative(-5.7f)
                lineTo(2.44f, 11.32f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(3.56f, -3.51f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(1f)
                lineTo(7f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.75f, 0f, 8.34f, 1.7f, 13.5f, 2.9f)
                verticalLineToRelative(7.83f)
                close()
            }
        }.also { _HandBackFist = it}
