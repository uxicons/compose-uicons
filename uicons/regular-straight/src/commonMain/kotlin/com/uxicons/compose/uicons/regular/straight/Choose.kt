package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Choose: ImageVector? = null

val Icons.Rs.Choose: ImageVector
    get() = _Choose ?: UXIcon(name = "Choose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                lineTo(8f, 0f)
                close()
                moveTo(6f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                close()
                moveTo(6f, 16f)
                lineTo(2f, 16f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(18f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                lineTo(18f, 0f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-4f)
                lineTo(12f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 19.77f)
                verticalLineToRelative(4.23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.85f)
                lineToRelative(-7f, -2.62f)
                verticalLineToRelative(-6.43f)
                curveToRelative(0f, -0.54f, -0.36f, -1.02f, -0.82f, -1.09f)
                curveToRelative(-0.3f, -0.05f, -0.59f, 0.03f, -0.82f, 0.22f)
                curveToRelative(-0.22f, 0.19f, -0.35f, 0.47f, -0.35f, 0.76f)
                verticalLineToRelative(11.71f)
                reflectiveCurveToRelative(-4.3f, -3.42f, -4.32f, -3.44f)
                curveToRelative(-0.4f, -0.37f, -1.03f, -0.35f, -1.41f, 0.05f)
                curveToRelative(-0.38f, 0.4f, -0.36f, 1.04f, 0.05f, 1.42f)
                lineToRelative(2.35f, 2.27f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(-0.85f, -0.82f)
                curveToRelative(-1.2f, -1.12f, -1.26f, -3.02f, -0.13f, -4.23f)
                curveToRelative(1.11f, -1.19f, 2.98f, -1.27f, 4.19f, -0.18f)
                lineToRelative(1.0f, 0.79f)
                verticalLineToRelative(-7.56f)
                curveToRelative(0f, -0.88f, 0.39f, -1.72f, 1.06f, -2.29f)
                curveToRelative(0.67f, -0.57f, 1.56f, -0.81f, 2.44f, -0.67f)
                curveToRelative(1.43f, 0.23f, 2.5f, 1.55f, 2.5f, 3.07f)
                verticalLineToRelative(5.04f)
                lineToRelative(7f, 2.62f)
                close()
            }
        }.also { _Choose = it}
