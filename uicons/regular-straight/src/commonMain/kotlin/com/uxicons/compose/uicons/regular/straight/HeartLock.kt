package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartLock: ImageVector? = null

val Icons.Rs.HeartLock: ImageVector
    get() = _HeartLock ?: UXIcon(name = "HeartLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21.5f, 12.18f)
                curveToRelative(0f, 5.18f, -6.86f, 10.02f, -8.96f, 11.38f)
                lineToRelative(-0.54f, 0.35f)
                lineToRelative(-0.54f, -0.35f)
                curveToRelative(-2.69f, -1.74f, -8.96f, -6.32f, -8.96f, -11.38f)
                curveToRelative(0f, -2.64f, 1.96f, -4.81f, 4.5f, -5.17f)
                verticalLineToRelative(-2.01f)
                curveTo(7f, 2.24f, 9.24f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(2.01f)
                curveToRelative(2.54f, 0.37f, 4.5f, 2.54f, 4.5f, 5.17f)
                close()
                moveTo(9f, 7.09f)
                curveToRelative(1.21f, 0.31f, 2.27f, 1.04f, 3f, 2.02f)
                curveToRelative(0.73f, -0.97f, 1.79f, -1.71f, 3f, -2.02f)
                verticalLineToRelative(-2.09f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.09f)
                close()
                moveTo(19.5f, 12.18f)
                curveToRelative(0f, -1.79f, -1.46f, -3.25f, -3.25f, -3.25f)
                curveToRelative(-1.83f, 0f, -3.25f, 1.65f, -3.25f, 3.07f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.42f, -1.42f, -3.07f, -3.25f, -3.07f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.46f, -3.25f, 3.25f)
                curveToRelative(0f, 3.17f, 3.78f, 6.83f, 7.5f, 9.34f)
                curveToRelative(3.72f, -2.51f, 7.5f, -6.18f, 7.5f, -9.34f)
                close()
            }
        }.also { _HeartLock = it}
