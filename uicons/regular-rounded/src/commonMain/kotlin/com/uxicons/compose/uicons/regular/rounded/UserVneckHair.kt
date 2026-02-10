package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Rr.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.88f, 0f, -3.44f, -1.3f, -3.87f, -3.05f)
                curveToRelative(0.22f, 0.02f, 0.44f, 0.05f, 0.66f, 0.05f)
                curveToRelative(2.62f, 0f, 4.94f, -1.51f, 6.06f, -3.8f)
                curveToRelative(0.71f, 0.72f, 1.15f, 1.71f, 1.15f, 2.8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.4f, 0f, 0.77f, 0.07f, 1.13f, 0.18f)
                curveToRelative(-0.76f, 1.69f, -2.45f, 2.82f, -4.34f, 2.82f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.02f, -0.63f, -0.05f)
                curveToRelative(0.46f, -1.7f, 2.0f, -2.95f, 3.84f, -2.95f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.82f, -0.77f, -3.82f, -1.87f, -4.85f)
                curveToRelative(-0.3f, -0.25f, -0.6f, -0.16f, -0.83f, 0.06f)
                lineToRelative(-3.52f, 4.41f)
                curveToRelative(-0.38f, 0.5f, -1.19f, 0.5f, -1.56f, -0.0f)
                lineToRelative(-3.54f, -4.46f)
                curveToRelative(-0.19f, -0.18f, -0.53f, -0.26f, -0.8f, -0.02f)
                curveToRelative(-1.1f, 1.03f, -1.88f, 3.03f, -1.88f, 4.86f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.41f, 0.99f, -4.89f, 2.51f, -6.32f)
                curveToRelative(1.01f, -0.99f, 2.78f, -0.87f, 3.69f, 0.2f)
                lineToRelative(2.79f, 3.52f)
                lineToRelative(2.77f, -3.47f)
                curveToRelative(0.95f, -1.11f, 2.68f, -1.23f, 3.73f, -0.23f)
                curveToRelative(1.52f, 1.42f, 2.5f, 3.9f, 2.5f, 6.31f)
                close()
            }
        }.also { _UserVneckHair = it}
