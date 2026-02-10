package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintSlash: ImageVector? = null

val Icons.Rr.PrintSlash: ImageVector
    get() = _PrintSlash ?: UXIcon(name = "PrintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.07f, 0f, -3.78f, 1.58f, -3.98f, 3.6f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.05f, -2.05f)
                curveToRelative(1.43f, -0.9f, 2.35f, -2.48f, 2.35f, -4.24f)
                close()
                moveTo(7f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                lineTo(7.41f, 6f)
                lineToRelative(-0.41f, -0.41f)
                verticalLineToRelative(-1.59f)
                close()
                moveTo(22f, 16f)
                curveToRelative(0f, 1.22f, -0.73f, 2.3f, -1.82f, 2.76f)
                lineToRelative(-10.76f, -10.76f)
                horizontalLineToRelative(9.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17.87f, 22.23f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f)
                curveToRelative(-0.45f, 0.26f, -0.97f, 0.4f, -1.5f, 0.4f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.44f, 0.62f, -2.8f, 1.69f, -3.75f)
                curveToRelative(0.41f, -0.36f, 1.05f, -0.33f, 1.41f, 0.09f)
                curveToRelative(0.36f, 0.41f, 0.33f, 1.05f, -0.09f, 1.41f)
                curveToRelative(-0.65f, 0.57f, -1.02f, 1.39f, -1.02f, 2.25f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.18f, 0f, 0.35f, -0.05f, 0.5f, -0.13f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f)
                close()
            }
        }.also { _PrintSlash = it}
