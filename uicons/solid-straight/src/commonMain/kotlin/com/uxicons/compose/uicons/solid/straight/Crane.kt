package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crane: ImageVector? = null

val Icons.Ss.Crane: ImageVector
    get() = _Crane ?: UXIcon(name = "Crane") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(-2.21f)
                lineToRelative(-16.83f, -5.79f)
                horizontalLineToRelative(-0.9f)
                lineToRelative(-6.27f, 6.08f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7.54f)
                curveToRelative(0f, 1.1f, 0.56f, 2.09f, 1.47f, 2.58f)
                curveToRelative(0.33f, 0.17f, 0.53f, 0.51f, 0.53f, 0.88f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.1f, -0.6f, -2.12f, -1.58f, -2.64f)
                curveToRelative(-0.26f, -0.14f, -0.42f, -0.46f, -0.42f, -0.82f)
                verticalLineToRelative(-7.54f)
                close()
                moveTo(9f, 20.09f)
                lineTo(6.41f, 17.5f)
                lineTo(9f, 14.91f)
                close()
                moveTo(6f, 15.09f)
                verticalLineToRelative(-5.17f)
                lineToRelative(2.59f, 2.59f)
                close()
                moveTo(6f, 19.91f)
                lineTo(8.09f, 22f)
                horizontalLineToRelative(-2.09f)
                close()
                moveTo(9f, 10.09f)
                lineTo(6.91f, 8f)
                horizontalLineToRelative(2.09f)
                close()
            }
        }.also { _Crane = it}
