package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Farm: ImageVector? = null

val Icons.Sr.Farm: ImageVector
    get() = _Farm ?: UXIcon(name = "Farm") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.58f, 15f)
                horizontalLineToRelative(6.84f)
                lineToRelative(-3.42f, 2.8f)
                lineToRelative(-3.42f, -2.8f)
                close()
                moveTo(16.42f, 24f)
                lineToRelative(-4.42f, -3.62f)
                lineToRelative(-4.42f, 3.62f)
                horizontalLineToRelative(8.84f)
                close()
                moveTo(13.58f, 19.09f)
                lineToRelative(3.42f, 2.8f)
                verticalLineToRelative(-5.6f)
                lineToRelative(-3.42f, 2.8f)
                close()
                moveTo(24f, 10.64f)
                verticalLineToRelative(8.36f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 10.64f)
                curveToRelative(0f, -0.79f, 0.23f, -1.56f, 0.67f, -2.22f)
                lineTo(3.67f, 3.92f)
                curveToRelative(0.43f, -0.65f, 1.04f, -1.15f, 1.75f, -1.46f)
                lineTo(10.42f, 0.32f)
                curveToRelative(1.0f, -0.43f, 2.15f, -0.43f, 3.15f, 0f)
                lineToRelative(5.0f, 2.14f)
                curveToRelative(0.71f, 0.31f, 1.32f, 0.81f, 1.75f, 1.46f)
                lineToRelative(3.0f, 4.5f)
                curveToRelative(0.44f, 0.66f, 0.67f, 1.43f, 0.67f, 2.22f)
                close()
                moveTo(15f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(7f, 16.29f)
                verticalLineToRelative(5.6f)
                lineToRelative(3.42f, -2.8f)
                lineToRelative(-3.42f, -2.8f)
                close()
            }
        }.also { _Farm = it}
