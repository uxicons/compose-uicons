package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCv: ImageVector? = null

val Icons.Rs.PersonCv: ImageVector
    get() = _PersonCv ?: UXIcon(name = "PersonCv") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(4.5f, 14f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(21f, 12f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                reflectiveCurveToRelative(-0.9f, 0.4f, -0.9f, 0.9f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.5f, 0.4f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.4f, 0.9f, -0.9f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.01f, 20.43f)
                curveToRelative(-0.13f, 0.65f, -0.64f, 1.57f, -1.63f, 1.57f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.62f, -1.53f)
                lineToRelative(-1.27f, -6.21f)
                horizontalLineToRelative(1.63f)
                lineToRelative(1.2f, 5.89f)
                curveToRelative(0.01f, 0.07f, 0.03f, 0.12f, 0.05f, 0.16f)
                curveToRelative(0.02f, -0.05f, 0.04f, -0.11f, 0.06f, -0.19f)
                lineToRelative(1.18f, -5.86f)
                horizontalLineToRelative(1.63f)
                lineToRelative(-1.24f, 6.17f)
                close()
            }
        }.also { _PersonCv = it}
