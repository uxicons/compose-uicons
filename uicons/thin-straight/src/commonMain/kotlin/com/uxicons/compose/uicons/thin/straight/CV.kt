package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CV: ImageVector? = null

val Icons.Ts.CV: ImageVector
    get() = _CV ?: UXIcon(name = "CV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 5.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(14.17f, 10.89f)
                curveToRelative(0.4f, -0.17f, 0.71f, -0.54f, 0.81f, -0.98f)
                lineToRelative(1.65f, -6.64f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(-1.59f, 6.41f)
                curveToRelative(-0.03f, 0.14f, -0.12f, 0.25f, -0.23f, 0.3f)
                curveToRelative(-0.12f, 0.05f, -0.24f, 0.05f, -0.35f, -0.01f)
                curveToRelative(-0.1f, -0.05f, -0.18f, -0.15f, -0.21f, -0.26f)
                lineToRelative(-1.7f, -6.44f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(1.76f, 6.68f)
                curveToRelative(0.09f, 0.39f, 0.35f, 0.72f, 0.72f, 0.91f)
                curveToRelative(0.37f, 0.19f, 0.81f, 0.2f, 1.19f, 0.04f)
                close()
                moveTo(22f, 0f)
                verticalLineToRelative(16.71f)
                lineToRelative(-7.29f, 7.29f)
                lineTo(4.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 0f)
                horizontalLineToRelative(20f)
                close()
                moveTo(4.5f, 23f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                lineTo(21f, 1f)
                lineTo(3f, 1f)
                verticalLineToRelative(20.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15f, 17f)
                verticalLineToRelative(5.29f)
                lineToRelative(5.29f, -5.29f)
                horizontalLineToRelative(-5.29f)
                close()
            }
        }.also { _CV = it}
