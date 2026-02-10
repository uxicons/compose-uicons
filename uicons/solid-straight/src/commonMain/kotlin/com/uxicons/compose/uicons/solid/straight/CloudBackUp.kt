package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudBackUp: ImageVector? = null

val Icons.Ss.CloudBackUp: ImageVector
    get() = _CloudBackUp ?: UXIcon(name = "CloudBackUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.75f, 19.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.75f, 2.75f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.75f, 1.75f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                lineToRelative(1.75f, -1.75f)
                close()
                moveTo(13.16f, 14.34f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-2.75f, 2.75f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.75f, -1.75f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                lineToRelative(1.75f, 1.75f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(18.35f, 5.23f)
                curveToRelative(-1.31f, -3.15f, -4.39f, -5.23f, -7.85f, -5.23f)
                curveTo(5.81f, 0f, 2f, 3.81f, 2f, 8.5f)
                curveToRelative(0f, 0.55f, 0.05f, 1.1f, 0.16f, 1.63f)
                curveToRelative(-1.35f, 1.03f, -2.16f, 2.65f, -2.16f, 4.37f)
                curveToRelative(0f, 3.03f, 2.24f, 5.5f, 5f, 5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.67f)
                lineToRelative(-3.99f, -3.99f)
                lineToRelative(4.16f, -4.16f)
                curveToRelative(1.51f, -1.51f, 4.15f, -1.51f, 5.66f, 0f)
                lineToRelative(1.17f, 1.17f)
                verticalLineToRelative(-2.34f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.67f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(1.65f, -1.19f, 2.75f, -3.02f, 3.03f, -5.08f)
                horizontalLineToRelative(0.07f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.47f, -2.34f, -6.44f, -5.65f, -7.27f)
                close()
            }
        }.also { _CloudBackUp = it}
