package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoking: ImageVector? = null

val Icons.Sr.Smoking: ImageVector
    get() = _Smoking ?: UXIcon(name = "Smoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(7f, 16f)
                lineTo(2.5f, 16f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-6f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(20f, 13f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -1.4f, -0.74f, -2.71f, -1.94f, -3.43f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.52f, -1.46f, -2.57f)
                verticalLineToRelative(-1.86f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 1.75f, 0.93f, 3.39f, 2.43f, 4.29f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(0.6f, 0.36f, 0.97f, 1.02f, 0.97f, 1.72f)
                verticalLineToRelative(1.18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(-0.73f)
                curveToRelative(0f, -1.75f, -0.93f, -3.39f, -2.43f, -4.29f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.3f, -0.18f, -0.49f, -0.51f, -0.49f, -0.86f)
                lineTo(19.0f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.87f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(0.9f, 0.54f, 1.46f, 1.52f, 1.46f, 2.57f)
                verticalLineToRelative(0.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Smoking = it}
