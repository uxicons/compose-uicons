package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dictionary: ImageVector? = null

val Icons.Sr.Dictionary: ImageVector
    get() = _Dictionary ?: UXIcon(name = "Dictionary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(12.03f)
                curveToRelative(0.7f, -0.53f, 1.52f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                lineTo(22f, 16f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(9.69f, 12f)
                curveToRelative(-0.38f, 0f, -0.71f, -0.26f, -0.79f, -0.64f)
                lineToRelative(-0.08f, -0.36f)
                horizontalLineToRelative(-2.15f)
                lineToRelative(-0.1f, 0.4f)
                curveToRelative(-0.08f, 0.35f, -0.4f, 0.59f, -0.75f, 0.59f)
                curveToRelative(-0.5f, 0f, -0.87f, -0.46f, -0.76f, -0.95f)
                lineToRelative(1.07f, -4.66f)
                curveToRelative(0.33f, -1.8f, 2.99f, -1.81f, 3.3f, 0.04f)
                lineToRelative(1.04f, 4.58f)
                curveToRelative(0.12f, 0.51f, -0.27f, 0.99f, -0.79f, 0.99f)
                close()
                moveTo(12.7f, 9f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.44f, 0f, -0.8f, -0.36f, -0.8f, -0.8f)
                reflectiveCurveToRelative(0.36f, -0.8f, 0.8f, -0.8f)
                horizontalLineToRelative(0.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                reflectiveCurveToRelative(-0.36f, 0.8f, -0.8f, 0.8f)
                close()
                moveTo(18.2f, 10.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                reflectiveCurveToRelative(-0.36f, 0.8f, -0.8f, 0.8f)
                horizontalLineToRelative(-2.44f)
                curveToRelative(-0.72f, 0f, -1.31f, -0.58f, -1.31f, -1.31f)
                curveToRelative(0f, -0.27f, 0.08f, -0.53f, 0.23f, -0.74f)
                lineToRelative(2.33f, -3.35f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-0.44f, 0f, -0.8f, -0.36f, -0.8f, -0.8f)
                reflectiveCurveToRelative(0.36f, -0.8f, 0.8f, -0.8f)
                horizontalLineToRelative(2.44f)
                curveToRelative(0.72f, 0f, 1.31f, 0.58f, 1.31f, 1.31f)
                curveToRelative(0f, 0.27f, -0.08f, 0.53f, -0.23f, 0.74f)
                lineToRelative(-2.33f, 3.35f)
                horizontalLineToRelative(1.76f)
                close()
                moveTo(7.88f, 6.78f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                close()
                moveTo(5f, 18f)
                lineTo(22f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
            }
        }.also { _Dictionary = it}
