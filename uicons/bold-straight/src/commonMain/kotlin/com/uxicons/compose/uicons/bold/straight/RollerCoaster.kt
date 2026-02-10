package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RollerCoaster: ImageVector? = null

val Icons.Bs.RollerCoaster: ImageVector
    get() = _RollerCoaster ?: UXIcon(name = "RollerCoaster") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 13f)
                curveToRelative(-0.8f, 0f, -1.58f, -0.13f, -2.31f, -0.36f)
                curveToRelative(1.74f, -1.88f, 2.81f, -4.38f, 2.81f, -7.14f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 2.75f, 1.06f, 5.26f, 2.81f, 7.14f)
                curveToRelative(-0.73f, 0.23f, -1.5f, 0.36f, -2.31f, 0.36f)
                curveToRelative(-4.28f, 0f, -7.5f, -3.01f, -7.5f, -7f)
                lineTo(0f, 6f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 13.13f)
                curveToRelative(0.59f, 0.57f, 1.27f, 1.06f, 2f, 1.48f)
                verticalLineToRelative(9.39f)
                horizontalLineToRelative(3f)
                lineTo(8f, 15.74f)
                curveToRelative(0.64f, 0.14f, 1.31f, 0.22f, 2f, 0.25f)
                verticalLineToRelative(8.01f)
                horizontalLineToRelative(3f)
                lineTo(13f, 15.7f)
                curveToRelative(0.7f, -0.17f, 1.37f, -0.41f, 2f, -0.71f)
                verticalLineToRelative(9.01f)
                horizontalLineToRelative(3f)
                lineTo(18f, 15.7f)
                curveToRelative(0.65f, 0.16f, 1.31f, 0.26f, 2f, 0.29f)
                verticalLineToRelative(8.01f)
                horizontalLineToRelative(3f)
                lineTo(23f, 13f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(15.5f, 11.09f)
                curveToRelative(-1.53f, -1.38f, -2.5f, -3.37f, -2.5f, -5.59f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 2.22f, -0.97f, 4.21f, -2.5f, 5.59f)
                close()
            }
        }.also { _RollerCoaster = it}
