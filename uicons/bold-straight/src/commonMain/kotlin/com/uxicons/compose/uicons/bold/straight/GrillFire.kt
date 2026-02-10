package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrillFire: ImageVector? = null

val Icons.Bs.GrillFire: ImageVector
    get() = _GrillFire ?: UXIcon(name = "GrillFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.72f, -0.37f, 3.19f, -0.92f, 4.45f)
                curveToRelative(-0.8f, -0.83f, -1.63f, -1.55f, -2.38f, -2.21f)
                curveToRelative(0.07f, -0.24f, 0.13f, -0.48f, 0.18f, -0.74f)
                horizontalLineToRelative(-17.73f)
                curveToRelative(0.68f, 3.73f, 3.78f, 5.54f, 4.7f, 6f)
                horizontalLineToRelative(2.9f)
                curveToRelative(-0.43f, 0.85f, -0.74f, 1.85f, -0.74f, 3f)
                horizontalLineToRelative(-1.36f)
                lineToRelative(-1.06f, 2.12f)
                curveToRelative(0.27f, 0.4f, 0.42f, 0.87f, 0.42f, 1.39f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.1f, 0.72f, -2.03f, 1.71f, -2.36f)
                lineToRelative(0.96f, -1.92f)
                curveToRelative(-2.0f, -1.22f, -5.67f, -4.21f, -5.67f, -9.72f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                close()
                moveTo(19.41f, 18.59f)
                lineTo(18.0f, 17.17f)
                lineTo(16.58f, 18.59f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                reflectiveCurveToRelative(2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                close()
                moveTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _GrillFire = it}
