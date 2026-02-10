package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tombstone: ImageVector? = null

val Icons.Rc.Tombstone: ImageVector
    get() = _Tombstone ?: UXIcon(name = "Tombstone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.19f, 21.05f)
                curveToRelative(-0.06f, -0.01f, -0.5f, -0.1f, -1.19f, -0.21f)
                verticalLineToRelative(-10.84f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                verticalLineToRelative(10.84f)
                curveToRelative(-0.7f, 0.12f, -1.14f, 0.2f, -1.19f, 0.21f)
                curveToRelative(-0.54f, 0.11f, -0.89f, 0.63f, -0.79f, 1.18f)
                curveToRelative(0.11f, 0.54f, 0.63f, 0.9f, 1.18f, 0.79f)
                curveToRelative(0.05f, -0.01f, 5.03f, -0.98f, 9.81f, -0.98f)
                curveToRelative(5.06f, 0.02f, 9.59f, 0.97f, 10.0f, 1f)
                curveToRelative(0.47f, 0f, 0.89f, -0.33f, 0.98f, -0.81f)
                curveToRelative(0.11f, -0.54f, -0.25f, -1.07f, -0.79f, -1.18f)
                close()
                moveTo(5f, 20.54f)
                verticalLineToRelative(-10.54f)
                curveToRelative(0f, -5.17f, 1.83f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 7f)
                verticalLineToRelative(10.54f)
                curveToRelative(-1.91f, -0.26f, -4.46f, -0.51f, -7f, -0.51f)
                reflectiveCurveToRelative(-5.09f, 0.26f, -7f, 0.51f)
                close()
                moveTo(15.99f, 10.33f)
                curveToRelative(-0.07f, 0.5f, -0.5f, 0.87f, -0.99f, 0.87f)
                curveToRelative(-0.04f, 0f, -0.09f, -0.0f, -0.14f, -0.01f)
                curveToRelative(-0.62f, -0.08f, -1.24f, -0.13f, -1.87f, -0.16f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.97f)
                curveToRelative(-0.63f, 0.03f, -1.25f, 0.07f, -1.87f, 0.16f)
                curveToRelative(-0.55f, 0.07f, -1.05f, -0.31f, -1.12f, -0.86f)
                curveToRelative(-0.07f, -0.55f, 0.31f, -1.05f, 0.86f, -1.12f)
                curveToRelative(0.7f, -0.1f, 1.42f, -0.14f, 2.13f, -0.17f)
                verticalLineToRelative(-2.03f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.03f)
                curveToRelative(0.71f, 0.03f, 1.43f, 0.08f, 2.13f, 0.17f)
                curveToRelative(0.55f, 0.07f, 0.93f, 0.58f, 0.86f, 1.12f)
                close()
            }
        }.also { _Tombstone = it}
