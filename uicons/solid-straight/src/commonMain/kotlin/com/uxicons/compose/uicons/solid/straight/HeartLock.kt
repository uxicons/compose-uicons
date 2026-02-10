package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartLock: ImageVector? = null

val Icons.Ss.HeartLock: ImageVector
    get() = _HeartLock ?: UXIcon(name = "HeartLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7.01f)
                verticalLineToRelative(-2.01f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 2.24f, 7f, 5f)
                verticalLineToRelative(2.01f)
                curveToRelative(-2.54f, 0.37f, -4.5f, 2.54f, -4.5f, 5.17f)
                curveToRelative(0f, 5.05f, 6.26f, 9.64f, 8.96f, 11.38f)
                lineToRelative(0.54f, 0.35f)
                lineToRelative(0.54f, -0.35f)
                curveToRelative(2.1f, -1.36f, 8.96f, -6.2f, 8.96f, -11.38f)
                curveToRelative(0f, -2.64f, -1.96f, -4.81f, -4.5f, -5.17f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(15f, 7.09f)
                curveToRelative(-1.21f, 0.31f, -2.27f, 1.04f, -3f, 2.02f)
                curveToRelative(-0.73f, -0.97f, -1.79f, -1.71f, -3f, -2.02f)
                verticalLineToRelative(-2.09f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2.09f)
                close()
            }
        }.also { _HeartLock = it}
