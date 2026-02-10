package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserDj: ImageVector? = null

val Icons.Ss.UserDj: ImageVector
    get() = _UserDj ?: UXIcon(name = "UserDj") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 22f)
                lineTo(20f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 17.59f)
                verticalLineToRelative(6.41f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.59f)
                lineToRelative(-3.54f, -3.54f)
                curveToRelative(-0.14f, -0.14f, -0.3f, -0.27f, -0.46f, -0.38f)
                verticalLineToRelative(5.5f)
                lineTo(6f, 20f)
                verticalLineToRelative(-5.51f)
                lineTo(0.08f, 9.94f)
                lineTo(5f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.42f)
                curveToRelative(0.77f, -1.76f, 2.53f, -3f, 4.58f, -3f)
                reflectiveCurveToRelative(3.8f, 1.24f, 4.58f, 3f)
                horizontalLineToRelative(1.42f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(-0.77f, 1.76f, -2.53f, 3f, -4.58f, 3f)
                reflectiveCurveToRelative(-3.8f, -1.24f, -4.58f, -3f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(-0.23f, 0f, -0.44f, -0.09f, -0.61f, -0.23f)
                lineToRelative(-2.43f, 2.86f)
                lineToRelative(3.08f, 2.37f)
                horizontalLineToRelative(10.3f)
                curveToRelative(1.33f, 0f, 2.59f, 0.52f, 3.54f, 1.47f)
                lineToRelative(4.12f, 4.12f)
                close()
            }
        }.also { _UserDj = it}
