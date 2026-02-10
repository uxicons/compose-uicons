package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCv: ImageVector? = null

val Icons.Bs.PersonCv: ImageVector
    get() = _PersonCv ?: UXIcon(name = "PersonCv") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(11f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(16f, 16.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.4f, -0.9f, -0.9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.4f, 0.9f, 0.9f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(22.25f, 14.26f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(-1.18f, 5.86f)
                curveToRelative(-0.01f, 0.08f, -0.04f, 0.14f, -0.06f, 0.19f)
                curveToRelative(-0.02f, -0.04f, -0.04f, -0.09f, -0.05f, -0.16f)
                lineToRelative(-1.2f, -5.89f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(1.27f, 6.21f)
                curveToRelative(0.11f, 0.56f, 0.5f, 1.53f, 1.62f, 1.53f)
                reflectiveCurveToRelative(1.5f, -0.93f, 1.63f, -1.57f)
                lineToRelative(1.24f, -6.17f)
                close()
            }
        }.also { _PersonCv = it}
