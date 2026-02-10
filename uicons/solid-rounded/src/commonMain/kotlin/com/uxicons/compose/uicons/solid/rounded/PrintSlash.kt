package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintSlash: ImageVector? = null

val Icons.Sr.PrintSlash: ImageVector
    get() = _PrintSlash ?: UXIcon(name = "PrintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.77f, 15f)
                lineToRelative(7.7f, 7.7f)
                curveToRelative(-0.54f, 0.78f, -1.44f, 1.3f, -2.47f, 1.3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(2.77f)
                close()
                moveTo(8.77f, 13f)
                lineTo(3.13f, 7.37f)
                curveTo(1.3f, 8.11f, 0.0f, 9.9f, 0f, 12f)
                verticalLineToRelative(4f)
                curveToRelative(0.0f, 1.99f, 1.18f, 3.78f, 3f, 4.58f)
                verticalLineToRelative(-2.58f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5f, -5f)
                horizontalLineToRelative(0.77f)
                close()
                moveTo(21.65f, 20.23f)
                lineToRelative(2.06f, 2.06f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.33f, 3.33f)
                curveToRelative(0.19f, -2.03f, 1.88f, -3.62f, 3.96f, -3.62f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                lineTo(6.41f, 5f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(10.59f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5f, 5f)
                verticalLineToRelative(4f)
                curveToRelative(-0.0f, 1.74f, -0.91f, 3.33f, -2.35f, 4.23f)
                close()
                moveTo(15f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(21f, 19.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(-0.0f, -2.76f, -2.24f, -5.0f, -5f, -5f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(2.05f, 2.05f)
                curveToRelative(1.28f, 0.2f, 2.29f, 1.21f, 2.49f, 2.49f)
                lineToRelative(2.05f, 2.05f)
                close()
            }
        }.also { _PrintSlash = it}
