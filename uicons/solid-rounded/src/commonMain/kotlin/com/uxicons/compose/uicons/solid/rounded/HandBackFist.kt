package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Sr.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.43f, 2.44f)
                lineTo(10.58f, 0.04f)
                curveToRelative(-0.89f, -0.17f, -1.79f, 0.05f, -2.49f, 0.62f)
                curveToRelative(-0.7f, 0.57f, -1.1f, 1.42f, -1.1f, 2.32f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(5.25f)
                lineToRelative(-2.81f, 2.79f)
                curveToRelative(-1.54f, 1.53f, -1.57f, 4.05f, -0.07f, 5.62f)
                lineToRelative(4.88f, 5.07f)
                verticalLineToRelative(2.28f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3.81f)
                lineToRelative(1.43f, -3.57f)
                curveToRelative(0.38f, -0.94f, 0.57f, -1.95f, 0.57f, -2.97f)
                verticalLineTo(4.39f)
                curveToRelative(0f, -0.94f, -0.65f, -1.75f, -1.57f, -1.95f)
                close()
            }
        }.also { _HandBackFist = it}
