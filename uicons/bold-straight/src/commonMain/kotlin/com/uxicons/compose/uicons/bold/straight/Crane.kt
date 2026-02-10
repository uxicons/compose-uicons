package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crane: ImageVector? = null

val Icons.Bs.Crane: ImageVector
    get() = _Crane ?: UXIcon(name = "Crane") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                verticalLineToRelative(-3.06f)
                lineToRelative(-16.74f, -5.94f)
                horizontalLineToRelative(-1.23f)
                lineToRelative(-6.03f, 6.41f)
                verticalLineToRelative(2.6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.54f)
                curveToRelative(0f, 1.1f, 0.56f, 2.09f, 1.47f, 2.58f)
                curveToRelative(0.33f, 0.17f, 0.53f, 0.51f, 0.53f, 0.88f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.1f, -0.6f, -2.12f, -1.58f, -2.64f)
                curveToRelative(-0.26f, -0.14f, -0.42f, -0.46f, -0.42f, -0.82f)
                verticalLineToRelative(-6.54f)
                close()
                moveTo(9f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4.5f, 6f)
                lineTo(7.18f, 3.15f)
                lineTo(15.2f, 6f)
                close()
            }
        }.also { _Crane = it}
