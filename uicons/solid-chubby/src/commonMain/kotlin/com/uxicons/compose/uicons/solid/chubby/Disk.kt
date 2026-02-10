package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Sc.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14.16f)
                moveToRelative(-2.28f, 0f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.55f, 0f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.55f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.03f, 4.31f)
                verticalLineTo(1.25f)
                curveToRelative(-1.21f, -0.14f, -2.59f, -0.24f, -4.03f, -0.24f)
                curveToRelative(-1.44f, 0f, -2.81f, 0.1f, -4.03f, 0.24f)
                verticalLineToRelative(3.08f)
                curveToRelative(0.53f, 0.2f, 1.74f, 0.53f, 4.03f, 0.53f)
                curveToRelative(2.24f, 0f, 3.46f, -0.33f, 4.03f, -0.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.42f, 5.55f)
                curveToRelative(-0.04f, -0.2f, -0.13f, -0.39f, -0.28f, -0.53f)
                lineToRelative(-3.14f, -3.14f)
                curveToRelative(-0.14f, -0.14f, -0.33f, -0.24f, -0.53f, -0.28f)
                curveToRelative(-0.14f, -0.03f, -0.29f, -0.05f, -0.44f, -0.08f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.3f, -0.14f, 0.59f, -0.37f, 0.78f)
                curveToRelative(-0.24f, 0.19f, -1.64f, 1.16f, -5.66f, 1.16f)
                curveToRelative(-4.12f, 0f, -5.46f, -0.98f, -5.69f, -1.18f)
                curveToRelative(-0.22f, -0.19f, -0.34f, -0.47f, -0.34f, -0.75f)
                lineTo(5.97f, 1.53f)
                curveToRelative(-1.81f, 0.3f, -3.0f, 0.63f, -3.09f, 0.66f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -2.15f, -0.2f, -4.31f, -0.58f, -6.45f)
                close()
                moveTo(12f, 18.44f)
                curveToRelative(-2.84f, 0f, -4.28f, -1.44f, -4.28f, -4.28f)
                reflectiveCurveToRelative(1.44f, -4.28f, 4.28f, -4.28f)
                reflectiveCurveToRelative(4.28f, 1.44f, 4.28f, 4.28f)
                reflectiveCurveToRelative(-1.44f, 4.28f, -4.28f, 4.28f)
                close()
            }
        }.also { _Disk = it}
