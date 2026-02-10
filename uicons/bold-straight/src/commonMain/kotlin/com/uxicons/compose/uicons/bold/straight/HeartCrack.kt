package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartCrack: ImageVector? = null

val Icons.Bs.HeartCrack: ImageVector
    get() = _HeartCrack ?: UXIcon(name = "HeartCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.32f)
                lineToRelative(-0.85f, -0.58f)
                curveToRelative(-1.14f, -0.78f, -11.15f, -7.85f, -11.15f, -14.57f)
                curveTo(0f, 4.22f, 3.03f, 1f, 6.75f, 1f)
                curveToRelative(2.12f, 0f, 4.01f, 1.04f, 5.25f, 2.67f)
                curveToRelative(1.24f, -1.63f, 3.13f, -2.67f, 5.25f, -2.67f)
                curveToRelative(3.72f, 0f, 6.75f, 3.22f, 6.75f, 7.17f)
                curveToRelative(0f, 6.72f, -10.01f, 13.78f, -11.15f, 14.57f)
                lineToRelative(-0.85f, 0.58f)
                close()
                moveTo(6.75f, 4f)
                curveToRelative(-2.03f, 0f, -3.75f, 1.91f, -3.75f, 4.17f)
                curveToRelative(0f, 3.97f, 5.87f, 9.16f, 9f, 11.48f)
                curveToRelative(3.13f, -2.33f, 9f, -7.52f, 9f, -11.48f)
                curveToRelative(0f, -2.26f, -1.72f, -4.17f, -3.75f, -4.17f)
                reflectiveCurveToRelative(-3.75f, 1.91f, -3.75f, 4.17f)
                verticalLineToRelative(0.63f)
                lineToRelative(-1.29f, 1.27f)
                lineToRelative(3.4f, 3.43f)
                lineToRelative(-3.56f, 3.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-3.41f, -3.44f)
                lineToRelative(2.49f, -2.47f)
                curveToRelative(-0.27f, -2f, -1.86f, -3.58f, -3.71f, -3.58f)
                close()
            }
        }.also { _HeartCrack = it}
