package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartCrack: ImageVector? = null

val Icons.Rs.HeartCrack: ImageVector
    get() = _HeartCrack ?: UXIcon(name = "HeartCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.32f)
                lineToRelative(-0.57f, -0.4f)
                curveToRelative(-0.47f, -0.32f, -11.43f, -8f, -11.43f, -14.92f)
                curveTo(0f, 4.14f, 2.92f, 1f, 6.5f, 1f)
                curveToRelative(2.31f, 0f, 4.35f, 1.31f, 5.5f, 3.27f)
                curveToRelative(1.15f, -1.96f, 3.19f, -3.27f, 5.5f, -3.27f)
                curveToRelative(3.58f, 0f, 6.5f, 3.14f, 6.5f, 7f)
                curveToRelative(0f, 6.92f, -10.96f, 14.6f, -11.43f, 14.92f)
                lineToRelative(-0.57f, 0.4f)
                close()
                moveTo(6.5f, 3f)
                curveToRelative(-2.44f, 0f, -4.5f, 2.29f, -4.5f, 5f)
                curveToRelative(0f, 4.59f, 6.75f, 10.49f, 10f, 12.87f)
                curveToRelative(3.25f, -2.38f, 10f, -8.29f, 10f, -12.87f)
                curveToRelative(0f, -2.71f, -2.06f, -5f, -4.5f, -5f)
                reflectiveCurveToRelative(-4.5f, 2.29f, -4.5f, 5f)
                verticalLineToRelative(0.41f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(4f, 4f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-4f, -4f)
                lineToRelative(2.4f, -2.4f)
                curveToRelative(-0.19f, -2.53f, -2.17f, -4.6f, -4.49f, -4.6f)
                close()
            }
        }.also { _HeartCrack = it}
